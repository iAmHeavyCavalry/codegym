//Program for getting input for array
package extras;

import java.util.Scanner;

public class test4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements? (max 5)");
        int number = scanner.nextInt();
        int array[] = new int[number];
        for(int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("The array elements are");
        for(int i = 0; i < number; i++){
            System.out.println(array[i]);
        }
        while (true){
            System.out.println("Which element from array: ");
            if (scanner.hasNextInt()){
                byte element = scanner.nextByte();
                System.out.println(array[element]);
                    break;
            }
        }
    }
}
