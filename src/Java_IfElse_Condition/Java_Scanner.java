package Java_IfElse_Condition;

import java.util.Scanner;

public class Java_Scanner {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("Not allowed to vote");
        }
        }

    }
    //Scanner is used to get input from user.
    // Class, it  has a inbuilt method like nextInt, , next, nextFloat.
    // These inbuilt methods can be used to basically get an input from a user
    // and assign directly into their respective data types.



