package com.example.classes.springdi;

import com.example.classes.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringdiApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("I am in main method");
		System.out.println(controller.sayHello());
	}

}
