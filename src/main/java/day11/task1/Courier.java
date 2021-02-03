package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse a;

    public int getSalary() {
        return salary;
    }


    public Courier(Warehouse a) {
        this.a = a;
        a.getCountDeliveredOrders();


    }


    @Override
    public void doWork() {
        salary += 100;
        a.increaseDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (a.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", a=" + a +
                '}';
    }
}
