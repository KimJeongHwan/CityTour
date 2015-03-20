package org.androidtown.citytour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButton3_1Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity3_jukbyuk.class);
        startActivity(intent);
    }

    public void onButton3_2Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity3_goin.class);
        startActivity(intent);
    }

    public void onButton3_3Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity3_oonju.class);
        startActivity(intent);
    }
}
