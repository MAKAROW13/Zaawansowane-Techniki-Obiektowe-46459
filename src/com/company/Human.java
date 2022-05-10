package com.company;

import creatures.Animal;
import devices.Car;
import devices.LPG;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

    public Car[] car;

    public Animal pet;
    protected Double salary;

    protected int valueOfTheCar;
    public int cash;
    public String name;
    public boolean hasSpaceInGarage;

    public Human(Car[] car) {
        this.car = car;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getCar(int positionInGarage) {
        return car[positionInGarage];
    }

    public String getCarToString() {
        return car.toString();
    }

    public void setCar(Car car, int positionInGarage) {
        this.car[positionInGarage] = car;
    }

    public int getValueOfTheCar() {
        return valueOfTheCar;
    }

    public double getValueOfTheGarage() {
        double value=0;
        for(int i=0;i<car.length;i++){
            value = value + car[i].value;
        };
        return value;
    }

    public void setValueOfTheCar(int valueOfTheCar) {
        if (valueOfTheCar < this.salary) {
            System.out.println("Udało się kupić auto za gotówkę!");
            car[0] = new LPG("BMW", "YX");
            car[0].marka = "Ferrari";
            car[0].value = valueOfTheCar;
        }
        else if (valueOfTheCar / 12 < this.salary) {
            System.out.println("Udało się kupić auto na kredyt!");
            car[0] = new LPG("Skoda", "Fabia");
            car[0].marka = "Ferrari";
            car[0].value = valueOfTheCar;
        }
        else {
            System.out.println("idź wybłagaj szefa o podwyżkę");
        }

        this.valueOfTheCar = valueOfTheCar;
    }
        public Double getSalary () {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println("Kiedy pobarne zostały dane?" + formatter.format(date));
            return salary;
        }

        public void setSalary (Double salary) {
            if (salary < 0)
            System.out.println("Przepraszamy, ale nie można mieć wypłaty na minusie.");
            System.out.println("Dziękujemy, dane zostały wysłane do biura księgowego.");
            System.out.println("Informujemy o konieczności odbioru gotowego aneksu do umowy od Pani Hani z HR.");
            System.out.println("Informujemy, że ZUS i US zostały poinformowanie o zmianie wypłaty, nie ma sensu ukrywać dochodu.");
            this.salary = salary;
        }

}
