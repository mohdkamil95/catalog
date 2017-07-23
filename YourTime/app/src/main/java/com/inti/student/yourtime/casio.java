package com.inti.student.yourtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ASUS on 20/7/2017.
 */

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

public class casio extends Activity {








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


    String[] names = { "CASIO PRO-TREK PRW-6100Y-1 TRIPLE SENSOR WATCH  ", "Casio Protrek PRW-7000-8 Sapphire Glass", "Casio Beside Black (BEM506CL-1A) ","Casio Watch Beside Silver Stainless-Steel Case Stainless-Steel Bracelet " };
    String[] locations = { "RM 1,599.00", "RM 2,399.00", "RM 350.00", "RM 359.00"};
    String[] buy = {"http://www.lazada.com.my/casio-pro-trek-prw-6100y-1-triple-sensor-watch-11823125.html?ff=1&sc=Mdc1&rb=13783",
            "http://www.lazada.com.my/casio-protrek-prw-7000-8-sapphire-glass-watch-for-men-58944078.html?ff=1&sc=Mdc1&rb=13783",
            "http://www.lazada.com.my/casio-beside-black-bem506cl-1a-2369771.html?ff=1&sc=MagC&rb=680",
            "http://www.lazada.com.my/casio-watch-beside-silver-stainless-steel-case-stainless-steelbracelet-mens-nwt-warranty-bem-313d-1a-40897945.html?ff=1&sc=MagC&rb=680"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.casio1, R.drawable.casio2, R.drawable.casio3, R.drawable.casio4 };
}