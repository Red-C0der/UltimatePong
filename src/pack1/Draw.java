package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {

        super.paintComponent(g); // Get paintComponent

        Graphics2D g2d = (Graphics2D) g; // Setup 2D graphics for drawing

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Enable Antialiasing

        g.setColor(Color.BLACK); // Set color

        g.fillRect(0, 0, Var.screenwidth, Var.screenhight);  // Draw filled background

        for (TextObject obj : Var.drawtexts) {  // Iterate over Var.drawtexts

            if (Var.scene == obj.scene) { // Check if current scene matches

                if (obj.setup) { // Setup if needed
                    obj.setup(g, g2d);
                }

                obj.display();       // Execute display void

            }

        }

        repaint();
    }

}
