package day6;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "White", 2008);

        Motorbike motorbike1 = new Motorbike("Honda", "Black", 2010);
        car1.info();
        motorbike1.info();
        int carYear = car1.yearDifference(2000);
        int bikeYear = motorbike1.yearDifference(2020);
        System.out.println("Разинца " + carYear + " лет");
        System.out.println("Разница " + bikeYear + " лет");


    }
}
