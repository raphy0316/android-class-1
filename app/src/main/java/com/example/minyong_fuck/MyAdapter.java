package com.example.minyong_fuck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 오현택 on 2017-03-24.
 */

class MyAdapter extends BaseAdapter {
    ArrayList<ItemList> items;

    Context context;

    public MyAdapter(ArrayList<ItemList> items,Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, null);
        TextView name = (TextView) view.findViewById(R.id.title);
        TextView num = (TextView) view.findViewById(R.id.number);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        ItemList item = items.get(position);

        name.setText(item.getName());
        num.setText(item.getNum());
        return view;
    }
}
