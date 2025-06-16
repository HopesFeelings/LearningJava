package ex_02_TypeCasting;

public class Lab_005_Char_to_ASCII {
    public static void main(String[] args) {


        char x = 65535;
        System.out.println(x);


//        char x = 'A';
//        int y = x;

        //System.out.println(y);

    }
}

// Java allows this without an explicit cast
// because 65 is a constant integer value within the
// valid range of char (i.e., from 0 to 65535).
// So this is not considered narrowing in practice — it's treated as a compile-time constant conversion.

// Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.