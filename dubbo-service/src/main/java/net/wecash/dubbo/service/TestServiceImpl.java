package net.wecash.dubbo.service;

import net.wecash.dubbo.api.Student;
import net.wecash.dubbo.api.TestService;


public class TestServiceImpl implements TestService{

	private int count=0;
	public String sayHello(String name) {
		System.out.println("sayHello==="+count++);
		return name + " service2 say hello word service2!";
	}

	public Student getStudent(String s) {
		System.out.println("getStudent===");
		Student student=new Student();
		student.setUserName(s);
		student.setAge(12);
		return student;
	}

}
