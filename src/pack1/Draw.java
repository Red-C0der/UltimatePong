package pack1;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {

        // Get paintComponent
        super.paintComponent(g);

        // Setup 2D graphics for drawing
        Graphics2D g2d = (Graphics2D) g;

        // Enable Antialiasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set color
        g.setColor(Color.BLACK);

        // Draw filled background
        g.fillRect(0, 0, Var.screenwidth, Var.screenhight);

        // Iterate over Var.drawtexts
        for (TextObject obj : Var.drawtexts) {

            // Check if current scene matches
            if (Var.scene == obj.scene) {

                // Setup if needed
                if (obj.setup) {
                    obj.setup(g, g2d);
                }

                obj.display();       // Execute display void

            }

        }

        repaint();

        /*

        repaint();

        // Check scene to draw
        if (Var.scene == "start") {

            // Set color
            g.setColor(Color.BLACK);

            // Draw filled background
            g.fillRect(0, 0, Var.screenwidth, Var.screenhight);

            // Set font
            g.setFont(FontHandler.defaultFont(80f));

            // Set color
            g.setColor(Color.WHITE);


            // Title
            g.drawString("UltimatePong", Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("UltimatePong", g2d).getWidth()/2, 120);

            // Set font
            g.setFont(FontHandler.defaultFont(35f));

            // Slogan
            g.drawString("Definitiv nicht irrelevant!", Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Definitiv nicht irrelevant!", g2d).getWidth()/2, 170);

            // Set font
            g.setFont(FontHandler.defaultFont(35f));

            // Start text
            g.drawString("Start!", Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Start!", g2d).getWidth()/2, 370);

            // Start rect
            mouse_rect_start = g.getFontMetrics().getStringBounds("Start!", g);
            mouse_rect_start.setRect(Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Start!", g2d).getWidth()/2, 370 - g.getFontMetrics().getAscent(), mouse_rect_start.getWidth(), mouse_rect_start.getHeight());

            g.setColor(Color.MAGENTA);
            g.drawRect(Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Start!", g2d).getWidth()/2, 370 - g.getFontMetrics().getAscent(), 100, 100);
            g.setColor(Color.WHITE);

            // Optionen
            g.drawString("Optionen", Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Optionen", g2d).getWidth()/2, 420);

            // Set font
            g.setFont(FontHandler.defaultFont(20f));

            // Version
            g.drawString("V. 0.1", 10, Var.screenhight -10);

            repaint();

        } else if (Var.scene == "game") {

            // Set color
            g.setColor(Color.BLACK);

            // Draw filled background
            g.fillRect(0, 0, Var.screenwidth, Var.screenhight);

            // Set color
            g.setColor(Color.WHITE);

            // Draw middle line
            for (int i = 0; i <= 30; i++) {

                g.fillRect(Var.screenwidth/2 -5, i * 20, 10, 10);

            }

            // Draw player paddles
            g.fillRect(Var.x, Var.y, 25, 150);
            g.fillRect(Var.gegnerx, Var.gegnery, 25, 150);

            // Set color
            g.setColor(Color.WHITE);

            // Set font for score
            g.setFont(FontHandler.defaultFont(55f));

            // Draw score string
            g.drawString("" + Var.playerPoints, Var.screenwidth/2 -82, 100);
            g.drawString("" + Var.gegnerPoints, Var.screenwidth/2 +40, 100);

            // Set color
            g.setColor(Color.WHITE);

            // Draw ball
            g.fillRect(Var.ballx, Var.bally, 20, 20);

            repaint();

        }*/

    }

}
