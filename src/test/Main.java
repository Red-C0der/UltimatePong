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

        gameEngine.newScene("titlescreen", newScene, gameEngine);

        gameEngine.displayScene("titlescreen");



    }

}
