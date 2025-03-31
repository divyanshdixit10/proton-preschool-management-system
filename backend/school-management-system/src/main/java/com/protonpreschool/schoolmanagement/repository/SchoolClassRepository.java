package com.protonpreschool.schoolmanagement.repository;

import com.protonpreschool.schoolmanagement.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {
}
