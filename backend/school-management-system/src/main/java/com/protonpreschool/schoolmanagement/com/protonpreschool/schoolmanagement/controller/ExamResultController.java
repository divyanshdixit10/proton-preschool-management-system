package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service.ExamResultService;

@RestController
@RequestMapping("/api/exam-results")
public class ExamResultController {
    private final ExamResultService examResultService;

    public ExamResultController(ExamResultService examResultService) {
        this.examResultService = examResultService;
    }

    @PostMapping
    public ResponseEntity<ExamResultDTO> saveExamResult(@RequestBody ExamResultDTO examResultDTO) {
        ExamResultDTO savedResult = examResultService.saveExamResult(examResultDTO);
        return ResponseEntity.ok(savedResult);
    }
}


//package com.protonpreschool.schoolmanagement.controller;
//
//import com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
//import com.protonpreschool.schoolmanagement.service.ExamResultService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/exam-results")
//public class ExamResultController {
//
//    private final ExamResultService examResultService;
//
//    public ExamResultController(ExamResultService examResultService) {
//        this.examResultService = examResultService;
//    }
//
//    // ✅ Fetch all exam results
//    @GetMapping
//    public ResponseEntity<List<ExamResultDTO>> getAllExamResults() {
//        List<ExamResultDTO> examResults = examResultService.getAllExamResults();
//        return ResponseEntity.ok(examResults);
//    }
//
//    // ✅ Fetch exam result by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<ExamResultDTO> getExamResultById(@PathVariable Long id) {
//        ExamResultDTO examResult = examResultService.getExamResultById(id);
//        return ResponseEntity.ok(examResult);
//    }
//
//    // ✅ Create a new exam result
//    @PostMapping
//    public ResponseEntity<ExamResultDTO> createExamResult(@RequestBody ExamResultDTO examResultDTO) {
//        ExamResultDTO createdExamResult = examResultService.createExamResult(examResultDTO);
//        return ResponseEntity.ok(createdExamResult);
//    }
//
//    // ✅ Update an existing exam result
//    @PutMapping("/{id}")
//    public ResponseEntity<ExamResultDTO> updateExamResult(@PathVariable Long id, @RequestBody ExamResultDTO examResultDTO) {
//        ExamResultDTO updatedExamResult = examResultService.updateExamResult(id, examResultDTO);
//        return ResponseEntity.ok(updatedExamResult);
//    }
//
//    // ✅ Delete an exam result
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteExamResult(@PathVariable Long id) {
//        examResultService.deleteExamResult(id);
//        return ResponseEntity.ok("Exam result deleted successfully.");
//    }
//}
