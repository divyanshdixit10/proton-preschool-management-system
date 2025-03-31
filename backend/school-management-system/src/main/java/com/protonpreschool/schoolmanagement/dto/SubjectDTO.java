package com.protonpreschool.schoolmanagement.dto;

import lombok.Data;

@Data
public class SubjectDTO {
    private Long id;
    private String subjectName;
    private Long classId; // Reference to SchoolClass
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
}
