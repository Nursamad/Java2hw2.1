package com.company;

public class Main {

    public static void main(String[] args) {

        Printable[] printables = {
                createObject("Merc"),
                createObject("Dodge"),
                createObject("BMW")};
        for (int i = 0; i < printables.length; i++) {
            System.out.println("\n" + printables[i].print());
        }

    }


    public static Printable createObject(String className) {
        switch (className) {
            case "Dodge":
                Dodje dodje = new Dodje("Dodje", 2015, "Challenger", 180);
                dodje.print();
                return dodje;
            case "Merc":
                MersedesBenz mersedesBenz = new MersedesBenz("Mercedes", 1998, "e500", 5.5);
                mersedesBenz.print();
                return mersedesBenz;
            case "BMW":
                BMW bmw = new BMW("BMW", 2000, "E39", 588);
                bmw.print();
                return bmw;
            default:
                System.out.println("You don't have a car");
        }
        return null;
    }
}
