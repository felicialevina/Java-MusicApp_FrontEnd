package iteration2and3_25;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.html.HTMLDocument.Iterator;

	public class HomeScreen extends JFrame implements ActionListener{
		
		Playlist play = new Playlist();
		Queue<Songs> printing;
		
		//Declaring components
		JLayeredPane mainPanel, artistPanel, menuPanel;
		JPanel sidePanel, btsPanel, scrollPanel;
		
		JButton btnPlaylist, hyyhCover, returnCover, ktlCover, eday6Cover, lblhyyh, lblreturn, lblktl, lbleday6, 
		btsCover, lblbts, bpCover, lblbp, ikonCover, lblikon, day6Cover, lblday6, lblahyyh, lblwings, lblynwa, lbltear, 
		lblanswer, lblwb, lblre, lblnkb, lblnkc, lblnkf, lblabp, lblst, lblsu, lblai, lblaktl, lbltd, lblsun, lblmoon,
		lbldd, btnSong1, btnSong2, btnSong3, lblHome, lblSkip;
		
		JComboBox cbMenu;
		
		JLabel lblUser, lblSearch, lblRecommend, lblUnderline, lblAlbums, lblUnderline2, ahyyhCover, 
		wingsCover, ynwaCover, tearCover, answerCover, wbCover, reCover, nkbCover, nkcCover, nkfCover, abpCover,
		stCover, suCover, aiiylCover, aktlCover, tdCover, sunCover, moonCover, ddCover, lblArtist, lblUnderline3,
		icon, banner, ynwaLock, reLock, stLock, tdLock;
		
		JTextField tfSearch;
		
		JTextArea area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		String titlePrint = "";
		ArrayList<Songs> hyyhlist;
		ArrayList<String> wingslist;
		
		String username = "hello";
		Font f2 = new Font("Britannic", Font.PLAIN, 30);
		//GenreScreen obj = new GenreScreen();
		//PlaylistFrame obj = new PlaylistFrame();
		
		public static void main(String[] args) {
		 new HomeScreen();
		}
		
		public HomeScreen() {
			/*
			btnLogin.setBorderPainted(false); 
	        btnLogin.setContentAreaFilled(false); 
	        btnLogin.setFocusPainted(false); 
	        btnLogin.setOpaque(false);
			*/
			Font f = new Font("Britannic Bold", Font.BOLD, 40);
		
			Font f3 = new Font("Britannic", Font.PLAIN, 20);
			
			ImageIcon img = new ImageIcon("background1.jpg");
			ImageIcon lockImg = new ImageIcon("lock.png");
			
			JLabel lblBackground = new JLabel();
			lblBackground.setIcon(img);
			lblBackground.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
			
			JLabel lblBackground2 = new JLabel();
			lblBackground2.setIcon(img);
			lblBackground2.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
			
			
			icon = new JLabel();
			ImageIcon iconImg = new ImageIcon("icon2.png");
			icon.setIcon(iconImg);
			icon.setBounds(65, 5, 370, 430);
			icon.setVisible(true);
			
			banner = new JLabel();
			ImageIcon bannerImg = new ImageIcon("ad3.jpg");
			banner.setIcon(bannerImg);
			banner.setBounds(465, 75, 1346, 280);
			banner.setVisible(true);
			
			lblHome = new JButton();
			lblHome.setFont(f);
			lblHome.setText(" HOME");
			lblHome.setBorderPainted(false); 
	        lblHome.setContentAreaFilled(false); 
	        lblHome.setFocusPainted(false); 
	        lblHome.setOpaque(false);
	        lblHome.setHorizontalAlignment(SwingConstants.LEFT);
			lblHome.setForeground(new Color(255, 255, 255));
			lblHome.setBounds(10, 400, 300, 35);
			
			lblSkip = new JButton();
			lblSkip.setFont(f2);
			lblSkip.setText("SKIP");
			lblSkip.setBorderPainted(false); 
	        lblSkip.setContentAreaFilled(false); 
	        lblSkip.setFocusPainted(false); 
	        lblSkip.setOpaque(false);
	        //lblSkip.setHorizontalAlignment(SwingConstants.LEFT);
			lblSkip.setForeground(new Color(255, 255, 255));
			lblSkip.setBounds(200, 470, 300, 50);
			
			btnPlaylist = new JButton("New Playlist");
			btnPlaylist.setFont(f2);
			btnPlaylist.setToolTipText("Click");
			btnPlaylist.setMnemonic(KeyEvent.VK_C);
			btnPlaylist.setBorderPainted(false); 
	        btnPlaylist.setContentAreaFilled(false); 
	        btnPlaylist.setFocusPainted(false); 
	        btnPlaylist.setOpaque(false);
	        btnPlaylist.setHorizontalAlignment(SwingConstants.LEFT);
	        btnPlaylist.setForeground(new Color(255, 255, 255)); 
	        btnPlaylist.setBounds(10, 470, 300, 50);
	        
	     //   area = new JTextArea(100, 200);
	       // area.setBounds(10, 540, 370, 400);
	       scroll.setBounds(10, 540, 370, 430);
	       area.setFont(f3);
	        //scroll.setBounds(10, 540, 370, 400);
	        
	       
	        
	        //area.setSize(10, 500);
	        
	        String[] Options = {"Select Category", "Album", "Artist", "Year"};
	        cbMenu = new JComboBox(Options);
	        cbMenu.setFont(f3);
			cbMenu.setPreferredSize(new Dimension(120, 20));
			cbMenu.setBounds(10, 10, 370, 35);
			cbMenu.setForeground(new Color(255, 255, 255));
			cbMenu.setBackground(Color.BLACK);
			
			tfSearch = new JTextField(10);
			tfSearch.setFont(f3);
			tfSearch.setBounds(1270, 10, 300, 35);
			
			lblSearch = new JLabel();
			lblSearch.setFont(f2);
			lblSearch.setText("Search:");
			lblSearch.setForeground(new Color(255, 255, 255));
			lblSearch.setBounds(1160, 10, 110, 35);
			
			/*JLabel lblUser = new JLabel();
			lblUser.setFont(f2);
			lblUser.setText(username);
			lblUser.setForeground(new Color(255, 255, 255));*/
			//lblUser.setBounds(500, 10, 370, 35);
			
	    	lblRecommend = new JLabel();
	    	lblRecommend.setFont(f);
	    	lblRecommend.setText("RECOMMENDED FOR YOU");
	    	lblRecommend.setForeground(new Color(255, 255, 255));
	    	lblRecommend.setBounds(460, 400, 510, 35);
	    	
	    	lblUnderline = new JLabel();
	    	lblUnderline.setFont(f2);
	    	lblUnderline.setText("____________________________");
	    	lblUnderline.setForeground(new Color(255, 255, 255));
	    	lblUnderline.setBounds(460, 410, 510, 35);
			
	    	
	    	/* ARTISTS */
	    	
	    	
	    	btsCover = new JButton();
	    	ImageIcon bCoverImg = new ImageIcon("bts.jpg");
	    	btsCover.setIcon(bCoverImg);
			btsCover.setBounds(460, 500, 300, 300);
			btsCover.setVisible(false);
	    	
			lblbts = new JButton("BTS");
			lblbts.setFont(f2);
			lblbts.setToolTipText("Click");
			lblbts.setMnemonic(KeyEvent.VK_C);
			lblbts.setFocusPainted(false); 
			lblbts.setForeground(new Color(255, 255, 255));
			lblbts.setBackground(Color.BLACK);
			lblbts.setBounds(460, 800, 300, 50);
			
			ikonCover = new JButton();
			ImageIcon ikonImg = new ImageIcon("ikon.jpg");
			//returnCover.setFocusPainted(false); 
			ikonCover.setIcon(ikonImg);
			ikonCover.setBounds(810, 500, 300, 300);
			ikonCover.setVisible(true);
			
			lblikon = new JButton("IKON");
			lblikon.setFont(f2);
			lblikon.setToolTipText("Click");
			lblikon.setMnemonic(KeyEvent.VK_C);
			//lblreturn.setContentAreaFilled(false); 
			lblikon.setFocusPainted(false); 
			//lblreturn.setOpaque(false);
			lblikon.setForeground(new Color(255, 255, 255)); 
			lblikon.setBackground(Color.BLACK);
			lblikon.setBounds(810, 800, 300, 50);
			
			bpCover = new JButton();
			ImageIcon bpImg = new ImageIcon("bp.png");
			bpCover.setIcon(bpImg);
			bpCover.setBounds(1160, 500, 300, 300);
			bpCover.setVisible(true);
			
			lblbp = new JButton("BLACKPINK");
			lblbp.setFont(f2);
			lblbp.setToolTipText("Click");
			lblbp.setMnemonic(KeyEvent.VK_C);
			lblbp.setFocusPainted(false); 
			lblbp.setForeground(new Color(255, 255, 255)); 
			lblbp.setBackground(Color.BLACK);
			lblbp.setBounds(1160, 800, 300, 50);
			
			day6Cover = new JButton();
			ImageIcon day6Img = new ImageIcon("day6.jpg");
			day6Cover.setIcon(day6Img);
			day6Cover.setBounds(1510, 500, 300, 300);
			day6Cover.setVisible(true);
			
			lblday6 = new JButton("DAY6");
			lblday6.setFont(f2);
			lblday6.setToolTipText("Click");
			lblday6.setMnemonic(KeyEvent.VK_C);
			lblday6.setFocusPainted(false); 
			lblday6.setForeground(new Color(255, 255, 255)); 
			lblday6.setBackground(Color.BLACK);
			lblday6.setBounds(1510, 800, 300, 50);
			
			lblArtist = new JLabel();
	    	lblArtist.setFont(f);
	    	lblArtist.setText("ARTISTS");
	    	lblArtist.setForeground(new Color(255, 255, 255));
	    	lblArtist.setBounds(460, 400, 510, 35);
	    	lblArtist.setVisible(false);
	    	
	    	lblUnderline2 = new JLabel();
	    	lblUnderline2.setFont(f2);
	    	lblUnderline2.setText("_________");
	    	lblUnderline2.setForeground(new Color(255, 255, 255));
	    	lblUnderline2.setBounds(460, 410, 510, 35);
	    	lblUnderline2.setVisible(false);
	    	//lblAlbums.setVisible(false);
			
	    	/* ALBUMS */
	    	
	    	lblAlbums = new JLabel();
	    	lblAlbums.setFont(f);
	    	lblAlbums.setText("ALBUMS");
	    	lblAlbums.setForeground(new Color(255, 255, 255));
	    	lblAlbums.setBounds(460, 400, 510, 35);
	    	
	    	//lblAlbums.setVisible(false);
	    	
	    	lblUnderline3 = new JLabel();
	    	lblUnderline3.setFont(f2);
	    	lblUnderline3.setText("_________");
	    	lblUnderline3.setForeground(new Color(255, 255, 255));
	    	lblUnderline3.setBounds(460, 410, 510, 35);
	    	
	    	
	    	ahyyhCover = new JLabel();
	    	ImageIcon ahCoverImg = new ImageIcon("hyyh__2.jpg");
	    	ahyyhCover.setIcon(ahCoverImg);
			ahyyhCover.setBounds(460, 500, 75, 75);
			
			
			lblahyyh = new JButton("HYYH");
			lblahyyh.setFont(f3); 
			lblahyyh.setToolTipText("Click");
			lblahyyh.setMnemonic(KeyEvent.VK_C);
			lblahyyh.setFocusPainted(false); 
			lblahyyh.setForeground(new Color(255, 255, 255));
			lblahyyh.setBackground(Color.BLACK);
			lblahyyh.setBounds(550, 515, 180, 50);
			
			
			wingsCover = new JLabel();
	    	ImageIcon wingsImg = new ImageIcon("wings.png");
	    	wingsCover.setIcon(wingsImg);
			wingsCover.setBounds(460, 585, 75, 75);
			
			
			lblwings = new JButton("WINGS");
			lblwings.setFont(f3); 
			lblwings.setToolTipText("Click");
			lblwings.setMnemonic(KeyEvent.VK_C);
			lblwings.setFocusPainted(false); 
			lblwings.setForeground(new Color(255, 255, 255));
			lblwings.setBackground(Color.BLACK);
			lblwings.setBounds(550, 600, 180, 50);
				
			ynwaCover = new JLabel();
	    	ImageIcon ynwaImg = new ImageIcon("ynwa.png");
	    	ynwaCover.setIcon(ynwaImg);
			ynwaCover.setBounds(460, 670, 75, 75);
			
			ynwaLock = new JLabel();
	    	ynwaLock.setIcon(lockImg);
			ynwaLock.setBounds(460, 670, 75, 75);
			
			lblynwa = new JButton("YNWA");
			lblynwa.setFont(f3); 
			lblynwa.setToolTipText("Click");
			lblynwa.setMnemonic(KeyEvent.VK_C);
			lblynwa.setFocusPainted(false); 
			lblynwa.setForeground(new Color(255, 255, 255));
			lblynwa.setBackground(Color.BLACK);
			lblynwa.setBounds(550, 685, 180, 50);
			
	    	
			tearCover = new JLabel();
			ImageIcon tearImg = new ImageIcon("tear.png");
	    	tearCover.setIcon(tearImg);
			tearCover.setBounds(460, 755, 75, 75);
			tearCover.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			
			lbltear = new JButton("LY: Tear");
			lbltear.setFont(f3); 
			lbltear.setToolTipText("Click");
			lbltear.setMnemonic(KeyEvent.VK_C);
			lbltear.setFocusPainted(false); 
			lbltear.setForeground(new Color(255, 255, 255));
			lbltear.setBackground(Color.BLACK);
			lbltear.setBounds(550, 770, 180, 50);
			
			
			answerCover = new JLabel();
			ImageIcon answerImg = new ImageIcon("answer.jpg");
	    	answerCover.setIcon(answerImg);
			answerCover.setBounds(460, 840, 75, 75);
			
			
			lblanswer = new JButton("LY: Answer");
			lblanswer.setFont(f3); 
			lblanswer.setToolTipText("Click");
			lblanswer.setMnemonic(KeyEvent.VK_C);
			lblanswer.setFocusPainted(false); 
			lblanswer.setForeground(new Color(255, 255, 255));
			lblanswer.setBackground(Color.BLACK);
			lblanswer.setBounds(550, 855, 180, 50);
			
			
			wbCover = new JLabel();
	    	ImageIcon wbImg = new ImageIcon("welcome_back.jpg");
	    	wbCover.setIcon(wbImg);
			wbCover.setBounds(760, 500, 75, 75);
			
			
			lblwb = new JButton("Welcome Back");
			lblwb.setFont(f3); 
			lblwb.setToolTipText("Click");
			lblwb.setMnemonic(KeyEvent.VK_C);
			lblwb.setFocusPainted(false); 
			lblwb.setForeground(new Color(255, 255, 255));
			lblwb.setBackground(Color.BLACK);
			lblwb.setBounds(850, 515, 180, 50);
			
			
			reCover = new JLabel();
	    	ImageIcon reImg = new ImageIcon("return2.jpg");
	    	reCover.setIcon(reImg);
			reCover.setBounds(760, 585, 75, 75);
			
			reLock = new JLabel();
	    	reLock.setIcon(lockImg);
			reLock.setBounds(760, 585, 70, 70);
			
			lblre = new JButton("Return");
			lblre.setFont(f3); 
			lblre.setToolTipText("Click");
			lblre.setMnemonic(KeyEvent.VK_C);
			lblre.setFocusPainted(false); 
			lblre.setForeground(new Color(255, 255, 255));
			lblre.setBackground(Color.BLACK);
			lblre.setBounds(850, 600, 180, 50);
			
			
			nkbCover = new JLabel();
	    	ImageIcon nkbImg = new ImageIcon("newkids_begin.jpg");
	    	nkbCover.setIcon(nkbImg);
			nkbCover.setBounds(760, 670, 75, 75);
			
			
			lblnkb = new JButton("New Kids: Begin");
			lblnkb.setFont(f3); 
			lblnkb.setToolTipText("Click");
			lblnkb.setMnemonic(KeyEvent.VK_C);
			lblnkb.setFocusPainted(false); 
			lblnkb.setForeground(new Color(255, 255, 255));
			lblnkb.setBackground(Color.BLACK);
			lblnkb.setBounds(850, 685, 180, 50);
			
			
			nkcCover = new JLabel();
	    	ImageIcon nkcImg = new ImageIcon("newkids_cont.jpg");
	    	nkcCover.setIcon(nkcImg);
			nkcCover.setBounds(760, 755, 75, 75);
			
			
			lblnkc = new JButton("New Kids: Cont.");
			lblnkc.setFont(f3); 
			lblnkc.setToolTipText("Click");
			lblnkc.setMnemonic(KeyEvent.VK_C);
			lblnkc.setFocusPainted(false); 
			lblnkc.setForeground(new Color(255, 255, 255));
			lblnkc.setBackground(Color.BLACK);
			lblnkc.setBounds(850, 770, 180, 50);
			
			
			nkfCover = new JLabel();
	    	ImageIcon nkfImg = new ImageIcon("newkids_final.jpg");
	    	nkfCover.setIcon(nkfImg);
			nkfCover.setBounds(760, 840, 75, 75);
			
			
			lblnkf = new JButton("New Kids: Final");
			lblnkf.setFont(f3); 
			lblnkf.setToolTipText("Click");
			lblnkf.setMnemonic(KeyEvent.VK_C);
			lblnkf.setFocusPainted(false); 
			lblnkf.setForeground(new Color(255, 255, 255));
			lblnkf.setBackground(Color.BLACK);
			lblnkf.setBounds(850, 855, 180, 50);
			
			
			abpCover = new JLabel();
	    	ImageIcon abCoverImg = new ImageIcon("blackpink.jpg");
	    	abpCover.setIcon(abCoverImg);
			abpCover.setBounds(1060, 500, 75, 75);
			abpCover.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			
			
			lblabp = new JButton("Blackpink");
			lblabp.setFont(f3); 
			lblabp.setToolTipText("Click");
			lblabp.setMnemonic(KeyEvent.VK_C);
			lblabp.setFocusPainted(false); 
			lblabp.setForeground(new Color(255, 255, 255));
			lblabp.setBackground(Color.BLACK);
			lblabp.setBounds(1150, 515, 180, 50);
			
			
			
			stCover = new JLabel();
	    	ImageIcon stImg = new ImageIcon("squareup.jpg");
	    	stCover.setIcon(stImg);
			stCover.setBounds(1060, 585, 75, 75);
			
			stLock = new JLabel();
	    	stLock.setIcon(lockImg);
			stLock.setBounds(1060, 585, 70, 70);
			
			lblst = new JButton("Square Two");
			lblst.setFont(f3); 
			lblst.setToolTipText("Click");
			lblst.setMnemonic(KeyEvent.VK_C);
			lblst.setFocusPainted(false); 
			lblst.setForeground(new Color(255, 255, 255));
			lblst.setBackground(Color.BLACK);
			lblst.setBounds(1150, 600, 180, 50);
			
			
			suCover = new JLabel();
	    	ImageIcon suImg = new ImageIcon("squaretwo.png");
	    	suCover.setIcon(suImg);
			suCover.setBounds(1060, 670, 75, 75);
			suCover.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			
			lblsu = new JButton("Square Up");
			lblsu.setFont(f3); 
			lblsu.setToolTipText("Click");
			lblsu.setMnemonic(KeyEvent.VK_C);
			lblsu.setFocusPainted(false); 
			lblsu.setForeground(new Color(255, 255, 255));
			lblsu.setBackground(Color.BLACK);
			lblsu.setBounds(1150, 685, 180, 50);
			
			
			aiiylCover = new JLabel();
	    	ImageIcon aiiylImg = new ImageIcon("aiiyl.jpg");
	    	aiiylCover.setIcon(aiiylImg);
			aiiylCover.setBounds(1060, 755, 75, 75);
			
			
			lblai = new JButton("AIIYL");
			lblai.setFont(f3); 
			lblai.setToolTipText("Click");
			lblai.setMnemonic(KeyEvent.VK_C);
			lblai.setFocusPainted(false); 
			lblai.setForeground(new Color(255, 255, 255));
			lblai.setBackground(Color.BLACK);
			lblai.setBounds(1150, 770, 180, 50);
			
			
			aktlCover = new JLabel();
	    	ImageIcon aktlImg = new ImageIcon("ktl2.png");
	    	aktlCover.setIcon(aktlImg);
			aktlCover.setBounds(1060, 840, 75, 75);
			
			
			lblaktl = new JButton("Kill This Love");
			lblaktl.setFont(f3); 
			lblaktl.setToolTipText("Click");
			lblaktl.setMnemonic(KeyEvent.VK_C);
			lblaktl.setFocusPainted(false); 
			lblaktl.setForeground(new Color(255, 255, 255));
			lblaktl.setBackground(Color.BLACK);
			lblaktl.setBounds(1150, 855, 180, 50);
			
			
			tdCover = new JLabel();
	    	ImageIcon tdImg = new ImageIcon("theday.jpg");
	    	tdCover.setIcon(tdImg);
			tdCover.setBounds(1360, 500, 75, 75);
			
			tdLock = new JLabel();
	    	tdLock.setIcon(lockImg);
			tdLock.setBounds(1360, 500, 70, 70);
			
			lbltd = new JButton("The Day");
			lbltd.setFont(f3); 
			lbltd.setToolTipText("Click");
			lbltd.setMnemonic(KeyEvent.VK_C);
			lbltd.setFocusPainted(false); 
			lbltd.setForeground(new Color(255, 255, 255));
			lbltd.setBackground(Color.BLACK);
			lbltd.setBounds(1450, 515, 180, 50);
			
			
			sunCover = new JLabel();
	    	ImageIcon sunImg = new ImageIcon("sunrise.jpg");
	    	sunCover.setIcon(sunImg);
			sunCover.setBounds(1360, 585, 75, 75);
			
			
			lblsun = new JButton("Sunrise");
			lblsun.setFont(f3); 
			lblsun.setToolTipText("Click");
			lblsun.setMnemonic(KeyEvent.VK_C);
			lblsun.setFocusPainted(false); 
			lblsun.setForeground(new Color(255, 255, 255));
			lblsun.setBackground(Color.BLACK);
			lblsun.setBounds(1450, 600, 180, 50);
			
			
			moonCover = new JLabel();
	    	ImageIcon moonImg = new ImageIcon("moonrise.png");
	    	moonCover.setIcon(moonImg);
			moonCover.setBounds(1360, 670, 75, 75);
			moonCover.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			
			lblmoon = new JButton("Moonrise");
			lblmoon.setFont(f3); 
			lblmoon.setToolTipText("Click");
			lblmoon.setMnemonic(KeyEvent.VK_C);
			lblmoon.setFocusPainted(false); 
			lblmoon.setForeground(new Color(255, 255, 255));
			lblmoon.setBackground(Color.BLACK);
			lblmoon.setBounds(1450, 685, 180, 50);
			
			
			ddCover = new JLabel();
	    	ImageIcon ddImg = new ImageIcon("daydream.jpg");
	    	ddCover.setIcon(ddImg);
			ddCover.setBounds(1360, 755, 75, 75);
			
			
			lbldd = new JButton("Daydream");
			lbldd.setFont(f3); 
			lbldd.setToolTipText("Click");
			lbldd.setMnemonic(KeyEvent.VK_C);
			lbldd.setFocusPainted(false); 
			lbldd.setForeground(new Color(255, 255, 255));
			lbldd.setBackground(Color.BLACK);
			lbldd.setBounds(1450, 770, 180, 50);
			
			
			/* RECOMMENDED */
			
			hyyhCover = new JButton();
			ImageIcon hCoverImg = new ImageIcon("hyyh_2.jpg");
			hyyhCover.setIcon(hCoverImg);
			hyyhCover.setBounds(460, 500, 300, 300);
			hyyhCover.setVisible(true);
			
			lblhyyh = new JButton("RUN");
			lblhyyh.setFont(f2); 
			lblhyyh.setToolTipText("Click");
			lblhyyh.setMnemonic(KeyEvent.VK_C);
			lblhyyh.setFocusPainted(false); 
			lblhyyh.setForeground(new Color(255, 255, 255));
			lblhyyh.setBackground(Color.BLACK);
			lblhyyh.setBounds(460, 800, 300, 50);
	        
			returnCover = new JButton();
			ImageIcon returnImg = new ImageIcon("return.jpg");
			//returnCover.setFocusPainted(false); 
			returnCover.setIcon(returnImg);
			returnCover.setBounds(810, 500, 300, 300);
			returnCover.setVisible(true);
			
			lblreturn = new JButton("Love Scenario");
			lblreturn.setFont(f2);
			lblreturn.setToolTipText("Click");
			lblreturn.setMnemonic(KeyEvent.VK_C);
			//lblreturn.setContentAreaFilled(false); 
			lblreturn.setFocusPainted(false); 
			//lblreturn.setOpaque(false);
			lblreturn.setForeground(new Color(255, 255, 255)); 
			lblreturn.setBackground(Color.BLACK);
			lblreturn.setBounds(810, 800, 300, 50);
			
			ktlCover = new JButton();
			ImageIcon ktlImg = new ImageIcon("ktl.png");
			ktlCover.setIcon(ktlImg);
			ktlCover.setBounds(1160, 500, 300, 300);
			ktlCover.setVisible(true);
			
			lblktl = new JButton("Kill This Love");
			lblktl.setFont(f2);
			lblktl.setToolTipText("Click");
			lblktl.setMnemonic(KeyEvent.VK_C);
			lblktl.setFocusPainted(false); 
			lblktl.setForeground(new Color(255, 255, 255)); 
			lblktl.setBackground(Color.BLACK);
			lblktl.setBounds(1160, 800, 300, 50);
			
			eday6Cover = new JButton();
			ImageIcon eday6Img = new ImageIcon("eday6.png");
			eday6Cover.setIcon(eday6Img);
			eday6Cover.setBounds(1510, 500, 300, 300);
			eday6Cover.setVisible(true);
			
			lbleday6 = new JButton("You Were Beautiful");
			lbleday6.setFont(f2);
			lbleday6.setToolTipText("Click");
			lbleday6.setMnemonic(KeyEvent.VK_C);
			lbleday6.setFocusPainted(false); 
			lbleday6.setForeground(new Color(255, 255, 255)); 
			lbleday6.setBackground(Color.BLACK);
			lbleday6.setBounds(1510, 800, 300, 50);		
			
			btnSong1 = new JButton("song 1");
			btnSong1.setFont(f3);
			btnSong1.setToolTipText("Click");
			btnSong1.setMnemonic(KeyEvent.VK_C);
	        btnSong1.setFocusPainted(false); 
	        btnSong1.setBackground(Color.BLACK);
	        btnSong1.setForeground(new Color(255, 255, 255)); 
	        btnSong1.setBounds(550, 515, 280, 50);
	        
	        btnSong2 = new JButton("song 2");
			btnSong2.setFont(f3);
			btnSong2.setToolTipText("Click");
			btnSong2.setMnemonic(KeyEvent.VK_C);
	        btnSong2.setFocusPainted(false); 
	        btnSong2.setBackground(Color.BLACK);
	        btnSong2.setForeground(new Color(255, 255, 255)); 
			btnSong2.setBounds(550, 600, 280, 50);
	        
			btnSong3 = new JButton("song 3");
			btnSong3.setFont(f3);
			btnSong3.setToolTipText("Click");
			btnSong3.setMnemonic(KeyEvent.VK_C);
	        btnSong3.setFocusPainted(false); 
	        btnSong3.setBackground(Color.BLACK);
	        btnSong3.setForeground(new Color(255, 255, 255)); 
	        btnSong3.setBounds(550, 685, 280, 50);
	        
	        hyyhlist = new ArrayList<Songs>();
	      /*  hyyhlist.add("RUN");
	        hyyhlist.add("Dead Leaves");
	        hyyhlist.add("Ma City");
	        
	       */
	      /*  wingslist = new ArrayList<String>();
	        wingslist.add("BST");
	        wingslist.add("Cypher pt. 4");
	        wingslist.add("I need U");*/
	        
			mainPanel = new JLayeredPane();
			mainPanel.setPreferredSize(new Dimension(img.getIconWidth(),
					img.getIconHeight()));
			
			/*sidePanel = new JPanel();
			sidePanel.setLayout(new GridLayout(1 ,2, 5, 5));
			sidePanel.setBorder(BorderFactory.createTitledBorder(""));
			sidePanel.setOpaque(false);
			sidePanel.setBounds(10, 400, 370, 560);*/
					
			//sidePanel.add(lblHome);
			//sidePanel.add(btnPlaylist);
			//sidePanel.add(area);
			
			
			//Create a content panel
	    	mainPanel.setLayout(null);
	    	
			mainPanel.add(lblBackground, new Integer(0));
			mainPanel.add(icon, new Integer(1));
			mainPanel.add(banner, new Integer(1));
			mainPanel.add(hyyhCover, new Integer(1));
			mainPanel.add(returnCover, new Integer(1));
			mainPanel.add(ktlCover, new Integer(1));
			mainPanel.add(eday6Cover, new Integer(1));
			//mainPanel.add(sidePanel, new Integer(1));
			mainPanel.add(lblHome, new Integer(1));
			mainPanel.add(btnPlaylist, new Integer(1));
		//	mainPanel.add(area,  new Integer(1));
			mainPanel.add(scroll,  new Integer(1));

			//mainPanel.add(scrollPanel, new Integer(1));
		//	mainPanel.add(new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			//		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), new Integer(1));
			mainPanel.add(cbMenu, new Integer(1));
			mainPanel.add(tfSearch, new Integer(1));
			mainPanel.add(lblSearch, new Integer(1));
			mainPanel.add(lblRecommend, new Integer(1));
			mainPanel.add(lblUnderline, new Integer(1));
			mainPanel.add(lblhyyh, new Integer(1));
			mainPanel.add(lblreturn, new Integer(1));
			mainPanel.add(lblktl, new Integer(1));
			mainPanel.add(lbleday6, new Integer(1));
			mainPanel.add(btsCover, new Integer(1));
			mainPanel.add(lblbts, new Integer(1));
			mainPanel.add(bpCover, new Integer(1));
			mainPanel.add(lblbp, new Integer(1));
			mainPanel.add(ikonCover, new Integer(1));
			mainPanel.add(lblikon, new Integer(1));
			mainPanel.add(day6Cover, new Integer(1));
			mainPanel.add(lblday6, new Integer(1));
			mainPanel.add(lblAlbums, new Integer(1));
			mainPanel.add(lblUnderline2, new Integer(1));
			mainPanel.add(ahyyhCover, new Integer(1));
			mainPanel.add(wingsCover, new Integer(1));
			mainPanel.add(ynwaCover, new Integer(1));
			mainPanel.add(tearCover, new Integer(1));
			mainPanel.add(answerCover, new Integer(1));
			mainPanel.add(lblahyyh, new Integer(1));
			mainPanel.add(lblwings, new Integer(1));
			mainPanel.add(lblynwa, new Integer(1));
			mainPanel.add(lbltear, new Integer(1));
			mainPanel.add(lblanswer, new Integer(1));
			mainPanel.add(wbCover, new Integer(1));
			mainPanel.add(reCover, new Integer(1));
			mainPanel.add(nkbCover, new Integer(1));
			mainPanel.add(nkcCover, new Integer(1));
			mainPanel.add(nkfCover, new Integer(1));
			mainPanel.add(lblwb, new Integer(1));
			mainPanel.add(lblre, new Integer(1));
			mainPanel.add(lblnkb, new Integer(1));
			mainPanel.add(lblnkc, new Integer(1));
			mainPanel.add(lblnkf, new Integer(1));
			mainPanel.add(abpCover, new Integer(1));
			mainPanel.add(stCover, new Integer(1));
			mainPanel.add(suCover, new Integer(1));
			mainPanel.add(aiiylCover, new Integer(1));
			mainPanel.add(aktlCover, new Integer(1));
			mainPanel.add(lblabp, new Integer(1));
			mainPanel.add(lblst, new Integer(1));
			mainPanel.add(lblsu, new Integer(1));
			mainPanel.add(lblai, new Integer(1));
			mainPanel.add(lblaktl, new Integer(1));
			mainPanel.add(tdCover, new Integer(1));
			mainPanel.add(sunCover, new Integer(1));
			mainPanel.add(moonCover, new Integer(1));
			mainPanel.add(ddCover, new Integer(1));
			mainPanel.add(lbltd, new Integer(1));
			mainPanel.add(lblsun, new Integer(1));
			mainPanel.add(lblmoon, new Integer(1));
			mainPanel.add(lbldd, new Integer(1));
			mainPanel.add(lblArtist, new Integer(1));
			mainPanel.add(lblUnderline3, new Integer(1));
			mainPanel.add(btnSong1, new Integer(1));
			mainPanel.add(btnSong2, new Integer(1));
			mainPanel.add(btnSong3, new Integer(1));
			mainPanel.add(lblSkip, new Integer(1));
			mainPanel.add(ynwaLock, new Integer(2));
			mainPanel.add(reLock, new Integer(2));
			mainPanel.add(stLock, new Integer(2));
			mainPanel.add(tdLock, new Integer(2));
			//panel.setVisible(false);
		
			setFalseArtist();	
			setFalseAlbum();	
			
			/*setContentPane(panel);
			setSize(img.getIconWidth(), img.getIconHeight());
			setTitle("PlayIt");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);*/
	    	
			btnSong1.setVisible(false);
			btnSong2.setVisible(false);
			btnSong3.setVisible(false);
			
			btnPlaylist.addActionListener(this);
			cbMenu.addActionListener(this);
			hyyhCover.addActionListener(this);
			returnCover.addActionListener(this);
			ktlCover.addActionListener(this);
			eday6Cover.addActionListener(this);
			lblhyyh.addActionListener(this);
			lblreturn.addActionListener(this);
			lblktl.addActionListener(this);
			lbleday6.addActionListener(this);
			lblahyyh.addActionListener(this);
			lblwings.addActionListener(this);
			lblynwa.addActionListener(this);
			lbltear.addActionListener(this);
			lblanswer.addActionListener(this);
			lblre.addActionListener(this);
			lblwb.addActionListener(this);
			lblnkb.addActionListener(this);
			lblnkc.addActionListener(this);
			lblnkf.addActionListener(this);
			lblabp.addActionListener(this);
			lblst.addActionListener(this);
			lblsu.addActionListener(this);
			lblai.addActionListener(this);
			lblaktl.addActionListener(this);
			lbltd.addActionListener(this);
			lblsun.addActionListener(this);
			lblmoon.addActionListener(this);
			lbldd.addActionListener(this);
			lblHome.addActionListener(this);
			btnSong1.addActionListener(this);
			btnSong2.addActionListener(this);
			btnSong3.addActionListener(this);
			lblSkip.addActionListener(this);
			btsCover.addActionListener(this);
			lblbts.addActionListener(this);
			ikonCover.addActionListener(this);
			lblikon.addActionListener(this);
			bpCover.addActionListener(this);
			lblbp.addActionListener(this);
			day6Cover.addActionListener(this);
			lblday6.addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent e) {
	    	
			if(cbMenu.getSelectedItem() == "Artist")
			{		
				cbMenu.setSelectedIndex(0);
				
				setFalseHome();
				setFalseAlbum();
				setTrueArtist();
				
				Font f = new Font("Britannic", Font.PLAIN, 40);
				lblHome.setFont(f);
				
			}
			
			else if(cbMenu.getSelectedItem() == "Album")
			{	
				cbMenu.setSelectedIndex(0);
				
				btnSong1.setVisible(false);
				btnSong2.setVisible(false);
				btnSong3.setVisible(false);
				
				setFalseHome();		
				setFalseArtist();
				setTrueAlbum();
				
				Font f = new Font("Britannic", Font.PLAIN, 40);
				lblHome.setFont(f);
				
			}
			
			if(e.getSource() == lblSkip)
			{
				play.removeSongs();
				titlePrint = "";
				area.setText("");
				
				for(Songs item: printing)
				{
					  titlePrint = titlePrint + item.getTitle() + "\n\n";
					area.setText(titlePrint);
				}
				
			}
			
			
			else if(e.getSource() == hyyhCover || e.getSource() == lblhyyh)
	    	{  		

				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					printing = play.addSongs("run");
					titlePrint = "";
					area.setText("");
				
					for(Songs item: printing)
					{
					  titlePrint = titlePrint + item.getTitle() + "\n\n";
					  area.setText(titlePrint);
					}
				}
	    	}
			
			else if(e.getSource() == returnCover || e.getSource() == lblreturn)
	    	{  	
				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					printing = play.addSongs("love scenario");
					titlePrint = "";
					area.setText("");
					
					for(Songs item: printing)
					{
						titlePrint = titlePrint + item.getTitle() + "\n\n";
						area.setText(titlePrint);
					}
				}
	    	}
			
			else if(e.getSource() == ktlCover || e.getSource() == lblktl)
	    	{  		
				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					printing = play.addSongs("kill this love");
					titlePrint = "";
					area.setText("");
				
					for(Songs item: printing)
					{
						titlePrint = titlePrint + item.getTitle() + "\n\n";
						area.setText(titlePrint);
					}
				}
	    	}
			
			else if(e.getSource() == eday6Cover || e.getSource() == lbleday6)
	    	{  	
				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					printing = play.addSongs("you were beautiful");
					titlePrint = "";
					area.setText("");
					
					for(Songs item: printing)
					{
						  titlePrint = titlePrint + item.getTitle() + "\n\n";
						//	System.out.println(CartItem);
						area.setText(titlePrint);
					}
	    	
				}
			
			
	    	}
			
			if(e.getSource() == btsCover || e.getSource() == lblbts)
			{
				setFalseArtist();
				ahyyhCover.setVisible(true);
				lblahyyh.setVisible(true);
				wingsCover.setVisible(true);
				lblwings.setVisible(true);
				ynwaCover.setVisible(true);
				lblynwa.setVisible(true);
				tearCover.setVisible(true);
				lbltear.setVisible(true);
				answerCover.setVisible(true);
				lblanswer.setVisible(true);
			}
			
			if(e.getSource() == bpCover || e.getSource() == lblbp)
			{
				setFalseArtist();
				abpCover.setVisible(true);
				lblabp.setVisible(true);
				stCover.setVisible(true);
				lblst.setVisible(true);
				suCover.setVisible(true);
				lblsu.setVisible(true);
				aiiylCover.setVisible(true);
				lblai.setVisible(true);
				aktlCover.setVisible(true);
				lblaktl.setVisible(true);
			}
			
			if(e.getSource() == ikonCover || e.getSource() ==  lblikon)
			{
				setFalseArtist();
				wbCover.setVisible(true);
				lblwb.setVisible(true);
				reCover.setVisible(true);
				lblre.setVisible(true);
				nkbCover.setVisible(true);
				lblnkb.setVisible(true);
				nkcCover.setVisible(true);
				lblnkc.setVisible(true);
				nkfCover.setVisible(true);
				lblnkf.setVisible(true);
			}
			
			if(e.getSource() == day6Cover || e.getSource() == lblday6)
			{
				setFalseArtist();
				tdCover.setVisible(true);
				lbltd.setVisible(true);
				sunCover.setVisible(true);
				lblsun.setVisible(true);
				moonCover.setVisible(true);
				lblmoon.setVisible(true);
				ddCover.setVisible(true);
				lbldd.setVisible(true);
			}
			
			if(e.getSource() == lblahyyh)
			{
				songButtons(play.getAlbum("hyyh"));
			}
			
			if(e.getSource() == lblwings)
			{
				songButtons(play.getAlbum("wings"));
			}
			
			if(e.getSource() == lblynwa)
			{
				if(!username.contains("admin"))
				 {
					 JOptionPane.showMessageDialog(this,  "You are not authorized to view this content", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				 }
				else
				songButtons(play.getAlbum("ynwa"));
			}
			
			if(e.getSource() == lbltear)
			{
				songButtons(play.getAlbum("tear"));
			}
			
			if(e.getSource() == lblanswer)
			{
				songButtons(play.getAlbum("ans"));
			}
			
			if(e.getSource() == lblwb)
			{
				songButtons(play.getAlbum("wb"));
			}
			
			 if(e.getSource() == lblre)
			{
				 if(!username.contains("admin"))
				 {
					 JOptionPane.showMessageDialog(this,  "You are not authorized to view this content", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				 }
				 else
				songButtons(play.getAlbum("ret"));
			}
			
			 if(e.getSource() == lblnkb)
			{
				songButtons(play.getAlbum("nkbegin"));
			}
			
			 if(e.getSource() == lblnkc)
			{
				songButtons(play.getAlbum("nkcont"));
			}
			
			 if(e.getSource() == lblnkf)
			{
				songButtons(play.getAlbum("nkfinal"));
			}
			
			  if(e.getSource() == lblabp)
				{
					songButtons(play.getAlbum("bp"));
				}
				 if(e.getSource() == lblst)
				{
					 if(!username.contains("admin"))
					 {
						 JOptionPane.showMessageDialog(this,  "You are not authorized to view this content", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					 }
					 else
					songButtons(play.getAlbum("squT"));
				}
				 if(e.getSource() == lblsu)
				{
					songButtons(play.getAlbum("squU"));
				}
				 if(e.getSource() == lblai)
				{
					songButtons(play.getAlbum("aiiyl"));
				}
				 if(e.getSource() == lblaktl)
				{
					songButtons(play.getAlbum("ktl"));
				}
				 if(e.getSource() == lbltd)
				{
					 if(!username.contains("admin"))
					 {
						 JOptionPane.showMessageDialog(this,  "You are not authorized to view this content", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
					 }
					 else
					songButtons(play.getAlbum("tday"));
				}
				 if(e.getSource() == lblsun)
				{
					songButtons(play.getAlbum("srise"));
				}
				 if(e.getSource() == lblmoon)
				{
					songButtons(play.getAlbum("mrise"));
				}
				 if(e.getSource() == lbldd)
				{
					songButtons(play.getAlbum("ddream"));
				}
			
			if(e.getSource() == btnSong1)
			{
				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					printing = play.addSongs(btnSong1.getText());
					titlePrint = "";
					area.setText("");
				
					for(Songs item: printing)
					{
					  titlePrint = titlePrint + item.getTitle() + "\n\n";
					//	System.out.println(CartItem);
					area.setText(titlePrint);
					}
				}
			}
			
			if(e.getSource() == btnSong2)
			{
				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
				printing = play.addSongs(btnSong2.getText());
				titlePrint = "";
				area.setText("");
				
				for(Songs item: printing)
				{
					  titlePrint = titlePrint + item.getTitle() + "\n\n";
					//	System.out.println(CartItem);
					area.setText(titlePrint);
				}
				}
			}
			
			if(e.getSource() == btnSong3)
			{
				if(play.checkTime() > 10800)
				{
					JOptionPane.showMessageDialog(this, "3 hours exceeded", "PlayIt", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
				printing = play.addSongs(btnSong3.getText());
				titlePrint = "";
				area.setText("");
				
				for(Songs item: printing)
				{
					  titlePrint = titlePrint + item.getTitle() + "\n\n";
					//	System.out.println(CartItem);
					area.setText(titlePrint);
				}
				}
			}
			if(e.getSource() == lblHome)
			{
				setTrueHome();
				setFalseArtist();
				setFalseAlbum();
			}
			
			else if(e.getSource() == btnPlaylist)
	    	{  		
				
	    	}
		}
		
		public void songButtons(ArrayList<Songs> list)
		{
			btnSong1.setText(list.get(0).getTitle());
			btnSong2.setText(list.get(1).getTitle());
			btnSong3.setText(list.get(2).getTitle());
			
			btnSong1.setVisible(true);
			btnSong2.setVisible(true);
			btnSong3.setVisible(true);
			
			
			setFalseAlbum();
		}
		
		
		public void setTrueHome()
		{
			hyyhCover.setVisible(true);
			returnCover.setVisible(true);
			ktlCover.setVisible(true);
			eday6Cover.setVisible(true);
			lblhyyh.setVisible(true);
			lblreturn.setVisible(true);
			lblktl.setVisible(true);
			lbleday6.setVisible(true);
			lblRecommend.setVisible(true);
			lblUnderline.setVisible(true);
		}
		
		public void setFalseHome()
		{
			hyyhCover.setVisible(false);
			returnCover.setVisible(false);
			ktlCover.setVisible(false);
			eday6Cover.setVisible(false);
			lblhyyh.setVisible(false);
			lblreturn.setVisible(false);
			lblktl.setVisible(false);
			lbleday6.setVisible(false);
			lblRecommend.setVisible(false);
			lblUnderline.setVisible(false);
		}
		
		public void setTrueArtist()
		{
			btsCover.setVisible(true);
			lblbts.setVisible(true);
			bpCover.setVisible(true);
			lblbp.setVisible(true);
			ikonCover.setVisible(true);
			lblikon.setVisible(true);
			day6Cover.setVisible(true);
			lblday6.setVisible(true);
			lblArtist.setVisible(true);
			lblUnderline2.setVisible(true);
		}
		
		public void setFalseArtist()
		{
			btsCover.setVisible(false);
			lblbts.setVisible(false);
			bpCover.setVisible(false);
			lblbp.setVisible(false);
			ikonCover.setVisible(false);
			lblikon.setVisible(false);
			day6Cover.setVisible(false);
			lblday6.setVisible(false);
			lblArtist.setVisible(false);
			lblUnderline2.setVisible(false);
		}
		public void setTrueAlbum()
		{
			lblAlbums.setVisible(true);
			lblUnderline3.setVisible(true);
			ahyyhCover.setVisible(true);
			lblahyyh.setVisible(true);
			wingsCover.setVisible(true);
			lblwings.setVisible(true);
			ynwaCover.setVisible(true);
			lblynwa.setVisible(true);
			tearCover.setVisible(true);
			lbltear.setVisible(true);
			answerCover.setVisible(true);
			lblanswer.setVisible(true);
			wbCover.setVisible(true);
			lblwb.setVisible(true);
			reCover.setVisible(true);
			lblre.setVisible(true);
			nkbCover.setVisible(true);
			lblnkb.setVisible(true);
			nkcCover.setVisible(true);
			lblnkc.setVisible(true);
			nkfCover.setVisible(true);
			lblnkf.setVisible(true);
			abpCover.setVisible(true);
			lblabp.setVisible(true);
			stCover.setVisible(true);
			lblst.setVisible(true);
			suCover.setVisible(true);
			lblsu.setVisible(true);
			aiiylCover.setVisible(true);
			lblai.setVisible(true);
			aktlCover.setVisible(true);
			lblaktl.setVisible(true);
			tdCover.setVisible(true);
			lbltd.setVisible(true);
			sunCover.setVisible(true);
			lblsun.setVisible(true);
			moonCover.setVisible(true);
			lblmoon.setVisible(true);
			ddCover.setVisible(true);
			lbldd.setVisible(true);
			ynwaLock.setVisible(true);
			tdLock.setVisible(true);
			reLock.setVisible(true);
			stLock.setVisible(true);
		}
		
		public void setFalseAlbum()
		{
			lblAlbums.setVisible(false);
			lblUnderline3.setVisible(false);
			ahyyhCover.setVisible(false);
			lblahyyh.setVisible(false);
			wingsCover.setVisible(false);
			lblwings.setVisible(false);
			ynwaCover.setVisible(false);
			lblynwa.setVisible(false);
			tearCover.setVisible(false);
			lbltear.setVisible(false);
			answerCover.setVisible(false);
			lblanswer.setVisible(false);
			wbCover.setVisible(false);
			lblwb.setVisible(false);
			reCover.setVisible(false);
			lblre.setVisible(false);
			nkbCover.setVisible(false);
			lblnkb.setVisible(false);
			nkcCover.setVisible(false);
			lblnkc.setVisible(false);
			nkfCover.setVisible(false);
			lblnkf.setVisible(false);
			abpCover.setVisible(false);
			lblabp.setVisible(false);
			stCover.setVisible(false);
			lblst.setVisible(false);
			suCover.setVisible(false);
			lblsu.setVisible(false);
			aiiylCover.setVisible(false);
			lblai.setVisible(false);
			aktlCover.setVisible(false);
			lblaktl.setVisible(false);
			tdCover.setVisible(false);
			lbltd.setVisible(false);
			sunCover.setVisible(false);
			lblsun.setVisible(false);
			moonCover.setVisible(false);
			lblmoon.setVisible(false);
			ddCover.setVisible(false);
			lbldd.setVisible(false);
			ynwaLock.setVisible(false);
			tdLock.setVisible(false);
			reLock.setVisible(false);
			stLock.setVisible(false);
		}
		
		public JLayeredPane getPanel() {
	        return mainPanel;
	    }
		public void getUsername(String user)
		{
			username = user;
			if(user.contains("admin")) 
			{
				user = "Administrator";
			}
			lblUser = new JLabel();
			lblUser.setFont(f2);
			lblUser.setText(user);
			lblUser.setForeground(new Color(255, 255, 255));
			lblUser.setBounds(1700, 10, 300, 35);
			mainPanel.add(lblUser, new Integer(1));
			
			//System.out.println(user);
		}
	}
	
