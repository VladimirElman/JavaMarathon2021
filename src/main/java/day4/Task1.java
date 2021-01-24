package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        int even = 0;
        int odd = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.print(numbers[i] + " ");
            sum = sum + numbers[i];
            if (numbers[i] % 2 == 0) {
                even++;
            }
            if (numbers[i] % 2 - 1 == 0) {
                odd++;
            }
            if (numbers[i] == 1) {
                a++;
            }
            if (numbers[i] > 8) {
                b++;
            }
        }
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше восьми: " + b);
        System.out.println("Количество чисел равных единице: " + a);
        System.out.println("Количетсво четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}

