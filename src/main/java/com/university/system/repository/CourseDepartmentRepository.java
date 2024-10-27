package com.university.system.repository;

import com.university.system.entity.CourseDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDepartmentRepository extends JpaRepository<CourseDepartment, Integer> {
}
