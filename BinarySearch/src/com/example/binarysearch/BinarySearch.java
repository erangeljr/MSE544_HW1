package com.example.binarysearch;

import java.util.Arrays;

import android.app.Activity;

public class BinarySearch extends Activity{
	
	private int index = 0;
	private static final int MAX_COUNT = 12;
	private static final int MIN_COUNT = 8;
	private int[] searchArray = new int[MAX_COUNT];
	//private boolean ADDED_SUCCESFULLY = false;
	
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
	// Then sorts the array
	//Passes the sorted array to the Search method
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
					
	//Tests integer
	//Tests to ensure that number being added
	//can be placed in array
	//Also checks for duplicates
	public int testInteger(int number)
	{
		int testResult = 0;
		boolean duplicate = false;
		
		if(index < MAX_COUNT -1 )
		{
			if(preSearch(number) >= 0 )
				duplicate = true;
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
	
	public String showArray()
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i =0; i< index; i++)
    		stringBuilder.append(searchArray[i]);
					
		return stringBuilder.toString();
		
	}
	

}
