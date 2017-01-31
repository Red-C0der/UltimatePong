package GameEngine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvents implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {

        for (TextObject obj : GameEngine.TextObjects) {

            // Check if current scene matches
            if (GameEngine.currentScene == obj.scene) {

                // Check for click
                if (obj.clickHitbox.contains(e.getPoint().getX(), e.getPoint().getY())) {
                    obj.onClick(e);             // Call associated function
                }

            }

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
