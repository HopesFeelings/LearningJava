package test_01;

import java.util.Scanner;


public class que_07_largest_of_three {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;


        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println(max);

    }
}
