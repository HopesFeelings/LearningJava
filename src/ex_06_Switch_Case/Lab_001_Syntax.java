package ex_06_Switch_Case;

import java.util.Scanner;

public class Lab_001_Syntax {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();

        switch (num)
        {

            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("NA");
                break;

        }
    }
}
