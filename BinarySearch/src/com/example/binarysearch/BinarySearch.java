package com.example.binarysearch;

import android.app.Activity;

public class BinarySearch extends Activity{
	
	private Boolean found = false;	
	private int index = 0;
	private static final int MAX_COUNT = 12;
	private static final int MIN_COUNT = 8;
	private int[] searchArray = new int[MAX_COUNT];

	//searchArray = { 0, 3, 1, 7, 2, 8, 12, 53, 64, 95, 6, 71};
	
	
	//should pass in search key, left, and right

	public int search(int[] sortedArray,int key, int first,int last)
	{
		int mid = 0;
		found = false;
		last = sortedArray.length - 1;
		first = 0;
		
		mid = (first + last)/2;
		
		while(!found)
		{
			if(sortedArray[mid] == key)
			{
				found = true;
			}
			else
			{
				if(sortedArray[mid] > key)
					last = mid - 1; 
				else
					first = mid + 1;
			}			
		}
		
		
		
		
		

		return mid;
	}
	
	public void addInteger(int number)
	{
		try
		{
			searchArray[index++] = number;	
		}
		catch(Exception e)
		{
			
		}
				
	}

	public boolean testInteger(int number)
	{
		found = false;
		if(index > MIN_COUNT || index < MAX_COUNT )
		{			
			addInteger(number);
			found = true;
		}
			
		return found;
	}
	
	

}
