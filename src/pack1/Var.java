package pack1;

        import javax.swing.*;
        import java.awt.*;
        import java.io.File;
        import java.io.IOException;
        import java.util.ArrayList;

public class Var {


    static JFrame jf1; // JFrame (Application window)

    static int screenwidth = 800, screenhight = 600;  // Width and height of window / JFrame

    static int x = 20, y = 185; // Player position

    static int gegnerx = 755, gegnery = 185; // Gegner position

    static int ballx = 200, bally = 200;  // Ball position

    static boolean moveup = false, movedown = false; // Movements
    static boolean gegnermoveup = false, gegnermovedown = false;
    static int balldirx = 1, balldiry = -1;

    static int playerPoints = 0, gegnerPoints = 0; // Score counter

    static Font pixelfont; // Score font

    static String scene = "start"; // Scene

    static ArrayList<TextObject> drawtexts = new ArrayList<TextObject>(); // Array to store the drawtext objects

    Var() {

        try {  // Create score font
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("Pixellari.ttf")).deriveFont(55f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Pixellari.ttf")));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

    }

}
