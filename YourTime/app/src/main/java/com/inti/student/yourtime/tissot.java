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

public class tissot extends Activity {




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


        String[] names = { "Tissot Couturier T035.617.16.051.00 ", "Tissot PRC 200 T055.417.11.047.00", "Tissot T-race T048.417.27.057.01","Tissot T081.420.97.207.00" };
        String[] locations = { "RM 1,483.20", "RM 1,555.20", "RM 1,859.00", "RM 1,555.20"};
        String[] buy = {"http://www.lazada.com.my/tissot-couturier-t0356171605100-quartz-chronograph-leathermens-watch-790584.html?ff=1&sc=McIB&rb=450a",
                "http://www.lazada.com.my/tissot-prc-200-t0554171104700-quartz-chronograph-stainlesssteel-mens-watch-790600.html?ff=1&sc=McIB&rb=450",
                    "http://www.lazada.com.my/tissot-t-race-t0484172705701-quartz-chronograph-red-siliconemens-watch-13401825.html?ff=1&sc=McIB&rb=450",
                "http://www.lazada.com.my/tissot-t0814209720700-mens-t-race-touch-aluminium-siliconestrap-watch-4984812.html?ff=1&sc=McIB&rb=450"};
        String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
        int[] images = { R.drawable.abc, R.drawable.def, R.drawable.hhh, R.drawable.jk };
    }

