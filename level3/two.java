package level3;

import java.util.Scanner;

public class two {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name and age as follows: ");
        String name = scanner.nextLine();
        byte age = scanner.nextByte();

        if (age >= 18 && age <= 28){
            System.out.println(name + ", you've been drafted for military service");
        }
    }
}
