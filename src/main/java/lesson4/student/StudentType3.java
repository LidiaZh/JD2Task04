package lesson4.student;

import lesson4.scheme.Scheme3;

public class StudentType3 extends Student {

    public StudentType3(String name, float talent) {
        super(name, talent);
        this.schemeOfStudy = new Scheme3();
    }
}
