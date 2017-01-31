package test;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Gui {

    Gui() {

        // Setup new JFrame
        Var.jf1 = new JFrame();

        // Set window size
        Var.jf1.setSize(800, 800);

        // Set window title
        Var.jf1.setTitle("TestFrame");

        // Enable closing
        Var.jf1.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set layout
        Var.jf1.setLayout(null);

        // Disable resize ability
        Var.jf1.setResizable(false);

        // Display window
        Var.jf1.setVisible(true);

        // Set window position on screen
        Var.jf1.setLocation(0, 0);

        // Set focus to window
        Var.jf1.requestFocus();




        Draw panelDraw = new Draw();

        panelDraw.setBounds(0,0, 800, 800);

        panelDraw.setVisible(true);

        Var.jf1.add(panelDraw);

        panelDraw.paint(Var.jf1.getGraphics());


        // =====[ Setup scenes ]=====

        //TextObject scene_start_title = new TextObject("UltimatePong");
        //scene_start_title.scene = "start";

        // =====[ END Setup scenes ]=====


        // Start painting
        //lbldraw.paintComponent(Var.jf1.getGraphics());


    }

}
