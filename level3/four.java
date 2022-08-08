package level3;

import java.util.Scanner;

public class four {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        byte temperature = scanner.nextByte();

        boolean high = temperature >= 30;
        boolean normal = temperature < 30 && temperature > 10;
        boolean low = temperature <= 10;

        if (high) {
            System.out.println("It's to warm");
        }
        if (normal){
            System.out.println("It's OK");
        }
        if (low){
            System.out.println("It's cold");
        }
    }
}
