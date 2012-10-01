package com.example.binarysearch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {


	private EditText addIntegerEditText;
	private EditText searchIntegerEditText;
	private EditText resultsEditText;	

	
	BinarySearch binSearch = new BinarySearch(); 
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
       addIntegerEditText = (EditText) findViewById(R.id.addIntegerEditText);
       searchIntegerEditText = (EditText) findViewById(R.id.searchIntegerEditText);
       resultsEditText = (EditText) findViewById(R.id.resultsEditText);
       
                
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void addIntegerEditTextOnClick(View view)
    {
    	addIntegerEditText.setText("");
    }
    
    //Tests input for a valid integer
    //based on the return results from testInteger
    //will display results from method test
    //Input must be between 1 - 100
    public void addIntegerSaveButtonOnClick(View view)
    {
    	try
    	{
    		int number = Integer.parseInt(addIntegerEditText.getText().toString()),
    			result =0;
    		if(number <= 1 || number > 100)
    		{
    			resultsEditText.setText("Enter an Integer between 1 - 100");
    		}
    		else
    		{
    			result = binSearch.testInteger(number);
        		if(result == -1)
        			resultsEditText.setText("Cannot Add anymore!");
        		if(result == -2)
        			resultsEditText.setText("Duplicate: " + number);
        		if(result == 0)	
        			resultsEditText.setText("Added Successful: " + number);
    			
    		}
    		    		
    
    	}
    	catch(NumberFormatException e)
    	{
    		resultsEditText.setText("Enter a valid Integer!");
    	}    	 	    
    	addIntegerEditText.setText("");
    	    	
    }
    
    public void searchIntegerEditTextOnClick(View view)
    {
    	searchIntegerEditText.setText("");
    }
    
    //OnClick event for Search
    //Tests to ensure a valid integer is being passed
    //Depending on the Return from the preSearch will 
    //display results if successfully found    
    public void searchEnterButtonOnClick(View view)
    {
    	try
    	{
    		int number = Integer.parseInt(searchIntegerEditText.getText().toString()),
    			location = 0;
    		
    		if(number == 0)
    			finish();
    		
    		location = binSearch.preSearch(number);
    		
    		
    		if(location == -1)
    			resultsEditText.setText("Enter more Integers!");
    		if(location == -2)
    			resultsEditText.setText("Integer not Found!"); 
    		if(location > 0)     			
    			resultsEditText.setText("Location: " + location);
    		

    	}
    	catch(NumberFormatException e)
    	{
    		resultsEditText.setText("Enter a valid Integer!");
    	}
    	
    	
    }    
    
    //Currently not implemented
    public void showButtonOnClick(View view)
    {
    	String  results;
    	results = binSearch.showArray().toString();
    	
    	resultsEditText.setText("Show: ");
    }
    
}
