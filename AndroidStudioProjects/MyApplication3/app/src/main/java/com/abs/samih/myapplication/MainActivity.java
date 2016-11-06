package com.abs.samih.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences ;
        Set<Integer> integers;
        ArrayList<Integer> integers1;
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        System.out.print("hi"+x);
    }
}
