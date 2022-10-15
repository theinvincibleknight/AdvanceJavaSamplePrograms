/* Java Program to create some Checkboxes and radio buttons and display the selected option text in textarea when the user clicks on it.*/

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Pizzaorder extends JApplet implements ItemListener {

	JCheckBox c1,c2,c3,c4,c5,c6;
	JRadioButton r1,r2;
	JTextArea ta1;
	JPanel mainpanel,p1,p2;
	ButtonGroup bg;
	public void init()
	{
		mainpanel=new JPanel();
		p1=new JPanel();
		p2=new JPanel();
		Border b1=BorderFactory.createTitledBorder("Select Pizza Toppings");
		p1.setBorder(b1);
		
		c1=new JCheckBox("Anchovies");
		c2=new JCheckBox("Extra Cheese");
		c3=new JCheckBox("Mushrooms");
		c4=new JCheckBox("Pepperoni");
		c5=new JCheckBox("Sweet Corn");
		c6=new JCheckBox("Onion");
		
				
		p1.add(c1);
		p1.add(c2);
		p1.add(c3);
		p1.add(c4);
		p1.add(c5);
		p1.add(c6);
		
		
		
		
		Border b2=BorderFactory.createTitledBorder("Select Food Type");
		p2.setBorder(b2);
		r1=new JRadioButton("Vegetarian");
		r2=new JRadioButton("Non-Vegetarian");
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		p2.add(r1);
		p2.add(r2);
		
		mainpanel.add(p2);
		mainpanel.add(p1);
		
		ta1=new JTextArea(10,25);
		ta1.setLineWrap(true);
		Border b3=BorderFactory.createLineBorder(Color.BLUE, 10);
		ta1.setBorder(b3);
		ta1.setFont(new Font("Times NEw Roman",Font.BOLD,20));
		mainpanel.add(ta1);
		add(mainpanel);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		r1.addItemListener(this);
		r2.addItemListener(this);
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		String s="\n" ;
		if(r1.isSelected())
			s+="Your Food Type is Vegetarian\n";
		else
			s+="Your Food Type is Non-Vegetarian\n";
		s+="\n You Ordered";
		if(c1.isSelected())
              s+="\nAnchovies  ";
		if(c2.isSelected())
            s+="\nExtra Cheese ";
		if(c3.isSelected())
            s+="\nMushrooms ";
		if(c4.isSelected())
            s+="\nPepperoni ";
		if(c5.isSelected())
            s+="\nSweet Corn ";
		if(c6.isSelected())
            s+="\nOnion ";
		
		ta1.setText(s);
	}

}
