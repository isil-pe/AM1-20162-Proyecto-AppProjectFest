package com.aromero.appproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.aromero.appproject.R;

/**
 * Created by User on 07/11/2016.
 */
public class MenuListAdapter extends BaseAdapter {

    private Context context;
    private String[] data;

    public MenuListAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.row_speech,parent,false);
        } else {
            view = convertView;
        }
        TextView tviTitle=(TextView)view.findViewById(R.id.txtTitle);
        tviTitle.setText(data[position]);
        return view;
    }
}
