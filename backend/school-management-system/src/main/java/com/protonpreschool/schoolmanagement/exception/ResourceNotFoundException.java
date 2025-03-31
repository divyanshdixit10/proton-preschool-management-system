package com.protonpreschool.schoolmanagement.exception;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L; // Added serialVersionUID

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
