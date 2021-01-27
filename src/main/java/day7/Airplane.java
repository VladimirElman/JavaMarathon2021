package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + "," + " год выпуска: " + year + "," + " длина: " + length + "," + " вес: " + weight + "тонн," + " количество топлива в баке:" + fuel);

    }

    int fillUp(int n) {
        fuel += n;

        return n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println("Самолет " + airplane1.producer + " длиннее чем " + " самолет " + airplane2.producer);
        } else {
            System.out.println("Самолет " + airplane2.producer + " длиннее чем " + " самолет " + airplane1.producer);
        }


    }
}
