package com.example.kostkadogry;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class ActivityTwo extends Activity implements OnClickListener {
	
	private Button generuj;
	private TextView wynik;
	private final static int MIN = 1;
	private final static int MAX = 6;
	private Random randomGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        
        generuj = (Button) findViewById(R.id.generuj_but);
        generuj.setOnClickListener(this);
        wynik = (TextView) findViewById(R.id.kostka_do_gry_tv);
        
        randomGenerator = new Random();
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

	@Override
	public void onClick(View v) {
		
		if(v.getId() == R.id.generuj_but) {
			
			int temp = randomGenerator.nextInt(MAX) + MIN;
			wynik.setText("Wynik: " + temp);
		}
		
	}
}
