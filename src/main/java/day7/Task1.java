package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2015, 40, 45);
        Airplane airplane2 = new Airplane("Airbus", 2019, 45, 40);
        airplane1.compareAirplanes(airplane1, airplane2);


    }
}