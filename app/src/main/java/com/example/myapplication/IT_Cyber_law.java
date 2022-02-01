package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IT_Cyber_law extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_cyber_law);
        pdfView=(PDFView)findViewById(R.id.pdfit1);
        pdfView.fromAsset("itpdf1.pdf").load();

    }
}