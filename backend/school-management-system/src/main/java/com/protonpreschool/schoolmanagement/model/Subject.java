package com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "subjects")
public class Subject extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String subjectName;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private SchoolClass schoolClass;

	
    
    public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
