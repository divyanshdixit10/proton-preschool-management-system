package com.protonpreschool.schoolmanagement.repository;

import com.protonpreschool.schoolmanagement.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
