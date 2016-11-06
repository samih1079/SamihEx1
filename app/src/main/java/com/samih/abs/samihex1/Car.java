package com.samih.abs.samihex1;

/**
 * Created by user on 10/4/2016.
 */
public class Car
{
    private String model;
    private int year;
    private String color;
    public Car(String model, int year, String color)//البارمترات
    {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(Car c)
    {
        this.model = c.model;
        this.year = c.year;
        this.color = c.color;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color="white";
    }
    public void change(String model, int year)
    {
        //...
    }
    public void change( int year ,String model)
    {
        //...
    }
    public void change(String model)
    {
        //...
    }
}
