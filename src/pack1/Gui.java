package pack1;

import javax.swing.*;

public class Gui {

    public Gui() {

        // Setup new JFrame
        Var.jf1 = new JFrame();

        // Set window size
        Var.jf1.setSize(Var.screenwidth, Var.screenhight);

        // Set window title
        Var.jf1.setTitle("PONG");

        // Enable closing
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Was macht das?
        Var.jf1.setLayout(null);

        // Disable resize ability
        Var.jf1.setResizable(false);

        // Display window
        Var.jf1.setVisible(true);

        // Set window position on screen
        Var.jf1.setLocation(0, 0);

        // Handle key presses
        Var.jf1.addKeyListener(new KeyHandler());

        // Set focus to window
        Var.jf1.requestFocus();

        // Setup Draw
        Draw lbldraw = new Draw();

        // Where draw will be applied
        lbldraw.setBounds(0,0, Var.screenwidth, Var.screenhight);

        // Make drawings visible
        lbldraw.setVisible(true);

        // Add draw to JFrame
        Var.jf1.add(lbldraw);

    }

}
