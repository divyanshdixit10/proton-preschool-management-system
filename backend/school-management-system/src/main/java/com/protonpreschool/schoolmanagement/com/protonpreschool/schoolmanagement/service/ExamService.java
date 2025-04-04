package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.ExamDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper.ExamMapper;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.Exam;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.repository.ExamRepository;

@Service
public class ExamService {

    private final ExamRepository examRepository;
    private final ExamMapper examMapper;

    public ExamService(ExamRepository examRepository, ExamMapper examMapper) {
        this.examRepository = examRepository;
        this.examMapper = examMapper;
    }

    // ✅ Get all exams (convert to DTO)
    public List<ExamDTO> getAllExams() {
        return examRepository.findAll()
                .stream()
                .map(examMapper::toDTO)
                .collect(Collectors.toList());
    }

    // ✅ Get exam by ID (convert to DTO)
    public Optional<ExamDTO> getExamById(Long id) {
        return examRepository.findById(id).map(examMapper::toDTO);
    }

    // ✅ Create a new exam (convert DTO to Entity, save, and return DTO)
    public ExamDTO saveExam(ExamDTO examDTO) {
        Exam exam = examMapper.toEntity(examDTO);
        Exam savedExam = examRepository.save(exam);
        return examMapper.toDTO(savedExam);
    }

    // ✅ Update an existing exam (convert DTO to Entity, save, and return DTO)
    public Optional<ExamDTO> updateExam(Long id, ExamDTO updatedExamDTO) {
        return examRepository.findById(id).map(existingExam -> {
            existingExam.setName(updatedExamDTO.getName());
            existingExam.setDate(updatedExamDTO.getDate());
            existingExam.setTotalMarks(updatedExamDTO.getTotalMarks());
            Exam updatedExam = examRepository.save(existingExam);
            return examMapper.toDTO(updatedExam);
        });
    }

    // ✅ Delete exam by ID
    public void deleteExam(Long id) {
        examRepository.deleteById(id);
    }
}
