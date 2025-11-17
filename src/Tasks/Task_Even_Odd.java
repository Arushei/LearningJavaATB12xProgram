package Tasks;

public class Task_Even_Odd {
    public static void main(String[] args) {

        int number = 80;
       int number1 = number%2;
        String result = (number1==0 ? "Even" : "Odd");
        System.out.println(result);

    }
}
