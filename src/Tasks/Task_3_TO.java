package Tasks;

public class Task_3_TO {
    public static void main(String[] args) {
        // String result = age > 18 ? True : False
        // if age is smaller than 18, then I can be minor.
        //  if age is greater than 65, then I am a senior.
        // if age between 18 to 65, then I am an adult.

       String user_input = args[3]; //In edit configuration you can add multiple it will add in args[0,1,2,3..]
         // we need to convert into int.
       int age = Integer.parseInt(user_input); //this is function will convert string into int.
        System.out.println(age);

        String result = (age<18)? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);

    }
}
