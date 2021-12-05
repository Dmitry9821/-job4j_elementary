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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
         in = 1500;
         expected = 25;
         out = Converter.rubleToDollar(in);
         passed = expected == out;
        System.out.println("1500 rubles are 25 dollars. Test result : " + passed);
         in = 5;
        expected = 6.25f;
         out = Converter.euroToDollar(in);
         passed = expected == out;
        System.out.println("5 euro are 6.25 dollars. Test result : " + passed);
         in = 10;
         expected = 8.849558f;
         out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("10 dollars are 8.849558 euro. Test result : " + passed);

    }
}