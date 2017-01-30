package pack1;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Var {

    // JFrame (Application window)
    static JFrame jf1;

    // Width and height of window / JFrame
    static int screenwidth = 800, screenhight = 600;

    // Player position
    static int x = 20, y = 185;

    // Gegner position
    static int gegnerx = 755, gegnery = 185;

    // Ball position
    static int ballx = 200, bally = 200;

    // Movements
    static boolean moveup = false, movedown = false;
    static boolean gegnermoveup = false, gegnermovedown = false;

    static int balldirx = 1, balldiry = -1;

    // Score counter
    static int playerPoints = 0, gegnerPoints = 0;

    // Score font
    static Font pixelfont;


    Var() {

        // Create score font
        try {
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("Hexametric.ttf")).deriveFont(90f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Hexametric.ttf")));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

    }

}
