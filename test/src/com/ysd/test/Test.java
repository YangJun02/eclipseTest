package com.ysd.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysd.bean.Student;
import com.ysd.service.StudentService;
import com.ysd.service.StudentServiceImp;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService s=(StudentService) context.getBean("studentServiceImp");
		Student student = new Student();
		student.setStu_id(2);
		student.setStu_name("tom");
		int addStudent = s.addStudent(student);
		System.out.println(addStudent);
	}

}
