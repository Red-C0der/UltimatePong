package pack1;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

class Gui {

    Gui() {

        Var.jf1 = new JFrame(); // Setup new JFrame

        Var.jf1.setSize(Var.screenwidth, Var.screenhight); // Set window size

        Var.jf1.setTitle("ULTIMATEPONG"); // Set window title

        Var.jf1.setDefaultCloseOperation(EXIT_ON_CLOSE);  // Enable closing

        Var.jf1.setLayout(null);  // Set layout

        Var.jf1.setResizable(false);  // Disable resize ability

        Var.jf1.setVisible(true); // Display window

        Var.jf1.setLocation(0, 0); // Set window position on screen

        Var.jf1.addKeyListener(new KeyHandler()); // Handle key presses

        Var.jf1.addMouseListener(new MouseEvent()); // Handle mouse klicked

        Var.jf1.requestFocus();  // Set focus to window

        Draw lbldraw = new Draw(); // Setup Draw

        lbldraw.setBounds(0, 0, Var.screenwidth, Var.screenhight); // Where draw will be applied

        lbldraw.setVisible(true); // Make drawings visible

        Var.jf1.add(lbldraw); // Add draw to JFrame


        // =====[ Setup scenes ]=====

        TextObject scene_start_title = new TextObject("UltimatePong");
        scene_start_title.scene = "start";


        // =====[ END Setup scenes ]=====

        lbldraw.paintComponent(Var.jf1.getGraphics()); // Start painting

    }

}
