package edu.temple.palettecolorapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class PaletteActivity extends AppCompatActivity {

    private final String colors[] = {"white", "blue", "green", "purple", "red", "gray", "cyan", "magenta", "yellow", "lime"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);


        final Spinner spinner = findViewById(R.id.spinner1);
        spinner.setAdapter(new PaletteAdapter(this, colors));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
