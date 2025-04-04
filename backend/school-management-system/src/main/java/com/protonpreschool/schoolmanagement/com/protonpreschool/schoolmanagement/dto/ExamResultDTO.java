package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto;

import lombok.Data;

@Data
public class ExamResultDTO {
    private Long id;
    private Long studentId; // Reference to Student
    private Long examId; // Reference to Exam
    private double marksObtained;
    private String grade;
    private Double score;  // Added `score` field

    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public double getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
}
