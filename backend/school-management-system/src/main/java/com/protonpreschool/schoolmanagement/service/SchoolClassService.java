package com.protonpreschool.schoolmanagement.service;

import com.protonpreschool.schoolmanagement.dto.SchoolClassDTO;
import com.protonpreschool.schoolmanagement.model.SchoolClass;
import com.protonpreschool.schoolmanagement.repository.SchoolClassRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolClassService {

    @Autowired
    private SchoolClassRepository schoolClassRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<SchoolClassDTO> getAllClasses() {
        return schoolClassRepository.findAll().stream()
                .map(schoolClass -> modelMapper.map(schoolClass, SchoolClassDTO.class))
                .collect(Collectors.toList());
    }

    public SchoolClassDTO addClass(SchoolClassDTO schoolClassDTO) {
        SchoolClass schoolClass = modelMapper.map(schoolClassDTO, SchoolClass.class);
        SchoolClass savedClass = schoolClassRepository.save(schoolClass);
        return modelMapper.map(savedClass, SchoolClassDTO.class);
    }
}
