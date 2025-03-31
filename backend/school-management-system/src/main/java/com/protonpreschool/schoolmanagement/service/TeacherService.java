package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.TeacherDTO;
import com.protonpreschool.schoolmanagement.exception.ResourceNotFoundException;
import com.protonpreschool.schoolmanagement.mapper.TeacherMapper;
import com.protonpreschool.schoolmanagement.model.Teacher;
import com.protonpreschool.schoolmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherMapper teacherMapper; // Injected TeacherMapper

    public List<TeacherDTO> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teacherMapper.toDTOList(teachers); // Use Mapper
    }

    public TeacherDTO getTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Teacher with ID " + id + " not found"));
        return teacherMapper.toDTO(teacher); // Use Mapper
    }

    public TeacherDTO addTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = teacherMapper.toEntity(teacherDTO); // Convert DTO to Entity
        Teacher savedTeacher = teacherRepository.save(teacher);
        return teacherMapper.toDTO(savedTeacher); // Convert back to DTO
    }
}
