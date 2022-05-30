package com;

 class Student {
	int id;
	String name;
	String course;
	String email;
	int phno;
	public Student ()
	{
		System.out.println("In default constructor");
	}
	public Student(int id,String name)
	{
		this();
		this.id=id;
		this.name=name;
	}
	Student(int id,String name,String course,String email,int phno)
	{
		this(id,name);
		this.id=id;
		this.name=name;
		this.course=course;
		this.email=email;
		this.phno=phno;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", phno=" + phno
				+ "]";
	}
	void display()
	{
		System.out.println("Student with[id="+id+"name="+name+"]");
	}
 }
 public class ConstructorDemo
 {
	 public static void main(String[] args)
	 {
		 Student obj=new Student(101,"Shivanand","BE","asfadl@gmail.com",123456789);
		 System.out.println(obj);
		 Student obj1=new Student(102,"Tippeswamy","BE","asfadl@gmail.com",123456789);
		 System.out.println(obj1);
		 Student obj2=new Student(103,"Gayaytri");
		 obj2.display();
	 }
 
		 
	 }
	
	
	
	
	
	


