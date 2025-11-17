package Java_Switch_Statement;

import java.util.Scanner;

public class Java_Switch_ex {
    public static void main(String[] args) {

        // Switch Statement : Multiple Condition or statements.
        // Java switch statement executes **one statement **from **multiple conditions.**


                //You need to take user input and ask for the integer from 1 go 7.
        // And if user enters 1 to 7
        // then you will tell which day it is.

        //Logic Building :
        // Step 1: Use the Scanner Class.
        // Step 2 : Figure out the expression of the program.
        // Step 3 : Rough logic.
        // Step 4 : Fix the logic and optimize.
        // Step 5 : Figure out the edge case.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user input");

        if (scanner.hasNext()) {// this loop will make sure you enter valid int input only.
           int day = scanner.nextInt();

            switch (day) {

                case 1:
                    System.out.println("Monday");
                    break; // it will amke you to comeout from loop
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default: // this is added if nothing matches then print this statement
                    System.out.println("Enter int number only from 1 to 7");

            }
        }

        else{
            System.out.println("This is wrong input you are entering");
        }
        }


        }





