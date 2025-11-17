package Tasks;

public class Task_4_Increment_Decrement {
    public static void main(String[] args) {
      //  int i = 11;
      //  i = i++ + ++i;
      //  System.out.println(i);

        // i++ -> Exp A -> 11 , i -> 12
        // +
        // ++i -> Exp B -> 13 , i -> 13

       // int a = 11, b = 22, c;
      //  c = a + b + a++ + b++ + ++a + ++b;// 11+22+11+22+13+24 = 103
      //  System.out.println("a=" + a);
      //  System.out.println("b=" + b);
      //  System.out.println("c=" + c);

        // ++a -> 12 , ++b -> 23 , a-> 13 , b-> 24
        // a -> 11 , b -> 22
        // a++ -> 11 , b++ -> 22 , a -> 12 , b-> 23
        // ++a -> 13 , ++b -> 24

        int i = 1, j = 2, k = 3;
        int m = i-- - j-- - k--;
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

        // i = ++i -> Exp A -> 3
        // +j = ++j -> Exp B -> 4
        // +k = ++k -> Exp C -> 6
        // m = (i--) - (j--) - (K--) -> 1-2-3 = 0 , i -> 0 , j -> 1 , k-> 2
        // +m = ++m -> Exp D -> -1-1-2 -> 4


    }
}
