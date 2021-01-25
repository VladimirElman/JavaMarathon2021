package day6;

import java.util.Random;

public class Teacher {
    private String teacherName;
    private String lesson;

    public String getName() {
        return teacherName;
    }

    public void setName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    void evaluate(String studentName) {
        Random random = new Random();
        int min = 2;
        int max = 5;
        int mark = min + random.nextInt(max - min + 1);

        System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + studentName + " по предмету " + lesson + " на оценку " + mark);
        switch (mark) {
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
        }

    }
}




