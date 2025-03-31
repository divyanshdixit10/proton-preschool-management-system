package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.ParentDTO;
import com.protonpreschool.schoolmanagement.model.Parent;
import com.protonpreschool.schoolmanagement.repository.ParentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ParentDTO> getAllParents() {
        return parentRepository.findAll().stream()
                .map(parent -> modelMapper.map(parent, ParentDTO.class))
                .collect(Collectors.toList());
    }

    public ParentDTO addParent(ParentDTO parentDTO) {
        Parent parent = modelMapper.map(parentDTO, Parent.class);
        Parent savedParent = parentRepository.save(parent);
        return modelMapper.map(savedParent, ParentDTO.class);
    }
}
