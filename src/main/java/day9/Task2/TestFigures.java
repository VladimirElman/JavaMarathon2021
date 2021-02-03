package day9.Task2;

/**
 * Создайте абстрактный класс Фигура (англ. Figure). Этот класс будет являться абстрактным представлением геометрической фигуры в нашей программе.
 * <p>
 * Figure[] figures = {
 * new Triangle(10, 10, 10, "Red"),
 * new Triangle(10, 20, 30, "Green"),
 * new Triangle(10, 20, 15, "Red"),
 * new Rectangle(5, 10, "Red"),
 * new Rectangle(40, 15, "Orange"),
 * new Circle(4, "Red"),
 * new Circle(10, "Red"),
 * new Circle(5, "Blue")
 * };
 * <p>
 * В этом же классе реализуйте два метода:
 * public static double calculateRedPerimeter(Figure[] figures)
 * public static double calculateRedArea(Figure[] figures)
 * <p>
 * Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур. Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
 * Вызовите эти два метода на массиве figures и выведите результат в консоль.
 * <p>
 * В java есть константа Math.PI, используйте ее, вместо ручного ввода 3,14
 * /**
 */

public class TestFigures {
    public static void main(String[] args) {



        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 20),
                new Circle("Blue", 5)
        };
        System.out.println("Сумма периметров красных фигур равна " + calculateRedPerimeter(figures));
        System.out.println("Сумма площадей красных фигур равна " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        int sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();

        }
        return sum;

    }

    public static double calculateRedArea(Figure[] figures) {
        int sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();
        }
        return sum;
    }




}


