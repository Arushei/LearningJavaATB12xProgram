package Tasks;

import java.util.Scanner;

public class Task_Switch_Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Grade :");
        String Grade = scanner.next();

        switch (Grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "E":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade Type");
                break;


        }
    }
}
