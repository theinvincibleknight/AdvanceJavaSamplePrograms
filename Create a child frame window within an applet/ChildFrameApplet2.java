// Java program to create a child frame window within an applet

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyeventsprog extends Applet implements KeyListener {
String s="";
int x=50,y=100;

	@Override
	public void init() {
		addKeyListener(this);
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(s, x, y);
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		int key=ke.getKeyCode();
		switch(key)
		{
		case KeyEvent.VK_CONTROL :  s+="<CTRL>";
									break;
		case KeyEvent.VK_SHIFT : s+="<SHIFT>";
									break;
		case KeyEvent.VK_ALT : s+="<ALT>";
									break;
		case KeyEvent.VK_RIGHT : s+="<Right Arrow>";
								break;
									
		}
		showStatus("KeyPressed");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		showStatus("Key Released");

	}

	@Override
	public void keyTyped(KeyEvent ke) {
		s+=ke.getKeyChar();
		repaint();

	}

}
