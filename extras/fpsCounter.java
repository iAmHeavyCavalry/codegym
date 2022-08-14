package extras;

public class fpsCounter {

    public static void main(String[] args){

        int frames = 0;
        long lastCheck = 0;

        frames++;

        /*If one second have passed since the last fps check,
        we do a new fps check, Save it and repeat*/

        if (System.currentTimeMillis() - lastCheck >= 1_000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames = 0;

        }
    }
}
