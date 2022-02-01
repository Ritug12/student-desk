package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class IUD extends AppCompatActivity {

    private DatabaseManager dbManager;

    private ListView listView;
    Button b1;

    private SimpleCursorAdapter adapter;

    final String[] from = new String[] { DBHelper._ID,
            DBHelper.SUBJECT, DBHelper.DESC };

    final int[] to = new int[] { R.id.id, R.id.ttle, R.id.desc };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_list);



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.add) {
            Toast.makeText(getApplicationContext(),"ryt",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),AddNotice.class);
            startActivity(i);

        }
        else if(id == R.id.add2) {
            Toast.makeText(getApplicationContext(), "ryt", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), Notice.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}