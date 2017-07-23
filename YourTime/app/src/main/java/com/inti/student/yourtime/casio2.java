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

public class casio2  extends AppCompatActivity{

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


    String[] names = { "Casio Women Gold Watch  ", "Casio Women Silver Watch  ", "Casio Women White Dial Stainless Steel Strap ","Casio Women Black Dial Stainless Steel Strap" };
    String[] locations = { "RM 133.00", "RM 101.00", "RM 99.00", "RM 100.00"};
    String[] buy = {"http://www.lazada.com.my/casio-women-gold-watch-ltp-1165n-9crdf-19909505.html?ff=1&sc=Efoh",
            "http://www.lazada.com.my/casio-women-silver-watch-ltp-1215a-7b2df-19909464.html?ff=1&sc=Efoh",
            "http://www.lazada.com.my/casio-women-white-dial-stainless-steel-strap-watch-ltp-1129a-7brdf-4682480.html?ff=1&sc=Efoh",
            "http://www.lazada.com.my/casio-women-black-dial-stainless-steel-strap-watch-ltp-1128a-1ardf-4682477.html?ff=1&sc=Efoh"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.cso1, R.drawable.cso2, R.drawable.cso3, R.drawable.cso4};
}