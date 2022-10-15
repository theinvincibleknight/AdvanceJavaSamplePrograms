/* Java Program to accept a website name and return its IP Address */

import java.net.*;
import javax.swing.*;
 
public class ip_host 
{
  public static void main(String arg[]) 
  {
     try{
	String n=JOptionPane.showInputDialog("Enter the host name :");
	InetAddress ipadd =InetAddress.getByName(n);
	JOptionPane.showMessageDialog(null,ipadd.toString());
      }catch(Exception e)
	{
	JOptionPane.showMessageDialog(null, "Sorry,Cannot find IP Address");
	}
		
	}
}
