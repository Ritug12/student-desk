package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


public class Dashboard extends AppCompatActivity {
    Button b2,b4,b5,b7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        b2=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.button6);
        b5=(Button)findViewById(R.id.button7);
        b7=(Button)findViewById(R.id.button27);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Course_Det.class);
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Syllabus_Det.class);
                startActivity(i);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Exam.class);
                startActivity(i);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Notice.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

       /* public void sign_out(View view) {
        AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                //User is now signed out
                Toast.makeText(getApplicationContext(),"User is signed out",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Dashboard.this, MainActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                Dashboard.this.startActivity(intent);
            }
        });
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        return super.onOptionsItemSelected(item);

    }
}

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        Intent i=new Intent(getApplicationContext(), SignIn.class);
//        startActivity(i);
//        return super.onOptionsItemSelected(item);
//
//    }

