package edu.temple.palettecolorapp;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class PaletteActivity extends AppCompatActivity implements PaletteFragment.OnFragmentInteractionListener {

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
        PaletteFragment master = PaletteFragment.newInstance(colors,translation);
        ColorFragment subject = ColorFragment.newInstance();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment1,master);
        ft.add(R.id.fragment2,subject);
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
