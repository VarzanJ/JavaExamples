import java.util.Scanner;

public class weekORweenend {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int Number = sc.nextInt();


        switch (Number){
            case 1:
                System.out.println("Monday (Week)");
                break;

            case 2:
                System.out.println("Tuesday (Week)");
                break;

            case 3:
                System.out.println("Wednesday (Week)");
                break;

            case 4:
                System.out.println("Thursday (Week)");
                break;

            case 5:
                System.out.println("Friday (Week)");
                break;

            case 6:
                System.out.println("Saturday (Weekend)");
                break;

            case 7:
                System.out.println("Sunday Weekend)");
                break;

            default:
                System.out.println("Invalid Number ");
    }
}
}
