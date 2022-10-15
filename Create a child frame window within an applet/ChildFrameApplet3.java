// Java program to create a child frame window within an applet

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*<applet code="prog2mouseevents" width=500 height=500></applet>*/
public class prog2mouseevents extends Applet implements MouseListener {
int x=20,y=20;
String msg="";
	@Override
	public void init() {
		setBackground(Color.pink);
		Font f=new Font("Times New Roman",Font.BOLD,28);
		setFont(f);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
		msg="MouSe Clicked ";
repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		showStatus("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		showStatus("mouse Exited");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
		msg="MouSe Pressed";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
		msg="MouSe Released ";
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}

}
