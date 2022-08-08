package level3;

import java.util.Scanner;

public class five {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String space = " ";

        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        byte c = scanner.nextByte();

        if (a == b){
            System.out.println(a + space + b);
            if (a == c){
                System.out.println(a + space + c + space + b);
            } else {
                System.out.println(a + space + b);
            }
        } else if (a == c){
                System.out.println(a + space + c);
        } else if (b == c){
            System.out.println(b + space + c);
        }
    }
}
