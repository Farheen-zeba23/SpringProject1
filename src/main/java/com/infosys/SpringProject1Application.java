package com.infosys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringProject1Application  implements CommandLineRunner {
	public static void showMassage(String...str) {
		System.out.println(str.length);
		for(String s:str) {
			System.out.println(s);
		}
	}

		
		@Bean(name="s1")
		public Student getStudent(){
			return new Student (1,"Farheen");
		}
	
	

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(SpringProject1Application.class, args);
	
			// TODO Auto-generated method stub
			
			Employee e=(Employee)con.getBean("e1");
			System.out.println(e.sayHello());
			
			
			
		    Student s=(Student)con.getBean("s1");
			System.out.println(s);
			showMassage("Farheen","Shahla","Zeba");
			System.out.println("Main Method");
			
			
			}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring boot command line run Method");
		
	}
	}


