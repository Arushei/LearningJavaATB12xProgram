package Tasks;

import java.util.Scanner; //this needs to be imported.

public class Task_Triangle_5 {
    public static void main(String[] args) {

        System.out.println("Enter Side 1 of Triangle");
        Scanner scanner = new Scanner(System.in);// this needs to be define only once.
        int S1 = scanner.nextInt();

        System.out.println("Enter Side 2 of Triangle");
        int S2 = scanner.nextInt();

        System.out.println("Enter Side 3 of Triangle");
        int S3 = scanner.nextInt();

        if ((S1==S2) && (S2==S3)){
            System.out.println("This is Acute Triangle");
        }
        else if((S1==S2) || (S2==S3) || (S1==S3)) {
            System.out.println("This is Isoceles Triangle");
        }
        else {
            System.out.println("This is obtuse Triangle");
        }

    }
}
