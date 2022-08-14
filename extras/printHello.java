package extras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class printHello {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int hello = 0;
        boolean error = false;

        do{
            error = false;
            try{
                System.out.println("How many times: ");
                hello = scanner.nextInt();
            }
            catch  (InputMismatchException e){
                System.out.println("Please enter number");
                error = true;
                scanner.nextLine();
            }
            for (int i = hello; i > 0; i--){
                System.out.println("Hello");
            }

        }while(error);
    }
}
