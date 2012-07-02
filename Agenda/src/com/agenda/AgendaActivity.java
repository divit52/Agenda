package com.agenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AgendaActivity extends Activity {
	
	Button bClass, bHw, bGpa, bCal;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bClass = (Button) findViewById(R.id.button1);
        bClass.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				Intent classIntent = new Intent(AgendaActivity.this, ClassActivity.class);
				startActivity(classIntent);				
			}
        	
        });
        
        bHw = (Button) findViewById(R.id.button2);
        
        bGpa = (Button) findViewById(R.id.button3);
        
        bGpa.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
	        	Intent classIntent = new Intent(AgendaActivity.this, GpaActivity.class);
	        	startActivity(classIntent);
			}
        });
        
        bCal = (Button) findViewById(R.id.button4);
        
       
    }
}