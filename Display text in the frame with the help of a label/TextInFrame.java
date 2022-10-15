//Java program to display some text in the frame with the help of a label

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class prog1 extends Frame 
{
	prog1()
	{
	Label lb = new Label("Welcome to AWT"); 	//Creating a label
	setForeground(Color.BLUE);
	add(lb);			 //adding label to the frame.
	setSize(300, 300);		 //setting frame size.
	setTitle("Welcome page ");
	setVisible(true); 		//set frame visibilty to true.
	
	addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
                // Terminate the program after the close button is clicked.
                System.exit(0);
                }
            });
        }

	public static void main(String args[])
	{
		prog1 f=new prog1();
	}
	
}
