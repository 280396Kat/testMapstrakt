package com.example.testmapstrakt.controller;

import com.example.testmapstrakt.dto.EmployeDto;
import com.example.testmapstrakt.entity.EmployeEntity;
import com.example.testmapstrakt.mapper.EmployeMapper;
import com.example.testmapstrakt.repository.EmployeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmployeController {

    private final EmployeRepository employeRepository;
    private final EmployeMapper employeMapper;

    @PostMapping("/save")
    public EmployeDto save(@RequestBody EmployeDto employeDto) {
        EmployeEntity toEntity = employeMapper.toEntity(employeDto);
        EmployeEntity tmp = employeRepository.save(toEntity);
        return employeMapper.toDto(tmp);
    }

}
