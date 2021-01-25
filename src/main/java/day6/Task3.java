package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setName("Петр Иванов");
        teacher1.setLesson("Биология");
        Student student1 = new Student();
        teacher1.evaluate("Олег Солнцев");
    }
}
