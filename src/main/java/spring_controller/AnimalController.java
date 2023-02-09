package spring_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_dto.Cow;

public class AnimalController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
		Cow c = context.getBean("cow",Cow.class);
		c.sound();
	}

}
