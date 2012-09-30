package com.example.binarysearch;

import java.util.Arrays;

import android.app.Activity;

public class BinarySearch extends Activity{
	
	private Boolean found = false;	
	private int index = 0;
	private static final int MAX_COUNT = 12;
	private static final int MIN_COUNT = 8;
	private int[] searchArray = new int[MAX_COUNT];
	
	
	//should pass in search key, left, and right
	//Add more comments
	public int search(int[] sortedArray,int key)
	{
		//found = false;
		
		boolean exists = false;
		int mid = 0,		
			last = sortedArray.length -1,
			first = MAX_COUNT - index,
			counter = 0;
		
		
		while(counter <= MAX_COUNT)
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
			counter++;				
		}
		
		if(!exists)
			mid = -2;
		
		return mid;
	}
	
	//Add more comments
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
	
	//Add more comments	
	public void addInteger(int number)
	{
		
		if(index < MAX_COUNT )
		{
			searchArray[index++] = number;				

		}						
				
	}
	

}
