package com.example.binarysearch;

import android.app.Activity;

public class BinarySearch extends Activity{
	
	private Boolean found = false;	
	private int index = 0;
	private static final int MAX_COUNT = 12;
	private static final int MIN_COUNT = 8;
	private int[] searchArray = new int[MAX_COUNT];
	
	
	public boolean search(int number)
	{
		found = false;
		int control = 0;
		while(!found)
		{
			if(searchArray[control++] == number);
				found = true;
		}
		return found;
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
