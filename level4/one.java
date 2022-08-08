package level4;

import java.util.Scanner;

public class one {

    public static void main(String[] args){
        String text = " loves me";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 0;

        while (i < 10){
            System.out.println(name + text);
            i++;
        }
    }
}
