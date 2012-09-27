package com.example.binarysearch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

//	
//	private static int MAX_VALUE = 10;
	private EditText addIntegerEditText;
//	private EditText searchIntegerEditText;
	private EditText resultsEditText;
//	private int searchArray[];
//	private int count = 0;
//	Button addIntegerSaveButton = (Button) findViewById( R.id.addIntegerSaveButton);
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
       addIntegerEditText = (EditText) findViewById(R.id.addIntegerEditText);
       //searchIntegerEditText = (EditText) findViewById(R.id.searchIntegerEditText);
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
//    	int number=0;
//    	testInteger(number);
    	resultsEditText.setText("Click Received");
    }
    
    private void addInteger(int number)
    {
//    	count++;
//    	int index=0;
//    	searchArray[index++] = number;
    }
    
    private boolean testInteger(int number)
    {    	
    	addInteger(number);
		return true;
    }
}
