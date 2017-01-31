package test;


import GameEngine.GameEngine;

public class Main {

    public static void main(String[] args) {

        GameEngine gameEngine = new GameEngine();

        gameEngine.displayWindow();
        gameEngine.newScene("test");
        gameEngine.displayScene("test");
    }

}
