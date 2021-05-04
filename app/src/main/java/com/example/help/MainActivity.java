package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] months={"Can't Create My Account","Can't Log In to My Account","Can't Find Nearest Milk Man","Can't Update Milk Info","Chat Box Is Not Working"};
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, months);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,months);
        ListView listView=(ListView)findViewById(R.id.mobile_list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String s = listView.getItemAtPosition(position).toString();
                switch (s) {

                    case "Can't Create My Account":
                        startActivity(new Intent(MainActivity.this, Registration.class));
                        break;
                    case "Can't Log In to My Account":
                        startActivity(new Intent(MainActivity.this, LogIn.class));
                        break;
                    case "Can't Find Nearest Milk Man":
                        startActivity(new Intent(MainActivity.this, CantFindNearestMilkMan.class));
                        break;
                    case "Can't Update Milk Info":
                        startActivity(new Intent(MainActivity.this, MilkInfoIsNotUploading.class));
                        break;
                    case "Chat Box Is Not Working":
                        startActivity(new Intent(MainActivity.this, ChatBoxNotWorking.class));
                        break;

                }


                }
        });
    }
}