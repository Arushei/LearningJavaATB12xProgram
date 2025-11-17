package Java_Operators;

public class Java_String_To_Int {
    public static void main(String[] args) {

        // if arguments are less then it will throw error.

        String age = args[0];

        int age_new = Integer.parseInt(age);//it will convert string into integer.
        System.out.println(age_new);

        String age1 = args[1];
        float age_float = Float.parseFloat(age1); //it will convert string into float
        System.out.println(age_float);

      //  String age2 = args[2];
      //  String age3 = args[3];
      //  String age4 = args[4];



       // System.out.println(age2);
       // System.out.println(age3);
       // System.out.println(age4);




    }
}
