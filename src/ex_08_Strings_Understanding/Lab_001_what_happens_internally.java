package ex_08_Strings_Understanding;

public class Lab_001_what_happens_internally {

    public static void main(String[] args) {
            // String literal — stored in SCP
            String literal = "Radha";

            // Created using StringBuilder — stored in heap
            StringBuilder sb = new StringBuilder("Radha");
            //String interned = sb.intern();
            String fromBuilder = sb.toString(); // This is a new String in the heap
            String interned1 = fromBuilder.intern();


        System.out.println(sb);
        System.out.println(fromBuilder);

        System.out.println("----------------------");

        System.out.println("string literal "+ System.identityHashCode(sb));
        System.out.println("string literal "+ System.identityHashCode(fromBuilder));









//            // Interned version of the StringBuilder result
//            String interned = fromBuilder.intern(); // Now points to SCP
//
//            // Comparing references
//            System.out.println("literal == fromBuilder       : " + (literal == fromBuilder)); // false
//            System.out.println("literal == interned          : " + (literal == interned));    // true
//            System.out.println("fromBuilder == interned      : " + (fromBuilder == interned)); // false
//
//            // Identity hash codes (like memory addresses for demo)
//            System.out.println("\n--- Identity Hash Codes ---");
//            System.out.println("literal       : " + System.identityHashCode(literal));
//            System.out.println("fromBuilder   : " + System.identityHashCode(fromBuilder));
//            System.out.println("interned      : " + System.identityHashCode(interned));
        }












}
