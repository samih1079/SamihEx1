package com.fadi_pro.fadi_pro.data;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fadi_pro.fadi_pro.R;

/**
 * Created by משתמש on 04/20/2016.
 */
public class AnimalAdapter extends ArrayAdapter<AnimalData>
{

    public AnimalAdapter(Context context, int resource, AnimalData[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView=View.inflate(getContext(), R.layout.animal_itm,parent);

        TextView tvAnimalName= (TextView) convertView.findViewById(R.id.tvItmAnimalName);
        TextView tvItmOwner= (TextView) convertView.findViewById(R.id.tvItmOwner);
        TextView tvItmPhone= (TextView) convertView.findViewById(R.id.tvItmPhone);

        AnimalData animalData=getItem(position);

        tvAnimalName.setText(animalData.getName());
        tvItmOwner.setText(animalData.getName());
        tvItmPhone.setText(animalData.getPhone());

        return convertView;
    }
}
