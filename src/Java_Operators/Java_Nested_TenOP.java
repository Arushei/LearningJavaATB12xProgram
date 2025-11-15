package Java_Operators;

public class Java_Nested_TenOP {
    public static void main(String[] args) {

        //Nested Ternary
        //result = condition ? experssion1 : (condition2 : expression2 : expression3);

        int age = 21;
        String result = (age > 18) ?(age>25 ? "You can Drink" : "You cant Drink") : "You can't Go";
        System.out.println(result);
    }
}
