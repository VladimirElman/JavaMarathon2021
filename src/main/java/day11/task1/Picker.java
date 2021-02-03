package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;

    private Warehouse a;

    public int getSalary() {
        return salary;
    }


    public Picker(Warehouse a) {
        this.a = a;


    }


    @Override
    public void doWork() {
        salary += 80;
        a.increasePickedOrders();

    }

    @Override
    public void bonus() {
        if (a.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;

        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", a=" + a +
                '}';
    }
}