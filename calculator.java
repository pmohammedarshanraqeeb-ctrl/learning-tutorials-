import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println("enter the operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        switch (operator) 
        {
            case '+'-> result = num1 + num2;
            case '-'-> result = num1 - num2;
            case '*'-> result = num1 * num2;
            case '/'-> 
            {
                if (num2==0){
                    System.out.println("the number is not divisible sorry!");
                    validOperation = false;
                }else{
                    
                    result = num1 / num2;

                }
            }
            case '^'-> result = Math.pow(num1, num2);
            default-> {System.out.println("Invalid operator!");
            validOperation = false;}
        }
        if (validOperation){
            System.out.println("The result is: " + result);
        }
        
        scanner.close();
            
    }
}

