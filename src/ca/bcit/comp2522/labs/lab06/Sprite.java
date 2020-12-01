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

    public Sprite(int x, int y, int health, float gravity, ArrayList<String> weapons) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.gravity = gravity;
        this.weapons = weapons;
    }

    public Sprite(final BufferedImage img) {
        pixelData = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
    }

    public byte[] getPixelData() {
        return pixelData;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<String> weapons) {
        this.weapons = weapons;
    }

    public void setPixelData(byte[] pixelData) {
        this.pixelData = pixelData;
    }
}
