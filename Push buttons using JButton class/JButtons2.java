/* Java program to create some push buttons using JButton class and draw different borders around the buttons.*/

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class toggle {

	JFrame frm;
	JLabel lbl;
	JToggleButton tg;
	
	toggle()
	{
		frm=new JFrame("MAKE IN INDIA");
		frm.setSize(400, 400);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		Icon icon=new ImageIcon("D:\\mii.jpg");
		tg=new JToggleButton("CLICK TO VIEW DETAILS",icon);
		lbl=new JLabel("");
		frm.add(tg);
		frm.add(lbl);
		frm.setVisible(true);
		tg.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(tg.isSelected())
					lbl.setText(" It was launched by Prime Minister Narendra Modi on 25 September 2014.");
				else
					lbl.setText("");
				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					toggle  t= new toggle();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}