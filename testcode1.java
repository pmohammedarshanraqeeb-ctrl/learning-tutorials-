
import java.util.Scanner;





public class testcode1 {
    public static void main(String[] args) {
        
        // Scanner scanner =new Scanner(System.in);
        // String name="";
        // while(name.isEmpty()){
        //     System.out.println("enter your name");
        //     name = scanner.nextLine();   
        // }


        // System.out.println("ah your name is"+name+"welcome to our house");
        // scanner.close();


        /*while(1==1)
        {
            System.out.println("my friend is gay");
        }*/


        /*Scanner scanner = new Scanner(System.in);
        String response=" ";
        while(!response.equals("Q")){
            System.out.println("you are playing a game");
            System.out.println("press q to quit");
            response = scanner.next().toUpperCase();
        }
        System.out.println("you have quit the game");
        scanner.close();*/
        Scanner scanner=new Scanner(System.in);
        int age=0;
        
       /*  while(age<1){
            System.out.println("your age cant be negative");
            System.out.println("enter your age: ");
            age=scanner.nextInt();
        }
        System.out.println("you are "+age+" years old");
        scanner.close();
        */
       //its a do while loop
       do{
            System.out.println("your age cant be negative");
            System.out.println("enter your age: ");
            age=scanner.nextInt();
        }while(age<1);
        System.out.println("you are "+age+" years old");
        scanner.close();
    }   
}
