package com.inti.student.yourtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



/**
 * Created by ASUS on 20/7/2017.
 */

public class bum extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bumm);
        ListView list = (ListView) findViewById(R.id.listView1);
        adapter show = new adapter();
        list.setAdapter(show);

    }

    class adapter extends BaseAdapter {

        @Override
        public int getCount() {

            return images.length;
        }

        @Override
        public Object getItem(int arg0) {


            return null;
        }

        @Override
        public long getItemId(int arg0) {

            return 0;
        }

        @Override
        public View getView(final int position, View convertview, ViewGroup arg2) {

            LayoutInflater inflater = getLayoutInflater();
            convertview = inflater.inflate(R.layout.single_item, null);
            TextView one = (TextView) convertview.findViewById(R.id.textView1);
            TextView two = (TextView) convertview.findViewById(R.id.textView2);
            TextView three = (TextView) convertview.findViewById(R.id.textView3);
            TextView four = (TextView) convertview.findViewById(R.id.textView4);
            ImageView image = (ImageView) convertview
                    .findViewById(R.id.imageView1);
            one.setText(names[position]);
            two.setText(locations[position]);
            three.setText(last[position]);
            four.setText(buy[position]);
            image.setImageResource(images[position]);

            return convertview;
        }

    }


    String[] names = { "B.U.M Equipment Multi function B72601 ", "B.U.M EQUIPMENT Multi-functions B724 ", "B.U.M Equipment Multi function B72601","B.U.M Equipment multi-function model B73002" };
    String[] locations = { "RM 259.00", "RM 319.00", "RRM 259.00", "RM 349.00"};
    String[] buy = {"http://www.lazada.com.my/bum-equipment-multi-function-b72601-02-08-26891888.html?ff=1",
            "http://www.lazada.com.my/bum-equipment-multi-functions-b724-26598705.html?ff=1",
            "http://www.lazada.com.my/bum-equipment-multi-function-b72601-02-08-26891895.html?ff=1",
            "http://www.lazada.com.my/bum-equipment-multi-function-model-b73002-26891766.html?ff=1"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.bum1, R.drawable.bum2, R.drawable.bum3, R.drawable.bum4 };
}