
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
class LightBill3  extends JFrame	implements ActionListener
{
	JLabel  meter,name,nunit,contact,email,meterid,total,sdate,edate,ounit,tit;
	JButton btnNext,btnDisplay,Homebtn;
LightBill3()
{
	//Header
			JPanel heading;
			heading = new JPanel();
			heading.setBackground(new Color(0,0,0,80));
			heading.setBounds(0,0,1940,100);
		//Frame
	JLabel  down3;
	setSize(1940,1080);
	setTitle("Energy Billing System  Receipt");
	setLayout(null);
	setResizable(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	ImageIcon img = new ImageIcon("/images (5).jpg");
	Image image = img.getImage();
	Image temp_image = image.getScaledInstance(1940,1080,Image.SCALE_SMOOTH);
	JLabel Background = new JLabel("",img,JLabel.CENTER);
	down3 = new JLabel("",img,JLabel.CENTER);
	down3.setBounds(0,0,1940,1080);
	
	Homebtn=new JButton();
	try
	{
		BufferedImage img3 = ImageIO.read(getClass().getResource("/images (8)456yy.jpg"));
	    Homebtn.setIcon(new ImageIcon(img3));
	  }
	catch (IOException ex) 
	   {
	  }
	Homebtn.setBounds(1570,15,250,246);
	add(Homebtn);
	Homebtn.addActionListener(this);
	meter=new JLabel();
	try
	{
		BufferedImage img2 = ImageIO.read(getClass().getResource("/download (2).jfif"));
		meter.setIcon(new ImageIcon(img2));
	  }
	catch (Exception e) 
	   {
System.out.println(e);
	  }
	meter.setBounds(750,50,616,724);
	tit=new JLabel("Energy Bill  Receipt");
	name=new JLabel("Name :");
	contact=new JLabel("Mobile No :");
	email=new JLabel("Email-ID :");
	meterid=new JLabel("Meter-ID :");
	ounit=new JLabel("Old Unit :");
	nunit=new JLabel("New Unit :");
	sdate=new JLabel("Start Date :");
	edate=new JLabel("Last Date :");
	total=new JLabel("Total Cost :");
	tit.setBounds(650,20,800,80);
	name.setBounds(800,680,250,300);
	contact.setBounds(1500,390,250,700);
	email.setBounds(450,390,250,700);
	meterid.setBounds(450,570,250,700);
	ounit.setBounds(20,570,250,700);
	nunit.setBounds(20,390,250,700);
	sdate.setBounds(1100,390,250,700);
	edate.setBounds(1100,570,250,700);
	total.setBounds(1500,570,330,700);
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
	btnNext=new JButton("NEXT");
	btnNext.setFont(new Font("Times New Roman",Font.BOLD,40));
	btnNext.setBounds(850,910,200,50);
	name.setForeground(Color.BLUE);
	contact.setForeground(Color.ORANGE);
	email.setForeground(Color.ORANGE);
	meterid.setForeground(Color.RED);
	ounit.setForeground(Color.BLUE);
	nunit.setForeground(Color.RED);
	sdate.setForeground(Color.GREEN);
	edate.setForeground(Color.ORANGE);
	total.setForeground(Color.RED);
	tit.setForeground(Color.PINK);
	btnNext.setForeground(Color.RED);
	btnNext.setBackground(Color.PINK);
	add(meter);
	Background.add(heading);
	add(tit);
	add(name);
	add(contact);
	add(email);
	add(meterid);
	add(ounit);
	add(nunit);
	add(sdate);
	add(edate);
	add(total);
	add(btnNext,btnNext.CENTER);
	add(down3);  
	setVisible(true);
	btnNext.addActionListener(this);
	btnDisplay.addActionListener(this);	
}
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==btnNext)
   {
new LightBill4().setVisible(true);
dispose();
   }
  if(ae.getSource()==Homebtn)
	{
new LightBill2().setVisible(true);
dispose();
	}
  

  
  
}
	public static void main(String[] args)
	{
		new LightBill3();

	}

}
