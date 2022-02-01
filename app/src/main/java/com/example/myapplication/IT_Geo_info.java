package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IT_Geo_info extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_geo_info);
        pdfView=(PDFView)findViewById(R.id.pdfit2);
        pdfView.fromAsset("itpdf2.pdf").load();

    }
}