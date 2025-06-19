package ex_06_Switch_Case;

import java.util.Scanner;

public class Lab_002_different_ways {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number");
//
//        String num = sc.next();

        char ch = 'A';

        switch (ch)
        {
            default:
                System.out.println("NA");
                break;

            case 65:
                System.out.println("Zero");
                break;

            case 'E':
                System.out.println("One");
                break;

            case 'T':
                System.out.println("Two");
                break;

        }
    }
}


