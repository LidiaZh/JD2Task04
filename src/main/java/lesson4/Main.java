package lesson4;

import lesson4.student.Student;
import lesson4.student.StudentType1;
import lesson4.student.StudentType2;
import lesson4.student.StudentType3;
import lesson4.utils.StudentInformation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final float BEST_HOURS_OF_STUDY = 198;

    public static void main(String[] args) {
        Student student1 = new StudentType1("Студент_1.1",StudentInformation.getTalent());
        Student student2 = new StudentType1("Студент_1.2",StudentInformation.getTalent());
        Student student3 = new StudentType1("Студент_1.3",StudentInformation.getTalent());

        Student student4 = new StudentType2("Студент_2.1",StudentInformation.getTalent());
        Student student5 = new StudentType2("Студент_2.2",StudentInformation.getTalent());
        Student student6 = new StudentType2("Студент_2.3",StudentInformation.getTalent());

        Student student7 = new StudentType3("Студент_3.1",StudentInformation.getTalent());
        Student student8 = new StudentType3("Студент_3.2",StudentInformation.getTalent());
        Student student9 = new StudentType3("Студент_3.3",StudentInformation.getTalent());

        List<Student> listOfStudents = Arrays.asList(student1, student2,
                student3, student4, student5, student6, student7, student8, student9);

        StudentInformation.printResult(listOfStudents, BEST_HOURS_OF_STUDY);

        System.out.println();
        StudentInformation.printResult(Collections.singletonList(student5),BEST_HOURS_OF_STUDY);
    }
}
