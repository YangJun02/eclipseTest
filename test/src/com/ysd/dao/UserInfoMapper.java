package com.ysd.dao;

import java.util.List;

import com.ysd.bean.Student;

public interface UserInfoMapper {
	//��¼
	Student login(Student s);
	//����
	int addStudent(Student s);
	
}
