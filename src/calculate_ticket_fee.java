import java.util.Scanner;

public class calculate_ticket_fee {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double fee = 0;
        String  Touriststype = "";
        int age = 0;

        System.out.print("Enter The Tourists Type (local / foreign):  ");
        String typ  = sc.next();

        System.out.print("Enter The Age : ");
        int a = sc.nextInt();


        if (typ.equalsIgnoreCase("logal")) {
             Touriststype = "logal";
            if (age <= 5) {
                fee = 0;
            } else if (age > 5 && age < 13) {
                fee = 30;
            } else if (age < 12 && age < 19) {
                fee = 50;
            } else if (age < 18 && age > 18) {
                fee = 100;
            }

       else if (typ.equalsIgnoreCase("foreign")) {
                 Touriststype = "foreign";
                if (age <= 5) {
                    fee = 100;
                } else if (age > 5 && age < 13) {
                    fee = 500;
                } else if (age < 12 && age < 19) {
                    fee = 1000;
                } else if (age < 18 && age > 18) {
                    fee = 2000;
                } else {
                    Touriststype = "invalid";

                }

                System.out.println("---------Print Ticket---------");
                System.out.println("Type of Tourists :" + typ);
                System.out.println("Total Fee : " + fee);
                System.out.println("Thankyou come again");
            }
        }
    }
}






