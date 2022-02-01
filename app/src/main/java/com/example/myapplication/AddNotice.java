package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNotice extends Activity implements View.OnClickListener {
    private Button addTodoBtn,updateBtn,deleteBtn;
    private EditText subjectEditText;
    private EditText descEditText;
    private long _id;



    private DatabaseManager dbManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notice);

        subjectEditText = (EditText)findViewById(R.id.edit_notice);
        descEditText = (EditText)findViewById(R.id.edit_descr);

        addTodoBtn = (Button)findViewById(R.id.addrecord);


        dbManager = new DatabaseManager(this);
        dbManager.open();
        addTodoBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addrecord:

                final String name = subjectEditText.getText().toString();
                final String desc = descEditText.getText().toString();

                dbManager.insert(name, desc);

                Intent main = new Intent(AddNotice.this, Notice.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(main);
                break;

        }
    }


}