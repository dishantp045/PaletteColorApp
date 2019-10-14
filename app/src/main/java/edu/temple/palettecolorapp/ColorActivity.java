package edu.temple.palettecolorapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        Resources res = context.getResources();
        String title = res.getString(R.string.color_title);
        setTitle(title);
        setContentView(R.layout.activity_color);
        ConstraintLayout layout = findViewById(R.id.color_layout);
        Bundle paletteData = getIntent().getExtras();
        if(paletteData != null){
            String color = paletteData.getString("backgroundColor");
            layout.setBackgroundColor(Color.parseColor(color));
        }
    }
}
