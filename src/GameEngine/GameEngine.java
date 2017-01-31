package GameEngine;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class GameEngine {

    // =====[ Display Stuff ]=====
    public static JFrame WindowFrame;

    // =====[ JFrame / Window Settings ]=====
    public static int windowHeight = 800;
    public static int windowWidth = 800;
    public static int windowStartPosX = 0;
    public static int windowStartPosY = 0;
    public static String windowTitle = "Default Title";
    public static String currentScene = "none";

    // =====[ Engine Stuff ]=====
    public static Map<String, Scene> scenes = new HashMap<String, Scene>();

    public GameEngine() {

        WindowFrame = new JFrame();                                     // Initialise JFrame

    }

    public static void displayWindow() {

        WindowFrame.setSize(windowWidth, windowHeight);                 // Set window size
        WindowFrame.setTitle(windowTitle);                              // Set window title
        WindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // Enable closing
        WindowFrame.setLayout(null);                                    // Set layout
        WindowFrame.setResizable(false);                                // Disable resize ability
        WindowFrame.setLocation(windowStartPosX, windowStartPosY);      // Set window position on screen
        WindowFrame.setVisible(true);                                   // Set visibility
        WindowFrame.requestFocus();                                     // Request focus to window

    }

    public static void newScene(String title) {

        Scene newscene = new Scene();                                   // Initialise new Scene instance
        newscene.graphics = WindowFrame.getGraphics();                  // Set graphics for scene
        WindowFrame.add(newscene);
        newscene.setBounds(0,0, 800, 800);
        newscene.paint(WindowFrame.getGraphics());

        scenes.put(title, newscene);                                    // Add scene to map

    }

    public static void displayScene(String title) {

        if (currentScene != "none") {
            Scene currentscene = scenes.get(currentScene);              // Get current scene
            currentscene.setVisible(false);                             // Hide scene
        }

        Scene scene = scenes.get(title);                                // Get requested scene
        scene.setVisible(true);                                         // Show requested scene
        System.out.println(scene);

    }

}
