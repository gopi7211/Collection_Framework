package com.comparable;

public class Student {

	String name ;
	int id;
	int percent;
	

  public Student(String name, int id, int percent) {
	this.name = name;
	this.id = id;
	this.percent = percent;
}

public String toString() {
	  return "Name :"+ name + "id :"+id;
  }
  
//  public int getid() {
//	  return this.id;
//  }
}
