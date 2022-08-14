package extras;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args){

        int length;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How big you want the list? ");
        length = scanner.nextInt();

        String[] dictionary = new String[length];

        //loop variable, condition, increment
        for (int counter = 0; counter < length; counter++ ){
            System.out.println("--> " + (counter + 1));
            dictionary[counter] = scanner.next();
        }

        scanner.close();

        System.out.println("Your shopping list has " + dictionary.length + " items:");
        for (int counter = 0; counter < length; counter++ ){
            System.out.println(dictionary[counter]);

        }
    }
}
