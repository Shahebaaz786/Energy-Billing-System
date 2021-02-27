
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LightBill1  extends JFrame	implements ActionListener 
{
	JLabel lblName,lblPass,tit;
	JLabel  down1;
	JTextField txtName;
	JButton btnOk;
	JPasswordField txtPass;
LightBill1()
{
	//Header
	JPanel heading;
	heading = new JPanel();
	heading.setBackground(new Color(0,0,0,80));
	heading.setBounds(0,0,1940,100);
	//Frame
	setSize(1940,1080);
	setTitle("Login to Energy Billing System ");
	setLayout(null);
	setResizable(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	ImageIcon img = new ImageIcon("/images (6).jpg");
	Image image = img.getImage();
	Image temp_image = image.getScaledInstance(1940,1080,Image.SCALE_SMOOTH);
	JLabel Background = new JLabel("",img,JLabel.CENTER);
	down1 = new JLabel("",img,JLabel.CENTER);
	down1.setBounds(0,0,1940,1080);
	tit=new JLabel("Welcome , Please Login Here");
	lblName=new JLabel("UserName");
	lblPass=new JLabel("Password");
	txtName=new JTextField("");
	txtPass=new JPasswordField("");
	tit.setBounds(547,110,950,80);
	lblName.setBounds(700,300,200,50);
	lblPass.setBounds(700,400,200,50);
	txtName.setBounds(950,300,250,50);
	txtPass.setBounds(950,400,250,50);
	tit.setFont(new Font("Times New Roman",Font.BOLD,70));
	lblName.setFont(new Font("Times New Roman",Font.BOLD,43));
	lblPass.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtName.setFont(new Font("Times New Roman",Font.BOLD,43));
	txtPass.setFont(new Font("Times New Roman",Font.BOLD,43));
	lblName.setForeground(Color.GREEN);
	lblPass.setForeground(Color.YELLOW);
	txtName.setForeground(Color.ORANGE);
	txtPass.setForeground(Color.BLUE);
	tit.setForeground(Color.RED);
	btnOk=new JButton("LOGIN");
	btnOk.setFont(new Font("Times New Roman",Font.BOLD,40));
	btnOk.setBounds(840,500,200,50);
	btnOk.setForeground(Color.ORANGE);
	btnOk.setBackground(Color.RED);
	Background.add(heading);
	add(tit);
	add(lblName);
	add(txtName); 
	add(lblPass);
	add(txtPass);
	add(down1);  
	add(btnOk,btnOk.CENTER);
	setVisible(true);
	btnOk.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	   if(txtName.getText().equals("Shahebaaj")&&txtPass.getText().equals("Inamdar"))
   {
new LightBill2().setVisible(true);
dispose();
   }
}
  public static void main(String[] args)
	{
		new LightBill1();
	}
}










