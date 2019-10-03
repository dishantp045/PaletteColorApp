package edu.temple.palettecolorapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class PaletteActivity extends AppCompatActivity {

    private final String colors[] = {"blue", "green", "purple", "red", "gray", "cyan", "magenta", "yellow", "lime"};
    private boolean isSelected = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        final Intent intent = new Intent(this,ColorActivity.class);

        final Spinner spinner = findViewById(R.id.spinner1);
        spinner.setAdapter(new PaletteAdapter(this, colors));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!isSelected) {
                    intent.putExtra("backgroundColor", colors[position]);
                    startActivity(intent);
                }
                isSelected = false;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
