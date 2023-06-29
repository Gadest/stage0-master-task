package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year>0 && month>0 && month<=12){
            int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
            if (((year%4==0 && year%100!=0) || year%400==0 ) && month==2)
                System.out.println("29");
            else System.out.println(arr[month-1]);
        }
        else System.out.println("invalid date");
    }

}
