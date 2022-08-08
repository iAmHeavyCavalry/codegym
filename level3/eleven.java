package level3;

import java.util.Scanner;

public class eleven {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b))
            System.out.println("Strings are the same");
        else System.out.println("Strings are not the same");
    }
}
