package com.company;

import creatures.Animal;

import devices.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car carDiesel = new Diesel("Ferrari", "KIA");
        Car carLpg = new LPG("Ferrari", "KIA");
        Car carElectric = new Electric("Tesla", "Audi");

        Human human = new Human(new Car[]{carElectric, carDiesel, carLpg);
        human.pet = new Animal() {
            @Override
            public void feed(double foodWeight) {

            }
        };
        human.pet.setWeight(500d);
        System.out.println(human.pet.getWeight());
        human.pet.takeForAWalk();
        human.pet.takeForAWalk();
        human.pet.takeForAWalk();
        human.pet.feed();
        human.pet.feed();
        human.pet.feed();
        human.pet.getWeight();
        System.out.println(human.pet.getWeight());

        Car car = new Car("marka", "producer") {
            @Override
            public boolean Sell(Human seller, Human buyer, Double price) {
                String wantsCar = "KIA";
                Boolean hasCar = false;
                int carPosition = 0;
                for(int i=0;i<seller.car.length;i++){
                    if (buyer.car[i].marka == wantsCar) {
                        hasCar = true;
                        carPosition = i;
                        break;
                    }
                }

                if(!hasCar)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }


                if(!buyer.hasSpaceInGarage)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                if(buyer.salary < price)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                buyer.car[carPosition] = seller.car[carPosition];
                buyer.salary = buyer.salary - price;
                seller.car[carPosition] = null;
                seller.salary = seller.salary + price;

                System.out.println("Sukces kupna/sprzedaży auta!");
                return true;
            }

            @Override
            public void refuel() {
                System.out.println("Paliwko ++");
            }
        };

        human.setCar(car, 2);
        System.out.println(human.getCar(2).marka + ' ' + human.getCar(2).getProducer());

        System.out.println();

        human.getSalary();

        human.setSalary(3500d);
        System.out.println("Wypłata wynosi teraz... " + human.getSalary());

        System.out.println();

        human.setValueOfTheCar(5000);
        human.getValueOfTheCar();

        //        System.out.println();
//        Car newCar = new Car("markaNowa", "producerNowy") {
//            @Override
//            protected void refuel() {
//                System.out.println("Paliwko ++");
//            }
//        };
//        Car newerCar = new Car("markaNowa", "producerNowy") {
//            @Override
//            protected void refuel() {
//                System.out.println("Paliwko ++");
//            }
//        };
//
//        if(newCar == newerCar)
//            System.out.println("To te same auta :O");
//        else
//            System.out.println("To NIE te same auta :O");
//
//        System.out.println("New car " + newCar.marka + ' ' + newCar.getProducer());
//        System.out.println("Newer car " + newerCar.marka + ' ' + newerCar.getProducer());
//
//        System.out.println("car.toString() " + car.toString());
//        System.out.println("human.getCarToString() " + human.getCarToString());

        System.out.println();
        Phone phone = new Phone();
        phone.turnOn();

        Device device = new Device() {
            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            public void turnOn() {
                System.out.println("Urządzenie ma opcję włącz");
            }
        };

        device.toString();
        device.turnOn();

        System.out.println();
        Human buyer = new Human(new Car[] {carElectric, carDiesel, carLpg});
        Human seller = new Human(new Car[] {carElectric, carDiesel, carLpg});
        buyer.pet = new Animal() {
            @Override
            public void feed(double foodWeight) {

            }
        };
        seller.pet = new Animal() {
            @Override
            public void feed(double foodWeight) {

            }
        };
        buyer.pet.species = "Słoń";
        seller.pet.species = "Słoń";
        buyer.salary = 200d;
        seller.salary = 0d;
        double price = 200;
        boolean sellResult = human.pet.sellable.Sell(seller, buyer, price);
        if(sellResult)
            System.out.println("Sprzedano " + seller.pet.species + " za " + price);
        else
            System.out.println("Nie sprzedano " + seller.pet.species + " za " + price);

        buyer.pet.species = "Human";
        buyer.salary = 200d;
        seller.salary = 0d;
        sellResult = human.pet.sellable.Sell(seller, buyer, price);
        if(sellResult)
            System.out.println("Sprzedano " + seller.pet.species + " za " + price);
        else
            System.out.println("Nie sprzedano " + seller.pet.species + " za " + price);

        System.out.println();
        Car carWithGarageSize = new Car(12) {
            @Override
            public boolean Sell(Human seller, Human buyer, Double price) {
                return false;
            }

            @Override
            protected void refuel() {}
        };

        human.setCar(new Electric("Elektryczna", "Tesla"), 0);
        human.setCar(new LPG("Gazowa", "Tesla"), 1);
        human.setCar(new Diesel("Dieslowa", "Tesla"), 2);

        System.out.println("Wartość aut w garażu to " + human.getValueOfTheGarage());

       // car.Sell(human, human, 150d);

        System.out.println();

        Car carForTask12 = new Car("KIA", "KIA") {
            @Override
            public boolean Sell(Human seller, Human buyer, Double price) {
                String wantsCar = "KIA";
                String currentSeller = "Maciej";
                Boolean hasCar = false;
                int carPosition = 0;
                for(int i=0;i<seller.car.length;i++){
                    if (buyer.car[i].marka == wantsCar) {
                        hasCar = true;
                        carPosition = i;
                        break;
                    }
                }

                if (buyer.car[carPosition].actualOwner != currentSeller) {
                    System.out.println("Przepraszamy, nie ma na stanie tego auta!");

                    return false;
                }

                if(!hasCar)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }


                if(!buyer.hasSpaceInGarage)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                if(buyer.salary < price)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                buyer.car[carPosition] = seller.car[carPosition];
                buyer.salary = buyer.salary - price;
                seller.car[carPosition] = null;
                seller.salary = seller.salary + price;

                System.out.println("Sukces kupna/sprzedaży auta!");
                return true;
            }

            @Override
            public void refuel() {
                System.out.println("Paliwko ++");
            }
        };

        ArrayList<String> ownerLisst = new ArrayList<String>() {
            {
                add("Maciej");
                add("Substych");
                add("Java");
            }
        };

        carForTask12.ownerList = ownerLisst;

        System.out.println("Czy miał właścicieli? " + carForTask12.checkForOwners());
        System.out.println("Czy A sprzedał dla B? " + carForTask12.checkIfASoldB(human, human));
        System.out.println("Ilu miał właścicieli? " + carForTask12.getNumberOfSells());
    }
}
// coś tutaj się wali