package test;

import GameEngine.*;

import java.awt.*;

public class start extends Scene {

    @Override
    public void definitions() {

        TextObject test_title_text = new TextObject("This is a test string! Helo World!", "titlescreen") {
            @Override
            public void onClick(java.awt.event.MouseEvent e) {
                System.out.print("Test: Overridden click void!");
            }
        };

        test_title_text.setFontSize(35f);
        test_title_text.setPos(250, 250);
        this.gameEngine.addTextObject(test_title_text);

    }

    @Override
    public void myCode(Graphics g2d) {

        g2d.setColor(Color.BLACK);

        g2d.fillRect(0, 0, GameEngine.windowWidth, GameEngine.windowHeight);

    }

}
