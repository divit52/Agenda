package com.agenda;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClassActivity extends Activity{

	public static final String PREFS_NAME = "MyPrefsFile";
	
	EditText etclass1, etclass2, etclass3, etclass4, etclass5, etclass6,
		etcred1, etcred2, etcred3, etcred4, etcred5, etcred6;
	
	Button bSave;
	
	EditText[] classArray;
	EditText[] numArray;
	TextView credTotal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classobj);
		
		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		final SharedPreferences.Editor editor = settings.edit();
		
		etclass1 = (EditText) findViewById(R.id.editText1);
		etclass2 = (EditText) findViewById(R.id.EditText01);
		etclass3 = (EditText) findViewById(R.id.EditText02);
		etclass4 = (EditText) findViewById(R.id.EditText03);
		etclass5 = (EditText) findViewById(R.id.EditText04);
		etclass6 = (EditText) findViewById(R.id.EditText05);
		etcred1 = (EditText) findViewById(R.id.editText2);
		etcred2 = (EditText) findViewById(R.id.EditText06);
		etcred3 = (EditText) findViewById(R.id.EditText07);
		etcred4 = (EditText) findViewById(R.id.EditText08);
		etcred5 = (EditText) findViewById(R.id.EditText09);
		etcred6 = (EditText) findViewById(R.id.EditText10);
		credTotal = (TextView) findViewById(R.id.textView4);
		
		bSave = (Button) findViewById(R.id.button1);
		
		EditText[] classArrayFill= {etclass1, etclass2, etclass3, etclass4,
				etclass5, etclass6};
		
		classArray = classArrayFill;
		
		EditText[] numArrayFill = {etcred1, etcred2, etcred3, etcred4, etcred5
				, etcred6};
		
		numArray = numArrayFill;
		
		bSave.setOnClickListener(new OnClickListener()
		{
			int totalCredits = 0;
			public void onClick(View v) 
			{
				for (int i = 0; i < classArray.length; i ++)
				{
					if (classArray[i].getText() != null && 
							numArray[i].getText() != null && 
							!classArray[i].getText().toString().equals("")
							&& !classArray[i].getText().toString().equals(""))
					{
						totalCredits += Integer.parseInt(numArray[i].getText().toString());
						editor.putString("Class " + i, classArray[i].getText().toString());
						System.out.println("Class " + i + ": " + classArray[i].getText().toString());
						//editor.putInt("Credit " + i, Integer.parseInt(numArray[i].getText().toString()));
						editor.commit();
					}
				}
				credTotal.setText("" + totalCredits);
			}
		});
		
	}


	
}
