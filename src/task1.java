import java.util.Scanner;

public class task1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ender the No : ");
        int b = sc.nextInt();

        int Factorials = 1 ;

        for (int i = 1; i <= b; i++){
              Factorials *= i;
        }
        System.out.println(  Factorials );


        System.out.println("Factorial is : " + Factorials);


    }
}
