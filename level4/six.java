package level4;

import java.util.Scanner;

public class six {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();

            if(input.equals("enough")){
                break;
            }
            else System.out.println(input);
        }
    }
}
