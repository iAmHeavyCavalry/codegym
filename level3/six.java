package level3;

import java.util.Scanner;

public class six {

    public static void main(String[] args){

        final String TRIANGLE_EXISTS = "It's a triangle";
        final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

        Scanner scanner = new Scanner(System.in);

        byte a, b, c;

        a = scanner.nextByte();
        b = scanner.nextByte();
        c = scanner.nextByte();

        if (a + b <= c){
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }else if(b + c <= a){
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }else if(c + a <= b){
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }else System.out.println(TRIANGLE_EXISTS);
    }
}
