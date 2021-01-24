package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[100];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = random.nextInt(10000);
        int max = 0;
        for (int x : myArray) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
        int min = 10000;
        for (int x : myArray) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Минимальное число в массиве: " + min);
        int counter = 0;
        for (int x : myArray) {
            if (x % 10 == 0)
                counter++;

        }
        System.out.println("Количество чисел оканчивающихся на 0:" + counter);
        int sum = 0;
        for (int x : myArray) {
            if (x % 10 == 0)
                counter++;
            sum += x;
        }
        System.out.println("Сумма элементов оканчивающихся на 0: " + sum);


    }
}

