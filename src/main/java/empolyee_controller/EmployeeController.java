package empolyee_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Empolyee_dto.Employee;
import spring_dto.Cow;

public class EmployeeController  {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeproperty.xml");
		Employee c = context.getBean("emp",Employee.class);
		c.print();
	}

}
