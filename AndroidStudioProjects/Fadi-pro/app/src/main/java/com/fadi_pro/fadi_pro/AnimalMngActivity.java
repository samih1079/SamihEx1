package com.fadi_pro.fadi_pro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.fadi_pro.fadi_pro.data.AnimalAdapter;
import com.fadi_pro.fadi_pro.data.AnimalData;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

public class AnimalMngActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_mng);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView= (ListView) findViewById(R.id.listView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent=new Intent(getBaseContext(),AddAnimalActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {

        ParseQuery<AnimalData> query = ParseQuery.getQuery(AnimalData.class);


        query.findInBackground(new FindCallback<AnimalData>()

        {

            public void done(List<AnimalData> list, ParseException e)

            {

                if (e == null)

                {
                    AnimalData[] ar=new AnimalData[list.size()];
                    for (int i=0;i<list.size();i++)
                    {
                        ar[i]=list.get(i);
                    }

                    AnimalAdapter animalAdapter=new AnimalAdapter(getBaseContext(),R.layout.animal_itm,ar);
                    listView.setAdapter(animalAdapter);

                } else

                {

                    Log.d("ERR", "Error: " + e.getMessage());

                }

            }

        });
        super.onResume();
    }
}
