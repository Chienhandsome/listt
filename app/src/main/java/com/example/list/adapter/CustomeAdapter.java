package com.example.list.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.list.R;
import com.example.list.model.user;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomeAdapter extends ArrayAdapter<user> {
    private Context context;
    private int resource;
    private ArrayList<user> arrUser;
    public CustomeAdapter( Context context,  int  resource,ArrayList<user> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrUser=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.row_item_user, parent, false);

        ImageView tv_color =  convertView.findViewById(R.id.tv_color);
        TextView tv_name = convertView.findViewById(R.id.tv_name);
        TextView tv_number = convertView.findViewById(R.id.tv_number);
        user usr = arrUser.get(position);

        tv_name.setText(usr.getmName());
        tv_number.setText(usr.getmNumBer());
        Picasso.get().load(usr.getmLink()).into(tv_color);
        return convertView;
    }
}
