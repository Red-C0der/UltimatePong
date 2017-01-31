package pack1;

import java.awt.event.MouseListener;
import java.util.Objects;

public class MouseEvent implements MouseListener {

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        for (int i = 0; i < Var.drawtexts.size(); i++) { // Iterate over all textobjects instances

            TextObject obj = (TextObject) Var.drawtexts.get(i);     // Create obj variable for later use

            if (Var.scene == obj.scene) { // Check if current scene matches

                if (obj.clickHitbox.contains(e.getPoint().getX(), e.getPoint().getY())) { // Check for click
                    obj.onClick(e);
                }

            }

        }

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) { // mouse clicked

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) { // mouse klick cancled

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) { // #irrelevant #aber müssen hin

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) { // #irrelevant #aber müssen hin

    }

}
