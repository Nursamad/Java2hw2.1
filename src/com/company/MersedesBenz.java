package com.company;

public class MersedesBenz extends Auto implements Printable {
    private double overclocking;

    public MersedesBenz(String name, int year, String model, double overclocking) {
        super(name, year, model);
        this.overclocking = overclocking;
    }

    public double getOverclocking() {
        return overclocking;
    }

    @Override
    public String print() {
        return
                "Name: " + getName() + "" +
                "\nYear: " + getYear() + "" +
                "\nModel: " + getModel() +
                "\nMerc overClock: " + getOverclocking();


    }
}
