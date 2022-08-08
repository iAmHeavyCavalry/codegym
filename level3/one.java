package level3;

import java.util.Scanner;

public class one {

    public static void main(String[] args){

        String cold = "It's cold outside";
        String warm = "It's warm outside";

        Scanner scanner = new Scanner(System.in);

        byte temperature = scanner.nextByte();

            if (temperature > 0) {
                System.out.println(warm);
            } else System.out.println(cold);

    }
}
