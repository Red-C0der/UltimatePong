package test;


import GameEngine.GameEngine;
import GameEngine.TextObject;

public class Main {

    public static void main(String[] args) {

        GameEngine gameEngine = new GameEngine();

        gameEngine.displayWindow();
        gameEngine.newScene("test", new start());

        TextObject test_title_text = new TextObject("This is a test string!");
        test_title_text.scene = "test";

        gameEngine.displayScene("test");

    }

}
