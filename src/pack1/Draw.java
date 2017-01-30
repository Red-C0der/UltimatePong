package pack1;

import javax.swing.*;
import java.awt.*;

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
        g.setColor(Color.MAGENTA);

        // Set font for score
        g.setFont(Var.pixelfont);

        // Draw score string
        g.drawString("" + Var.playerPoints, Var.screenwidth/2 -95, 100);
        g.drawString("" + Var.gegnerPoints, Var.screenwidth/2 +40, 100);

        // Set color
        g.setColor(Color.WHITE);

        // Draw ball
        g.fillRect(Var.ballx, Var.bally, 20, 20);

        // Repeat painting process
        repaint();

    }
}
