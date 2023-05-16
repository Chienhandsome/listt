package com.example.list.adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.list.R;
import com.example.list.model.user;

import java.util.ArrayList;
import java.util.List;

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

        TextView tv_color = (TextView) convertView.findViewById(R.id.tv_color);
        TextView tv_name = (TextView)convertView.findViewById(R.id.tv_name);
        TextView tv_number = (TextView)convertView.findViewById(R.id.tv_number);
        user usr = arrUser.get(position);
        tv_color.setBackgroundColor(usr.getmCoLor());
        tv_color.setText((position+1)+"");
        tv_name.setText(usr.getmName());
        tv_number.setText(usr.getmNumBer());
        return convertView;
    }
}
