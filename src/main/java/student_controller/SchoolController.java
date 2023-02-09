package student_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import contructor_injection.School1;
import contructor_injection.Student;



public class SchoolController {
	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("studentconstructor.xml");
		School1 s = context.getBean("school",School1.class);
		Student student= s.getStudent();
		
		System.out.println(student.getName());
		System.out.println(s.getFee());
		
		
		
	}
	
	
	

}
