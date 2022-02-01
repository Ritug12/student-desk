package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Course_Det extends AppCompatActivity {

        Button b1,b2,b3;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_course_det);
            b1=(Button)findViewById(R.id.buttonn);
            b2=(Button)findViewById(R.id.button20);
            b3=(Button)findViewById(R.id.button23);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),Bms_det.class);
                    startActivity(i);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),IT_det.class);
                    startActivity(i);

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),CS_det.class);
                    startActivity(i);
                }
            });


        }
    }

