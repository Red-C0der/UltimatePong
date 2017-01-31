package GameEngine;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.concurrent.Callable;

public class TextObject {

    Color color = Color.WHITE;  // Default text color
    Font font = FontHandler.defaultFont(80f);   // Default text font
    String text = "Hello World!";   // Default text
    public static String scene = "none";      // Scene in which this text is displayed
    Rectangle2D clickHitbox;
    Graphics g;
    Graphics2D g2d;
    Boolean setup = true;   // true when setup is needed, false if not

    int posy = 50;
    int posx = 50;


    public TextObject(String newText) {

        this.text = newText;                 // Set default text to new one
        GameEngine.TextObjects.add(this);    // Add class to Array for later use

    }

    void setup(Graphics graphics, Graphics2D graphics2D) {

        this.g = graphics;      // Setup Graphics
        this.g2d = graphics2D;  // Setup Graphics2D

        this.clickHitbox = g.getFontMetrics().getStringBounds(text, this.g);
        this.clickHitbox.setRect(this.posx - (int) this.g2d.getFontMetrics().getStringBounds(this.text, this.g2d).getWidth()/2, this.posy, this.clickHitbox.getWidth(), this.clickHitbox.getHeight());

        this.setup = false;     // Disable setup

    }

    void display() {

        // Set color
        this.g.setColor(color);

        // Set Font
        this.g.setFont(this.font);

        // Draw string
        this.g.drawString(text, this.posx, this.posy);


    }

    void setFontSize(float size) {

        this.font = FontHandler.defaultFont(size);

    }

    void setClickVoid(Callable func) {

    }

    // Override this for specific instructions
    public void onClick(java.awt.event.MouseEvent e) {
        System.out.println("Clicked!!");
    }

}
