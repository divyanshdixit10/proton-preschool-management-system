package com.protonpreschool.schoolmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.model.SchoolClass;

@Mapper
public interface SchoolClassMapper {
    SchoolClassMapper INSTANCE = Mappers.getMapper(SchoolClassMapper.class);

    SchoolClassDTO toDto(SchoolClass schoolClass);  // ✅ Converts Entity → DTO

    SchoolClass toEntity(SchoolClassDTO schoolClassDTO);  // ✅ Converts DTO → Entity
}
