import java.util.Scanner;

public class english {
    static void main() {
        Scanner sc = new Scanner(System.in);

        char letter ;
        System.out.print("Enter a Letter : ");
        char Letter = sc.next().charAt(0);

        if( Letter =='a'|| Letter == 'e' || Letter =='i'|| Letter == 'o' || Letter == 'u' ||
                Letter =='A'|| Letter == 'E' || Letter =='I'|| Letter == 'O' || Letter == 'U') {
            System.out.println(Letter + " The Letter is Vowles");
        }
         else{
            System.out.println(Letter + " The Letter isn't vowels");

        }

    }
}
