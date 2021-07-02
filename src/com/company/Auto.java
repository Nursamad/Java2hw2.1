package com.company;

public  class Auto {
    private String name;
    private int year;
    private String model;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Auto(String name, int year, String model) {
        this.name = name;
        this.year = year;
        this.model = model;
    }
}
