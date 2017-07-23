package com.inti.student.yourtime;

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

public class bonia  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonia);
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


    String[] names = { "BONIA Monochrome Vintage", "BONIA Black Abyss Vintage", "BONIA Golden Vintage Watch","Bonia Rosegold and Black Chevalier " };
    String[] locations = { "RM 506.00", "RM 506.00", "RM 537.00", "RM 988.00"};
    String[] buy = {"http://www.lazada.com.my/bonia-monochrome-vintage-watch-l-9994566.html?ff=1&sc=Efoh",
            "http://www.lazada.com.my/bonia-black-abyss-vintage-watch-s-9974039.html?ff=1&sc=Efoh",
            "http://www.lazada.com.my/bonia-golden-vintage-watch-l-9974025.html?ff=1&sc=Efoh",
            "http://www.lazada.com.my/bonia-rosegold-and-black-chevalier-watch-41769828.html?ff=1&sc=Efoh"};
    String[] last = {"Buy online at : ","Buy online at : ","Buy online at : ","Buy online at : "};
    int[] images = { R.drawable.bonia1, R.drawable.bonia2, R.drawable.bonia3, R.drawable.bonia4 };
}

