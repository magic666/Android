package com.example.plus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class ActivityTwo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
	}
	 public void buttonClick(View view){
	    	EditText numA  = (EditText)findViewById(R.id.editText1);
	    	EditText numB  = (EditText)findViewById(R.id.editText2);
	    	EditText wynik = (EditText)findViewById(R.id.editText3);
	    	float num1 = Float.parseFloat(numA.getText().toString());
	    	float num2 = Float.parseFloat(numB.getText().toString());
	    	float eq = 0;

	    	switch(view.getId()){
	    		case R.id.button1:
	    			eq = num1 + num2;
	    			break;
	    		case R.id.button2:
	    			eq = num1 - num2;
	    			break;
	    		case R.id.button3:
	    			eq = num1 * num2;
	    			break;
	    		case R.id.button4:
	    			eq = num1 / num2;
	    			break;
	    	}

	    	wynik.setText(String.format("%f", eq));
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
