package GameEngine;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.concurrent.Callable;

public class TextObject {

    Color color = Color.WHITE;                          // Default text color
    Font font = FontHandler.defaultFont(80f);      // Default text font
    String text = "Hello World!";                       // Default text
    public String scene = "none";                       // Scene in which this text is displayed
    public Rectangle2D clickHitbox;                            // Hitbox for mouseclick registration
    Dimension clickHitboxSize;
    Boolean clickDisabled = false;                      // True if no mouse clicks should be accepted
    Graphics g;                                         // Graphics object
    Graphics2D g2d;                                     // Graphics2D object
    Boolean setup = true;                               // true when setup is needed, false if not
    int posx = 50;                                      // Text position X
    int posy = 50;                                      // Text position Y


    public TextObject(String newText, String sceneTitle) {

        this.text = newText;                            // Set default text to new one
        this.scene = sceneTitle;                        // Set scene in which text should be displayed

    }

    void setup(Graphics graphics, Graphics2D graphics2D) {

        GameEngine.debug("Executed TextObject.setup");     // Debug information

        this.g = graphics;                              // Setup Graphics
        this.g2d = graphics2D;                          // Setup Graphics2D
        updateHitbox();
        this.setup = false;                             // Disable setup

    }

    void display() {

        GameEngine.debug("Executed TextObject.display");   // Debug information8
        this.g.setColor(color);                         // Set color
        this.g.setFont(this.font);                      // Set Font
        this.g.drawString(text, this.posx, this.posy);  // Draw string

    }

    public void updateHitbox() {

        FontMetrics metrics = this.g2d.getFontMetrics(font);
        // get the height of a line of text in this
        // font and render context
        int hgt = metrics.getHeight();
        // get the advance of my text in this font
        // and render context
        int adv = metrics.stringWidth(this.text);
        // calculate the size of a box to hold the
        // text with some padding.
        Dimension size = new Dimension(adv+2, hgt+2);
        clickHitboxSize = size;

        this.clickHitbox = g2d.getFontMetrics(font).getStringBounds(text, this.g2d);        // Set hitbox border
        this.clickHitbox.setRect(
                this.posx,
                this.posy,
                size.getWidth(),
                size.getHeight());          // Set hitbox border

    }

    public void setFontSize(float size) {
        this.font = FontHandler.defaultFont(size);      // Get default font with input size
    }

    public void setColor(Color newColor) {
        this.color = newColor;                          // Set font color
    }

    public void setText(String newText) {
        this.text = newText;                            // Set text
    }

    public void setPos(int newPosX, int newPosY) {
        this.posx = newPosX;                            // Set x position
        this.posy = newPosY;                            // Set y position
        //updateHitbox();
    }

    // Override this for specific instructions TODO: Finsish
    public void onClick(java.awt.event.MouseEvent e) {
        System.out.println("Clicked!!");
    }

}
