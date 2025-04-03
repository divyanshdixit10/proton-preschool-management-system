package com.protonpreschool.schoolmanagement.repository;

import com.protonpreschool.schoolmanagement.model.ExamResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamResultRepository extends JpaRepository<ExamResult, Long> {
}
