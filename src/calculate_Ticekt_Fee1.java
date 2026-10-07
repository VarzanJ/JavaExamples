import java.util.Scanner;

public class calculate_Ticekt_Fee1 {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("Enter The Residence (1.local, 2. foreign ) : ");
        int Residence = sc.nextInt();
        System.out.print("Enter The age : ");
        int age = sc.nextInt();

        int fees = 0;
        String ResidenceStataus = "";

        if (Residence == 1) {
            ResidenceStataus = "logal";
            if (age <= 5) {
                fees = 0;
            } else if (age > 5 && age <= 12) {
                fees = 30;
            } else if (age > 12 && age <= 18) {
                fees = 50;
            } else {
                fees = 100;
            }

            }
            else if (Residence == 2) {
                ResidenceStataus = "foreign";
                if (age <= 5) {
                    fees = 100;
                } else if (age > 5 && age <= 12) {
                    fees = 500;
                } else if (age > 12 && age <= 18) {
                    fees = 1000;
                } else {
                    fees = 2000;}

            }
             else {
            ResidenceStataus = "invalid";
        }
            System.out.println("---------Print Ticket----------");
            System.out.println("Your Residence: " + ResidenceStataus);
            System.out.println("Your Age is " + age);
            System.out.println("Your Ticket Amount is : Rs. " + fees);
            System.out.println("Thank you come again");

    }

}
