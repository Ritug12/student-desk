package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin_Login extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    final Context c=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        e1 = (EditText) findViewById(R.id.editText13);
        e2 = (EditText) findViewById(R.id.editText14);
        b1 = (Button) findViewById(R.id.buttonn17);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("admin") && e2.getText().toString().equals("admin123")) {
                    Toast.makeText(getApplicationContext(), "Details are correct", Toast.LENGTH_LONG).show();
                    AlertDialog.Builder a = new AlertDialog.Builder(c);
                    a.setTitle("Do you want to login");
                    a.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            e1.setText("");
                            e2.setText("");

                            Intent i = new Intent(getApplicationContext(), AddNotice.class);
                            startActivity(i);

                        }
                    });
                    a.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog ad = a.create();
                    ad.show();

                } else {
                    Toast.makeText(getApplicationContext(), "invalid Details", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
