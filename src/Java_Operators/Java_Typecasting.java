package Java_Operators;

public class Java_Typecasting {
    public static void main(String[] args) {

        long phone_no = 9756943070l;//Narrowing - implicit
        // short s = phone_no (we cannot write this, it cannot store like this as short is 16bits)
        short s = (short) phone_no;// Narrowing Explicit
        System.out.println(s); //output - 8926
        // Reason : the long phone_no converting into binary 64bits,
        // then short has pick 16bits from this & getting convert into
        // this output number. Narrowing never store full value.

    }
}
