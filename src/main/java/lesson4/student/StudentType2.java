package lesson4.student;

import lesson4.scheme.Scheme2;

public class StudentType2 extends Student {

    public StudentType2(String name, float talent) {
        super(name, talent);
        this.schemeOfStudy = new Scheme2();
    }
}
