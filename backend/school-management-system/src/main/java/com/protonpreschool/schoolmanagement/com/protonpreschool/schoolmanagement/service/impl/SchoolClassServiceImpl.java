package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper.SchoolClassMapper;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.SchoolClass;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.repository.SchoolClassRepository;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.service.SchoolClassService;

@Service
public class SchoolClassServiceImpl implements SchoolClassService {

    private final SchoolClassRepository schoolClassRepository;
    private final SchoolClassMapper schoolClassMapper;

    public SchoolClassServiceImpl(SchoolClassRepository schoolClassRepository, SchoolClassMapper schoolClassMapper) {
        this.schoolClassRepository = schoolClassRepository;
        this.schoolClassMapper = schoolClassMapper;
    }

    // ✅ Create a new class
    @Override
    public SchoolClassDTO createClass(SchoolClassDTO schoolClassDTO) {
        SchoolClass schoolClass = schoolClassMapper.toEntity(schoolClassDTO);
        SchoolClass savedClass = schoolClassRepository.save(schoolClass);
        return schoolClassMapper.toDto(savedClass);
    }

    // ✅ Get class by ID
    @Override
    public SchoolClassDTO getClassById(Long id) {
        SchoolClass schoolClass = schoolClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found!"));
        return schoolClassMapper.toDto(schoolClass);
    }

    // ✅ Get all classes
    @Override
    public List<SchoolClassDTO> getAllClasses() {
        List<SchoolClass> classes = schoolClassRepository.findAll();
        return classes.stream().map(schoolClassMapper::toDto).collect(Collectors.toList());
    }

    // ✅ Update a class
    @Override
    public SchoolClassDTO updateClass(Long id, SchoolClassDTO schoolClassDTO) {
        SchoolClass existingClass = schoolClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found!"));

        existingClass.setClassName(schoolClassDTO.getClassName());
        existingClass.setSection(schoolClassDTO.getSection());

        SchoolClass updatedClass = schoolClassRepository.save(existingClass);
        return schoolClassMapper.toDto(updatedClass);
    }

    // ✅ Delete a class
    @Override
    public void deleteClass(Long id) {
        if (!schoolClassRepository.existsById(id)) {
            throw new RuntimeException("Class not found!");
        }
        schoolClassRepository.deleteById(id);
    }
}
