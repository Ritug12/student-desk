package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Exam extends AppCompatActivity {
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        b1 =(Button)findViewById(R.id.button25);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu pm= new PopupMenu(Exam.this,b1);
                pm.getMenuInflater().inflate(R.menu.pop_up1,pm.getMenu());
                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId()==R.id.it) {
                            Intent i = new Intent(getApplicationContext(), IT_Notes.class);
                            startActivity(i);
                        }
                        else if(item.getItemId()==R.id.cs){
                            Intent i=new Intent(getApplicationContext(),CS_Notes.class);
                            startActivity(i);
                        }
                        else if(item.getItemId()==R.id.bms){
                            Intent i=new Intent(getApplicationContext(),BMS_Notes.class);
                            startActivity(i);

                        }
                        return false;
                    }
                });
                pm.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.logout)
        {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
        else if(id==R.id.home)
        {
            Intent i=new Intent(getApplicationContext(),Dashboard.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
