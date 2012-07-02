package com.agenda;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GpaActivity extends Activity{

	TextView tvclass1, tvclass2, tvclass3, tvclass4, tvclass5, tvclass6;
	EditText etgrade1, etgrade2, etgrade3, etgrade4, etgrade5, etgrade6;
	Button bCalc;
	public static final String PREFS_NAME = "MyPrefsFile";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpa);
		

		
		tvclass1 = (TextView) findViewById(R.id.textClass1);
		tvclass2 = (TextView) findViewById(R.id.textClass01);
		tvclass3 = (TextView) findViewById(R.id.textClass02);
		tvclass4 = (TextView) findViewById(R.id.textClass03);
		tvclass5 = (TextView) findViewById(R.id.textClass04);
		tvclass6 = (TextView) findViewById(R.id.textClass05);
		
		etgrade1 = (EditText) findViewById(R.id.textClassSpec);
		etgrade2 = (EditText) findViewById(R.id.textClass06);
		etgrade3 = (EditText) findViewById(R.id.textClass07);
		etgrade4 = (EditText) findViewById(R.id.textClass08);
		etgrade5 = (EditText) findViewById(R.id.textClass09);
		etgrade6 = (EditText) findViewById(R.id.textClass10);
		
		bCalc = (Button) findViewById(R.id.buttonSave);
		

		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

		TextView[] textGroup = {tvclass1, tvclass2, tvclass3, tvclass4,
				tvclass5, tvclass6};
		
		for (int i = 0; i < textGroup.length; i++)
		{
			
			if (!settings.getString("Class " + i, "").equals("")) {
			System.out.println(settings.getString("Class " + i, "failed"));
			}
		}
	  
    	bCalc.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v) {
				
			}
			
		});

		
		
	}

}
