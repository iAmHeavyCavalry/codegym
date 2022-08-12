package level4;

import java.util.Scanner;

public class eighteen {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double speedPerMS = scanner.nextInt();
        int speedPerKH = (int) Math.round(speedPerMS * 3.6);
        System.out.println(speedPerKH);
    }
}
