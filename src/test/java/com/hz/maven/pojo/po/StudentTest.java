package com.hz.maven.pojo.po;

import org.junit.Test;

import com.hz.maven.pojo.Student;

public class StudentTest {
	@Test
	public void test1(){
		Student stu=new Student();
		stu.setName("tom");
		stu.setPassword("10086");
		System.out.println(stu);
	}
}
