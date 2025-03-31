package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.ExamDTO;
import com.protonpreschool.schoolmanagement.model.Exam;
import com.protonpreschool.schoolmanagement.repository.ExamRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ExamDTO> getAllExams() {
        return examRepository.findAll().stream()
                .map(exam -> modelMapper.map(exam, ExamDTO.class))
                .collect(Collectors.toList());
    }

    public ExamDTO addExam(ExamDTO examDTO) {
        Exam exam = modelMapper.map(examDTO, Exam.class);
        Exam savedExam = examRepository.save(exam);
        return modelMapper.map(savedExam, ExamDTO.class);
    }
}
