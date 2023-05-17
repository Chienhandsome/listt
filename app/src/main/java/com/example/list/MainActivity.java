package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import com.squareup.picasso.Picasso;
import com.example.list.adapter.CustomeAdapter;
import com.example.list.model.user;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvUser;
    String link1="https://robohash.org/DinhTranCongChien";
    String link2="https://robohash.org/NguyenVanA";
    String link3="https://robohash.org/TranLuu";
    @Override
    protected void   onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvUser =  findViewById(R.id.lv_user);
        ArrayList<user> arrayList = new ArrayList<>();

        user  usr1 = new user(link1,"Đinh Trần Công Chiến","Hi! R u ok?", 0);
        user  usr2 = new user(link2,"Nguyễn Văn A",        "Niceee!!!", 1);
        user  usr3 = new user(link3,"Trần Lưu",            "come on dude:/", 0);


        arrayList.add(usr1);
        arrayList.add(usr2);
        arrayList.add(usr3);


        CustomeAdapter customeAdapter = new CustomeAdapter(this, R.layout.row_item_user, arrayList);
        lvUser.setAdapter(customeAdapter);

    }
}