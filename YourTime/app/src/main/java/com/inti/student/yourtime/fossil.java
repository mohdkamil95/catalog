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

public class fossil extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tissot);
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
            convertview = inflater.inflate(R.layout.fossil2, null);
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


    String[] names = { "Fossil Men's Grant Quartz Twist Three-Hand Navy Blue Leather Strap Watch  ", "FOSSIL Q MARSHAL TOUCHSCREEN BROWN LEATHER SMARTWATCH", "Fossil Men's FS5241 Grant Chronograph Luggage Leather Watch ","Fossil Men Nate Chronograph Smoke Stainless Steel Watch " };
    String[] locations = { "RM 546.00", "RM 825.30", "RM 436.20", "RM 472.00"};
    String[] buy = {"http://www.lazada.com.my/fossil-mens-grant-quartz-twist-three-hand-navy-blue-leather-strapwatch-me1162-25192618.html?ff=1&sc=MZk=&rb=153",
            "http://www.lazada.com.my/fossil-q-marshal-touchscreen-brown-leather-smartwatch-19457397.html?ff=1&sc=MZk=&rb=153",
            "http://www.lazada.com.my/fossil-mens-fs5241-grant-chronograph-luggage-leather-watch-16669722.html?ff=1&sc=MZk=&rb=153",
            "http://www.lazada.com.my/fossil-men-nate-chronograph-smoke-stainless-steel-watch-jr1437-4681713.html?ff=1&sc=MZk=&rb=153"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.fossila, R.drawable.fossilb, R.drawable.fossilc, R.drawable.fossild };
}