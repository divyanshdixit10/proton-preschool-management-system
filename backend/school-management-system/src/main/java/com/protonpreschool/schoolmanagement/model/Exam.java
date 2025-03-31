package com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "exams")
public class Exam extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String examName;
    private LocalDateTime examDate;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private SchoolClass schoolClass;

	
    
    public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public LocalDateTime getExamDate() {
		return examDate;
	}

	public void setExamDate(LocalDateTime examDate) {
		this.examDate = examDate;
	}
}
