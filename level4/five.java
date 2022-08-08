package level4;

public class five {

    public static void main(String[] args){

        int vertical = 1;
        while (vertical <= 10){

            int horizonal = 1;
            while (horizonal <= 20){
                if(vertical == 1 || vertical == 10){
                    System.out.print("B");
                } else if (horizonal == 1 || horizonal == 20){
                    System.out.print("B");
                } else {
                    System.out.print(' ');
                }
                horizonal++;
            }
            System.out.println();
            vertical++;
        }
    }
}