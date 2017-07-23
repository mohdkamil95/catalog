package com.inti.student.yourtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by ASUS on 19/7/2017.
 */

public class womenpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.women_page);

        String [] watch = {"Bonia","Alba","Tissot","Casio"};
        ListAdapter abcAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,watch);
        ListView newlist= (ListView) findViewById(R.id.newlist);
        newlist.setAdapter(abcAdapter);
        newlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                if (position == 0) {
                    Intent myintent = new Intent(view.getContext(), bonia.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), alba.class);
                    startActivityForResult(myintent, 1);

                }
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), tissot2.class);
                    startActivityForResult(myintent, 2);

                }
                if (position==3) {
                    Intent myintent = new Intent(view.getContext(), casio2.class);
                    startActivityForResult(myintent, 3);
                }
            }
        });

    }
   }

