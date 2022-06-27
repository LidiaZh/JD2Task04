package lesson4.scheme;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scheme1 implements SchemeOfStudy {

    @Override
    public List<Float> scheme(float hours) {
        float analysis = hours / 3;
        float practice = hours / 3;
        float stayInThread = hours / 3;
        return new LinkedList<>(Arrays.asList(analysis, practice, stayInThread));
    }
}
