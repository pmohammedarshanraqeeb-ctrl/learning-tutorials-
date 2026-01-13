import java.util.Scanner;
public class ticketdiscount 
{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("IS THE PERSON A STUDENT?(true/false)");
        boolean isStudent=scanner.nextBoolean();
        System.out.println("IS THE PERSON A SENIOR CITIZEN?(true/false)");
        boolean isSeniorCitizen=scanner.nextBoolean();
        double ticketPrice=100.0;
        if (isStudent) {
            if (isSeniorCitizen) {
                System.out.println("you get the 30% discount sir have a beautiful day! ");
                ticketPrice = ticketPrice*0.7;
                System.out.printf("the ticket price is %.2f", ticketPrice);
            } else {
                System.out.println("you get the 10% discount , have a beautiful day! ");
                ticketPrice = ticketPrice*0.9;
                System.out.printf("the ticket price is %.2f", ticketPrice);
            }
        }
         else 
            {
            if (isSeniorCitizen) {
                System.out.println("welcome sir you get 20% discount ,have a beautuful day!");
                ticketPrice *=0.8;
                System.out.printf("the ticket price is %.2f", ticketPrice);
            } else {
                System.out.println("have a beautiful day!");
                System.out.printf("the ticket price is %.2f", ticketPrice);
            
            
        }
        scanner.close();   

        }
    }
}
