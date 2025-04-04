package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service;

import java.util.List;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.SubjectDTO;

public interface SubjectService {
    SubjectDTO createSubject(SubjectDTO subjectDTO);
    SubjectDTO getSubjectById(Long id);
    List<SubjectDTO> getAllSubjects();
    SubjectDTO updateSubject(Long id, SubjectDTO subjectDTO);
    void deleteSubject(Long id);
}
