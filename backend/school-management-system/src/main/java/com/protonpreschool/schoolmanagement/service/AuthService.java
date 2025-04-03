package com.protonpreschool.schoolmanagement.service;

import java.util.Collections;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.protonpreschool.schoolmanagement.dto.AuthResponse;
import com.protonpreschool.schoolmanagement.dto.LoginRequest;
import com.protonpreschool.schoolmanagement.dto.RegisterRequest;
import com.protonpreschool.schoolmanagement.model.Role;
import com.protonpreschool.schoolmanagement.model.User;
import com.protonpreschool.schoolmanagement.repository.RoleRepository;
import com.protonpreschool.schoolmanagement.repository.UserRepository;
import com.protonpreschool.schoolmanagement.security.JwtTokenProvider;

@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthService(AuthenticationManager authenticationManager,
                       UserRepository userRepository,
                       RoleRepository roleRepository,
                       PasswordEncoder passwordEncoder,
                       JwtTokenProvider jwtTokenProvider) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public AuthResponse authenticateUser(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                )
        );

        String token = jwtTokenProvider.generateToken(authentication);
        User user = userRepository.findByEmail(loginRequest.getEmail()).orElseThrow(
                () -> new RuntimeException("User not found")
        );

        return new AuthResponse(user.getId(), user.getName(), user.getEmail(), token);
    }

    public AuthResponse registerUser(RegisterRequest registerRequest) {
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            throw new RuntimeException("Email is already in use!");
        }

        User user = new User();
        user.setName(registerRequest.getName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));

        Role userRole = roleRepository.findByName("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("Default role not found"));

        user.setRoles(Collections.singleton(userRole));
        userRepository.save(user);

        String token = jwtTokenProvider.generateToken(new UsernamePasswordAuthenticationToken(
                user.getEmail(), registerRequest.getPassword()
        ));

        return new AuthResponse(user.getId(), user.getName(), user.getEmail(), token);
    }
}



//package com.protonpreschool.schoolmanagement.service;
//
//import com.protonpreschool.schoolmanagement.dto.AuthResponse;
//import com.protonpreschool.schoolmanagement.dto.LoginRequest;
//import com.protonpreschool.schoolmanagement.dto.RegisterRequest;
//import com.protonpreschool.schoolmanagement.model.Role;
//import com.protonpreschool.schoolmanagement.model.User;
//import com.protonpreschool.schoolmanagement.repository.RoleRepository;
//import com.protonpreschool.schoolmanagement.repository.UserRepository;
//import com.protonpreschool.schoolmanagement.security.JwtTokenProvider;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@Service
//public class AuthService {
//
//    private final AuthenticationManager authenticationManager;
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final JwtTokenProvider jwtTokenProvider;
//
//    public AuthService(
//            AuthenticationManager authenticationManager,
//            UserRepository userRepository,
//            RoleRepository roleRepository,
//            PasswordEncoder passwordEncoder,
//            JwtTokenProvider jwtTokenProvider) {
//        this.authenticationManager = authenticationManager;
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    // ✅ Login Method
//    public AuthResponse login(LoginRequest loginRequest) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
//        );
//
//        String token = jwtTokenProvider.generateToken(authentication);
//        User user = userRepository.findByUsername(loginRequest.getUsername()).orElseThrow(
//                () -> new RuntimeException("User not found"));
//
//        return new AuthResponse(user.getId(), user.getUsername(), token, user.getRoles());
//    }
//
//    // ✅ Register Method
//    public AuthResponse register(RegisterRequest registerRequest) {
//        if (userRepository.existsByUsername(registerRequest.getUsername())) {
//            throw new RuntimeException("Username already exists!");
//        }
//
//        User user = new User();
//        user.setUsername(registerRequest.getUsername());
//        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
//
//        Role userRole = roleRepository.findByName("ROLE_USER")
//                .orElseThrow(() -> new RuntimeException("Role not found"));
//        user.setRoles(Collections.singleton(userRole));
//
//        userRepository.save(user);
//
//        String token = jwtTokenProvider.generateToken(
//                new UsernamePasswordAuthenticationToken(user.getUsername(), registerRequest.getPassword()));
//
//        return new AuthResponse(user.getId(), user.getUsername(), token, user.getRoles());
//    }
//}
