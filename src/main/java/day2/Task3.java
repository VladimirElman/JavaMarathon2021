package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (a < b) {
            a = a + 1;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}
