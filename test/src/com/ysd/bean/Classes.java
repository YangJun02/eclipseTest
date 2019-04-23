package com.ysd.bean;

import org.springframework.stereotype.Component;

@Component
public class Classes {
	private String class_name;
	private Integer class_id;
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Classes [class_name=" + class_name + ", class_id=" + class_id
				+ "]";
	}
	

}
