package dungeon;

import processing.core.PApplet;
import processing.core.PImage;
import processing.event.KeyEvent;

import java.util.Vector;

public class App extends PApplet {

    private Player player;
    private Map map;

    public App() {

    }

    @Override
    public void settings() {
        size(800,600);
    }

    @Override
    public void setup() {
        var playerSprite = loadImage("assets/kenney_tinydungeon/Tiles/tile_0085.png");

        var sprites = new Vector<PImage>();
        for (int i = 0; i < 132; i++) {
            var path = String.format("assets/kenney_tinydungeon/Tiles/tile_%04d.png",i);
            System.out.println(path);
            var img = loadImage(path);
            sprites.add(img);
        }
        System.out.println(sprites);

        map = new Map(50,40,16,getGraphics(),sprites);

        player = new Player("Hero",getGraphics(),playerSprite);
        player.setPos(10,10);

    }

    @Override
    public void draw() {
        background(55);
        update();
        map.draw();
        player.draw();
    }



    @Override
    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case 65 -> player.move(-1, 0);
            case 68 -> player.move(1, 0);
            case 87 -> player.move(0,-1);
            case 83 -> player.move(0,1);
        }

    }

    private void update() {

    }

    public static void main(String[] args) {
        PApplet.main("dungeon.App");
    }
}
