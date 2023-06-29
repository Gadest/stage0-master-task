package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i=0;i<cathetusLength;i++){
            int n = cathetusLength-i;
            for (int j= 0;j<n-1;j++){
                System.out.print(" ");
            }
            for (int m= i;m>=0;m--){
                System.out.print(m+1);
            }
            for (int m= 1;m<=i;m++){
                System.out.print(m+1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
