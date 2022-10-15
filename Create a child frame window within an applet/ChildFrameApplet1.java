// Java program to create a child frame window within an applet

import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program3 extends Applet implements ActionListener {
	Frame frm;
	Button btn;

	public void init()
	{
	frm = new Frame("Frame Window");
	frm.setSize(250, 250);
	btn = new Button("Show Window");
	add(btn);
	btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		boolean visible = frm.isShowing();
		if (visible)
		{
		frm.setVisible(false);
		btn.setLabel("Show Window");
		}
		else
		{
		frm.setVisible(true);
		btn.setLabel("Hide Window");
		}
           }

}
