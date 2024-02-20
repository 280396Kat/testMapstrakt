package com.example.testmapstrakt.repository;

import com.example.testmapstrakt.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Long> {
}
