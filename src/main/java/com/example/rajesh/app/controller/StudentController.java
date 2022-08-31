package com.example.rajesh.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rajesh.app.service.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Rajesh","Kumar",22,"Male","Pune","manikumarrajesh2000@gmail.com","9708267908","Cognizant",4500000.00);
	}
	@GetMapping("/students")
    public List<Student> getStudents()
    {
    	List<Student> students = new ArrayList<>();
    	students.add(new Student("Rajesh", "Kumar",22,"Male","Pune","manikumarrajesh2000@gmail.com","9708267908","Cognizant",45000000.00));
    	students.add(new Student("Manshi", "Gupta",21,"Female","Gurgaon","manshigupta@gmail.com","9878654567","cognizant",6000000.00));
    	students.add(new Student("Rashi", "Gupta",22,"Female","Pune","rashigupta161999@gmail.com","9756341256","cognizant",89000.00));
    	students.add(new Student("Nidhi", "Kumari",21,"Female","Pune","nidhikumari1804@gmail.com","7867569012","Google",3000000.00));
    	students.add(new Student("Mitraseen", "Yadav",24,"Male","Noida","mitraseenyadav0104@gmail.com","8978642310","Flipkart",26000000.00));
    	students.add(new Student("Ayush" ,"Kumar",23,"Male","Delhi","ayushstm123@gmail.com","9087153480","Apple",79120000.00));
    	students.add(new Student("Gaurav", "Kumar",22,"Male","Bangalore","gauravkumarmft345@gmail.com","9018267945","CGI",42500000.00));
    	return students;
    }
}
