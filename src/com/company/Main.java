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
        human.car = car;
        System.out.println(human.car.Marka + ' ' + human.car.Producer);

        System.out.println();

        human.getSalary();

        System.out.println();
    }
}
