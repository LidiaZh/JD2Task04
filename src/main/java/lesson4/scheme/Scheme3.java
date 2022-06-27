package lesson4.scheme;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scheme3 implements SchemeOfStudy {

    @Override
    public List<Float> scheme(float hours) {
        hours *= 3;
        float analysis = hours;
        float practice = 0;
        float stayInThread = 0;
        return new LinkedList<>(Arrays.asList(analysis, practice, stayInThread));
    }
}
