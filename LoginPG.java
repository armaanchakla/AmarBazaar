import java.lang.*;
import java.sql.*;	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginPG extends JFrame implements MouseListener, ActionListener
{
	JPanel pn;
	JButton login,register;
	JLabel s1, uname, upass, backImgLbl,bandImgLbl;
	JTextField userName;
	JPasswordField userPS;
	ImageIcon imgp1,imgp2,imgp3,backImg,bandImg;
	String arrRole[] = new String[]{"Adminstrator","Local Host","Local Host","Local Host","Local Host",""};
	String arrUserName[] = new String[]{"mohaimen","jami","estiak","samira","arman",""};
	String arrPS[] = new String[]{"mohaimen","jami","estiak","samira","arman",""};
	String arrName[] = new String[]{"Mohaimen Bin Noor Sir","Abdullah Al Jami","MD Estiak Ahmed","Sobhan Samira","Armaan Hossain Sanjeed Chaklader",""};
	String arrBalance[] = new String[]{"60,000 bdt.","20,000 bdt.","20,000 bdt.","20,000 bdt.","20,000",""};
	String arrPhn[] = new String[]{"01345 678910","01779 611966","01766 461990","01742 237347","01785 973940",""};
	Color halkalal,ashColor;
	Font s1font,btnfont;

	public LoginPG()
	{
		this.setTitle("Amar Bazaar Login Page");		//super("Amar Bazaar login page");
		this.setSize(1366,740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pn = new JPanel();
		pn.setLayout(null);
		
		halkalal = new Color(167,37,37);
		ashColor = new Color(128,128,128);
		s1font = new Font("Impact",Font.BOLD,30);
		btnfont = new Font("Impact",Font.PLAIN,15);
		
		s1 = new JLabel("Sign in here ");
		uname = new JLabel("User Name : ");
		upass = new JLabel("Password  : ");
		
		userName = new JTextField();
		userPS = new JPasswordField();
		
		login = new JButton("Login");
		register = new JButton("Register");
		
		backImg = new ImageIcon("back_img.jpg");
		backImgLbl = new JLabel(backImg);
		bandImg = new ImageIcon("side_bar.png");
		bandImgLbl = new JLabel(bandImg);
		
		s1.setBounds(595,240,200,30);
		uname.setBounds(565,290,100,30);
		userName.setBounds(645,290,150,30);
		upass.setBounds(565,330,100,30);
		userPS.setBounds(645,330,150,30);
		login.setBounds(565,390,100,30);
		register.setBounds(695,390,100,30);
		backImgLbl.setBounds(0,0,1366,740);
		bandImgLbl.setBounds(450,10,450,700);
		
		s1.setForeground(halkalal);
		s1.setFont(s1font);
		
		login.setFont(btnfont);
		register.setFont(btnfont);
		
		login.addActionListener(this);
		login.addMouseListener(this);
		register.addActionListener(this);
		register.addMouseListener(this);
		
		pn.add(s1);
		pn.add(uname);
		pn.add(upass);
		pn.add(userName);
		pn.add(userPS);
		pn.add(login);
		pn.add(register);
		pn.add(bandImgLbl);
		pn.add(backImgLbl);
		
		this.add(pn);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("p_img.png")));
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String Text = ae.getActionCommand();
		
		if(Text.equals(login.getText()))
		{
			for(int i=0 ; i<=5; i++)
			{
					if(userName.getText().equals(arrUserName[i]) && userPS.getText().equals(arrPS[i]))
					{
						JOptionPane.showMessageDialog(this,"Login Successfull");
						String un = arrUserName[i];
						String ps = arrPS[i];
						String u = arrName[i];
						String role = arrRole[i];
						String phn = arrPhn[i];
						String bal = arrBalance[i];
						HomePG pg = new HomePG(role,un,ps,u,phn,bal);
						Product p = new Product(role,un,ps,u,phn,bal);
						pg.setVisible(true);
						this.setVisible(false);
						break;
					}
					else if(arrUserName[i] == arrName[5])
					{
						JOptionPane.showMessageDialog(this,"Invalid Credential");
						break;
					}
					else if(userName.getText().equals(""))
					{
						JOptionPane.showMessageDialog(this,"User Name field is blank");
						break;
					}
					if(userPS.getText().equals(""))
					{
						JOptionPane.showMessageDialog(this,"Password field is blank");
						break;
					}
			}
		}
		if(Text.equals(register.getText()))
		{
			Register rg = new Register();
			rg.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public void mousePressed(MouseEvent me){ }
	public void mouseReleased(MouseEvent me){ }
	public void mouseClicked(MouseEvent me){ }
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == login)
		{
			login.setBackground(ashColor);
			login.setForeground(Color.WHITE);
		}
		else if(me.getSource()== register)
		{
			register.setBackground(ashColor);
			register.setForeground(Color.WHITE);
		}
		
		else
		{
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()== login)
		{
			login.setBackground(Color.white);
			login.setForeground(Color.BLACK);
		}
		else if(me.getSource()== register)
		{
			register.setBackground(Color.white);
			register.setForeground(Color.BLACK);
		}
		else
		{
		}
	}
}