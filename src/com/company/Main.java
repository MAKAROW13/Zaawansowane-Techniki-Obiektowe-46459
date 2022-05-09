package com.company;

import creatures.Animal;

import devices.Car;

import devices.Device;

import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
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

        Car car = new Car("marka", "producer");
        human.setCar(car);
        System.out.println(human.getCar().Marka + ' ' + human.getCar());

        System.out.println();

        human.getSalary();

        System.out.println();

        human.setSalary(3500d);
        System.out.println("Wypłata wynosi teraz... " + human.getSalary());

        System.out.println();

        human.setValueOfTheCar(5000d);
        human.getValueOfTheCar();

        System.out.println();
        Car newCar = new Car("markaNowa", "producerNowy");
        Car newerCar = new Car("markaNowa", "producerNowy");

        if(newCar == newerCar)
            System.out.println("To te same auta :O");
        else
            System.out.println("To NIE te same auta :O");

        System.out.println("New car " + newCar.Marka + ' ' + newCar.getProducer());
        System.out.println("Newer car " + newerCar.Marka + ' ' + newerCar.getProducer());

        System.out.println("car.toString() " + car.toString());
        System.out.println("human.getCarToString() " + human.getCarToString());

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
        Human buyer = new Human();
        Human seller = new Human();
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
    }
}
