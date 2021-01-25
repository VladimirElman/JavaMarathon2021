package day6;

class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }


    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {

        return Math.abs(inputYear - year);


    }
}


