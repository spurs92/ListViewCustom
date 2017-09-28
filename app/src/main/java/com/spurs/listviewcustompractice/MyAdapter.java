package com.spurs.listviewcustompractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by alfo06-11 on 2017-05-24.
 */

public class MyAdapter extends BaseAdapter {

    ArrayList<Custom> customs;
    LayoutInflater inflater;

    public MyAdapter(ArrayList<Custom> customs, LayoutInflater inflater) {
        this.customs = customs;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return customs.size();
    }

    @Override
    public Object getItem(int position) {
        return customs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView=inflater.inflate(R.layout.lisetview_item,null);
        }

        Custom c=customs.get(position);
        int img=c.getImg();
        String name=c.getName();
        String weight=c.getWeight();
        String height=c.getHeight();
        String year=c.getYear();

        ImageView imageView=(ImageView) convertView.findViewById(R.id.img);
        TextView textView=(TextView) convertView.findViewById(R.id.text_name);
        TextView textView1=(TextView) convertView.findViewById(R.id.text_weight);
        TextView textView2=(TextView) convertView.findViewById(R.id.text_height);
        TextView textView3=(TextView) convertView.findViewById(R.id.text_year);

        imageView.setImageResource(img);
        textView.setText(name);
        textView1.setText(weight);
        textView2.setText(height);
        textView3.setText(year);

        return convertView;
    }
}
