package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.model.Parent;
import com.protonpreschool.schoolmanagement.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;

    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    public Optional<Parent> getParentById(Long id) {
        return parentRepository.findById(id);
    }

    public Parent createParent(Parent parent) {
        return parentRepository.save(parent);
    }

    public Parent updateParent(Long id, Parent parentDetails) {
        return parentRepository.findById(id).map(parent -> {
            parent.setName(parentDetails.getName());
            parent.setPhone(parentDetails.getPhone());
            return parentRepository.save(parent);
        }).orElseThrow(() -> new RuntimeException("Parent not found"));
    }

    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }
}
