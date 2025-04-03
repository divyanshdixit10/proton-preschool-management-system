package com.protonpreschool.schoolmanagement.service.impl;

import com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
import com.protonpreschool.schoolmanagement.mapper.ExamResultMapper;
import com.protonpreschool.schoolmanagement.model.ExamResult;
import com.protonpreschool.schoolmanagement.repository.ExamResultRepository;
import com.protonpreschool.schoolmanagement.service.ExamResultService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExamResultServiceImpl implements ExamResultService {

    private final ExamResultRepository examResultRepository;
    private final ExamResultMapper examResultMapper;

    public ExamResultServiceImpl(ExamResultRepository examResultRepository, ExamResultMapper examResultMapper) {
        this.examResultRepository = examResultRepository;
        this.examResultMapper = examResultMapper;
    }

    @Override
    public ExamResultDTO createExamResult(ExamResultDTO examResultDTO) {
        ExamResult examResult = examResultMapper.toEntity(examResultDTO);
        ExamResult savedResult = examResultRepository.save(examResult);
        return examResultMapper.toDto(savedResult);
    }

    @Override
    public ExamResultDTO getExamResultById(Long id) {
        ExamResult examResult = examResultRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Exam Result not found"));
        return examResultMapper.toDto(examResult);
    }

    @Override
    public List<ExamResultDTO> getAllExamResults() {
        return examResultRepository.findAll().stream()
                .map(examResultMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ExamResultDTO updateExamResult(Long id, ExamResultDTO examResultDTO) {
        ExamResult existingResult = examResultRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Exam Result not found"));
        
        existingResult.setScore(examResultDTO.getScore());
        existingResult.setGrade(examResultDTO.getGrade());

        ExamResult updatedResult = examResultRepository.save(existingResult);
        return examResultMapper.toDto(updatedResult);
    }

    @Override
    public void deleteExamResult(Long id) {
        if (!examResultRepository.existsById(id)) {
            throw new RuntimeException("Exam Result not found");
        }
        examResultRepository.deleteById(id);
    }

    // ✅ Implement the missing method
    @Override
    public ExamResultDTO saveExamResult(ExamResultDTO examResultDTO) {
        ExamResult examResult = examResultMapper.toEntity(examResultDTO);
        ExamResult savedResult = examResultRepository.save(examResult);
        return examResultMapper.toDto(savedResult);
    }
}
