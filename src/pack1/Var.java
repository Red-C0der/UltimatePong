package pack1;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Var {

    // JFrame (Application window)
    public static JFrame jf1;

    // Width and height of window / JFrame
    public static int screenwidth = 800, screenhight = 600;

    // Player position
    public static int x = 20, y = 185;

    // Gegner position
    public static int gegnerx = 755, gegnery = 185;

    // Ball position
    public static int ballx = 200, bally = 200;

    // Movements
    public static boolean moveup = false, movedown = false;
    public static boolean gegnermoveup = false, gegnermovedown = false;

    public static int balldirx = 1, balldiry = -1;

    // Score counter
    public static int playerPoints = 0, gegnerPoints = 0;

    // Score font
    public static Font pixelfont;


    Var() {

        // Create score font
        try {
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("Pixellari.ttf")).deriveFont(55f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Pixellari.ttf")));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

    }

}
