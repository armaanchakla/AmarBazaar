import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdateAccounts extends JFrame implements ActionListener, MouseListener
{
	JPanel pn;
	JButton load, update, logout, back;
	JLabel idLbl, nameLbl, statusLbl, phoneLbl, balanceLbl, pvwLbl, backImgLbl ,bandImgLbl;
	JTextField idTF, nameTF, statusTF, phoneTF, balanceTF;
	ImageIcon backImg,bandImg;
	Color halkalal,ashColor;
	Font s1font,btnfont;
	String role,un,ps,u,phn,bal;
	
	public UpdateAccounts(String role,String un,String ps,String u,String phn,String bal)
	{
		this.role=role;
		this.un=un;
		this.ps=ps;
		this.u=u;
		this.phn=phn;
		this.bal=bal;
		
		this.setTitle("Accounts Information Change Page");		//super("Amar Bazaar Homepage");
		this.setSize(1366,740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pn = new JPanel();
		pn.setLayout(null);
		
		halkalal = new Color(167,37,37);
		ashColor = new Color(128,128,128);
		s1font = new Font("Impact",Font.BOLD,30);
		btnfont = new Font("Impact",Font.PLAIN,15);
		
		idLbl = new JLabel("User's ID :");
		nameLbl = new JLabel("User's Name :");
		statusLbl = new JLabel("User's Status :");
		phoneLbl = new JLabel("User's Phone No. :");
		balanceLbl = new JLabel("User's Balance :");
		pvwLbl = new JLabel("Accounts Information");
		
		idTF = new JTextField();
		nameTF = new JTextField();
		statusTF = new JTextField();
		phoneTF = new JTextField();
		balanceTF = new JTextField();
		
		load = new JButton("Load Accounts Information");
		update = new JButton("Update Information");
		logout = new JButton("Logout");
		back = new JButton("Back");
		
		backImg = new ImageIcon("back_img.jpg");
		backImgLbl = new JLabel(backImg);
		bandImg = new ImageIcon("side_bar.png");
		bandImgLbl = new JLabel(bandImg);
		
		idLbl.setBounds(950,100,200,30);
		nameLbl.setBounds(925,250,200,30);
		statusLbl.setBounds(925,300,200,30);
		phoneLbl.setBounds(925,350,200,30);
		balanceLbl.setBounds(925,400,200,30);
		pvwLbl.setBounds(300,300,300,30);
		idTF.setBounds(1050,95,200,30);
		nameTF.setBounds(1075,250,200,30);
		statusTF.setBounds(1075,300,200,30);
		phoneTF.setBounds(1075,350,200,30);
		balanceTF.setBounds(1075,400,200,30);	
		load.setBounds(975,150,225,30);
		update.setBounds(1075,480,200,30);
		logout.setBounds(1150,520,125,30);
		back.setBounds(1075,520,70,30);
		backImgLbl.setBounds(0,0,1366,740);
		bandImgLbl.setBounds(850,0,500,700);
		
		
		pvwLbl.setForeground(halkalal);
		pvwLbl.setFont(s1font);
		
		load.setFont(btnfont);
		update.setFont(btnfont);
		logout.setFont(btnfont);
		back.setFont(btnfont);
		
		load.addActionListener(this);
		load.addMouseListener(this);
		update.addActionListener(this);
		update.addMouseListener(this);
		logout.addActionListener(this);
		logout.addMouseListener(this);
		back.addActionListener(this);
		back.addMouseListener(this);
		
		pn.add(idLbl);
		pn.add(idTF);
		pn.add(nameLbl);
		pn.add(nameTF);
		pn.add(statusLbl);
		pn.add(statusTF);
		pn.add(phoneLbl);
		pn.add(phoneTF);
		pn.add(balanceLbl);
		pn.add(balanceTF);
		pn.add(pvwLbl);
		pn.add(load);
		pn.add(update);
		pn.add(logout);
		pn.add(back);
		pn.add(bandImgLbl);
		pn.add(backImgLbl);
		
		this.add(pn);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("p_img.png")));
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String Text = ae.getActionCommand();
		
		if(Text.equals(load.getText()))
		{
			JOptionPane.showMessageDialog(this,"Accounts Information Loaded");
		}
		if(Text.equals(update.getText()))
		{
			JOptionPane.showMessageDialog(this,"Accounts Information Updated");
		}
		if(Text.equals(logout.getText()))
		{
			LoginPG lp = new LoginPG();
			lp.setVisible(true);
			this.setVisible(false);
		}
		if(Text.equals(back.getText()))
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
		if(me.getSource() == load)
		{
			load.setBackground(ashColor);
			load.setForeground(Color.WHITE);
		}
		if(me.getSource() == update)
		{
			update.setBackground(ashColor);
			update.setForeground(Color.WHITE);
		}
		if(me.getSource() == logout)
		{
			logout.setBackground(ashColor);
			logout.setForeground(Color.WHITE);
		}
		if(me.getSource() == back)
		{
			back.setBackground(ashColor);
			back.setForeground(Color.WHITE);
		}
		else
		{
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == load)
		{
			load.setBackground(Color.white);
			load.setForeground(Color.black);
		}
		if(me.getSource() == update)
		{
			update.setBackground(Color.white);
			update.setForeground(Color.black);
		}
		if(me.getSource() == logout)
		{
			logout.setBackground(Color.white);
			logout.setForeground(Color.black);
		}
		if(me.getSource() == back)
		{
			back.setBackground(Color.white);
			back.setForeground(Color.black);
		}
		else
		{
		}
	}
}