package com.company;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
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
        System.out.println(human.getCar().Marka + ' ' + human.getCar().Producer);

        System.out.println();

        human.getSalary();

        System.out.println();

        human.setSalary(3500d);
        System.out.println("Wypłata wynosi teraz... " + human.getSalary());

        System.out.println();

        human.setValueOfTheCar(5000d);
        human.getValueOfTheCar();
    }
}
