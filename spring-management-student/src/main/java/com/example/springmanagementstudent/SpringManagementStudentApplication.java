package com.example.springmanagementstudent;

import com.example.springmanagementstudent.entity.Student;
import com.example.springmanagementstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringManagementStudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringManagementStudentApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student(1L,"Tahir","Altundağ","tahiraltundag1@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student(1L,"Hatice","Altundağ","haticealtundag@gmail.com");
		studentRepository.save(student2);

		 */
	}
}
