package test;

import GameEngine.*;

import java.awt.*;

public class start extends Scene {

    @Override
    public void definitions() {

        TextObject test_title_text = new TextObject("This is a test string! Helo World!", "titlescreen");
        this.gameEngine.addTextObject(test_title_text);

    }

    @Override
    public void myCode(Graphics g2d) {

        g2d.setColor(Color.BLACK);

        g2d.fillRect(0, 0, GameEngine.windowWidth, GameEngine.windowHeight);

    }

}
