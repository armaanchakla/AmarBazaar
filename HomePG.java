import java.sql.*;	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HomePG extends JFrame implements ActionListener, MouseListener
{
	JPanel pn;
	JButton logout, beverage, vegitable,chaldal,fish,oil,medicine,updateProduct, updateAccounts;
	JLabel s1, s2, uRole, uname, upass, name, phone, balance, backImgLbl,bandImgLbl,breadImgLbl,vegImgLbl,chaldalImgLbl,fishImgLbl,oilImgLbl,mediImgLbl;
	ImageIcon imgp1,imgp2,imgp3,backImg,bandImg,breadImg,vegImg,chaldalImg,fishImg,oilImg,mediImg;
	Color halkalal,ashColor;
	Font s1font,btnfont;
	String role,un,ps,u,phn,bal;

	public HomePG(String role,String un,String ps,String u,String phn,String bal)
	{
		this.setTitle("Amar Bazaar Home Page");		//super("Amar Bazaar Homepage");
		this.setSize(1366,740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pn = new JPanel();
		pn.setLayout(null);
		
		halkalal = new Color(167,37,37);
		ashColor = new Color(128,128,128);
		s1font = new Font("Impact",Font.BOLD,30);
		btnfont = new Font("Impact",Font.PLAIN,15);
		
		s1 = new JLabel("Welcome.................!");
		uRole = new JLabel("User Type : "+role);
		uname = new JLabel("your username is : "+un);
		upass = new JLabel("your Password : "+"*****");
		name  = new JLabel("Name : "+u);
		phone = new JLabel("Contact No : "+phn);
		balance = new JLabel("Current Balance : "+bal);
		
		this.role=role;
		this.un=un;
		this.upass=upass;
		this.u=u;
		this.phn=phn;
		this.bal=bal;
		
		// login = new JButton("Login");
		logout = new JButton("Logout ?");
		beverage = new JButton("Bread and Brevarage");
		vegitable = new JButton("Vegitables");
		chaldal = new JButton("Groceries");
		fish = new JButton("Fish");
		oil = new JButton("Oil");
		medicine = new JButton("Medicine");
		updateProduct = new JButton("Update Product");
		updateAccounts = new JButton("Update Accounts Information");
		
		backImg = new ImageIcon("back_img.jpg");
		backImgLbl = new JLabel(backImg);
		bandImg = new ImageIcon("side_bar.png");
		bandImgLbl = new JLabel(bandImg);
		breadImg = new ImageIcon("bread_img.png");
		breadImgLbl = new JLabel(breadImg);
		vegImg = new ImageIcon("veg_img.jpg");
		vegImgLbl = new JLabel(vegImg);
		chaldalImg = new ImageIcon("chaldal_img.png");
		chaldalImgLbl = new JLabel(chaldalImg);
		fishImg = new ImageIcon("fish_img.jpg");
		fishImgLbl = new JLabel(fishImg);
		oilImg = new ImageIcon("oil_img.jpg");
		oilImgLbl = new JLabel(oilImg);
		mediImg = new ImageIcon("medi_img.jpg");
		mediImgLbl = new JLabel(mediImg);
		// this.setIconImage(oilImg);
		
		s1.setBounds(985,240,200,30);
		uRole.setBounds(985,290,300,30);
		uname.setBounds(985,330,300,30);
		upass.setBounds(985,370,300,30);
		name.setBounds(985,410,300,30);
		phone.setBounds(985,450,300,30);
		balance.setBounds(985,480,300,30);
		logout.setBounds(950,600,100,30);
		beverage.setBounds(300,300,200,30);
		vegitable.setBounds(550,300,200,30);
		chaldal.setBounds(300,470,200,30);
		fish.setBounds(550,470,200,30);
		oil.setBounds(300,640,200,30);
		medicine.setBounds(550,640,200,30);
		backImgLbl.setBounds(0,0,1366,740);
		bandImgLbl.setBounds(850,0,500,700);
		breadImgLbl.setBounds(300,130,200,200);
		vegImgLbl.setBounds(550,130,200,200);
		chaldalImgLbl.setBounds(300,300,200,200);
		fishImgLbl.setBounds(550,300,200,200);
		oilImgLbl.setBounds(300,500,200,200);
		mediImgLbl.setBounds(550,500,200,200);
		updateProduct.setBounds(1060,600,200,30);
		updateAccounts.setBounds(950,640,300,30);
		
		s1.setForeground(halkalal);
		s1.setFont(s1font);
		
		updateProduct.setFont(btnfont);
		updateAccounts.setFont(btnfont);
		logout.setFont(btnfont);
		
		beverage.setOpaque(false);
		
		updateProduct.addActionListener(this);
		updateProduct.addMouseListener(this);
		updateAccounts.addActionListener(this);
		updateAccounts.addMouseListener(this);
		logout.addActionListener(this);
		logout.addMouseListener(this);
		beverage.addActionListener(this);
		vegitable.addActionListener(this);
		chaldal.addActionListener(this);
		fish.addActionListener(this);
		oil.addActionListener(this);
		medicine.addActionListener(this);
		
		
		pn.add(s1);
		pn.add(uname);
		pn.add(upass);
		pn.add(name);
		pn.add(phone);
		pn.add(uRole);
		pn.add(balance);
		pn.add(logout);
		pn.add(updateProduct);
		pn.add(updateAccounts);
		pn.add(beverage);
		pn.add(vegitable);
		pn.add(chaldal);
		pn.add(fish);
		pn.add(oil);
		pn.add(medicine);
		pn.add(breadImgLbl);
		pn.add(vegImgLbl);
		pn.add(chaldalImgLbl);
		pn.add(fishImgLbl);
		pn.add(oilImgLbl);
		pn.add(mediImgLbl);
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
		else if(Text.equals(beverage.getText()))
		{
			Product p = new Product(role,un,ps,u,phn,bal);
			p.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(vegitable.getText()))
		{
			Product p = new Product(role,un,ps,u,phn,bal);
			p.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(chaldal.getText()))
		{
			Product p = new Product(role,un,ps,u,phn,bal);
			p.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(fish.getText()))
		{
			Product p = new Product(role,un,ps,u,phn,bal);
			p.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(oil.getText()))
		{
			Product p = new Product(role,un,ps,u,phn,bal);
			p.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(medicine.getText()))
		{
			Product p = new Product(role,un,ps,u,phn,bal);
			p.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(updateProduct.getText()))
		{
			UpdateInventory up = new UpdateInventory(role,un,ps,u,phn,bal);
			up.setVisible(true);
			this.setVisible(false);
		}
		else if(Text.equals(updateAccounts.getText()))
		{
			UpdateAccounts ua = new UpdateAccounts(role,un,ps,u,phn,bal);
			ua.setVisible(true);
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
		if(me.getSource() == updateProduct)
		{
			updateProduct.setBackground(ashColor);
			updateProduct.setForeground(Color.WHITE);
		}
		if(me.getSource() == updateAccounts)
		{
			updateAccounts.setBackground(ashColor);
			updateAccounts.setForeground(Color.WHITE);
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
		if(me.getSource() == updateProduct)
		{
			updateProduct.setBackground(Color.white);
			updateProduct.setForeground(Color.black);
		}
		if(me.getSource() == updateAccounts)
		{
			updateAccounts.setBackground(Color.white);
			updateAccounts.setForeground(Color.black);
		}
		else
		{
		}
	}
}