package com.samih.abs.samihex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity
{

    //1.
    private Button btnCompute;
    private EditText etNumber;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //2.
        tvResult=(TextView)findViewById(R.id.tvResult);
        etNumber=(EditText) findViewById(R.id.etNumber);
        btnCompute=(Button) findViewById(R.id.btnCompute);

    }

    public void compute(View v)
    {
        //
        //compare reference
       // if(v.getId()==R.id.btnCompute)// compare by id
        if(v==btnCompute)
        {
            //getting the value from edititext feild
            String stNum=etNumber.getText().toString();
            //converting string to number
            double num=Double.parseDouble(stNum);
            //int num2=Integer.parseInt(stNum);
            double res=Math.pow(num,2);

            //show the result via TextView Object
            tvResult.setText(res+"");



        }
    }




}
