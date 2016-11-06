package com.fadi_pro.fadi_pro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Management extends AppCompatActivity implements View.OnClickListener {
    private Button CMbtn;
    private Button CMVAbtn;
    private Button BtnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        CMbtn = (Button) findViewById(R.id.CMbtn);
        CMVAbtn = (Button) findViewById(R.id.CMVACbtn);
        BtnNext = (Button) findViewById(R.id.BtnNext);
        CMbtn.setOnClickListener(this);
        CMVAbtn.setOnClickListener(this);
        BtnNext.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_management, menu);
        return true;
    } //0547738394
    //1236547896541236547896541236547896541236987456214155369989999999999999999999

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
        Intent i;
        switch(v.getId()) {
            case R.id.CMbtn:
                i = new Intent(Management.this,AnimalMngActivity.class);
                startActivity(i);
                break;
            case R.id.CMVACbtn:
                i = new Intent(Management.this,AddVACsActivity.class);
                startActivity(i);
                break;
         //   case R.id.BtnNext:
              //  i = new Intent(Management.this,class);
              //  startActivity(i);
             //  break;
        }
    }
}
