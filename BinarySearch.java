package com.kuliza.task.task;

public class BinarySearch {
	// sorting 
	// search 
	// return the result 
	
	private sortAlgorithm sortAlgorithm;
	
	
	public BinarySearch(com.kuliza.task.task.sortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int []numbers , int number)
	{		
		int [] sorted = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// implementing sorting 
		// search the array 
		return 1;
	}
}
