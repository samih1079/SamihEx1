package com.samih.abs.samihrectangle;

/**
 * Created by user on 9/25/2016.
 */
public class Disk
{
    //
    private String fnan;
    private double time;
    private double price;

    public Disk(String fnan, double time, double price)
    {
        this.fnan = fnan;
        this.time = time;
        this.price = price;
    }

    public String getFnan()
    {
        return this.fnan;
    }

    public void setFnan(String fnan)
    {
        this.fnan = fnan;
    }

    public double getTime()
    {
        return time;
    }

    public void setTime(double time)
    {
        this.time = time;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    private double computeMinAvg()
    {
        return  p                  aasfdrice/time;
    }
    private boolean isTheSame(Disk other)
    {
        if(this.fnan.equals(other.getFnan()))
            return true;
        else
            return false;


    }

    @Override
    public String toString() {
        return
                "fnan='" + fnan + '\'' +
                ", time=" + time +
                ", price=" + price ;
    }
}
