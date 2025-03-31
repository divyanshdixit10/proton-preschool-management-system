package com.protonpreschool.schoolmanagement.mapper;

import com.protonpreschool.schoolmanagement.dto.StudentDTO;
import com.protonpreschool.schoolmanagement.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDTO studentToStudentDTO(Student student);

    Student studentDTOToStudent(StudentDTO studentDTO);
}
