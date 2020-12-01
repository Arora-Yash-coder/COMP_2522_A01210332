package ca.bcit.comp2522.labs.lab06;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.Serializable;
import java.util.ArrayList;

public class Sprite implements Serializable {
    public int x;
    public int y;
    public int health;
    public float gravity;
    public ArrayList<String> weapons;
    public byte[] pixelData;

    public Sprite(final BufferedImage img) {
        pixelData = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
    }

    public byte[] getPixelData() {
        return pixelData;
    }



}
