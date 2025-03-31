package com.protonpreschool.schoolmanagement.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ExamDTO {
    private Long id;
    private String examName;
    private LocalDate examDate;
    private Long classId; // Reference to SchoolClass
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public LocalDate getExamDate() {
		return examDate;
	}
	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
}
