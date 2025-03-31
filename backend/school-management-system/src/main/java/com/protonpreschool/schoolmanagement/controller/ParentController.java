package com.protonpreschool.schoolmanagement.controller;

import com.protonpreschool.schoolmanagement.dto.ParentDTO;
import com.protonpreschool.schoolmanagement.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parents")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @GetMapping
    public List<ParentDTO> getAllParents() {
        return parentService.getAllParents();
    }

    @PostMapping
    public ParentDTO addParent(@RequestBody ParentDTO parentDTO) {
        return parentService.addParent(parentDTO);
    }
}
