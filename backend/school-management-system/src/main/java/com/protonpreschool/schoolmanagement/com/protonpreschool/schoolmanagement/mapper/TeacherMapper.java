package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.TeacherDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.Teacher;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    TeacherDTO toDTO(Teacher teacher);
    Teacher toEntity(TeacherDTO teacherDTO);
    List<TeacherDTO> toDTOList(List<Teacher> teachers);
}
