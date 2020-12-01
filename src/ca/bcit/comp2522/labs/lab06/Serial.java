package ca.bcit.comp2522.labs.lab06;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
public class Serial {
    public static void main (String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("lava.png"));
            Sprite s = new Sprite(img);
            System.out.println(s.getPixelData()[114]);
            System.out.println(s.getPixelData().length);

            FileOutputStream f = new FileOutputStream("sprite.ser");
            ObjectOutput out = new ObjectOutputStream(f);
            out.writeObject(s);
            out.flush();
            out.close();

            FileInputStream f2 = new FileInputStream("sprite.ser");
            ObjectInputStream in = new ObjectInputStream(f2);
            Sprite s2 = (Sprite) in.readObject();
            System.out.println(s2.getPixelData()[4]);
            System.out.println(s.getPixelData().length);
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }



