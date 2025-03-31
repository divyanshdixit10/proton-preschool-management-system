package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.model.Role;
import com.protonpreschool.schoolmanagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    // Fetch role by name
    public Role getRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    // Save a new role
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }
}
