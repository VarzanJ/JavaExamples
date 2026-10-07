import java.util.Scanner;

public class OddorEven{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The numbers is even");
          } else {
            System.out.println("The number is odd");
        }
}
    }