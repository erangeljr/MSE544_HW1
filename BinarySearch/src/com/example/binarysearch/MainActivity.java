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
    
    public void addIntegerSaveButtonOnClick(View view)
    {
    	try
    	{
    		int number = Integer.parseInt(addIntegerEditText.getText().toString());
    		
    		if(binSearch.testInteger(number))
    		{    			
    			binSearch.addInteger(number);
    			resultsEditText.setText("Test Successful");
    		}        		
        	else
        		resultsEditText.setText("Test Unsuccessful");;
    	}
    	catch(NumberFormatException e)
    	{
    		resultsEditText.setText("Enter a valid Integer!");
    	}    	 	    	
    	    	
    }
    
    public void searchIntegerEditTextOnClick(View view)
    {
    	searchIntegerEditText.setText("");
    }
    
    public void searchEnterButtonOnClick(View view)
    {
    	try
    	{
    		int number = Integer.parseInt(searchIntegerEditText.getText().toString());
    		resultsEditText.setText("Received: " + number);

    	}
    	catch(NumberFormatException e)
    	{
    		resultsEditText.setText("Enter a valid Integer!");
    	}
    	
    	resultsEditText.setText("Search Click Received");
    }    
    
}
