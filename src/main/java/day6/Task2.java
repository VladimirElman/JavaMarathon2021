package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2015, 43, 40);
        airplane1.setYear(2018);
        airplane1.setLength(50);
        airplane1.fillUp(10000);
        airplane1.fillUp(20000);
        airplane1.info();

    }
}
