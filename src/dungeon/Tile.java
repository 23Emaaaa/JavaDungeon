package dungeon;

import processing.core.PApplet;
import processing.core.PImage;

public class Tile {
    public static final int FLOOR = 42;
    public static final int WALL = 40;
    private int sprite;

    public Tile(int sprite) {
        this.sprite = sprite;
    }

    public int getSprite() {
        return sprite;
    }
}
