package com.example.binarysearch;

import java.util.Arrays;


import android.app.Activity;

public class BinarySearch extends Activity{
	
	private int index = 0;
	private static final int MAX_COUNT = 12;
	private static final int MIN_COUNT = 8;
	private int[] searchArray = new int[MAX_COUNT];
	private boolean ADDED_SUCCESFULLY = false;
	
	//default constructor
	BinarySearch()
	{
		
	}
	//should pass in search key, left, and right
	//Add more comments
	public int search(int[] sortedArray,int key)
	{
		//found = false;
		
		boolean exists = false;
		int mid = 0,		
			last = sortedArray.length -1,
			first = MAX_COUNT - index;				
		
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
					last = mid -1;
				else
					first = mid + 1;
			}			
			
		}
		
		if(!exists)
			mid = -2;
		
		return mid;
	}
	
	//Performs a check on the size of the array
	// The sorts the array
	public int preSearch(int number)
	{
		int result = 0;
		if(index < MIN_COUNT)
		{
			result = -1;			
		}
		else
		{
			Arrays.sort(searchArray);
			result = search(searchArray, number);
		}
		
			
				
		return result;
		
	}
	
	//Tests size then
	//Inserts an Integer into the array	
	public void addInteger(int number)
	{
	
		searchArray[index++] = number;				

	}	
					
	
	public int testInteger(int number)
	{
		int testResult = 0;
		boolean duplicate = false;
		
		if(index < MAX_COUNT )
		{
			if(preSearch(number) > 0 )
			;
			if(duplicate == false)
				addInteger(number);				

		}	
		else
		{
			testResult = -1;
		}
		if(duplicate == true)
			testResult = -2;
		return testResult;
	}
	
	public int[] showArray()
	{
		return searchArray; 
	}
	

}
