import java.sql.*;	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Register extends JFrame implements MouseListener, ActionListener
{
	JPanel pn;
	JButton signUP,signBack;
	JLabel s1, name, phn, balance, uname, upass, backImgLbl,bandImgLbl;
	JTextField nameTF, phnTF, balanceTF, unameTF, upassTF;
	ImageIcon backImg,bandImg;
	Color halkalal,ashColor;
	Font s1font,btnfont;

	public Register()
	{
		this.setTitle("Amar Bazaar Registration Page");		//super("Amar Bazaar login page");
		this.setSize(1366,740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pn = new JPanel();
		pn.setLayout(null);
		
		halkalal = new Color(167,37,37);
		ashColor = new Color(128,128,128);
		s1font = new Font("Impact",Font.BOLD,30);
		btnfont = new Font("Impact",Font.PLAIN,15);
		
		s1 = new JLabel("Register for free ... ");
		name = new JLabel("Your Name : ");
		phn = new JLabel("Phone Number  : ");
		balance = new JLabel("Balance  : ");
		uname = new JLabel("User Name  : ");
		upass = new JLabel("User Password  : ");
		
		nameTF = new JTextField();
		phnTF = new JTextField();
		balanceTF = new JTextField("20,000");
		unameTF = new JTextField();
		upassTF = new JTextField();
		
		signUP = new JButton("Sign Up");
		signBack = new JButton("Already have an account ?");
		
		backImg = new ImageIcon("back_img.jpg");
		backImgLbl = new JLabel(backImg);
		bandImg = new ImageIcon("side_bar.png");
		bandImgLbl = new JLabel(bandImg);
		
		s1.setBounds(480,150,300,30);
		name.setBounds(480,220,100,30);
		nameTF.setBounds(610,220,150,30);
		phn.setBounds(480,260,100,30);
		phnTF.setBounds(610,260,150,30);
		balance.setBounds(480,300,150,30);
		balanceTF.setBounds(610,300,150,30);
		uname.setBounds(480,340,150,30);
		unameTF.setBounds(610,340,150,30);
		upass.setBounds(480,380,150,30);
		upassTF.setBounds(610,380,150,30);
		signUP.setBounds(440,450,100,30);
		signBack.setBounds(545,450,300,30);
		backImgLbl.setBounds(0,0,1366,740);
		bandImgLbl.setBounds(420,10,450,700);
		
		s1.setForeground(halkalal);
		s1.setFont(s1font);
		
		signUP.setFont(btnfont);
		signBack.setFont(btnfont);
		
		signUP.addActionListener(this);
		signUP.addMouseListener(this);
		signBack.addActionListener(this);
		signBack.addMouseListener(this);
		
		pn.add(s1);
		pn.add(name);
		pn.add(phn);
		pn.add(balance);
		pn.add(uname);
		pn.add(upass);
		pn.add(nameTF);
		pn.add(phnTF);
		pn.add(balanceTF);
		pn.add(unameTF);
		pn.add(upassTF);
		pn.add(signUP);
		pn.add(signBack);
		pn.add(bandImgLbl);
		pn.add(backImgLbl);
		
		this.add(pn);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("p_img.png")));
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String Text = ae.getActionCommand();
		
		if(Text.equals(signUP.getText()))
		{
			JOptionPane.showMessageDialog(this,"Successfully Registered");
		}
		if(Text.equals(signBack.getText()))
		{
			LoginPG lp = new LoginPG();
			lp.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public void mousePressed(MouseEvent me){ }
	public void mouseReleased(MouseEvent me){ }
	public void mouseClicked(MouseEvent me){ }
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == signUP)
		{
			signUP.setBackground(ashColor);
			signUP.setForeground(Color.WHITE);
		}
		else if(me.getSource()== signBack)
		{
			signBack.setBackground(ashColor);
			signBack.setForeground(Color.WHITE);
		}
		
		else
		{
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()== signUP)
		{
			signUP.setBackground(Color.white);
			signUP.setForeground(Color.BLACK);
		}
		else if(me.getSource()== signBack)
		{
			signBack.setBackground(Color.white);
			signBack.setForeground(Color.BLACK);
		}
		else
		{
		}
	}
}