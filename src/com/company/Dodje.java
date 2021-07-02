package com.company;

public class Dodje extends Auto implements Printable {
    private int speed;

    public Dodje(String name, int year, String model, int speed) {
        super(name, year, model);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    @Override
    public String print() {
        return
                "Name: " + getName() + "" +
                        "\nYear: " + getYear() + "" +
                        "\nModel: " + getModel() + "" +
                        "\nDodje speed: " + getSpeed();

    }
}
