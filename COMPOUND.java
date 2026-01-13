import java.util.Scanner;
public class COMPOUND {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double principle;
        double interest;
        int compound;
        int lifetime;
        System.out.println("ENTER THE VALUE OF PRINCIPLE AMOUNT : ");
        principle=scanner.nextDouble();
        System.out.println("ENTER THE INTEREST IN PERCENTAGE");
        interest=scanner.nextDouble();
        interest=interest/100;
        System.out.println("ENTER THE NUMBER OF TIMES INTEREST IS COMPOUNDED IN A YEAR");
        compound=scanner.nextInt();
        System.out.println("ENTER THE LIFETIME IN YEARS");
        lifetime=scanner.nextInt();
        double amount;
        amount=principle*Math.pow(1+interest/compound ,compound*lifetime);
        System.out.printf("THE TOTAL AMOUNT IS %.2f",amount);
        scanner.close();
    }
}
