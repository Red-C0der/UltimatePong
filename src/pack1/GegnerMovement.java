package pack1;

import java.util.Timer;
import java.util.TimerTask;

class GegnerMovement {

    GegnerMovement() {

        Timer move = new Timer();  // Setup timer

        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.gegnermoveup) { // Check movement direction

                    if (Var.gegnery >= 20) { // Move and stop at border
                        Var.gegnery -= 2;
                    }

                } else if (Var.gegnermovedown) {

                    if (Var.gegnery <= Var.screenhight - 200) { // Move and stop at border
                        Var.gegnery += 2;
                    }
                }

            }
        }, 0, 6);

    }

}
