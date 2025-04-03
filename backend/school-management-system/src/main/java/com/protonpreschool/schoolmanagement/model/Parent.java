package com.protonpreschool.schoolmanagement.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "parents")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;  // ✅ Added name field

    @Column(nullable = false, unique = true)
    private String phone;  // ✅ Added phone field

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<Student> children = new HashSet<>();

    // ✅ Default Constructor
    public Parent() {}

    // ✅ Constructor with fields
    public Parent(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {  // ✅ Added getName() method
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {  // ✅ Added getPhone() method
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Student> getChildren() {
        return children;
    }

    public void setChildren(Set<Student> children) {
        this.children = children;
    }
}
