package dungeon;

import processing.core.PApplet;
import processing.event.KeyEvent;

public class App extends PApplet {

    private Player player;

    public App() {

    }

    @Override
    public void settings() {
        size(800,600);
    }

    @Override
    public void setup() {
        var playerSprite = loadImage("assets/kenney_tinydungeon/Tiles/tile_0085.png");
        player = new Player("Hero",getGraphics(),playerSprite);
        player.setPos(10,10);

    }

    @Override
    public void draw() {
        background(55);
        update();

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
