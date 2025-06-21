package test_01;

import java.util.Scanner;

public class que_06_positive_negative_zero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();


        if(num > 0)
        {
            System.out.println("number "+num+" is positive");
        }
        else if(num < 0)
        {
            System.out.println("number "+num+" is negative");
        }
        else
        {
            System.out.println("number "+num+" is zero");
        }
    }
}
