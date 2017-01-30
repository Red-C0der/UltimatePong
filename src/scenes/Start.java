package scenes;

import pack1.*;

import javax.swing.*;
import java.awt.*;

public class Start {

    public static void display(Graphics g) {

        // Setup 2D graphics for drawing
        Graphics2D g2d = (Graphics2D) g;

        // Enable Antialiasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set color
        g.setColor(Color.BLACK);

        // Draw filled background
        g.fillRect(0, 0, Var.screenwidth, Var.screenhight);

        // Set font
        g.setFont(pack1.FontHandler.defaultFont(80f));

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

        // Start
        g.drawString("Start!", Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Start!", g2d).getWidth()/2, 370);

        // Optionen
        g.drawString("Optionen", Var.screenwidth/2 - (int) g2d.getFontMetrics().getStringBounds("Optionen", g2d).getWidth()/2, 420);

        // Set font
        g.setFont(FontHandler.defaultFont(20f));

        // Version
        g.drawString("V. 0.1", 10, Var.screenhight -10);

    }

}
