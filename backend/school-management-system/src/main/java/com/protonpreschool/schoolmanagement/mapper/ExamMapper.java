package com.protonpreschool.schoolmanagement.mapper;

import com.protonpreschool.schoolmanagement.dto.ExamDTO;
import com.protonpreschool.schoolmanagement.model.Exam;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExamMapper {
    ExamMapper INSTANCE = Mappers.getMapper(ExamMapper.class);

    ExamDTO examToExamDTO(Exam exam);

    Exam examDTOToExam(ExamDTO examDTO);
}
