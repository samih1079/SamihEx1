package com.abs.samih.myapplication;

/**
 * Created by school on 26/09/2016.
 */
public class Car
{
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color)
    {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        return  "model=" + model  +
                ", year=" + year +
                ", color=" + color ;
    }

    public static void what (int j, int n )
    {
        if (j == n)
            System.out.print(n);
        else
        {
            System.out.print (" "+ j) ;
            what (j+1, n) ;
            System.out.print (" "+ j) ;
        }
    }
}
