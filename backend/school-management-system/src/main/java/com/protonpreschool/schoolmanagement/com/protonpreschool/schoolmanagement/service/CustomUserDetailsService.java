package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.User;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve user from the database using username
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        User user = userOptional.get();

        // Build UserDetails object
        UserBuilder userBuilder = org.springframework.security.core.userdetails.User.withUsername(user.getUsername());
        userBuilder.password(user.getPassword()); // Set the password from the user entity
        userBuilder.roles(user.getRoles().stream().map(role -> role.getName()).toArray(String[]::new)); // Convert roles to String array

        return userBuilder.build();
    }
}
