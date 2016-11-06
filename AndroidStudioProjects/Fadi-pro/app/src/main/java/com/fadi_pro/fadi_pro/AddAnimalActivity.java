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

import com.fadi_pro.fadi_pro.data.AnimalData;
import com.parse.ParseException;
import com.parse.SaveCallback;

public class AddAnimalActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText etAnimalName;

    private  EditText etAge;
    private EditText etVac;
    private EditText etPhone;
    private EditText etID;
    private  EditText etAdress;
    private EditText etZIPCode;
    private EditText etAnimalType;
    private EditText etOwner;
    private Button btnNext;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);
        etAnimalName=(EditText)findViewById(R.id.etAnimalName);
        etAge=(EditText)findViewById(R.id.etAge);
        etVac=(EditText)findViewById(R.id.etVac);
        etAnimalType=(EditText)findViewById(R.id.etAnimalType);
        etPhone=(EditText)findViewById(R.id.etPhone);
        etOwner=(EditText)findViewById(R.id.etOwner);
        etID=(EditText)findViewById(R.id.etID);
        etAdress=(EditText)findViewById(R.id.etAdress);
        etZIPCode=(EditText)findViewById(R.id.etZIPCod);
        btnNext=(Button)findViewById(R.id.btnNext2);
        btnNext.setOnClickListener(this);
        btnSave=(Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signin, menu);
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
        AnimalData animalData = new AnimalData();
        switch (v.getId())
        {
            case R.id.btnNext2:
                Intent intent2=new Intent(AddAnimalActivity.this,MngrVacsActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnSave:

                String name = etAnimalName.getText().toString();
                String age = etAge.getText().toString();
                String Vac = etVac.getText().toString();
                String phone = etPhone.getText().toString();
                String ID = etID.getText().toString();
                String Adress = etAdress.getText().toString();
                String ZIPcode = etZIPCode.getText().toString();
                String AnimalType = etAnimalType.getText().toString();
                String Owner = etOwner.getText().toString();

                animalData.setName(name);
                animalData.setAdress(Adress);
                animalData.setPhone(phone);
                animalData.setTakenVaccination(Vac);
                animalData.setAge(age);
                animalData.setId(Integer.parseInt(ID));
                animalData.setZIPcode(ZIPcode);
                animalData.setOwener(Owner);
                animalData.setAnimalType(AnimalType);


                animalData.saveEventually(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if(e == null)
                        {
                            Toast.makeText(AddAnimalActivity.this, "SAVED", Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(AddAnimalActivity.this,"SOMETHING WENT WRONG",Toast.LENGTH_LONG).show();
                            Log.d("ERR", e.getMessage());
                        }
                    }
                });
                break;

        }
    }
}
