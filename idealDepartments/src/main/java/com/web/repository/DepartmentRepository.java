package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.IdealDepartment;

@Repository

public interface DepartmentRepository  extends JpaRepository<IdealDepartment, Long>{

}
