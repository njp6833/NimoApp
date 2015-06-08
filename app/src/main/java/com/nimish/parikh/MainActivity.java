

package com.nimish.parikh;

import com.nimish.parikh.*;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	int counter,ballCounter;
	Button add,add2,add3,add4,add6,sub,reset,badd,bsub,brest;
	TextView display,display2;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        add2 = (Button) findViewById(R.id.bAdd2);
        add3 = (Button) findViewById(R.id.bAdd3);
        add4 = (Button) findViewById(R.id.bAdd4);
        add6 = (Button) findViewById(R.id.bAdd6);
        sub = (Button) findViewById(R.id.bSub);
        reset = (Button) findViewById(R.id.bReset);
        badd = (Button) findViewById(R.id.ballAdd);
        bsub = (Button) findViewById(R.id.ballSub);
        brest = (Button) findViewById(R.id.ballReset);


        display = (TextView) findViewById(R.id.tvDisplay);
        add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Your total is "+counter);
			}
		});

        add2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                counter += 2 ;
                display.setText("Your total is "+counter);
            }
        });

        add3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                counter += 3 ;
                display.setText("Your total is "+counter);
            }
        });

        add4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                counter += 4 ;
                display.setText("Your total is "+counter);
            }
        });

        add6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                counter += 6 ;
                display.setText("Your total is "+counter);
            }
        });




        sub.setOnClickListener(new View.OnClickListener() {

        	@Override
        	public void onClick(View v)
            {
        		// TODO Auto-generated method stub
        		counter--;
                if (counter <= 0)
                {
                    counter = 0;
                    display.setText("Your total is " + 0);
                }
                else
                {
                    display.setText("Your total is "+counter);
        	    }
            }
        	
        	
        	
        });
        
        reset.setOnClickListener(new View.OnClickListener() {

        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		counter = 0;
        		display.setText("Your total is "+counter);
        	}
        	
        	
        	
        });
        
       display2 = (TextView) findViewById(R.id.tvDisplay1);

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ballCounter++;
                display2.setText("Your total is " + ballCounter);
            }

        });

        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ballCounter--;
                if (counter <= 0)
                {
                    ballCounter = 0;
                    display2.setText("Your total is " + 0);
                }
                else
                {
                    display2.setText("Your total is "+ballCounter);
                }
            }

        });
        brest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ballCounter = 0;
                display2.setText("Your total is " + ballCounter);
            }

        });



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
