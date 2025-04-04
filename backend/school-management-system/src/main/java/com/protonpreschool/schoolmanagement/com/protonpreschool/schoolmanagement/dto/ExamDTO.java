package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ExamDTO {
    private Long id;
    private String name;
    private Date date;
    private int totalMarks;
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
}
