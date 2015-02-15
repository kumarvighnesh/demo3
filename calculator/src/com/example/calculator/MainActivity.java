package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends Activity {
 Button b1;
 Button b2;
 Button b3;
 Button b4;
 EditText t1;
 EditText t2;
 EditText t3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1=(EditText)findViewById(R.id.editText1);
		t2=(EditText)findViewById(R.id.editText2);
		t3=(EditText)findViewById(R.id.editText3);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float num1,num2,num3;
				num1=Integer.parseInt(t1.getText().toString());
				num2=Integer.parseInt(t2.getText().toString());
				num3=num1+num2;
				t3.setText(" "+num3);
				
				
			}
		});
		b2=(Button)findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float num1,num2,num3;
				num1=Integer.parseInt(t1.getText().toString());
				num2=Integer.parseInt(t2.getText().toString());
				num3=num1-num2;
				t3.setText(" "+num3);
				
			}
		});
		b3=(Button)findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float num1,num2,num3;
				num1=Integer.parseInt(t1.getText().toString());
				num2=Integer.parseInt(t2.getText().toString());
				num3=num1*num2;
				t3.setText(" "+num3);
				
			}
		});
		b4=(Button)findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float num1,num2,num3;
				num1=Integer.parseInt(t1.getText().toString());
				num2=Integer.parseInt(t2.getText().toString());
				num3=num1/num2;
				t3.setText(" "+num3);
				
			}
		});
		
		
		
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
