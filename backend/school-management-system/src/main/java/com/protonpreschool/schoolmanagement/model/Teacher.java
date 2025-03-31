package com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "teachers")
public class Teacher extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double salary;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

	
    
    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
