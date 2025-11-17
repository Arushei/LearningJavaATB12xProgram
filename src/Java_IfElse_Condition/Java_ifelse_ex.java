package Java_IfElse_Condition;

public class Java_ifelse_ex {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("You can Vote");
        }
            else {
            System.out.println("You cannot vote");
        }
    }
}
