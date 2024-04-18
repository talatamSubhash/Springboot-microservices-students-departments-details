package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.IdealDepartment;
import com.web.repository.DepartmentRepository;

@Service

public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	 
	public IdealDepartment saveDepartment(IdealDepartment idealDepartment) {
		return departmentRepository.save(idealDepartment);
	}
	public IdealDepartment getDepartmentById(Long id) {
		return departmentRepository.findById(id).get();
	}

}
