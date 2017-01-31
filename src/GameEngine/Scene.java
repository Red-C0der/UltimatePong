package GameEngine;

import javax.swing.*;
import java.awt.*;

public abstract class Scene extends JPanel {

    public static Graphics graphics;

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        myCode(g2d);
        drawTextObjects(g2d, g);

        repaint();

    }

    public void drawTextObjects(Graphics2D g2d, Graphics g) {

        for (TextObject obj : GameEngine.TextObjects) {


            // Check if current scene matches
            if (GameEngine.currentScene == obj.scene) {

                // Setup if needed
                if (obj.setup) {
                    obj.setup(g, g2d);
                }

                obj.display();       // Execute display void

            }

        }

    }

    public abstract void myCode(Graphics2D g2d);
}
