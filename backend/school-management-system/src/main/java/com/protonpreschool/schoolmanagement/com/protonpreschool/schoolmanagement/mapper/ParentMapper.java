package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto.ParentDTO;
import com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.model.Parent;

@Mapper
public interface ParentMapper {
    ParentMapper INSTANCE = Mappers.getMapper(ParentMapper.class);

    ParentDTO parentToParentDTO(Parent parent);

    Parent parentDTOToParent(ParentDTO parentDTO);
}
