package level4;

import java.util.Scanner;

public class eight {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while(scanner.hasNextInt()){

            int x = scanner.nextInt();
            if (x % 2 == 0 && x > max)
                max = x;
        }
        System.out.println(max);


    }
}
