package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
    Timer move; //Timer

    public BallMovement() {
        move = new Timer(); //neuer Timer
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

            Var.ballx += Var.balldirx; //überprüft
            Var.bally += Var.balldiry; //überprüft
            }
        }, 0, 4); //Frequenz vom Timer


    }

}
