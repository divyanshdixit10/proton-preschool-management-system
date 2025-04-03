package com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "school_classes")
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String className;

    @Column(nullable = false)
    private String section;

    // ✅ Manually adding setter methods
    public void setClassName(String className) {
        this.className = className;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // ✅ Also add getter methods if needed
    public String getClassName() {
        return className;
    }

    public String getSection() {
        return section;
    }
}
