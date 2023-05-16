package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import com.example.list.adapter.CustomeAdapter;
import com.example.list.model.user;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvUser =  findViewById(R.id.lv_user);
        ArrayList<user> arrayList = new ArrayList<>();

        user  usr1 =   new user(Color.BLUE,"Đinh Trần Công Chiến","Hi! R u ok?", 0);
        user  usr2 = new user(Color.BLUE,"Nguyễn Văn A",        "Niceee!!!", 1);
        user  usr3 = new user(Color.BLUE,"Trần Lưu",            "come on dude:/", 0);


        arrayList.add(usr1);
        arrayList.add(usr2);
        arrayList.add(usr3);


        CustomeAdapter customeAdapter = new CustomeAdapter(this, R.layout.row_item_user, arrayList);
        lvUser.setAdapter(customeAdapter);
    }
}