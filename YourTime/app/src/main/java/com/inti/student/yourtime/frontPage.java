package com.inti.student.yourtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frontPage extends AppCompatActivity {
    private Button mmanButton ;
    private Button mwomenButton ;
    private Button mkidsButton ;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        mmanButton=(Button) findViewById(R.id.man_button);
        mmanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(frontPage.this,newPage.class));

            }
        });

        mwomenButton=(Button) findViewById(R.id.women_button);
        mwomenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(frontPage.this,womenpage.class));
            }
        });

    }
}
