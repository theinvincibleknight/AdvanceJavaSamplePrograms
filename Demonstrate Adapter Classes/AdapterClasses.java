// Java Program to demonstrate Adapter Classes

package programs;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*<applet code=,ouseadapterdemo" width=300 height=300></applet>*/

public class mouseadapterdemo extends Applet {

public void init()
{
		addMouseListener(new Myclass(this));
}
}

class Myclass extends MouseAdapter
{
	mouseadapterdemo m;
	public Myclass(mouseadapterdemo m)
	{
		this.m=m;
	}
	public void mouseClicked(MouseEvent me)
	{
		String s="Mouse Clicked at coordinates   : " +me.getX() +" , "+me.getY();
	    m.showStatus(s);
	}
}
