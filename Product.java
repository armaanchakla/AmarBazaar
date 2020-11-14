import java.sql.*;	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Product extends JFrame implements ActionListener, MouseListener
{
	JPanel pn;
	JButton logout, goBack;																		//brevarage, vegitable,chaldal,fish,oil,medicine;
	JLabel s1, s2, uRole, uname, upass, name, phone, balance, backImgLbl,bandImgLbl;			//breadImgLbl,vegImgLbl,chaldalImgLbl,fishImgLbl,oilImgLbl,mediImgLbl;
	ImageIcon backImg,bandImg; 																	//breadImg,vegImg,chaldalImg,fishImg,oilImg,mediImg;
	Color halkalal,ashColor;
	Font s1font,btnfont;
	String role,un,ps,u,phn,bal;
	
	public Product(String role,String un,String ps,String u,String phn,String bal)
	{
		this.role=role;
		this.un=un;
		this.ps=ps;
		this.u=u;
		this.phn=phn;
		this.bal=bal;
		this.setTitle("Products from Amar Bazaar");		//super("Amar Bazaar Homepage");
		this.setSize(1366,740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pn = new JPanel();
		pn.setLayout(null);
		
		halkalal = new Color(167,37,37);
		ashColor = new Color(128,128,128);
		s1font = new Font("Impact",Font.BOLD,30);
		btnfont = new Font("Impact",Font.PLAIN,15);
		
		s1 = new JLabel("Welcome.................!");
		s2 = new JLabel("Product Details goes here");
		uRole = new JLabel("User Type : "+role);
		uname = new JLabel("your username is : "+un);
		upass = new JLabel("your Password : "+"*****");
		name  = new JLabel("Name : "+u);
		phone = new JLabel("Contact No : "+phn);
		balance = new JLabel("Current Balance : "+bal);
		
		goBack = new JButton("Go Back");
		logout = new JButton("Logout ?");
		
		backImg = new ImageIcon("back_img.jpg");
		backImgLbl = new JLabel(backImg);
		bandImg = new ImageIcon("side_bar.png");
		bandImgLbl = new JLabel(bandImg);
		
		s1.setBounds(985,240,200,30);
		s2.setBounds(300,240,200,30);
		uRole.setBounds(985,290,300,30);
		uname.setBounds(985,330,300,30);
		upass.setBounds(985,370,300,30);
		name.setBounds(985,410,300,30);
		phone.setBounds(985,450,300,30);
		balance.setBounds(985,480,300,30);
		logout.setBounds(985,600,100,30);
		goBack.setBounds(1100,600,100,30);
		backImgLbl.setBounds(0,0,1366,740);
		bandImgLbl.setBounds(850,0,500,700);
		
		
		s1.setForeground(halkalal);
		s1.setFont(s1font);
		
		goBack.setFont(btnfont);
		logout.setFont(btnfont);
		
		
		logout.addActionListener(this);
		logout.addMouseListener(this);
		goBack.addActionListener(this);
		goBack.addMouseListener(this);
		
		pn.add(s1);
		pn.add(s2);
		pn.add(uname);
		pn.add(upass);
		pn.add(name);
		pn.add(phone);
		pn.add(uRole);
		pn.add(balance);
		pn.add(logout);
		pn.add(goBack);
		
		pn.add(bandImgLbl);
		pn.add(backImgLbl);
		
		this.add(pn);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("p_img.png")));
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String Text = ae.getActionCommand();
		
		if(Text.equals(logout.getText()))
		{
			LoginPG lp = new LoginPG();
			lp.setVisible(true);
			this.setVisible(false);
		}
		if(Text.equals(goBack.getText()))
		{
			HomePG hp = new HomePG(role,un,ps,u,phn,bal);
			hp.setVisible(true);
			this.setVisible(false);
		}
		
	}
	public void mousePressed(MouseEvent me){ }
	public void mouseReleased(MouseEvent me){ }
	public void mouseClicked(MouseEvent me){ }
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == logout)
		{
			logout.setBackground(ashColor);
			logout.setForeground(Color.WHITE);
		}
		if(me.getSource() == goBack)
		{
			goBack.setBackground(ashColor);
			goBack.setForeground(Color.WHITE);
		}
		else
		{
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == logout)
		{
			logout.setBackground(Color.white);
			logout.setForeground(Color.black);
		}
		if(me.getSource() == goBack)
		{
			goBack.setBackground(Color.white);
			goBack.setForeground(Color.black);
		}
		else
		{
		}
	}
}