/* Java program to create some push buttons using JButton class and draw different borders around the buttons.*/


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class drawingBorders extends JApplet implements ActionListener {

	JButton rect,oval,square,circle;
	int code;
	
	public void paint(Graphics g) {
		g.clearRect(50, 50, 800, 800);
	switch(code)
	{
	case 1: g.drawRect(80, 80, 190, 70);
			break;
	case 2: g.drawOval(80, 470, 200, 80);
		     break;
	case 3 : g.drawRect(480, 50, 200, 200);
			break;
	case 4: g.drawOval(430, 430, 250, 250);
	        break;
		
	
	}
		
	}

	public void init() {
		
		rect=new JButton("RECTANGLE");
		oval=new JButton("OVAL");
		square=new JButton("SQUARE");
		circle=new JButton("CIRCLE");
		
		this.setLayout(null);
		rect.setBounds(100,100,150,30);square.setBounds(500,100,150,30);
		oval.setBounds(100,500,150,30);circle.setBounds(500,500,150,30);
		
		add(rect);
		add(oval);
		add(circle);
		add(square);
		
		rect.addActionListener(this);
		oval.addActionListener(this);
		square.addActionListener(this);
		circle.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("RECTANGLE"))
			code=1;
		else if(s.equals("OVAL"))
			code=2;
		else if(s.equals("SQUARE"))
			code=3;
		else
			code=4;
		repaint();
	}

}
