package pack1;

import javax.swing.*;

import scenes.*;

import java.util.*;
import java.util.Timer;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

class Gui {

    Gui() {

        // Setup new JFrame
        Var.jf1 = new JFrame();

        // Set window size
        Var.jf1.setSize(Var.screenwidth, Var.screenhight);

        // Set window title
        Var.jf1.setTitle("ULTIMATEPONG");

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

        // Start painting
        //lbldraw.paintComponent(Var.jf1.getGraphics());
        //scenes.Start.display(Var.jf1.getGraphics());

        Timer move = new Timer();

        move.scheduleAtFixedRate(new TimerTask(){

             @Override
             public void run() {
                 scenes.Game.display(Var.jf1.getGraphics());
             }

         }, 0, 6);

    }

}
