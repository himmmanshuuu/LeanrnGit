package com.kuliza.task.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		
		BinarySearch binarySearch = new BinarySearch(new Sorting());
		
		int result = binarySearch.binarySearch(new int[]{12,4,6} , 0);
		System.out.println(result);
		
	
		SpringApplication.run(TaskApplication.class, args);
	}

}
