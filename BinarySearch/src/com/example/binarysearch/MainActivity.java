package com.example.binarysearch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

//	private EditText addIntegerEditText;
//	private EditText searchIntegerEditText;
//	Button addIntegerSaveButton = (Button) findViewById( R.id.addIntegerSaveButton);
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
       //addIntegerEditText = (EditText) findViewById(R.id.addIntegerEditText);
       //searchIntegerEditText = (EditText) findViewById(R.id.searchIntegerEditText);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void addIntegerSaveButtonOnClick(View view)
    {
    	
    }
}
