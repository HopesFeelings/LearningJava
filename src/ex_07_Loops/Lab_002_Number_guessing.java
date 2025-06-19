package ex_07_Loops;

import java.util.Random;
import java.util.Scanner;
public class Lab_002_Number_guessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(100)+1;
        System.out.println(num);

        System.out.println("Make a guess");
        int count = 0;

        while(true)
        {

            int guessedNum = sc.nextInt();
            count++;


            if(num == guessedNum)
            {
                System.out.println("Correct");
                System.out.printf("Yout guessed in %d attempts", count);
                return;
            }
            else if(guessedNum < num)
            {
                System.out.println("Make a larger guess");
            }
            else
            {
                System.out.println("Make a smaller guess");
            }

        }



    }
}
