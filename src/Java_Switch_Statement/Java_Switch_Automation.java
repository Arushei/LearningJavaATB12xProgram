package Java_Switch_Statement;

import java.util.Scanner;

public class Java_Switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //first define this so that user can enter user input
        System.out.println("Enter the browser"); //print the heading for user input
        String browser = scanner.next(); // define the valid int/string
        browser = browser.toLowerCase(); // it wil Chrome/CHRome/CHROME == Chrome ; No case sensitivity.

        switch (browser){
            case "chrome" :
            System.out.println("Open Steps for Chrome");
            break;
            case "firefox":
                System.out.println("Open steps for Firefox");
                break;
            case "opera":
                System.out.println("Steps open for Opera");
                break;
            default:
                System.out.println("I dont have idea of this browser");
                break;

        }
    }
}
