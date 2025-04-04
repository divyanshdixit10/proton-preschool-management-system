package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;  // ✅ Added name field

    // ✅ Default Constructor
    public Role() {}

    // ✅ Constructor with field
    public Role(String name) {
        this.name = name;
    }

    // ✅ Getter & Setter for name
    public String getName() {  // ✅ Added getName() method
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
