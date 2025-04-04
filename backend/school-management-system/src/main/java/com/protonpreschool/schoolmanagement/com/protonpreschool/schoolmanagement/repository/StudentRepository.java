package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
