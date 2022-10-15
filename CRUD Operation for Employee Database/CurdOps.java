// JDBC Program to perform CRUD Operation for Employee Database.

import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCPrg {
    
    public JDBCPrg() {
    }
    
 public static void main(String[] args)
    {
        try
        {
            DataInputStream in=new DataInputStream(System.in);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Connection Established");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","adk","adk");
            Statement st=con.createStatement();
           
            
            String name=new String();
            for(;;)
            {
            System.out.println("\n\n****************************************");
            System.out.println("Enter Your Choice from the below options");
            System.out.println("****************************************");
            System.out.println("1 : Add New Employee Record \n2 : Delete\n3 : View Employee Records\n4 : Quit\n");
            int choice;
            
            System.out.println("Enter your Choice   :  " );
            choice=Integer.parseInt(in.readLine());
           
            switch(choice)
            {
                case 1 :
                        System.out.print("\n\nEnter Employee Name  : ");
                        name=in.readLine();
                        System.out.flush();
                        System.out.print("\nEnter Employee Code(only Numbers) ");
                        int code =Integer.parseInt(in.readLine());
                        System.out.print("\nEnter Employee Age(only Numbers) ");
                        int age =Integer.parseInt(in.readLine());
                        PreparedStatement ps=con.prepareStatement("Insert into employee values(?,?,?)");
                        ps.setString(1,name);
                        ps.setInt(2, code);
                        ps.setInt(3, age);
                        ps.executeUpdate();
                       
                        System.out.println("\nRecord Added Succesfully");
                        
                        break;
                
                case 2 : System.out.println("\n Enter EmployeeID   : ");
                          int id=Integer.parseInt(in.readLine());
                          int i=st.executeUpdate("Delete from employee where employeeid=" +id);
                          System.out.println(i+" records Deleted");
                	    break;
                
                
                case 3: ResultSet rs = st.executeQuery("Select * from employee order by name asc");
                        System.out.println("\n****************************************");
                        System.out.println("\nEmployee Name\tEmployeeId\tAge");
                        System.out.println("\n****************************************");
                        while(rs.next())
                        {
                          System.out.println(rs.getString(1)+"\t\t"+rs.getInt(2)+"\t\t"+rs.getInt(3));
                        }
                        break;
                case 4: System.exit(0);
                
                default: System.out.println("Incorrect Choice");
            }
         
            }
           
                
        }
        catch(Exception e)
        {
            System.out.println("Connection Problem ... Try Again");
        }
    }
    
}
