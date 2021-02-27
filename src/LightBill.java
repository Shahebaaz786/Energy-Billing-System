
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
@SuppressWarnings("serial")
 public class LightBill extends JFrame implements ActionListener  
{
	JLabel lblTitle,lblBk;
	@SuppressWarnings("rawtypes")
	JComboBox jcbBatch,jcbClass,jcbDept,jcbState,jcbDist,jcbTaluca,jcbGender;
	JButton Homebtn,btnAdd,btnCancel;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	LightBill()
	{
		setSize(1940,1080);
		setTitle("Energy Billing System");
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
			BufferedImage img = ImageIO.read(getClass().getResource("/download1.jpg"));
			lblBk.setIcon(new ImageIcon(img));
		  }
		catch (Exception e) 
		   {
			System.out.println(e);
		  }
		lblBk.setBounds(0,0,1940,1080);
		Homebtn=new JButton();
		try
		{
			BufferedImage img = ImageIO.read(getClass().getResource("/rrrr.jpg"));
		    Homebtn.setIcon(new ImageIcon(img));
		  }
		catch (IOException ex) 
		   {
		  }
		Homebtn.setBounds(500,660,900,325);
		add(Homebtn);
		Homebtn.addActionListener(this);
		lblTitle.setBounds(350,30,1500,150);
		lblTitle.setFont(new Font("Times New Roman",Font.BOLD,25));
		lblTitle.setForeground(new Color(0,0,255));
		add(lblTitle,JLabel.CENTER);
		add(lblBk);
	}
		   
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Homebtn)
		{
		new LightBill1().setVisible(true);
		dispose();
		}
	}
	public static void main(String args[])
	{
			new LightBill().setVisible(true);
	}
	
}
