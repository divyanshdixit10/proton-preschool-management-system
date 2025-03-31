package com.protonpreschool.schoolmanagement.controller;

import com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class SchoolClassController {

    @Autowired
    private SchoolClassService schoolClassService;

    @GetMapping
    public List<SchoolClassDTO> getAllClasses() {
        return schoolClassService.getAllClasses();
    }

    @PostMapping
    public SchoolClassDTO addClass(@RequestBody SchoolClassDTO schoolClassDTO) {
        return schoolClassService.addClass(schoolClassDTO);
    }
}
