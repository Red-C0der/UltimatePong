package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) { // Start movement


        if (e.getKeyCode() == KeyEvent.VK_W) { // Movent for w
            Var.moveup = true;
        } else if (e.getKeyCode() == KeyEvent.VK_S) { // Movement for s
            Var.movedown = true;

        } else if (e.getKeyCode() == KeyEvent.VK_I) { // Movement for i
            Var.gegnermoveup = true;
        } else if (e.getKeyCode() == KeyEvent.VK_K) { // Movement for k
            Var.gegnermovedown = true;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) { // Stop movement


        if (e.getKeyCode() == KeyEvent.VK_W) { // Stop Movement for w
            Var.moveup = false;
        } else if (e.getKeyCode() == KeyEvent.VK_S) { // Stop Movement for s
            Var.movedown = false;

        } else if (e.getKeyCode() == KeyEvent.VK_I) { // Stop Movement for i
            Var.gegnermoveup = false;
        } else if (e.getKeyCode() == KeyEvent.VK_K) { // Stop Movement for k
            Var.gegnermovedown = false;

        }

    }
}
