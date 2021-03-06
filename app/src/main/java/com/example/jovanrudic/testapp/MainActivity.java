package com.example.jovanrudic.testapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView proba;
    Button btnKul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKul = (Button) findViewById(R.id.btnKul);
        proba = (TextView) findViewById(R.id.tvTest);

        Button but = (Button) findViewById(R.id.btnTest);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //proba.setText("Testiranje");
                Animation animation = AnimationUtils.loadAnimation(getApplication(), R.anim.fall_from_the_sky);
                btnKul.startAnimation(animation);
                btnKul.setVisibility(View.VISIBLE);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
