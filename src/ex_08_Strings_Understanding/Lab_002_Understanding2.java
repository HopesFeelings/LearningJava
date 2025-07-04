package ex_08_Strings_Understanding;

public class Lab_002_Understanding2 {

    public static void main(String[] args) {


        String s = "Radha";

        String news = s.toLowerCase();
        System.out.println(news);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(news));



    }


}
