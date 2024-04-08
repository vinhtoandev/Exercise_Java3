package ThucHanh2;

import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.w3c.dom.events.MouseEvent;

public class MouseTest extends JFrame implements MouseListener{

	public MouseTest() {
		setVisible(true);
		setSize(300,300);
		addMouseListener(this);
	}
	public static void main(String[] args) {
		new MouseTest();

	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(SwingUtilities.isLeftMouseButton(e)) {
			System.out.println("you left click the mouse " + e.getX() + " " + e.getY());
		}
		if(SwingUtilities.isRightMouseButton(e)) {
			System.out.println("you right click the mouse " + e.getX() + " " + e.getY());
		}
		if(SwingUtilities.isMiddleMouseButton(e)) {
			System.out.println("you middle click the mouse " + e.getX() + " " + e.getY());
		}
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		System.out.println("you release the mouse " + e.getX() + " " + e.getY());
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("you enter the window at " + e.getX()+" " + e.getY() +" ");
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("you exit the window at " + e.getX()+" " + e.getY() +" ");
		
	}

}
