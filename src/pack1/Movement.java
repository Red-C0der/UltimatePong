package pack1;

import java.util.Timer;
import java.util.TimerTask;

class Movement {

    Movement() {

        // Setup timer
        Timer move = new Timer();

        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                // Check movement direction
                if (Var.moveup) {

                    // Move and stop at border
                    if (Var.y >= 20) {
                        Var.y -= 2;
                    }

                } else if (Var.movedown) {

                    // Move and stop at border
                    if (Var.y <= Var.screenhight - 200) {
                        Var.y += 2;
                    }
                }

            }

        }, 0, 6);

    }



}
