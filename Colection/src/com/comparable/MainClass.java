package com.comparable;

import java.util.ArrayList;
import java.util.List;

//import comparator.main;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1  = new Student("Vishnu",100,53);
		Student s2  = new Student("Hari",102,53);
		Student s3  = new Student("Narayani",103,53);
		Student s4  = new Student("Siva",104,53);
		
		
		List<Student> stu = new ArrayList<Student>();
		
		stu.add(s1);stu.add(s2);
		stu.add(s3);	stu.add(s4);
		
		
		for(Student st : stu){
			if(st.id>100) {
				System.out.println(st.name+" "+st.id);
//				System.out.println("hai");
			}
		}
		
	}
}
