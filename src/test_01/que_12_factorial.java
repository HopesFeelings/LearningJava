package test_01;


import java.util.Scanner;

public class que_12_factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();

        long factorial = 1;

        for(int i=1; i<=num; i++)
        {
            factorial = factorial * i;

        }

        System.out.println(factorial);
    }
}
