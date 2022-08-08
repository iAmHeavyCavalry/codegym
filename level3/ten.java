package level3;

import java.util.Scanner;

public class ten {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         double a = scanner.nextDouble();
         double b = scanner.nextDouble();

         if(Math.abs(a-b) < 0.000001)
             System.out.println("The numbers are equal");
         else System.out.println("The numbers are not equal");
    }
}
