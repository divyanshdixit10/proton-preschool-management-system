package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.model.Role;
import com.protonpreschool.schoolmanagement.model.User;
import com.protonpreschool.schoolmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
 // Method to get user roles
    public void printUserRoles(Long userId) {
        // Fetch the user by ID (ensure the user is already loaded)
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            // Access roles
            Set<Role> roles = user.getRoles();
            for (Role role : roles) {
                System.out.println("Role: " + role.getName());
            }
        }
    }
}
