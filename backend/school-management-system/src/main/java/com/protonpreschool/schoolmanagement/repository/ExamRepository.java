package com.protonpreschool.schoolmanagement.repository;

import com.protonpreschool.schoolmanagement.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
