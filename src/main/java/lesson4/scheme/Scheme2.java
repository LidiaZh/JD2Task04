package lesson4.scheme;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scheme2 implements SchemeOfStudy {

    @Override
    public List<Float> scheme(float hours) {
        hours *= 2;
        float analysis = hours / 2;
        float practice = hours / 2;
        float stayInThread = 0;
        return new LinkedList<>(Arrays.asList(analysis, practice, stayInThread));
    }
}
