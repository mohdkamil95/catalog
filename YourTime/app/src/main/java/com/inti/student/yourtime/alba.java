package com.inti.student.yourtime;

/**
 * Created by ASUS on 22/7/2017.
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

public class alba  extends AppCompatActivity{

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


    String[] names = { "original ALBA CHRONOGRAPH ", "ALBA Watch AG8543X Black   ", "Original ALBA PRESTIGE","ALBA V782-X212 Japan " };
    String[] locations = { "RM 282.00", "RM 430.00", "RM 158.00", "RM 298.00"};
    String[] buy = {"http://www.lazada.com.my/original-alba-chronograph-by-seiko-watch-as6085x1free-shipping-44636751.html?ff=1",
            "http://www.lazada.com.my/alba-watch-ag8543x-black-13570306.html?ff=1",
            "http://www.lazada.com.my/original-alba-prestige-pair-by-seiko-watch-axdt61x1-freeshipping-39335925.html?ff=1",
            "http://www.lazada.com.my/alba-v782-x212-japan-ana-date-curve-glass-ladies-watch-white-4858331.html?ff=1"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.alba1, R.drawable.alba2, R.drawable.alba3, R.drawable.alba4 };
}

