package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
import com.protonpreschool.schoolmanagement.model.ExamResult;
import com.protonpreschool.schoolmanagement.repository.ExamResultRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExamResultService {

    @Autowired
    private ExamResultRepository examResultRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ExamResultDTO> getAllResults() {
        return examResultRepository.findAll().stream()
                .map(result -> modelMapper.map(result, ExamResultDTO.class))
                .collect(Collectors.toList());
    }

    public ExamResultDTO addResult(ExamResultDTO examResultDTO) {
        ExamResult examResult = modelMapper.map(examResultDTO, ExamResult.class);
        ExamResult savedResult = examResultRepository.save(examResult);
        return modelMapper.map(savedResult, ExamResultDTO.class);
    }
}
