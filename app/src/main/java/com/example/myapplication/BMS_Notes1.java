package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BMS_Notes1 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bms_notes1);
        pdfView=(PDFView)findViewById(R.id.pdfbms);
        pdfView.fromAsset("bms1.pdf").load();
    }
}