import java.util.Scanner;

public class Vowelswitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Letter : ");
        char Letter = sc.next().charAt(0);

        switch (Letter){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(Letter + " is vowels");
                break;

            default:
                System.err.println(Letter + " isn't vowels");


        }

    }
}
