package lesson4.student;

import lesson4.scheme.Scheme1;

public class StudentType1 extends Student {

    public StudentType1(String name, float talent) {
        super(name, talent);
        this.schemeOfStudy = new Scheme1();
    }
}
