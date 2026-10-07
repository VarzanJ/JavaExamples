import java.util.Scanner;

public class inputArithmetic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, sub = 0, multy = 0;

        System.out.print("Enteer First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        total = a + b + c;
        sub = a - b -c;
        multy = a * b * c;

        System.out.println("Total value is : " + total);
        System.out.println("Substraction is : " + sub);
        System.out.println("Multiplication is : " + multy);

    }

}
