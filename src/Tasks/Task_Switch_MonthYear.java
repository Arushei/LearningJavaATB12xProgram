package Tasks;

import java.util.Scanner;

public class Task_Switch_MonthYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month Number :");
        int month = scanner.nextInt();
        System.out.println("Enter Year Number :");
        int year = scanner.nextInt();

        switch (month){
            case 1,3,5,7,8,10,12 :
                System.out.println(31);
                break;
            case 4,6,9,11:
                System.out.println(30);
                break;
            case 2 :
                if ((year%4==0) && (year%100!=0) || (year%400==0)){
                    System.out.println(29);
                }
                else{
                    System.out.println(28);
                }
                break;
            default:
                System.out.println("Not valid");


        }
    }
}
