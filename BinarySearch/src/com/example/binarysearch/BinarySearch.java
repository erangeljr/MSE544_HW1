package com.example.binarysearch;


import android.app.Activity;

public class BinarySearch extends Activity{
	
	private int index = 0;
	private static final int MAX_COUNT = 12;
	private static final int MIN_COUNT = 8;
	private int[] searchArray = new int[MAX_COUNT];
	private boolean IsSorted = false;
	
	//default constructor
	BinarySearch()
	{
		
	}
	//Pass in a Sorted Array and test key
	//Defines variables used in binary search
	//If found returns index of array 
	//If not found returns -2
	public int search(int[] sortedArray,int key)
	{
		//found = false;
		
		boolean exists = false;
		int mid = 0,		
			last = index - 1,
			first = 0;				
		
		while(first <= last && !exists)
		{
			
			mid = (first + last)/2;
			if(sortedArray[mid] == key)
			{
				exists = true;
			}
			else
			{
				if(sortedArray[mid] > key)
					last = mid - 1;
				else
					first = mid + 1;
			}			
			
		}
		
		if(!exists)
			mid = -2;
		
		return mid;
	}
	
	//Performs a check on the size of the array
	// Then sorts the array
	//Passes the sorted array to the Search method
	//Tests if a Sort has occurred.
	public int preSearch(int number)
	{
		int result = 0;
		
		if(IsSorted == false)
			return -3; 
		
		if(index < MIN_COUNT)
		{
			result = -1;			
		}
		else
		{			
			result = search(searchArray, number);
		}			
				
		return result;
		
	}
	
	//Tests size then
	//Inserts an Integer into the array	
	public void addInteger(int number)
	{
		if(IsSorted == true)
			IsSorted = false;
		searchArray[index++] = number;				

	}	
					
	//Tests integer
	//Tests to ensure that number being added
	//can be placed in array
	//Also checks for duplicates
	public int testInteger(int number)
	{
		int testResult = 0;
		boolean duplicate = false;
		
		//Checks for maximum input
		if(index < MAX_COUNT -1 )
		{
			//Checking for duplicates
			for(int i = 0; i < index; i++)
			{
				if(searchArray[i] == number)
					duplicate = true;
			}
			if(duplicate == true)
			{
				//Returns Error for
				//Duplicates
				testResult = -2;
			}			
			else
				addInteger(number);
				
		}	
		else
		{
			//Returns Error for Array overload
			testResult = -1;
		}

		
		return testResult;
	}
	
	public String showArray()
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("[");
		for(int i =0; i< index; i++)
		{
			stringBuilder.append(searchArray[i]);
			if(i != index-1) 
    			stringBuilder.append(",");
		}
			stringBuilder.append("]");
					
		return stringBuilder.toString();
		
	}
	
	//Performs a bubble sort
	public int[] SortArray(int[] sort)
	{
		int temp = 0;
		for(int i = 0; i < index; i++)
		{
			for(int j = 1; j < index; j++)
			{
			
				if(sort[j -1] > sort[j])
				{
					temp = sort[j -1];
					sort[j - 1] = sort[j];
					sort[j] = temp;
				}				
			}
		}
		IsSorted = true;
		return sort;
	}
	
	//Helper for Sort
	public void preSort()
	{
		searchArray = SortArray(searchArray);		
	}
	

}
