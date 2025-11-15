package Java_Operators;

public class Java_Typecas_ex {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
       // int total1 = course+GST; // Narrowing Implicit
        int total = course + (int)GST;// Narrowing Explicit
        System.out.println(total); // output 118 : this will not give answer in decimal.
        // so instead of this we should use,

        float total2 = course+GST; // Widening -auto-implicit
        //float total3 = (float)course + GST;// Widening - Explicit
        System.out.println(total2); // output - 118.45

    }
}
