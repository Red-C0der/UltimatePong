package GameEngine;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public abstract class Scene extends JPanel {

    public static Graphics graphics;
    Boolean useUpdate = false;
    BufferedImage  bf = new BufferedImage( GameEngine.windowWidth, GameEngine.windowHeight,
            BufferedImage.TYPE_INT_RGB);

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);                                            // TODO: What does this do exactly?
        GameEngine.debug("Executed Scene.paint");                      // Debug information
        Graphics2D g2d = (Graphics2D) g;                                    // Graphics2D object
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   // Enable Antialiasing
        myCode(bf.getGraphics());                                           // Run custom scene code
        GameEngine.debug("Executed Scene.myCode");                     // Debug information
        drawTextObjects(g2d, bf.getGraphics());                             // Draw scenes text objects
        g.drawImage(bf,0,0,null);                           // Draw buffered image

        if (useUpdate) { repaint(); }
    }

    public void drawTextObjects(Graphics2D g2d, Graphics g) {

        GameEngine.debug("Executed drawTextObjects");                           // Debug information

        for (TextObject obj : GameEngine.TextObjects) {

            GameEngine.debug("TextObject: "+obj);                               // Debug information

            // Check if current scene matches
            if (Objects.equals(GameEngine.currentScene, obj.scene)) {

                GameEngine.debug("Scene matches!");                             // Debug information

                // Setup if needed
                if (obj.setup) {
                    obj.setup(g, g2d);
                }

                obj.display();       // Execute display void

            }

        }

    }

    public abstract void myCode(Graphics g);

    public void setUseUpdate(Boolean value) { useUpdate = value; }
}
