package edu.temple.palettecolorapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PaletteAdapter extends BaseAdapter {

    String colors[];
    Context c;

    public PaletteAdapter(Context c, String colors[]){
        this.c = c;
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(c);
        textView.setText(colors[position]);
        textView.setId(position);
        textView.setTextSize(28);
        LinearLayout ll = new LinearLayout(c);
        ll.setBackgroundColor(Color.parseColor(colors[position]));
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.addView(textView);
        return ll;
    }
}
