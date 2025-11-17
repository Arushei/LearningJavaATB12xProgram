package Tasks;

public class Task_GreaterNumber_TO {
    public static void main(String[] args) {

        int N1 = 10;
        int N2 = 60;
        int N3 = 30;

        //int max = N1 > N2 ? True : False
        //if True then you will check for N1>N3.
        //if False then you will check for N2 > N3.
        // if both not true then it will print N3.

        int max = N1 > N2 ? (N1>N3 ? N1 : N3) : (N2>N3 ? N2 : N3);
        System.out.println(max);


    }
}
