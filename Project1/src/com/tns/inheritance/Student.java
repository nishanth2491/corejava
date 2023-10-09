package com.tns.inheritance;

public class Student extends Citizen{
	private int rollno;
	private String collegeName;
	
	public int getRollno() {
		return rollno;
	}
	//@Override
	//public String toString() {
	//	return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]";
	//}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, long adharno, String address, long phno) {
		super(name, adharno, address, phno);
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	
	
}
