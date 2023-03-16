package org.example;


public class App
{
    public static void main( String[] args )
    {
        Car carReference = new Car();
        carReference.name= "Ferrari";
        carReference.maxSpeed= 300;
        carReference.fuelLevel=60;
        carReference.mileage=12.5;
        carReference.totalTraveledDistance=0;
        carReference.damaged= true;
        carReference.doorCount=1;
        carReference.color= "Red";


        System.out.println("Properties of car " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total traveled distance: " + carReference.totalTraveledDistance);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Door count: " + carReference.doorCount);
        System.out.println("Color car: " + carReference.color);
        System.out.println(carReference);


        Car car2 = new Car();
        car2.name = "Audi";
        car2.fuelLevel=70;
        car2.totalTraveledDistance=100;
        System.out.println("Properties of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total traveled distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door count: " + car2.doorCount);
        System.out.println("Color car: " + car2.color);

        System.out.println("initial name for car 1: " +carReference.name );
        carReference.name="audi";
        System.out.println("changed name for car 1: " +carReference.name );

        carReference = new Car();
        System .out.println("name of new car: " +carReference.name );
        carReference.name= "BMW";
        System .out.println("new name of new car: " +carReference.name );

        carReference=car2;
        System .out.println("name of new car: " +carReference.name );
        System .out.println("name of new car: " +car2.name);

        car2.name="Dacia";
        System .out.println("name of new car: " +carReference.name );
        System .out.println("name of new car: " +car2.name);


    }
}

