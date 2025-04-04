package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service.SchoolClassService;

@RestController
@RequestMapping("/api/classes")
public class SchoolClassController {

    private final SchoolClassService schoolClassService;

    public SchoolClassController(SchoolClassService schoolClassService) {
        this.schoolClassService = schoolClassService;
    }

    // ✅ Create a new class
    @PostMapping
    public ResponseEntity<SchoolClassDTO> createClass(@RequestBody SchoolClassDTO schoolClassDTO) {
        SchoolClassDTO createdClass = schoolClassService.createClass(schoolClassDTO);
        return ResponseEntity.ok(createdClass);
    }

    // ✅ Get class by ID
    @GetMapping("/{id}")
    public ResponseEntity<SchoolClassDTO> getClassById(@PathVariable Long id) {
        SchoolClassDTO schoolClassDTO = schoolClassService.getClassById(id);
        return ResponseEntity.ok(schoolClassDTO);
    }

    // ✅ Get all classes
    @GetMapping
    public ResponseEntity<List<SchoolClassDTO>> getAllClasses() {
        List<SchoolClassDTO> classes = schoolClassService.getAllClasses();
        return ResponseEntity.ok(classes);
    }

    // ✅ Update a class
    @PutMapping("/{id}")
    public ResponseEntity<SchoolClassDTO> updateClass(@PathVariable Long id, @RequestBody SchoolClassDTO schoolClassDTO) {
        SchoolClassDTO updatedClass = schoolClassService.updateClass(id, schoolClassDTO);
        return ResponseEntity.ok(updatedClass);
    }

    // ✅ Delete a class
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClass(@PathVariable Long id) {
        schoolClassService.deleteClass(id);
        return ResponseEntity.ok("Class deleted successfully!");
    }
}
