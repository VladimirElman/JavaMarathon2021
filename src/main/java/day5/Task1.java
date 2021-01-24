package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Nissan Tiida");
        car1.setColor("Gold");
        car1.setYear(2008);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());


    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }
}

