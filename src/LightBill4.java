
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.sql.*;
@SuppressWarnings("serial")
 public class LightBill4 extends JFrame implements ActionListener  
{
	private static final long serialVersionUID = 1L;
	
	JLabel lblTitle,lblBk;
	JPanel topPanel;
	JTable table;
	JScrollPane scrollPane;
	JButton Homebtn,btnDis;
	String data[][];
    @SuppressWarnings({ "rawtypes", "unchecked" })
	LightBill4()
	{
		setSize(1940,1080);
		setTitle(" Information Of Energy Billing System ");
		setLayout(null);
		setResizable(true);
		lblTitle=new JLabel();
		try
		{
			BufferedImage img = ImageIO.read(getClass().getResource("/Student Registration.jpg"));
			lblTitle.setIcon(new ImageIcon(img));
		  }
		catch (Exception e) 
		   {
			System.out.println(e);
		  }
		lblBk=new JLabel();
		try
		{
			BufferedImage img = ImageIO.read(getClass().getResource("/images (3).jpg"));
			lblBk.setIcon(new ImageIcon(img));
		  }
		catch (Exception e) 
		   {
			System.out.println(e);
		  }
		lblBk.setBounds(0,-50,1940,1080);
		btnDis=new JButton();
		try
		{
			BufferedImage img = ImageIO.read(getClass().getResource("/images (8)w.jpg"));
			btnDis.setIcon(new ImageIcon(img));
		  }
		catch (IOException ex) 
		   {
		  }
		btnDis.setBounds(10,15,350,247);
		add(btnDis);
		btnDis.addActionListener(this);
		Homebtn=new JButton();
		try
		{
			BufferedImage img = ImageIO.read(getClass().getResource("/images (8)ioi.jpg"));
		    Homebtn.setIcon(new ImageIcon(img));
		  }
		catch (IOException ex) 
		   {
		  }
		Homebtn.setBounds(1570,15,327,302);
		add(Homebtn);
		Homebtn.addActionListener(this);
		lblTitle.setBounds(322,50,1500,150);
		lblTitle.setFont(new Font("Times New Roman",Font.BOLD,25));
		lblTitle.setForeground(new Color(0,0,255));
		add(lblTitle,JLabel.CENTER);
		add(lblBk);
	}
	@SuppressWarnings({ "static-access", "deprecation" })	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Homebtn)
		{
		new LightBill2().setVisible(true);
		dispose();
		}
if(ae.getSource()==btnDis)
{
if(topPanel!=null)
remove(topPanel);
 topPanel = new JPanel();
System.out.println("Button is pressed");
topPanel.setLayout(new BorderLayout());
System.out.println("1");
JScrollPane scroller = new JScrollPane(topPanel);   
System.out.println("2");
this.getContentPane().add(scroller, BorderLayout.CENTER);
System.out.println("Button is pressed");
topPanel.setLayout( new BorderLayout() );
JScrollPane scrolle = new JScrollPane(topPanel);   
this.getContentPane().add(scrolle, BorderLayout.CENTER);
 // Create columns names
String columnNames[]={ "NAME","NUNIT","OUNIT", "CONTACT_NO", "EMAIL_ID","METER_ID","TOTAL","START_DATE","END_DATE"};
// Create some data
   int cnt=0;
 System.out.println("A");
    data=new String[cnt][8];	
    int i=0;
     try
     {
       	 Class.forName("oracle.jdbc.driver.OracleDriver");
 		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","papa");
PreparedStatement ps=con.prepareStatement("select * from LightBill");
System.out.println("C");
ResultSet rs=ps.executeQuery();
System.out.println("D");
             while(rs.next())
                    {
            	 data[i][0]=rs.getString(1);
                  data[i][1]=rs.getString(2);                  
                  data[i][2]=rs.getString(3);
                  data[i][3]=rs.getString(4);
                  data[i][4]=rs.getString(5);
                  data[i][5]=rs.getString(6);
                  data[i][6]=rs.getString(7);
                  data[i][7]=rs.getString(8);
                  data[i][8]=rs.getString(9);
                
                  i++;
                    	}
                    }
              catch(Exception e)
             {	
                  System.out.println(e);
             }
	// Create a new table instance
		table = new JTable(data, columnNames );
table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
table.getColumnModel().getColumn(0).setPreferredWidth(170);
table.getColumnModel().getColumn(1).setPreferredWidth(150);
table.getColumnModel().getColumn(2).setPreferredWidth(170);
table.getColumnModel().getColumn(3).setPreferredWidth(170);
table.getColumnModel().getColumn(4).setPreferredWidth(170);
table.getColumnModel().getColumn(5).setPreferredWidth(170);
table.getColumnModel().getColumn(6).setPreferredWidth(170);
table.getColumnModel().getColumn(7).setPreferredWidth(170);
table.getColumnModel().getColumn(8).setPreferredWidth(170);
// Configure some of JTable's paramters
		table.setShowHorizontalLines( true );
		table.setRowSelectionAllowed( true );
		table.setColumnSelectionAllowed( true );
// Add the table to a scrolling pane
scrollPane = table.createScrollPaneForTable( table );
topPanel.add( scrollPane, BorderLayout.CENTER );
topPanel.setBounds(180,340,1500,650);
topPanel.setVisible(true);
//dispose();
//StudDetails sd1=new StudDetails();
//sd1.setVisible(true);
add(topPanel);
topPanel.repaint();
topPanel.revalidate();
}
}
	public static void main(String args[])
	{
		new LightBill4().setVisible(true);
	}
}
