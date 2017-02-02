package GameEngine;

import pack1.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

public class GameEngine {

    // =====[ Display Stuff ]=====
    public static JFrame WindowFrame;

    // =====[ JFrame / Window Settings ]=====
    public static int windowWidth = 800;
    public static int windowHeight = 600;
    public static int windowStartPosX = 0;
    public static int windowStartPosY = 0;
    public static String windowTitle = "Default Title";
    public static String currentScene = "none";

    // =====[ Engine Stuff ]=====
    public static Map<String, Scene> scenes = new HashMap<String, Scene>();
    public static ArrayList<TextObject> TextObjects = new ArrayList<TextObject>();

    static Boolean DEBUG = true;                                        // Print debug information to console

    public GameEngine() {

        WindowFrame = new JFrame();                                     // Initialise JFrame
        WindowFrame.addMouseListener(new MouseEvent());                 // Add mouse listener for events

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

    public static void hideWindow() {
        WindowFrame.setVisible(false);                                  // Hide window
    }

    public void newScene(String title, Scene scene, GameEngine gameEngine) {

        //Scene newscene = new scene();                                 // Initialise new Scene instance
        scene.graphics = WindowFrame.getGraphics();                     // Set graphics for scene
        scene.setBounds(0,0, windowWidth, windowHeight);         // Set scene / Panel size to window size
        scene.setDoubleBuffered(false);                                 // Disable double buffering
        scene.setGameEngine(gameEngine);                                // Set GameEngine for adding content elements
        WindowFrame.add(scene);                                         // Add scene to Window
        scenes.put(title, scene);                                       // Add scene to map

    }

    public static void displayScene(String title) {

        if (!Objects.equals(currentScene, "none")) {                 // Check if any scene is displayed
            Scene currentscene = scenes.get(currentScene);              // Get current scene
            currentscene.setVisible(false);                             // Hide scene

            if (currentscene.useUpdate) {
                currentscene.setUseUpdate(false);                       // TODO: Maybe depreciated -> Replace
                currentscene.setUseUpdate(true);
            }
        }

        Scene scene = scenes.get(title);                                // Get requested scene
        scene.setVisible(true);                                         // Show requested scene
        currentScene = title;                                           // Set the current scene to input scene
        scene.paintComponent(WindowFrame.getGraphics());                // Paint scene (and repaint if set so)


    }

    // =====[ Methods for adding content to the engine / scenes ]=====

    public void addTextObject(TextObject textObject) {

        TextObjects.add(textObject);                                    // Add class to Array for later use

    }

    public static void debug(String text) { if (DEBUG) { System.out.println(text); } }      // Dispaly GameEngine debugging information

}
