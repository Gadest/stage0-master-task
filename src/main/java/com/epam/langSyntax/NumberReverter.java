package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        boolean negative =false;

        String str = String.valueOf(number);
        String arr[]=str.split("");
        str=arr[0];
        arr[0]=arr[2];
        arr[2]=str;
        str="";
        for (String s:
                arr) {
            str=str+s;
        }


        System.out.println(str);
    }

}
