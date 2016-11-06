package com.fadi_pro.fadi_pro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
 {
     private TextView mail;
     private EditText etpass;
     private EditText etmail1;
     private TextView tvPass;
     private Button btn;
     private Button SignUpB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail = (TextView) findViewById(R.id.mail);
        etpass = (EditText) findViewById(R.id.etPass);
        etmail1 = (EditText) findViewById(R.id.etmail1);
        tvPass = (TextView) findViewById(R.id.tvPass);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        SignUpB = (Button)findViewById(R.id.SignUpB);
        SignUpB.setOnClickListener(this);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

     @Override
     public void onClick(View v) {
         switch (v.getId())
         {
             case R.id.btn:
                 Intent intent1=new Intent(MainActivity.this,Management.class);
                 startActivity(intent1);
                 break;

             case R.id.SignUpB:
                 Intent intent2=new Intent(MainActivity.this,SignUpActivity.class);
                 startActivity(intent2);
                 break;
         }




     }
 }
