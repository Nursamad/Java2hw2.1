package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Merc");
        Dodje dodje = new Dodje("Dodje", 2015, "Challenger" , 180);

        MersedesBenz mersedesBenz = new MersedesBenz("Mercedes", 1998, "e500" , 5.5);

        BMW bmw = new BMW("BMW", 2000, "E39" , 588);


        Auto[] autos = {dodje, mersedesBenz, bmw,};
        for (Auto auto : autos) {
            System.out.println("\nAuto: " + auto.getName() + "\nYear: " + auto.getYear() + "\nModel: " + auto.getModel() + "\n_____________");

        }

    }


    public static Auto createObject(String className) {
        switch (className) {
            case "Dodge":
                Dodje dodje = new Dodje("Dodje", 2015, "Challenger" , 180);
                dodje.print();
                return  dodje;
            case "Merc":
                MersedesBenz mersedesBenz = new MersedesBenz("Mercedes", 1998, "e500" , 5.5);
                mersedesBenz.print();
                return  mersedesBenz;
            case "BMW":
                BMW bmw = new BMW("BMW", 2000, "E39" , 588);
                bmw.print();
                return bmw;
            default:
                System.out.println("You don't have a car");
        }
        return null;
    }
}
