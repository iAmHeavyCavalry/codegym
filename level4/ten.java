package level4;

import java.util.Scanner;

public class ten {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int min= scanner.nextInt();
        int secondMin = scanner.nextInt();
        if (secondMin < min){
            int tmp = min;
            min= secondMin;
            secondMin = tmp;
        }
        while(scanner.hasNextInt()){
            int x = scanner.nextInt();
            if(min == secondMin){
                if(x < min) {
                    min = x;
            } else {
                secondMin = x;
            }
        } else if (x < min){
                secondMin = min;
                min = x;

            } else if (x > min && x < secondMin)
                secondMin = x;
        }
        System.out.println(secondMin);
    }
}
