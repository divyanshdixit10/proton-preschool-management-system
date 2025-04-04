package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.ExamDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.Exam;

@Mapper(componentModel = "spring")
public interface ExamMapper {
    ExamMapper INSTANCE = Mappers.getMapper(ExamMapper.class);

    ExamDTO toDTO(Exam exam);
    Exam toEntity(ExamDTO examDTO);
}
