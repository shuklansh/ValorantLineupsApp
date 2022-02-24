package com.jadeapss.valorantlineupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ascentLineup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ascentLineup = (Button) findViewById(R.id.ascentLineup);
        ascentLineup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdefaultxml();
            }
        });



    }
    public void openAdefaultxml() {
        Intent intent = new Intent(this, ascent.class);
        startActivity(intent);
    }
}