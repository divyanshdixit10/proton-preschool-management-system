package com.protonpreschool.schoolmanagement.mapper;

import com.protonpreschool.schoolmanagement.dto.TeacherDTO;
import com.protonpreschool.schoolmanagement.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    TeacherDTO toDTO(Teacher teacher);
    Teacher toEntity(TeacherDTO teacherDTO);
    List<TeacherDTO> toDTOList(List<Teacher> teachers);
}
