package com.infosys;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Student {
	int rno;
	String sname;
	
	public Student() {
		super();

	}
	public Student(int rno, String sname) {
		super();
		this.rno = rno;
		this.sname = sname;
	}

	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + "]";
	}

	
	
	}
	
	
	


