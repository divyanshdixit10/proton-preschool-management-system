package com.protonpreschool.schoolmanagement.dto;

import lombok.Data;

@Data
public class SchoolClassDTO {
    private Long id;
    private String className;
    private String section;
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
}
