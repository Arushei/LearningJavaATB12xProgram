package Java_Increment_Decrement_OP;

public class Java_Advance_Inc {
    public static void main(String[] args) {
       // int a = 10;
      //  System.out.println(a++ + a);

        // a++ -> Exp A -> 10 (print first increment later)
        // +
        // a - > Exp B -> 11 (increment after 1st a++)

     //   int a = 10;
      //  System.out.println(a++ + ++a);
     //   System.out.println(a);

        // a++ -> Exp A -> 10, a-> 11
        //+
        // ++a -> Exp B -> 12 , a -> 11

        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> Exp A -> 11 , a->11
        // +
        // ++a -> Exp B -> 12 , a-> 12
    }
}
