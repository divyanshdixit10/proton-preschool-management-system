package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByUsername(String username);  // ✅ Add this method

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
    
    Optional<User> findByEmail(String email);
}
