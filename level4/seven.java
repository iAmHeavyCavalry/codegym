package level4;

import java.util.Scanner;

public class seven {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        while (number <= 100){
            if (number % 3 == 0){
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);


    }
}
