package extras;

import javax.swing.*;
import java.util.Objects;

public class demo extends JFrame{

    JFrame frame;
    JLabel displayField;
    ImageIcon image;

    public demo(){

        frame = new JFrame("Java testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            image = new ImageIcon(Objects.requireNonNull(getClass().getResource("javaback.jpg")));
            displayField = new JLabel(image);
            frame.add(displayField);
        } catch (Exception e){
            System.out.println("Image cannot be found!");
        }

        frame.setSize(710,444);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args){

         new demo();

    }
}
