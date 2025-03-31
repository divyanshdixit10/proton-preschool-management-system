package com.protonpreschool.schoolmanagement.controller;

import com.protonpreschool.schoolmanagement.dto.ExamDTO;
import com.protonpreschool.schoolmanagement.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping
    public List<ExamDTO> getAllExams() {
        return examService.getAllExams();
    }

    @PostMapping
    public ExamDTO addExam(@RequestBody ExamDTO examDTO) {
        return examService.addExam(examDTO);
    }
}
