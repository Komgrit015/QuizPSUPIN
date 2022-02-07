package com.example.komgrit.psupin;

/**
 * Created by Komgrit on 15/11/2560.
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by STD on 15/11/2560.
 */


public class Pinadapter extends BaseAdapter {

    private static final android.R.attr R = ;
    Context mContext;
    ArrayList<Pin> pins = new ArrayList<>();

    public Pinadapter(Context context, ArrayList<Pin> pins) {
        this.mContext = context;
        this.pins = pins;

    }

    @Override
    public int getCount() {
        return this.pins.size();
    }

    @Override
    public Object getItem(int i) {


        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater mInflater =
                (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if (view == null)
            view = mInflater.inflate(R.layout.activity_pin, viewGroup, false);
        //Data binding

        TextView textUsername = (TextView) view.findViewById(R.id.username);
        textUsername.setText(this.pins.get(i).getUsername());

        TextView textTime = (TextView) view.findViewById(R.id.time);
        textTime.setText(this.pins.get(i).getPostTime());

        if (this.pins.get(i).getIcon() == 1) {
            ImageView imagePin = (ImageView) view.findViewById(R.id.imageView);
            imagePin.setBackgroundResource(R.drawable.ic_1);

        } else if (this.pins.get(i).getIcon() == 2) {
            ImageView imagePin = (ImageView) view.findViewById(R.id.imageView);
            imagePin.setBackgroundResource(R.drawable.ic_2);

        } else if (this.pins.get(i).getIcon() == 3) {
            ImageView imagePin = (ImageView) view.findViewById(R.id.imageView);
            imagePin.setBackgroundResource(R.drawable.ic_3);

        }


        return view;
    }

}

