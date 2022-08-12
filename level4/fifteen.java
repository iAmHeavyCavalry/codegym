package level4;

import java.util.Scanner;

public class fifteen {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();


        double pi = 3.14;
        int square = (int) (pi * radius * radius);

        System.out.println(square);
    }
}
