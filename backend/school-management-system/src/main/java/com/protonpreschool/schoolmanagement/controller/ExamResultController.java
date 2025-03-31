package com.protonpreschool.schoolmanagement.controller;

import com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
import com.protonpreschool.schoolmanagement.service.ExamResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam-results")
public class ExamResultController {

    @Autowired
    private ExamResultService examResultService;

    @GetMapping
    public List<ExamResultDTO> getAllResults() {
        return examResultService.getAllResults();
    }

    @PostMapping
    public ExamResultDTO addResult(@RequestBody ExamResultDTO examResultDTO) {
        return examResultService.addResult(examResultDTO);
    }
}
