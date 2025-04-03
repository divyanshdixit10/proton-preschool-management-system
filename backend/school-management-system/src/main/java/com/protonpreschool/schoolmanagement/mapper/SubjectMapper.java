package com.protonpreschool.schoolmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.protonpreschool.schoolmanagement.dto.SubjectDTO;
import com.protonpreschool.schoolmanagement.model.Subject;

@Mapper
public interface SubjectMapper {

    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

    SubjectDTO toDto(Subject subject);

    Subject toEntity(SubjectDTO subjectDTO);
}
