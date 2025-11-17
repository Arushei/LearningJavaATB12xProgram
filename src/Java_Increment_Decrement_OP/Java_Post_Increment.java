package Java_Increment_Decrement_OP;

public class Java_Post_Increment {
    public static void main(String[] args) {

        //#Increment Operator (++)
        //**Postfix Increment**: `variable++`
        //print first and then increase the value.

        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        /* ERT Table

           Line No.  | a_post  |  b
             10      |  10     | NA
             11      |  11     | 10
             12      |  11     |  NA
             13      |  NA     |  10
         */

    }
}
