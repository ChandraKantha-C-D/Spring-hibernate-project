package student_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import contructor_injection.School;
import contructor_injection.Student;

public class StudentController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentconstructor.xml");
		Student student = context.getBean("std",Student.class);
		
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Phone : "+student.getPhone());
		System.out.println("Student Course: "+student.getCourse());
    
        School s = context.getBean("school",School.class);
        
		System.out.println("*****************************");
		
		System.out.println("School Name    : "+s.getName());
		System.out.println("School Fee     : "+s.getFee());
		System.out.println("School Address : "+s.getAddress());
		
	}

}
