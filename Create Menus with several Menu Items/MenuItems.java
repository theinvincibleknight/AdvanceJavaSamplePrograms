//Java Program to create Menus with several Menu Items

package programs;

import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menus extends Frame implements ActionListener,ItemListener{

	MenuBar mb;
	Menu file,edit;
	MenuItem  inew,isave,iopen,isaveas,icopy,ipaste;
	CheckboxMenuItem ibold,iitalic;
	TextField t1,t2;
	Label l1;
	String text;
	
	Menus()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		t1=new TextField(10);
		t2=new TextField(10);
		l1=new Label("Enter Text Here   :");
		Font f=new Font("Times New Roman",Font.PLAIN,20);
				setFont(f);
				
		add(l1);add(t1);add(t2);
		setTitle("New Window");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}});
		
		
		mb=new MenuBar();
		setMenuBar(mb);
		file=new Menu("File");
		edit=new Menu("Edit",false);
		
		file.add(inew=new MenuItem("New..."));
		file.add(iopen=new MenuItem("Open"));
		file.addSeparator();
		file.add(isave=new MenuItem("Save"));
		file.add(isaveas=new MenuItem("Save As"));
		mb.add(file);
		
		edit.add(icopy=new MenuItem("Copy"));
		edit.add(ipaste=new MenuItem("Paste"));
		edit.addSeparator();
		edit.add(ibold=new CheckboxMenuItem("Bold"));
		edit.add(iitalic=new CheckboxMenuItem("Italic"));
		mb.add(edit);
	
		
		
		ipaste.setEnabled(false);
		icopy.addActionListener(this);
		ipaste.addActionListener(this);
		ibold.addItemListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		
		if(s.equals("Copy"))
		{
			ipaste.setEnabled(true);
	        text=t1.getSelectedText();
	      
		}
		else 
		{ 
			t2.setText(text);
			ipaste.setEnabled(false);
		}
		
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		
			if(ibold.getState())
			{
			Font f1=new Font("Times New Roman",Font.BOLD,20);
			t1.setFont(f1);t2.setFont(f1);
			}
			else
			{
				Font f=new Font("Times New Roman",Font.PLAIN,20);
				t1.setFont(f);t2.setFont(f);
			}
		
	}
	
	
	
	public static void main(String s[])
	{
		Menus m=new Menus();
		
	}
}
