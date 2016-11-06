package com.fadi_pro.fadi_pro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fadi_pro.fadi_pro.data.Vac;
import com.parse.ParseException;
import com.parse.SaveCallback;

public class AddVACsActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName;
    private EditText etGoal;
    private EditText etPrice;
    private Button btnNext;
    private Button btnSave;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vacs);

        etName = (EditText) findViewById(R.id.etAnimalName);
        etGoal = (EditText) findViewById(R.id.etgoal);
        etPrice = (EditText) findViewById(R.id.etPrice);
        btnNext = (Button) findViewById(R.id.btnNext2);
        btnSave = (Button) findViewById(R.id.btnSave2);
        btnNext.setOnClickListener(this);
        btnSave.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_vacs, menu);
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


        Toast.makeText(AddVACsActivity.this, "onClick", Toast.LENGTH_LONG).show();

        switch (v.getId()) {
            case R.id.btnNext2:
                Intent intent2 = new Intent(AddVACsActivity.this, MngrVacsActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnSave:
                Vac vac = new Vac();

                String name = etName.getText().toString();
                String goal = etGoal.getText().toString();
                String price = etPrice.getText().toString();

                vac.setName(name);
                vac.setGoal(goal);
                vac.setPrice(price);

                vac.saveEventually(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            Toast.makeText(AddVACsActivity.this, "SAVED", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(AddVACsActivity.this, "SOMETHING WENT WRONG", Toast.LENGTH_LONG).show();
                            Log.d("ERR", e.getMessage());
                        }
                    }
                });
                break;


        }

    }

}