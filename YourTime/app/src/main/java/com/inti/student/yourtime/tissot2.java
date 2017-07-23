package com.inti.student.yourtime;

/**
 * Created by ASUS on 23/7/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by ASUS on 22/7/2017.
 */

public class tissot2  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alba);
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


    String[] names = { "Tissot Women's Silver Stainless steel Watch ", "Tissot Womens TIST0332101101300  ", "Tissot T1012511605100 Womens Black Dial Analog ","Tissot T-Race White Dial Womens" };
    String[] locations = { "RM 691.00", "RM 1,190.21", "RM 1,599.00", "RM 3,581.52"};
    String[] buy = {"http://www.lazada.com.my/tissot-womens-silver-stainless-steel-watch-t0332101105300-790887.html?ff=1",
            "http://www.lazada.com.my/tissot-womens-tist0332101101300-dream-stainless-steel-watch-22388595.html?ff=1",
            "http://www.lazada.com.my/tissot-t1012511605100-womens-black-dial-analog-quartz-watch-withleather-strap-12286438.html?ff=1",
            "http://www.lazada.com.my/tissot-t-race-white-dial-womens-watch-t0482172701700-23062586.html?ff=1"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.tsst1, R.drawable.tsst2, R.drawable.tsst3, R.drawable.tsst4 };
}