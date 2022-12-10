package dungeon;

import processing.core.PGraphics;
import processing.core.PImage;

import java.util.Vector;

public class Map {
    private final Tile[] tileMap;
    private final int height;
    private final int width;
    private final int tileSize;
    private final PGraphics gfx;
    private final Vector<PImage> sprites;

    public Map(int width, int height, int tileSize, PGraphics gfx, Vector<PImage> sprites) {
        this.sprites = sprites;
        this.tileMap = new Tile[width*height];
        for (int i = 0; i < width*height; i++) {
            tileMap[i] = new Tile();
        }
        this.height = height;
        this.width = width;
        this.tileSize = tileSize;
        this.gfx = gfx;
    }

    public Tile getTile(int row, int col){
        var pos = col + row * width;
        return tileMap[pos];
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                var tile = getTile(row,col);
                var spriteId = tile.getSprite();
                gfx.image(sprites.get(spriteId),col*tileSize,row*tileSize);
            }
        }
    }
}
