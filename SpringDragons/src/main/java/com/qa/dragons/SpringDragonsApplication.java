package com.qa.dragons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDragonsApplication {

	public static void main(String[] args) {
//		ApplicationContext beanBag = SpringApplication.run(SpringDragonsApplication.class, args);
//		DragonController controller = beanBag.getBean(DragonController.class);
//		System.out.println(controller);

		SpringApplication.run(SpringDragonsApplication.class, args);
	}

}
