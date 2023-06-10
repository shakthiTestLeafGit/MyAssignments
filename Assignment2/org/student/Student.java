package org.student;

import org.department.Department;

public class Student extends Department{
	
	public String studentName(String name)
	{
		return name;
	}
	
	public String studentDept(String d)
	{ 
		return this.deptName(d);
	
	}
	
	public int studentId(int id)
	{
		return id;
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		System.out.println(s1.studentName("Shakthi"));
		System.out.println(s1.studentId(21));
		System.out.println(s1.studentDept("CSE"));
		
		
	}

}
