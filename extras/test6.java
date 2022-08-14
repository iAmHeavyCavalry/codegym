package extras;
// find minimum number inside an array
import java.util.Scanner;

public class test6 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = scanner.nextInt();
        }
        //check every value from array and compare to index 0

        int min = array[0];
        for (int i = 1; i < 10; i++){
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
