package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service;

import java.util.List;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;

public interface SchoolClassService {
    SchoolClassDTO createClass(SchoolClassDTO schoolClassDTO);
    SchoolClassDTO getClassById(Long id);
    List<SchoolClassDTO> getAllClasses();
    SchoolClassDTO updateClass(Long id, SchoolClassDTO schoolClassDTO);
    void deleteClass(Long id);
}
