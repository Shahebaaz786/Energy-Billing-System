
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.*;
class LightBill2  extends JFrame	implements ActionListener
{
	JLabel  name,nunit,contact,email,meterid,total,sdate,edate,ounit,tit;
	JTextField txtName,txtNunit,txtOunit,txtTotal,txtEdate,txtSdate,txtMail,txtMeterid,txtContact;
	JButton btnSubmit,btnDisplay;
LightBill2()
{	
	//Header
		JPanel heading;
		heading = new JPanel();
		heading.setBackground(new Color(0,0,0,80));
		heading.setBounds(0,0,1940,100);
	//Frame
	JLabel  down2;
	setSize(1940,1080);
	setTitle("Energy Billing System Registeration");
	setLayout(null);
	setResizable(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	ImageIcon img = new ImageIcon("/images (2).jpg");
	Image image = img.getImage();
	Image temp_image = image.getScaledInstance(1940,1080,Image.SCALE_SMOOTH);
	JLabel Background = new JLabel("",img,JLabel.CENTER);
	down2 = new JLabel("",img,JLabel.CENTER);
	down2.setBounds(0,-50,1940,1080);
	tit=new JLabel("Energy Bill Registration");
	name=new JLabel("Name");
	contact=new JLabel("Mobile No");
	email=new JLabel("Email-ID");
	meterid=new JLabel("Meter-ID");
	ounit=new JLabel("Old Unit");
	nunit=new JLabel("New Unit");
	sdate=new JLabel("Start Date");
	edate=new JLabel("Last Date");
	total=new JLabel("Total Cost");
	txtName=new JTextField(10);
	txtContact=new JTextField(10);
	txtMail=new JTextField(10);
	txtMeterid=new JTextField(10);
	txtOunit=new JTextField(10);
	txtNunit=new JTextField(10);
	txtSdate=new JTextField(10);
	txtEdate=new JTextField(10);
	txtTotal=new JTextField(10);
	tit.setBounds(650,20,800,80);
	name.setBounds(300,10,250,300);
	contact.setBounds(300,110,250,400);
	email.setBounds(300,210,250,500);
	meterid.setBounds(300,310,250,600);
	ounit.setBounds(300,410,250,700);
	nunit.setBounds(950,140,200,50);
	sdate.setBounds(950,290,200,50);
	edate.setBounds(950,440,200,50);
	total.setBounds(930,590,300,50);
	txtName.setBounds(550,140,250,50);
	txtContact.setBounds(550,290,250,50);
	txtMail.setBounds(550,440,250,50);
	txtMeterid.setBounds(550,590,250,50);
	txtOunit.setBounds(550,740,250,50);
	txtNunit.setBounds(1200,140,250,50);
	txtSdate.setBounds(1200,290,250,50);
	txtEdate.setBounds(1200,440,250,50);
	txtTotal.setBounds(1200,590,250,50);
	tit.setFont(new Font("Times New Roman",Font.BOLD,70));
	name.setFont(new Font("Times New Roman",Font.BOLD,43));
	contact.setFont(new Font("Times New Roman",Font.BOLD,43));
	email.setFont(new Font("Times New Roman",Font.BOLD,43));
	meterid.setFont(new Font("Times New Roman",Font.BOLD,43));
	ounit.setFont(new Font("Times New Roman",Font.BOLD,43));
	nunit.setFont(new Font("Times New Roman",Font.BOLD,43));
	sdate.setFont(new Font("Times New Roman",Font.BOLD,43));
	edate.setFont(new Font("Times New Roman",Font.BOLD,43));
	total.setFont(new Font("Times New Roman",Font.BOLD,60));
	txtName.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtContact.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtMail.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtMeterid.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtOunit.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtNunit.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtSdate.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtEdate.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtTotal.setFont(new Font("Times New Roman",Font.BOLD,43));
	btnSubmit=new JButton("SUBMIT");
	btnDisplay=new JButton("DISPLAY");
	btnSubmit.setFont(new Font("Times New Roman",Font.BOLD,40));
	btnDisplay.setFont(new Font("Times New Roman",Font.BOLD,40));
	btnSubmit.setBounds(700,910,200,50);
	btnDisplay.setBounds(990,910,240,50);
	name.setForeground(Color.BLUE);
	contact.setForeground(Color.RED);
	email.setForeground(Color.GREEN);
	meterid.setForeground(Color.RED);
	ounit.setForeground(Color.BLUE);
	nunit.setForeground(Color.RED);
	sdate.setForeground(Color.GREEN);
	edate.setForeground(Color.BLUE);
	total.setForeground(Color.RED);
	txtName.setForeground(Color.PINK);
	txtContact.setForeground(Color.ORANGE);
	txtMail.setForeground(Color.YELLOW);
	txtMeterid.setForeground(Color.PINK);
	txtOunit.setForeground(Color.ORANGE);
	txtNunit.setForeground(Color.YELLOW);
	txtSdate.setForeground(Color.PINK);
	txtEdate.setForeground(Color.ORANGE);
	txtTotal.setForeground(Color.YELLOW);
	tit.setForeground(Color.ORANGE);
	btnSubmit.setForeground(Color.RED);
	btnSubmit.setBackground(Color.PINK);
	btnDisplay.setForeground(Color.ORANGE);
	btnDisplay.setBackground(Color.RED);
	Background.add(heading);
	add(tit);
	add(name);
	add(txtName); 
	add(contact);
	add(txtContact);
	add(email);
	add(txtMail); 
	add(meterid);
	add(txtMeterid);
	add(ounit);
	add(txtOunit); 
	add(nunit);
	add(txtNunit);
	add(sdate);
	add(txtSdate); 
	add(edate);
	add(txtEdate);
	add(total);
	add(txtTotal); 
	add(btnSubmit,btnSubmit.CENTER);
	add(btnDisplay,btnDisplay.CENTER);
	add(down2); 
	setVisible(true);
	btnSubmit.addActionListener(this);
	btnDisplay.addActionListener(this);
}
@SuppressWarnings("unchecked")
public void actionPerformed(ActionEvent ae)
{
	String NAME,NUNIT,CONTACT_NO,EMAIL_ID,METER_ID,TOTAL,START_DATE,END_DATE,OUNIT;
 if(ae.getSource()==btnSubmit)
   {
new LightBill4().setVisible(true);
dispose();
   }
if(ae.getSource()==btnDisplay)
{
new LightBill3().setVisible(true);
dispose();
   }
  if(ae.getSource()==btnDisplay)
	{
	  NAME=txtName.getText();
	  NUNIT=txtNunit.getText();
	  OUNIT=txtOunit.getText();
		CONTACT_NO=txtContact.getText();
		EMAIL_ID=txtMail.getText();
		METER_ID=txtMeterid.getText();
		TOTAL=txtTotal.getText();
		START_DATE=txtSdate.getText();
		END_DATE=txtEdate.getText();
		
		if(!NAME.matches("[a-zA-Z ]+$")) 
		{
		System.out.println("After Insertion1");

		  JOptionPane.showMessageDialog(null,"Error in Name","Inane warning",JOptionPane.WARNING_MESSAGE);
		}
	else if(!EMAIL_ID.matches("[a-zA-Z ]+$")) 
	{
		System.out.println("After Insertion1");

		  JOptionPane.showMessageDialog(null,"Error in Email-ID","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((CONTACT_NO.length()==0)||(!CONTACT_NO.matches("[0-9]+$"))||(CONTACT_NO.length()!=10))
	{
		JOptionPane.showMessageDialog(null,"Incorrect Contact No","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((NUNIT.length()==0)||(!NUNIT.matches("[0-9]+$")))
	{
		JOptionPane.showMessageDialog(null,"Incorrect New Unit","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((OUNIT.length()==0)||(!OUNIT.matches("[0-9]+$")))
	{
		JOptionPane.showMessageDialog(null,"Incorrect Old Unit","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((METER_ID.length()==0)||(!METER_ID.matches("[0-9]+$")))
	{
		JOptionPane.showMessageDialog(null,"Incorrect Meter-ID","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((TOTAL.length()==0)||(!TOTAL.matches("[0-9]+$")))
	{
		JOptionPane.showMessageDialog(null,"Incorrect Total Cost","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((START_DATE.length()==0)||(!START_DATE.matches("[0-9]+$")))
	{
		JOptionPane.showMessageDialog(null,"Incorrect Starting Date","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
	else if((END_DATE.length()==0)||(!END_DATE.matches("[0-9]+$")))
	{
		JOptionPane.showMessageDialog(null,"Incorrect Ending Date","Inane warning",JOptionPane.WARNING_MESSAGE);
	}
		else
	{
	    try
	    {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","papa");
       PreparedStatement ps1=con.prepareStatement("select * from LightBill");
       ResultSet rs1=ps1.executeQuery();
int cnt=0;
while(rs1.next())
{
cnt++;
}
cnt++;
      System.out.println("1");
      PreparedStatement ps=con.prepareStatement("insert into LightBill values(?,?,?,?,?,?,?,?,?)");
      ps.setString(1,NAME);
      ps.setString(2,NUNIT);
      ps.setString(3,OUNIT);  
      ps.setString(4,CONTACT_NO);
      ps.setString(5,EMAIL_ID);
      ps.setString(6,METER_ID);
      ps.setString(7,TOTAL);
      ps.setString(8,START_DATE);  
      ps.setString(9,END_DATE);
      ps.executeUpdate();
JOptionPane.showMessageDialog(this,"Data Inserted Successfully(Name)"+"=("+NAME+" )","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
txtName.setText(" ");
txtNunit.setText(" ");
txtOunit.setText(" ");
txtContact.setText(" ");
txtMail.setText(" ");
txtMeterid.setText(" ");
txtTotal.setText(" ");
txtSdate.setText(" ");
txtEdate.setText(" ");

ps.close();
con.close();
ps1.close();
rs1.close();
	    }
	    catch(Exception e)
	    {
	    JOptionPane.showMessageDialog(this,"ERROR="+e,"ERROR",JOptionPane.ERROR_MESSAGE);		    	
	    }  
	}	
	}
}
public static void main(String[] args)
	{
		new LightBill2();
	}
}




	
