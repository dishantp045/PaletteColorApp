package edu.temple.palettecolorapp;

import android.content.Intent;
import android.content.res.Resources;
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
    private boolean isSelected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        Resources res = context.getResources();
        String title = res.getString(R.string.palette_title);
        setTitle(title);
        setContentView(R.layout.activity_palette);
        final String translation[] = res.getStringArray(R.array.colors);
        //final Intent intent = new Intent(this,ColorActivity.class);

        final Spinner spinner = findViewById(R.id.spinner1);
        spinner.setAdapter(new PaletteAdapter(this, colors,translation));
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
