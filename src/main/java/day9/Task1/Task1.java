package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Олег", "M-33");
        Teacher teacher = new Teacher("Виктор", "Биология");
        System.out.println("Группа " + student.getGroupName());
        System.out.println("Предмет " + teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
