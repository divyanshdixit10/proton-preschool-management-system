package com.protonpreschool.schoolmanagement.controller;

import com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.service.SchoolClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
