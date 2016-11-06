package com.fadi_pro.fadi_pro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    private EditText etUser;
    private EditText etPass;
    private EditText etIDman;
    private EditText etAdress;
    private EditText etName;
    private Button etSave;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        etUser = (EditText) findViewById(R.id.etUser);
        etAdress= (EditText) findViewById(R.id.etAdress);
        etIDman= (EditText) findViewById(R.id.etIDman);
        etName= (EditText) findViewById(R.id.etAnimalName);
        etPass= (EditText) findViewById(R.id.etPass);
        etSave= (Button) findViewById(R.id.etSave);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
