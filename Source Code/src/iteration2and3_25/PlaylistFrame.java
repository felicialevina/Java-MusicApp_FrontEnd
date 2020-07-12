package iteration2and3_25;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.*;

import java.awt.event.*;
import java.text.DecimalFormat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class PlaylistFrame extends JFrame implements ActionListener {
	//MainFrame obj = new MainFrame();
	HomeScreen obj = new HomeScreen();
	//Declaring Components
	JPasswordField pfPassword, cfPassword, bfPassword;
	JTextField pfUsername, cfUsername;
	JButton btnLogin, btnSignup, btnSignup2;
	JRadioButton rbUser, rbAdmin;
	JLabel username, password, username2, password2, password3, icon, playIt;
	JLayeredPane Spanel, Lpanel;
	String usernameG = "";
	JFrame frame;
	
	//Username and Password for the admin
	String adminUsername = "admin";
	String adminPassword = "1234";
	String uname, uPassword, confirmPassword;
	
	
	public static void main(String[] args) {
		//new PlaylistFrame();
	}
	
	public PlaylistFrame()
	{	
		ImageIcon img = new ImageIcon("background1.jpg");
		
		JLabel lblBackground1 = new JLabel();
		lblBackground1.setIcon(img);
		lblBackground1.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());	
		
		JLabel lblBackground2 = new JLabel();
		lblBackground2.setIcon(img);
		lblBackground2.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		
		icon = new JLabel();
		ImageIcon iconImg = new ImageIcon("icon2.png");
		icon.setIcon(iconImg);
		icon.setBounds(620, 5, 370, 350);
		icon.setVisible(true);
		
		playIt = new JLabel();
		ImageIcon playImg = new ImageIcon("playit.png");
		playIt.setIcon(playImg);
		playIt.setBounds(820, 70, 370, 250);
		playIt.setVisible(true);

		Lpanel = new JLayeredPane();
		//Lpanel.setLayout(GridBagLayout);
		Lpanel.setPreferredSize(new Dimension(img.getIconWidth(),
				img.getIconHeight()));
		
		Spanel = new JLayeredPane();
		Spanel.setPreferredSize(new Dimension(img.getIconWidth(),
				img.getIconHeight()));
		
		Font f = new Font("Arial", Font.PLAIN, 20);
		Font f2 = new Font("Arial", Font.BOLD, 20);

		/*LOGIN PAGE*/
		
		//Creating JLabel objects
		username = new JLabel();
		username.setFont(f);
		username.setText("Enter your username:");
		username.setBounds(670, 350, 200, 40);
		username.setForeground(new Color(255, 255, 255));
		
		//Initialize JPasswordField
		pfUsername = new JTextField(10);
		pfUsername.setFont(f);
		pfUsername.setBounds(870, 350, 200, 40);
				
		//Creating JLabel objects
		password = new JLabel();
		password.setFont(f);
		password.setText("Enter your password:");
		password.setBounds(670, 400, 200, 40);
		password.setForeground(new Color(255, 255, 255));

		//Initialize JPasswordField
		pfPassword = new JPasswordField(10);
		pfPassword.setBounds(870, 400, 200, 40);
				
		//for user account
		rbUser = new JRadioButton("User");
		rbUser.setBounds(880, 460, 100, 40);
		rbUser.setFont(f);
		rbUser.setOpaque(false);
		rbUser.setForeground(new Color(255, 255, 255));

		//for admin account
		rbAdmin = new JRadioButton("Admin");
		rbAdmin.setBounds(980, 460, 200, 40);
		rbAdmin.setFont(f);
		rbAdmin.setOpaque(false);
		rbAdmin.setForeground(new Color(255, 255, 255));
		
		//Creating the buttons
		btnLogin = new JButton("LOGIN");
		btnLogin.setFont(f2);
		btnLogin.setToolTipText("Click");
		btnLogin.setMnemonic(KeyEvent.VK_C);
		btnLogin.setBounds(840, 525, 120, 40);
		
		btnSignup = new JButton("SIGN UP");
		btnSignup.setFont(f2);
		btnSignup.setToolTipText("Click");
		btnSignup.setMnemonic(KeyEvent.VK_C);
		btnSignup.setBounds(980, 525, 120, 40);
		
		
		/*SIGN UP PAGE*/
		//creating JLabel for username
		username2 = new JLabel();
		username2.setFont(f);
		username2.setText("Enter your username:");
		username2.setBounds(670, 350, 200, 40);
		username2.setForeground(new Color(255, 255, 255));
		username2.setVisible(true);
		
		//Initialize JPasswordField
		cfUsername = new JTextField(10);
		cfUsername.setFont(f);
		cfUsername.setBounds(870, 350, 200, 40);
		cfUsername.setVisible(true);
		
		//Create JLabel objects
		password2 = new JLabel();
		password2.setFont(f);
		password2.setText("Enter new password:");
		password2.setBounds(670, 400, 200, 40);
		password2.setForeground(new Color(255, 255, 255));
		password2.setVisible(true);
		
		//Initialize JPasswordField
		cfPassword = new JPasswordField(10);
		cfPassword.setBounds(870, 400, 200, 40);
		cfPassword.setVisible(true);
		
		//Create JLabel objects
		password3 = new JLabel();
		password3.setFont(f);
		password3.setText("Confirm password:");
		password3.setBounds(670, 450, 200, 40);
		password3.setForeground(new Color(255, 255, 255));
		password3.setVisible(true);
		
		//Initialize JPasswordField
		bfPassword = new JPasswordField(10);
		bfPassword.setBounds(870, 450, 200, 40);
		bfPassword.setVisible(true);
		
		//Create Sign up button
		btnSignup2 = new JButton("SIGN UP");
		btnSignup2.setFont(f2);
		btnSignup2.setToolTipText("Click");
		btnSignup2.setMnemonic(KeyEvent.VK_C);
		btnSignup2.setBounds(895, 550, 150, 40);
		btnSignup2.setVisible(true);
		
		//Adding objects to panel
		Lpanel.add(lblBackground1, new Integer(0));
		Lpanel.add(username, new Integer(1));
		Lpanel.add(password, new Integer(1));
		Lpanel.add(pfUsername, new Integer(1));	
		Lpanel.add(pfPassword, new Integer(1));	
		Lpanel.add(btnLogin, new Integer(1));
		Lpanel.add(btnSignup, new Integer(1));	
		Lpanel.add(rbUser, new Integer(1));
		Lpanel.add(rbAdmin, new Integer(1));
		Lpanel.add(icon, new Integer(1));
		Lpanel.add(playIt, new Integer(1));
		
		Spanel.add(lblBackground2, new Integer(0));
		Spanel.add(username2, new Integer(1));
		Spanel.add(password2, new Integer(1));
		Spanel.add(password3, new Integer(1));
		Spanel.add(cfUsername, new Integer(1));
		Spanel.add(cfPassword, new Integer(1));
		Spanel.add(bfPassword, new Integer(1));
		Spanel.add(btnSignup2, new Integer(1));
		//add(new JScrollPane(Spanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		//		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		//Set the properties of the frame
		//frame = new JFrame();
		setContentPane(Lpanel);
		//pack();
		//setSize(1500, 844);
		setSize(img.getIconWidth(), img.getIconHeight());
		add(new JScrollPane(Spanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
	      setVisible(true);*/
	      
		setTitle("PlayIt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setResizable(false);
		
		//The buttons are activated using the ActionListener
		btnLogin.addActionListener(this);
		btnSignup.addActionListener(this);
		btnSignup2.addActionListener(this);
		rbUser.addActionListener(this);
		rbAdmin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == rbUser)
		{
			rbAdmin.setSelected(false);
		}
		else if(e.getSource() == rbAdmin)
		{
			rbUser.setSelected(false);
		}
		
		else if(e.getSource() == btnLogin)
		{
			String usernameTest = pfUsername.getText();
			String passwordTest = pfPassword.getText();
			
			//if the password is correct, a confirm dialogue box shows up telling the user
			//that the password they have entered is correct. When the user clicks 'OK'
			
			if(usernameTest.equals("") || passwordTest.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Missing username or password", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
			}	
			
			else if(!(adminUsername.equals(usernameTest)) && !(uname.equals(usernameTest)))
			{
				JOptionPane.showMessageDialog(this, "Username does not exist", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				pfUsername.setText(null);
				pfPassword.setText(null);
			}						
			
			//if(adminUsername.equals(usernameTest) && rbAdmin.isSelected())
			else if(adminUsername.equals(usernameTest))
			{
				if(adminPassword.equals(passwordTest))
				{
					if(rbAdmin.isSelected())
					{
						JOptionPane.showMessageDialog(this,  "Login successful", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
						//obj.setAdmin();
						obj.getUsername(adminUsername);
						JLayeredPane mPanel = obj.getPanel();
						setContentPane(mPanel);
						revalidate();
					}
					else if(rbUser.isSelected())
					{
						JOptionPane.showMessageDialog(this,  "Not a user account", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(rbAdmin.isSelected() == false && rbUser.isSelected() == false)
					{
						JOptionPane.showMessageDialog(this,  "Select Admin or User", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			
			//if the user enters an incorrect password, a confirm dialogue box appears
			//telling the user the password is not correct. When the user clicks 'OK', they
			//are taken back to the program and the password textfield clears.
				else
				{
					JOptionPane.showMessageDialog(this, "Incorrect password", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					pfPassword.setText(null);
				}			
			}
			
			else if(uname.equals(usernameTest))
			{
				if(uPassword.equals(passwordTest))
				{
					if(rbUser.isSelected())
					{
					JOptionPane.showMessageDialog(this,  "Login successful", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					JLayeredPane mPanel = obj.getPanel();
					setContentPane(mPanel);
					revalidate();
					obj.getUsername(uname);
					}
					else if(rbAdmin.isSelected())
					{
						JOptionPane.showMessageDialog(this,  "You are not authorized", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(rbUser.isSelected() == false && rbAdmin.isSelected() == false)
					{
						JOptionPane.showMessageDialog(this,  "Select Admin or User", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			
			//if the user enters an incorrect password, a confirm dialogue box appears
			//telling the user the password is not correct. When the user clicks 'OK', they
			//are taken back to the program and the password textfield clears.
				else
				{
					JOptionPane.showMessageDialog(this, "Incorrect password", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					pfPassword.setText(null);
				}			
			}
			
		}
		else if(e.getSource() == btnSignup)
		{	
			setContentPane(Spanel);
			revalidate();
		}
		
		else if(e.getSource() == btnSignup2)
		{
			uname = cfUsername.getText();
			uPassword = cfPassword.getText();
			confirmPassword = bfPassword.getText();
				
			if(uname.equals("") || uPassword.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Missing username or password", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(!(uPassword.equals(confirmPassword)))
			{
				JOptionPane.showMessageDialog(this, "Password does not match", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				cfPassword.setText(null);
				bfPassword.setText(null);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Sign up successful!", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				
				setContentPane(Lpanel);
				revalidate();
			}
		}
			
	}

		
	}
