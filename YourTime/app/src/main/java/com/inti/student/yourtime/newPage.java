package com.inti.student.yourtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by ASUS on 19/7/2017.
 */

public class newPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.men_page);

        String [] watch = {"B.U.M Equipment","Fossil","Tissot","Casio"};
        ListAdapter nameyAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, watch);
        ListView listView= (ListView) findViewById(R.id.listview);
        listView.setAdapter(nameyAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                if (position == 0) {
                    Intent myintent = new Intent(view.getContext(), bum.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), fossil.class);
                    startActivityForResult(myintent, 1);

                }
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), tissot.class);
                    startActivityForResult(myintent, 2);

                }
                if (position==3) {
                    Intent myintent = new Intent(view.getContext(), casio.class);
                    startActivityForResult(myintent, 3);
                }
            }
            });
    }

}