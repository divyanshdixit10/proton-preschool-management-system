package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement")
public class ProtonPreSchoolManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProtonPreSchoolManagementSystemApplication.class, args);
    }
}
