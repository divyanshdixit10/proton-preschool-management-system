package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import java.util.List;

public interface SchoolClassService {
    SchoolClassDTO createClass(SchoolClassDTO schoolClassDTO);
    SchoolClassDTO getClassById(Long id);
    List<SchoolClassDTO> getAllClasses();
    SchoolClassDTO updateClass(Long id, SchoolClassDTO schoolClassDTO);
    void deleteClass(Long id);
}
