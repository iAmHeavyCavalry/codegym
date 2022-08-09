package extras;

import java.text.NumberFormat;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args){

        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        int principal;
        float monthlyInterest;
        int numberOfPayments;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter principal (1k - 1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a valid number (1k - 1M): ");
        }

        while(true) {
            System.out.println("Please enter rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = (annualInterest / PERCENT / MONTHS_IN_YEAR);
                break;
            }
            System.out.println("Enter a valid number (1 - 30)");
        }

        while(true) {
            System.out.println("How many years: ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = (years * MONTHS_IN_YEAR);
                break;
            }
        }
        System.out.println("Your payment is: ");
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Payment per month " + mortgageFormat);


    }
}
