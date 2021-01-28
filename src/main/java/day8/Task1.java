package day8;

public class Task1 {
    public static void main(String[] args) {
       String elements = "";

       long before = System.currentTimeMillis();
        for(int i = 0; i<=20000;i++){

            elements += i + " ";

        }
        long after = System.currentTimeMillis();
        System.out.println();
        System.out.println("Время выполнения цикла 1: " + (after-before));
        System.out.print(elements);


        StringBuilder builder = new StringBuilder("");
        before = System.currentTimeMillis();
        for(int i = 0; i<=20000;i++){

            builder.append(i) .append(" ");
        }
        after = System.currentTimeMillis();
        System.out.println(builder);

        System.out.println("Время выполнения цикла 2: " + (after-before));
    }
}
