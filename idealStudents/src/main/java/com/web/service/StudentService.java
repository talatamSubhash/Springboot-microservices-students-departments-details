package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.web.entity.Student;
import com.web.repository.StudentRepository;
import com.web.vo.IdealDepartment;
import com.web.vo.StudentDepartmentVO;
@Service
public class StudentService {
	private String baseUrl="http://DEPARTMENTSERVICE:9191/department/";
	@Autowired
	
	private StudentRepository studentRepository; 
	@Autowired 
	private RestTemplate restTemplate;
	
	@Autowired
	private MailService mailService;
	
	public Student saveStudent (Student student) {
		return studentRepository.save(student);
	}
	public String getStudentWithDepartment(Long id) {
		Student student=studentRepository.findById(id).get();
		IdealDepartment idealDepartment=restTemplate.getForObject(baseUrl+student.getDepartmentId(),IdealDepartment.class);
//		StudentDepartmentVO vo=new StudentDepartmentVO();
//		vo.setIdealDepartment(idealDepartment);
//		vo.setStudent(student);
		StringBuffer buffer=new StringBuffer();
		buffer.append("please find below");
		buffer.append("\n");
		buffer.append(student.getStudentId()+" "+student.getFirstName()+" "+student.getLastName()+" "+student.getEmail()+" "+student.getDepartmentId());
		buffer.append("\n");
		buffer.append(idealDepartment.getDepartmentName()+" "+idealDepartment.getDepartmentAddress()+" "+idealDepartment.getDepartmentCode());
		mailService.sendMail("talatamsubhash@gmail.com", "StudentWithDepartmentInfo", buffer.toString());
		return "Student with Department Details sent to mail";
	}

}
