package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.StudentDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.Student;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDTO studentToStudentDTO(Student student);

    Student studentDTOToStudent(StudentDTO studentDTO);
}
