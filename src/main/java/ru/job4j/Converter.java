package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value / 0.8f;
        return rsl;
    }

        public static float dollarToEuro(float value) {
        float rsl = value / 1.13f;
        return rsl;
        }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(1500);
        float dollar = Converter.euroToDollar(5);
        float euros = Converter.dollarToEuro(10);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("1500 rubles are " + dollars + " dollars.");
        System.out.println("5 euro are " + dollar + " dollars.");
        System.out.println("10 dollars are " + euros + " euro.");
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        float in2 = 1500;
        float expected2 = 25;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("1500 rubles are 25 dollars. Test result : " + passed2);
        float in3 = 5;
        float expected3 = 6.25f;
        float out3 = Converter.euroToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("5 euro are 6.25 dollars. Test result : " + passed3);
        float in4 = 10;
        float expected4 = 8.849558f;
        float out4 = Converter.dollarToEuro(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("10 dollars are 8.849558 euro. Test result : " + passed4);

    }
}