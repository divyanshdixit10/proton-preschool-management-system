package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.ExamResultDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.ExamResult;


@Mapper(componentModel = "spring")
public interface ExamResultMapper {

    @Mapping(source = "student.id", target = "studentId")
    @Mapping(source = "exam.id", target = "examId")
    ExamResultDTO toDto(ExamResult examResult);  // ✅ This method was missing

    @Mapping(source = "studentId", target = "student.id")
    @Mapping(source = "examId", target = "exam.id")
    ExamResult toEntity(ExamResultDTO examResultDTO);
}
