package level4;

import java.util.Scanner;

public class nine {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        while(scanner.hasNextInt()){
            int x = scanner.nextInt();
            if (x < min){
                min = x;
            }
        }
        System.out.println(min);
    }
}
