package com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String grade;  // ✅ Added grade field

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    // ✅ Default Constructor
    public Student() {}

    // ✅ Constructor with fields
    public Student(String name, String email, String phoneNumber, String grade, Parent parent) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
        this.parent = parent;
    }

    // ✅ Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGrade() {  // ✅ Added getGrade() method
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
