package pack1;

import java.awt.event.MouseListener;
import java.util.Objects;

public class MouseEvent implements MouseListener {

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        System.out.println("Clicked!");

        if (Objects.equals(Var.scene, "start")) {
            if (Draw.mouse_rect_start.contains(e.getPoint().getX(), e.getPoint().getY())) {
                System.out.println("Clicked start!");
                Var.scene = "game";
                System.out.println("Starting game..");
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
