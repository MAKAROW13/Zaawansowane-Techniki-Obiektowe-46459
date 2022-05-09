package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    protected Car car;
    protected Double salary;

    public Double getSalary() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Kiedy pobarne zostały dane?"+formatter.format(date));
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0)
            System.out.println("Przepraszamy, ale nie można mieć wypłaty na minusie.");
        System.out.println("Dziękujemy, dane zostały wysłane do biura księgowego.");
        System.out.println("Informujemy o konieczności odbioru gotowego aneksu do umowy od Pani Hani z HR.");
        System.out.println("Informujemy, że ZUS i US zostały poinformowanie o zmianie wypłaty, nie ma sensu ukrywać dochodu.");
        this.salary = salary;
    }

    Animal pet = new Animal();
}
