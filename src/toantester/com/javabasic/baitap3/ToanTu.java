package toantester.com.javabasic.baitap3;

public class ToanTu {
    int number = 100;
    int number1 = 50;
    int number2 = 20;

    public void checkNumber1() {
        String s = ((number > number1) && (number1 > number2)) ? "True" : "False"; // Toán tử quan hệ >,< toán tử logic &&
        System.out.println(s);
        String m = ((number > number1) || (number1 < number2)) ? "True" : "False"; // Toán tử quan hệ >,< toán tử logic ||
        System.out.println(m);
        String n = (number1 % number2 == 0) ? "Number1 chia hết cho number 2" : "Number 1 không chia hết cho number2";// Toán tử số học % toán tử logic &&
        System.out.println(n);
        String e = (number != number1) ? "True" : "False"; // Toán tử quan hệ != (so sánh khác)
        System.out.println(e);
        String f = (number == number1) ? "True" : "False"; // Toán tử quan hệ ==
        System.out.println(f);
    }

    public void checkNumber(int n) {
        if (n == number) {
            System.out.printf("Gía trị n = number");
        } else if (n < number) {
            System.out.printf("Gía trị n < number");
        } else {
            System.out.printf("Gía trị n > number");
        }
    }
    public static void main(String[] args) {
        ToanTu tt = new ToanTu();
        tt.checkNumber1();
        tt.checkNumber(200);
    }
}
