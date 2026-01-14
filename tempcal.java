import java.util.Scanner;
public class tempcal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER THE TEMPERATURE VALUE TO CONVERT FROM ");
          Double temp = scanner.nextDouble();
        
            System.out.println("ENTER THE UNIT TO CONVERT FROM (C/F): ");
            char UNIT = scanner.next().toUpperCase().charAt(0);
            double convertedTemp = (UNIT == 'C')? (temp*9/5) +32 : (temp -32)*5/9;
            System.out.println("THE CONVERTED TEMPERATURE IS: " + convertedTemp);
            scanner.close();


    }
    
}
