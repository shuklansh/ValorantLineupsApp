package com.jadeapss.valorantlineupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ascent extends AppCompatActivity {
    private Button aDefault;
    private Button midcubbybut;
    private Button bdefbut;
    private Button openadefatk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascent);
        aDefault = (Button) findViewById(R.id.aDefault);
        aDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAscent();
            }
        });
        midcubbybut = (Button) findViewById(R.id.midcubbybut);
        midcubbybut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmidcubby();
            }
        });
        openadefatk = (Button) findViewById(R.id.openadefatk);
        openadefatk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openadefatk();
            }
        });
        bdefbut = (Button) findViewById(R.id.bdefbut);
        bdefbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbdef();
            }
        });



    }
    public void openAscent() {
        Intent intent = new Intent(this, adefault.class);
        startActivity(intent);
    }
    public void openmidcubby() {
        Intent intent = new Intent(this, midcubby.class);
        startActivity(intent);
    }

    public void openadefatk() {
        Intent intent = new Intent(this, asitedefattk.class);
        startActivity(intent);
    }

    public void openbdef() {
        Intent intent = new Intent(this, bdefault.class);
        startActivity(intent);
    }

}
