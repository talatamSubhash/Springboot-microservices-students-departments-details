package com.web.vo;

import com.web.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDepartmentVO {
	private Student student;
	private IdealDepartment idealDepartment;

}
