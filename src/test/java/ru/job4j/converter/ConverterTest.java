package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Converter;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float exepcted = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(exepcted, out, eps);
    }

    @Test
    public void whenCovert0RblThen0Dlr() {
        float in = 0;
        float exepcted = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(exepcted, out, eps);
    }
}