package com.example.testmapstrakt.mapper;

import com.example.testmapstrakt.dto.EmployeDto;
import com.example.testmapstrakt.entity.EmployeEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EmployeMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    @Mapping(target = "name", source = "fullName")
    @Mapping(target = "departmentId", source = "department")
    EmployeEntity toEntity(EmployeDto employeDto);


    @Mapping(target = "fullName", source = "name")
    @Mapping(target = "department", source = "departmentId")
    EmployeDto toDto(EmployeEntity employeEntity);
}
