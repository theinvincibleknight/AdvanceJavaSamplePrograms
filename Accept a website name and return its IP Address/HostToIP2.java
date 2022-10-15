/* Java Program to accept a website name and return its IP Address */

import java.net.*;
import java.io.*;
import javax.swing.*;
 
public class ip_host //extends JApplet
{
	public static void main(String arg[]) throws Exception
	{
		
		System.out.println("Enter the host name :");
		String n=new DataInputStream(System.in).readLine();
 
		InetAddress ipadd =InetAddress.getByName(n);
 
		System.out.println("IP address :"+ipadd);
		
		
	}
}
