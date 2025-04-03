package com.protonpreschool.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.protonpreschool.schoolmanagement.model.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
