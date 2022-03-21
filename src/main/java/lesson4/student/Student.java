package lesson4.student;

import lesson4.scheme.SchemeOfStudy;

import java.util.LinkedList;
import java.util.List;

public abstract class Student {

    private final float talent;
    private final String name;
    SchemeOfStudy schemeOfStudy;

    public Student(String name, float talent) {
        this.name = name;
        this.talent = talent;
    }

    public List<Float> scheme(float hours) {
        hours /= this.talent;
        return new LinkedList<>(schemeOfStudy.scheme(hours));
    }

    public float getTalent() {
        return talent;
    }

    public String getName() {
        return name;
    }
}
