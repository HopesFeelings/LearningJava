package ex_07_Loops;


import java.util.Scanner;

public class Lab_003_CharIsVowelOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");

        char ch = sc.nextLine().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u')
        {
            System.out.printf("Character %c is vowel",ch);
        }
        else
        {
            System.out.printf("Character %c is not vowel",ch);
        }

    }
}
