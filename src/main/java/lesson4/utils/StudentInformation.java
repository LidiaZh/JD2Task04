package lesson4.utils;

import lesson4.student.Student;

import java.util.List;
import java.util.Random;

public class StudentInformation {

    //талант студента
    public static float getTalent() {
        Random random = new Random();
        return (float) ((random.nextInt(10) + 1) * 0.1);
    }

    //Информация о всех студентах
    public static void printResult(List<Student> list, float hour) {
        System.out.print("Тип студента  Талант  Разбор  Практика  Поток  Всего времени\n");
        for (Student st : list) {
            System.out.printf("%12s %7.1f %7.1f %9.1f %6.1f %14.1f",
                    st.getName(),
                    st.getTalent(),
                    st.scheme(hour).get(0),
                    st.scheme(hour).get(1),
                    st.scheme(hour).get(2),
                    sumHoursOfStudy(st, hour));
            System.out.println();
        }
    }

    //Время на получения навыка для отдельного студента с учетом таланта и типа
    public static float sumHoursOfStudy(Student student, float hours) {
        float sum = 0;
        for (int i = 0; i < student.scheme(hours).size(); i++) {
            sum += student.scheme(hours).get(i);
        }
        return sum;
    }
}
