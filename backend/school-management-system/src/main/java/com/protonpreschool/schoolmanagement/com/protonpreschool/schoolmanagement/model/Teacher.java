package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
    private String name;  // ✅ Added name field

    @Column(nullable = false)
    private String subject;  // ✅ Added subject field

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    // ✅ Default Constructor
    public Teacher() {}

    // ✅ Constructor with fields
    public Teacher(String name, String subject, String email, String phoneNumber) {
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // ✅ Getters & Setters
    public String getName() {  // ✅ Added getName()
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {  // ✅ Added getSubject()
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
}
