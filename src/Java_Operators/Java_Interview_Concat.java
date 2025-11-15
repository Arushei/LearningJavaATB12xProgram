package Java_Operators;

public class Java_Interview_Concat {
    public static void main(String[] args) {

        String first_name = "Aruhei";
        String last_name = "A Singh";

        int a = 10;
        int b = 10;

        System.out.println(first_name + '\t' +last_name + a + b); //it will merge from left to right.
        //Aruhei A Singh1010
        System.out.println(a +b + first_name + last_name); //it will add first then merge
        //20AruheiA Singh
        System.out.println(first_name + last_name + (a+b)); // it will follow BODMAS rule
        //AruheiA Singh20

    }
}
