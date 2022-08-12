package extras;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much do you owe? ");
        int number = scanner.nextInt();

        int percent = number / PERCENT;
        int numberPerMonth = (number / MONTHS_IN_YEAR) + percent;
        System.out.println("You can pay " + numberPerMonth + " monthly");


    }
}
