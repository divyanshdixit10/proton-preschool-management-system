package com.protonpreschool.schoolmanagement.mapper;

import com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.model.SchoolClass;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SchoolClassMapper {
    SchoolClassMapper INSTANCE = Mappers.getMapper(SchoolClassMapper.class);

    SchoolClassDTO schoolClassToSchoolClassDTO(SchoolClass schoolClass);

    SchoolClass schoolClassDTOToSchoolClass(SchoolClassDTO schoolClassDTO);
}
