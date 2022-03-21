package lesson4.testLesson4;

import lesson4.student.*;
import lesson4.utils.StudentInformation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void getInfOfStudent() {
        //тесты в случае таланта 1
        Student student1 = new StudentType1("Студент_1", 1);
        Student student2 = new StudentType2("Студент_2", 1);
        Student student3 = new StudentType3("Студент_3", 1);

        float hour = 198;
        Assert.assertEquals(student1.scheme(hour), Arrays.asList(66f, 66f, 66f));
        Assert.assertEquals(student2.scheme(hour), Arrays.asList(198f, 198f, 0f));
        Assert.assertEquals(student3.scheme(hour), Arrays.asList(594f, 0f, 0f));
        Assert.assertNotEquals(student3.scheme(hour), Arrays.asList(598f, 0f, 0f));

        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student1, hour), 198f, 0f);
        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student2, hour), 396f, 0f);
        Assert.assertNotEquals(StudentInformation.sumHoursOfStudy(student2, hour), 392f, 0f);
        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student3, hour), 594f, 0f);

        hour = 220;
        Assert.assertEquals(student1.scheme(hour), Arrays.asList(73.333336f, 73.333336f, 73.333336f));
        Assert.assertEquals(student2.scheme(hour), Arrays.asList(220f, 220f, 0f));
        Assert.assertEquals(student3.scheme(hour), Arrays.asList(660f, 0f, 0f));
        Assert.assertNotEquals(student3.scheme(hour), Arrays.asList(598f, 0f, 0f));

        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student1, hour), 220f, 0f);
        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student2, hour), 440f, 0f);
        Assert.assertNotEquals(StudentInformation.sumHoursOfStudy(student2, hour), 392f, 0f);
        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student3, hour), 660f, 0f);

        //тесты в случае таланта 0.5
        Student student4 = new StudentType1("Студент_1", 0.5f);
        Student student5 = new StudentType2("Студент_2", 0.5f);
        Student student6 = new StudentType3("Студент_3", 0.5f);

        hour = 198;
        Assert.assertEquals(student4.scheme(hour), Arrays.asList(132f, 132f, 132f));
        Assert.assertEquals(student5.scheme(hour), Arrays.asList(396f, 396f, 0f));
        Assert.assertEquals(student6.scheme(hour), Arrays.asList(1188f, 0f, 0f));
        Assert.assertNotEquals(student3.scheme(hour), Arrays.asList(1181f, 0f, 0f));

        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student4, hour), 396f, 0f);
        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student5, hour), 792f, 0f);
        Assert.assertNotEquals(StudentInformation.sumHoursOfStudy(student5, hour), 392f, 0f);
        Assert.assertEquals(StudentInformation.sumHoursOfStudy(student6, hour), 1188f, 0f);
    }
}
