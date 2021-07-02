package com.company;

public class BMW extends Auto implements Printable{
     private int engineVolume;

     public BMW(String name, int year, String model, int engineVolume) {
          super(name, year, model);
          this.engineVolume = engineVolume;
     }

     public int getEngineVolume() {
          return engineVolume;
     }

     @Override
     public String print() {
          return "Name: " + getName() + "" +
                  "\nYear: " + getYear() + "" +
                  "\nModel: " + getModel() +"" +
                  "\nBmw engineVolume: " + getEngineVolume();

     }
}
