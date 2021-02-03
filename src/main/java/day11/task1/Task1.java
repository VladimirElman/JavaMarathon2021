package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker1 = new Picker(warehouse);
        Courier courier1 = new Courier(warehouse);

        businessProcess(picker1);
        System.out.println(picker1);
        System.out.println(warehouse);

        businessProcess(courier1);
        System.out.println(courier1);
        System.out.println(warehouse);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        businessProcess(picker2);
        System.out.println(picker2);
        System.out.println(warehouse2);

        businessProcess(courier2);
        System.out.println(courier2);
        System.out.println(warehouse2);


    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
