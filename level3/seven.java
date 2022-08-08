package level3;

import java.util.Scanner;

public class seven {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        if(age < 20 || age > 60){
            System.out.println("You don't have to work");
        }else System.out.println("Work hard, play hard");

    }
}
