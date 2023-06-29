package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        boolean negative =false;

        String str = String.valueOf(number);
        String arr[]= str.split("");
        int result = 0;
        for (String s:
                arr) {
            result +=Integer.parseInt(s);
        }

        System.out.println(result);
    }

}
