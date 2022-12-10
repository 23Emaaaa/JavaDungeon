package dungeon;

import processing.core.PGraphics;
import processing.core.PImage;

public class Map {
    private final Tile[] tileMap;
    private final int height;
    private final int width;
    private final int tileSize;
    private final PGraphics gfx;

    public Map(int width, int height, int tileSize, PGraphics gfx) {
        this.tileMap = new Tile[width*height];
        this.height = height;
        this.width = width;
        this.tileSize = tileSize;
        this.gfx = gfx;
    }

    public Tile getTile(int row, int col){
        var pos = col + row * width;
        return tileMap[pos];
    }
}
