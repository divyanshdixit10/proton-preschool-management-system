package com.protonpreschool.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.protonpreschool.schoolmanagement.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
