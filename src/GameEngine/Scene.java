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
    private Boolean finishedDefinitions = false;
    public GameEngine gameEngine;

    @Override
    public void paintComponent(Graphics g) {

        if (!finishedDefinitions) definitions();                            // Check for not executed definitions

        super.paintComponent(g);                                            // TODO: What does this do exactly?
        GameEngine.debug("Executed Scene.paint");                      // Debug information
        Graphics2D g2d = (Graphics2D) g;                                    // Graphics2D object
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   // Enable Antialiasing
        myCode(bf.getGraphics());                                           // Run custom scene code
        GameEngine.debug("Executed Scene.myCode");                     // Debug information
        drawTextObjects(g2d, bf.getGraphics());                             // Draw scenes text objects
        g.drawImage(bf,0,0,null);                            // Draw buffered image
        if (useUpdate) repaint();                                           // Update scene

    }

    public void drawTextObjects(Graphics2D g2d, Graphics g) {

        GameEngine.debug("Executed drawTextObjects");                  // Debug information
        for (TextObject obj : GameEngine.TextObjects) {

            GameEngine.debug("TextObject: "+obj);                      // Debug information
            if (Objects.equals(GameEngine.currentScene, obj.scene)) {       // Check if scene is the current one

                GameEngine.debug("Scene matches!");                    // Debug information
                if (obj.setup) obj.setup(g, g2d);                           // Call setup if needed
                obj.display();                                              // Display TextObject

            }

        }

    }

    public void setGameEngine(GameEngine gameEngine) { this.gameEngine = gameEngine; }  // Set game engine

    public abstract void definitions();                // Define scene elements like text ... here
    public abstract void myCode(Graphics g);                                // Additional code to be run on every draw
    public void setUseUpdate(Boolean value) { useUpdate = value; }          // Sets if the scene should be updated frequently
}
