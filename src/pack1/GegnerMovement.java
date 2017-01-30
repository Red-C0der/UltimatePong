package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {

    public GegnerMovement() {

        // Setup timer
        Timer move = new Timer();

        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                // Check movement direction
                if (Var.gegnermoveup) {

                    // Move and stop at border
                    if (Var.gegnery >= 20) {
                        Var.gegnery -= 2;
                    }

                } else if (Var.gegnermovedown) {

                    // Move and stop at border
                    if (Var.gegnery <= Var.screenhight - 200) {
                        Var.gegnery += 2;
                    }
                }

            }
        }, 0, 6);

    }

}
