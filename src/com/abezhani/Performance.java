package com.abezhani;

public class Performance
{
    private int avgMilesPerHour;
    private int topSpeed;

    public Performance(int avgMilesPerHour, int topSpeed)
    {
        this.avgMilesPerHour = avgMilesPerHour;
        this.topSpeed = topSpeed;
    }

    public int getAvgMilesPerHour()
    {
        return avgMilesPerHour;
    }

    public void setAvgMilesPerHour(int avgMilesPerHour)
    {
        this.avgMilesPerHour = avgMilesPerHour;
    }

    public int getTopSpeed()
    {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed)
    {
        this.topSpeed = topSpeed;
    }

}
