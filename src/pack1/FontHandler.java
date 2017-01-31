package pack1;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontHandler {

    public static Font defaultFont(float size) {

        try { // Create score font
            return Font.createFont(Font.TRUETYPE_FONT, new File("Pixellari.ttf")).deriveFont(size);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void drawCenteredText(String text, int y, Graphics2D g) {

        g.drawString(text, Var.screenwidth / 2 - (int) g.getFontMetrics().getStringBounds(text, g).getWidth() / 2, y);

    }

}
