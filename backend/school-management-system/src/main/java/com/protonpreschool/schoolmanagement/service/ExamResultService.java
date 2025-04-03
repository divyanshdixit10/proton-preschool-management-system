package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
import java.util.List;

public interface ExamResultService {  

    ExamResultDTO createExamResult(ExamResultDTO examResultDTO);
    
    ExamResultDTO getExamResultById(Long id);
    
    List<ExamResultDTO> getAllExamResults();
    
    ExamResultDTO updateExamResult(Long id, ExamResultDTO examResultDTO);
    
    void deleteExamResult(Long id);

    // ✅ Add missing method definition
    ExamResultDTO saveExamResult(ExamResultDTO examResultDTO);
}
