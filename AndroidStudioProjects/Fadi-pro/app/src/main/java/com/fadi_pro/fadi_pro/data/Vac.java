package com.fadi_pro.fadi_pro.data;

/**
 * Created by משתמש on 12/06/2015.
 */
import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("Vac")
public class Vac extends ParseObject
{
    private String name;
    private String goal;
    private String price;


    public Vac(String name, String goal, String price)
    {
        setName(name);
        setGoal(goal);
        setPrice(price);
    }


    public Vac()
    {

    }



    public String getName() {
        name=getString("name");
        return name;
    }

    public void setName(String name) {
        put("name",name);
        this.name = name;
    }

    public String getGoal() {
        goal=getString("goal");
        return goal;
    }

    public void setGoal(String goal) {
        put("goal",goal);
        this.goal = goal;
    }

    public String getPrice() {
        price=getString("price");
        return price;
    }

    public void setPrice(String price) {
        put("price",price);
        this.price = price;
    }

}



