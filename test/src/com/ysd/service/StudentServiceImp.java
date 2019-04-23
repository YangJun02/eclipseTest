package com.ysd.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.bean.Student;
import com.ysd.dao.UserInfoMapper;
@Service
public class StudentServiceImp implements StudentService {
	@Resource
	private UserInfoMapper userInfoMapper;
	@Override
	public Student login(Student s) {
		// TODO Auto-generated method stub
		return userInfoMapper.login(s);
	}
	@Override
	public int addStudent(Student s) {
		// TODO Auto-generated method stub
		/*int j=1/0;*/
		return userInfoMapper.addStudent(s);
	}

}
