package com.ayoolaolafenwa.naturetwist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Chapter10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fb_home);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chapter10.this, MainActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton next = (FloatingActionButton)findViewById(R.id.fb_nxt);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(Chapter10.this, About.class);
                startActivity(intent1);
            }
        });

        FloatingActionButton pre = (FloatingActionButton)findViewById(R.id.fb_pre);

        pre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(Chapter10.this,Chapter9.class);
                startActivity(intent1);
            }
        });
    }

}
