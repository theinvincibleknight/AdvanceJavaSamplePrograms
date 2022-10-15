//Java Program to create push buttons using Button class and perform some action

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*<APPLET code="mobilebill" width=800 height=800></applet>*/
public class mobilebill extends Applet implements ActionListener {
 Label name,std,sms,isd,title,total;
 TextField tname,tsms,tisd,tstd,trent,ttotal;
 Button b1,b2;
	public void init()
	{
		setBackground(Color.PINK);
		setForeground(Color.BLUE);
		Font f=new Font("Times new Rooman",Font.BOLD,20);
		setFont(f);
		
		
		title=new Label("MOBILE BILL GENERATION",Label.CENTER);
		name=new Label("Enter Name",Label.RIGHT);
		std=new Label("Enter No.of STD Calls",Label.RIGHT);
		isd=new Label("Enter No.of ISD Calls",Label.RIGHT);
		sms=new Label("Enter No.of SMS",Label.RIGHT);
		total=new Label("Total Bill",Label.RIGHT);
		
		tname=new TextField();
		tsms=new TextField();
		tisd=new TextField();
		tstd=new TextField();
		ttotal=new TextField();
		
		b1=new Button("Generate Bill");
		b2=new Button("Clear");
		
		add(title);add(name);add(tname);add(std);add(tstd);add(isd);add(tisd);
                        add(sms);add(tsms);add(b1);add(total);add(ttotal);add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(null);
		title.setBounds(200,20,600,30);
		name.setBounds(100, 100, 300,25);
		tname.setBounds(410, 100, 300, 25);
		std.setBounds(100, 170, 300,25);
		tstd.setBounds(410, 170, 300, 25);
		isd.setBounds(100, 240, 300,25);
		tisd.setBounds(410, 240, 300, 25);
		sms.setBounds(100, 310, 300,25);
		tsms.setBounds(410, 310, 300, 25);
		total.setBounds(100, 380, 300,25);
		ttotal.setBounds(410, 380, 300, 25);
		ttotal.setEnabled(false);
		
		b1.setBounds(200, 500, 250,35);
		b2.setBounds(500, 500, 250,35);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("Clear"))
		{
			tname.setText(" "); 
			tstd.setText(" ");
			tsms.setText(" "); 
			tisd.setText(" ");
			ttotal.setText(" ");
		}
		else
		{
		float bill=0;
		try
		{
			bill=Integer.parseInt(tsms.getText());
			bill+=Integer.parseInt(tisd.getText())*2.5;
			bill+=Integer.parseInt(tstd.getText())*0.60;
			ttotal.setText(Float.valueOf(bill).toString());
		}
		catch(Exception e){ttotal.setText(" ");}
			
		}
	}
  }
