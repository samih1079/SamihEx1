package com.abs.samih.amt;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton=(ImageButton)findViewById(R.id.imageView);
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://edu.gov.il/tech/amat/about/Pages/cyber_olympic.aspx")));

                finish();
            }
        });
//        ImageView imageView=new ImageView(this);
//        imageView.setImageResource(R.mipmap.ic_launcher);
//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                /* Create an Intent that will start the Menu-Activity. */
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://edu.gov.il/tech/amat/about/Pages/cyber_olympic.aspx")));
//
//                finish();
//            }
//        }, 2*1000);




    }


}
