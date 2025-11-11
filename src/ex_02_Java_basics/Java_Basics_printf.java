package ex_02_Java_basics;

public class Java_Basics_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("Your variable is %d", a); //printf is use for formatting string
        //%d - int, byte, short, long -data type
        //%s - string
        //%f - float, double
        //%b - bollean

        int b = 20;
        System.out.printf("a value is %d , b value is %d" ,a,b);
        System.out.println(); //it will add new line
        System.out.printf("a value is = % d , b value is = %d",a,b);
        System.out.println();
        System.out.printf("a = %d , b = %d", a,b);

    }
}
