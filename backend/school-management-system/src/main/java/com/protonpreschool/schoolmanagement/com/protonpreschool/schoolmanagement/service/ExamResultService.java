package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service;

import java.util.List;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.ExamResultDTO;

public interface ExamResultService {  

    ExamResultDTO createExamResult(ExamResultDTO examResultDTO);
    
    ExamResultDTO getExamResultById(Long id);
    
    List<ExamResultDTO> getAllExamResults();
    
    ExamResultDTO updateExamResult(Long id, ExamResultDTO examResultDTO);
    
    void deleteExamResult(Long id);

    // ✅ Add missing method definition
    ExamResultDTO saveExamResult(ExamResultDTO examResultDTO);
}
