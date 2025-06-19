package ex_07_Loops;


import java.util.Scanner;

public class Lab_001_factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();

        int factorial = 1;

        if(num < 0)
        {
            System.out.println("Enter the valid number");
            return;
        }

        if(num == 0)
        {
            System.out.println(factorial);
        }
        else
        {
            for(int i =1; i<=num; i++)
            {
                factorial = factorial * i;
            }

            System.out.println(factorial);
        }







    }
}
