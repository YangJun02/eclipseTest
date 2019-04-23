package com.ysd.dao;

import java.util.List;

import com.ysd.bean.Student;

public interface UserInfoMapper {
	//µÇÂ¼
	Student login(Student s);
	//ĞÂÔö
	int addStudent(Student s);
	
}
