package test_01;

import java.util.Scanner;

public class que_10_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");


        byte choice = sc.nextByte();

        System.out.println("Enter number 1");
        int a = sc.nextByte();

        System.out.println("Enter number 2");
        int b = sc.nextByte();

        int c = 0;

        switch (choice)
        {
            case 1:

                c = a + b;
                System.out.println(c);

                break;


            case 2:

                c = a - b;

                System.out.println(c);

                break;

            case 3:

                c = a * b;

                System.out.println(c);

                break;

            case 4:

                float d = (float)a / b;

                System.out.println(d);

                break;

            default:
                System.out.println("Invalid input");

        }

    }
}
