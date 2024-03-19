package com.example.lab1;

public class Car
{
    String name;
    String model;
    String color;
    double HP;
    double Volume;
    double Max_Speed;
    double liters_of_fuel_per_100;

    public Car(String name, String model, String color, double HP, double Volume, double Max_Speed, double liters_of_fuel_per_100)
    {
        this.name = name;
        this.model = model;
        this.color = color;
        this.HP = HP;
        this.Volume = Volume;
        this.Max_Speed = Max_Speed;
        this.liters_of_fuel_per_100 = liters_of_fuel_per_100;
    }
}
