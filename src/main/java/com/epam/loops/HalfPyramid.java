package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i=0;i<cathetusLength;i++){
            int n = cathetusLength-i;
            for (int j= 0;j<n-1;j++){
                System.out.print(" ");
            }
            for (int m= i;m>=0;m--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
