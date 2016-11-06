package com.fadi_pro.fadi_pro;

import android.app.Application;

import com.fadi_pro.fadi_pro.data.AnimalData;
import com.fadi_pro.fadi_pro.data.Vac;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by משתמש on 12/08/2015.
 */
public class ParseApp extends Application {
    @Override
    public void onCreate()
    {

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(AnimalData.class);
        ParseObject.registerSubclass(Vac.class);
        Parse.initialize(this, "smC8h7uxU5BnNXvMIAZwTiDCb3UIUqsvNQUSwVIt", "kqPEf7FPzsc3cPth6yk1lzQhS6uumbzTBCfhI3eX");
        ParseUser.enableAutomaticUser();
        ParseACL defaultAC=new ParseACL();
        ParseACL.setDefaultACL(defaultAC, true);
        super.onCreate();

    }
}
