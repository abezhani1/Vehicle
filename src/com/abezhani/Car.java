package com.abezhani;

public class Car //extends Performance <-- the class used to extend performace
{
    private String make;
    private String model;
    private int year;
    private String vin;
    private int milesOnOdometer;
    private Performance perf;

    public Car(int avgMilesPerHour, int topSpeed, String make, String model, int year, String vin, int milesOnOdometer)
    {
        //super(avgMilesPerHour, topSpeed); <-- this is what we initially put in the class
        perf = new Performance(avgMilesPerHour, topSpeed);
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.milesOnOdometer = milesOnOdometer;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getVin()
    {
        return vin;
    }

    public void setVin(String vin)
    {
        this.vin = vin;
    }

    public int getMilesOnOdometer()
    {
        return milesOnOdometer;
    }

    public void setMilesOnOdometer(int milesOnOdometer)
    {
        this.milesOnOdometer = milesOnOdometer;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                ", milesOnOdometer=" + milesOnOdometer +
                ", topSpeed=" + perf.getTopSpeed() + //super.getTopSpeed() <-- it used to be super instead of perf
                ", avgMilesPerHour=" + perf.getAvgMilesPerHour() + //super.getAvgMilesPerHour() <-- it used to be super instead of perf
                '}';
    }
}
