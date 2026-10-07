import java.util.Scanner;

public class Marks{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, avg = 0 ;
        char Grade;


        System.out.print("Enter The Physics Marks : ");
        double phy = sc.nextInt();

        System.out.print("Enter The Chemistry Marks : ");
        double Che = sc.nextInt();

        System.out.print("Enter The Biology Marks : ");
        double Bio = sc.nextInt();

        System.out.print("Enter The Mathematics Marks : ");
        double Maths = sc.nextInt();

        System.out.print("Enter The IT Marks : ");
        double It = sc.nextInt();

        total = phy + Che + Bio + Maths + It;
        avg = total/5;

        System.out.println("Total Marks is : " + total);
        System.out.println("Average is " + avg );

        if( avg>=90 && avg<= 100 ){
            System.out.println("Grade A");
        }

           else if(avg >= 80 && avg <= 90){
                System.out.println("Grade B");
            }

               else if (avg >=70 && avg<= 80){
                    System.out.println("Grade C");
                }

                else if(avg >=60 && avg<= 70) {
                    System.out.println("Grade D");
                }

                   else  if(avg >=40 && avg<= 60){
                        System.out.println("Grade E");
                    }
                        else if (avg <=40 && avg<= 0){
                            System.out.println("Grade F");
                        }




    }


}
