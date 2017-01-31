package pack1;

import java.awt.event.MouseListener;
import java.util.Objects;

public class MouseEvent implements MouseListener {

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        // Iterate over all textobject instances
        for (int i = 0; i < Var.drawtexts.size(); i++) {

            TextObject obj = (TextObject) Var.drawtexts.get(i);     // Create obj variable for later use

            // Check if current scene matches
            if (Var.scene == obj.scene) {

                // Check for click
                if (obj.clickHitbox.contains(e.getPoint().getX(), e.getPoint().getY())) {
                    obj.onClick(e);
                }

            }

        }

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }

}
