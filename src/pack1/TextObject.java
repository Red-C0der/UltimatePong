package pack1;


import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TextObject {

    Color color = Color.WHITE;  // Default text color
    Font font = FontHandler.defaultFont(80f);   // Default text font
    String text = "Hello World!";   // Default text
    String scene = "none";      // Scene in which this text is displayed
    Rectangle2D clickHitbox;
    Graphics g;
    Graphics2D g2d;
    Boolean setup = true;   // true when setup is needed, false if not

    int posy = 50;
    int posx = 50;


    TextObject(String newText) {
        //this.g2d = graphics;       // Set graphics
        this.text = newText;     // Set default text to new one

        Var.drawtexts.add(this);    // Add class to Array for later use

    }

    void setup(Graphics graphics, Graphics2D graphics2D) {

        this.g = graphics;      // Setup Graphics
        this.g2d = graphics2D;  // Setup Graphics2D

        this.clickHitbox = g.getFontMetrics().getStringBounds(text, this.g);
        this.clickHitbox.setRect(this.posx - (int) this.g2d.getFontMetrics().getStringBounds(this.text, this.g2d).getWidth() / 2, this.posy, this.clickHitbox.getWidth(), this.clickHitbox.getHeight());

        this.setup = false;     // Disable setup

    }

    void display() {

        this.g.setColor(color); // Set color

        this.g.setFont(this.font);  // Set Font

        this.g.drawString(text, this.posx, this.posy); // Draw string

    }

    void setFontSize(float size) {

        this.font = FontHandler.defaultFont(size);

    }

    void onClick(java.awt.event.MouseEvent e) { // Override this for specific instructions
    }


}
