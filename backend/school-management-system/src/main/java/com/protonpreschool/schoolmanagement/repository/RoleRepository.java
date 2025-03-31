package com.protonpreschool.schoolmanagement.repository;

import com.protonpreschool.schoolmanagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);  // Find role by name (e.g., "ADMIN")
}
