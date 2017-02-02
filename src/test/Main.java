package test;


import GameEngine.GameEngine;
import GameEngine.Scene;
import GameEngine.TextObject;

public class Main {

    public static void main(String[] args) {

        GameEngine gameEngine = new GameEngine();

        gameEngine.displayWindow();

        Scene newScene = new start();
        newScene.setUseUpdate(true);

        gameEngine.newScene("none", newScene);

        TextObject test_title_text = new TextObject("This is a test string!");
        test_title_text.scene = "none";

        gameEngine.displayScene("none");

        gameEngine.currentScene = "none";

    }

}
