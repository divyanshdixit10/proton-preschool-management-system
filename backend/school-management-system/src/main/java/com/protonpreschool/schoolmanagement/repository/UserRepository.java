package com.protonpreschool.schoolmanagement.repository;

import com.protonpreschool.schoolmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByUsername(String username);  // ✅ Add this method

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
    
    Optional<User> findByEmail(String email);
}
