package com.protonpreschool.schoolmanagement.controller;

import com.protonpreschool.schoolmanagement.dto.SubjectDTO;
import com.protonpreschool.schoolmanagement.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<SubjectDTO> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PostMapping
    public SubjectDTO addSubject(@RequestBody SubjectDTO subjectDTO) {
        return subjectService.addSubject(subjectDTO);
    }
}
