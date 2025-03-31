package com.protonpreschool.schoolmanagement.mapper;

import com.protonpreschool.schoolmanagement.dto.ParentDTO;
import com.protonpreschool.schoolmanagement.model.Parent;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParentMapper {
    ParentMapper INSTANCE = Mappers.getMapper(ParentMapper.class);

    ParentDTO parentToParentDTO(Parent parent);

    Parent parentDTOToParent(ParentDTO parentDTO);
}
