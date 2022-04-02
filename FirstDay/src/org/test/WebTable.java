package org.test;


import java.util.ArrayList;
import java.util.List;

public class WebTable extends Student {
	public static void main(String[] args)
	{
		 List<Student> students = new ArrayList<>();
		 students.add(new Student("s1","Anu",5,'1'));
		 students.add(new Student("s2","Ani",3,'2'));
		 students.add(new Student("s3","Abu",4,'3'));
		 students.add(new Student("s4","Ari",6,'4'));
		 
		 System.out.println("======================================================================"); 
		 System.out.println("Student ID", "Student Name", "Student Age", "Student Grade");
		 System.out.println();
		 System.out.println("=======================================================================");
		 for(Student student: students)
		 {
			 System.out.println();
			 
			 System.out.println();
		 }
	}
	

}
