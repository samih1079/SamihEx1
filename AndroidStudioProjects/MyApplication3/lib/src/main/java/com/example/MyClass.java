package com.example;


public class Point
{

    private double x;
    private double y;


    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    //שיטה בונה מעתיקה
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public String toString()
    {
        return "(" + this.x+
                "," + this.y+")";
    }
}
