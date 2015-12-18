package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;


public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int windowwidth=800;
	int windowheight=680;
	JPanel panel = new JPanel();
	JLabel now;
	JPanel panel_2;
	JPanel panel_3;
	BufferedImage img3;
	 int sizel; 
	 int sizeh;
	 int x,y,time;
	 int [][] Map;
	 int castlewidth=0;
 	int castleheight = 0;
 	int guardnum=0;
	 JLabel [][] picture;
	 private JTextField txtGo;
	 private JTextField txtTime;
	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/6.jpg")));
		setTitle("save the princess");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
    	setSize(windowwidth,windowheight);
    	int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().width;
    	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().height;
    	
    	setLocation((screenWidth-windowwidth)/2,(screenHeight-windowheight)/2);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(185, 62, 401, 89);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/3.png"))));
		lblNewLabel_2.setVisible(true);
		
		
		/*ImageIcon icon = new ImageIcon("E:\\java\u6587\u4EF6\\save the princess\\\u7D20\u6750\\1.jpg");
		  icon.setImage(icon.getImage().getScaledInstance(icon.getIconWidth(),
		    icon.getIconHeight(), Image.SCALE_DEFAULT));
		  JLabel jlpic = new JLabel();
		  jlpic.setBounds(0, 0, 1366, 768);
		  jlpic.setHorizontalAlignment(0);
		  jlpic.setIcon(icon);
		  panel.add(jlpic);
		//Graphics g=new Graphics();
		//Image a = Image.createImag("/src/welcome.png");
		*/
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(0, 153, 784, 348);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel GImage = new JPanel() {
			   /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g) {
				    ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/1.png")));
				    Image img = icon.getImage();
				    g.drawImage(img, 0, 0, 754,155, icon.getImageObserver());
				   } 
				  };
		GImage.setBounds(0, 477, 784, 155);
		panel.add(GImage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(168, 200, 435, 235);
		panel.add(panel_1);
		panel_1.setBorder(new MatteBorder(9, 1, 9, 1, (Color) new Color(0, 191, 255)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		

		
		JLabel lblPleaseEnterThe = new JLabel("please enter the length of the castle:");
		lblPleaseEnterThe.setFont(new Font("宋体", Font.PLAIN, 15));
		lblPleaseEnterThe.setToolTipText("");
		lblPleaseEnterThe.setBounds(10, 34, 312, 38);
		panel_1.add(lblPleaseEnterThe);
		
		JLabel lblNewLabel = new JLabel("please enter the width of the castle:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 75, 312, 38);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("please enter the number of the guard:");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 117, 312, 38);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField("");
		textField.setBounds(322, 43, 66, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(322, 84, 66, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("");
		textField_2.setBounds(322, 126, 66, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		panel_3= new JPanel();
		panel_3.setVisible(false);
		/*
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 30, 784, 613);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setVisible(true);
		*/
		//确定按钮
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s="";
				boolean flag=false;
				try{
					castleheight=Integer.parseInt(textField.getText());
			    	}catch(Exception e1){
			    		s+=textField.getText();
			    		flag=true;
			    		}
				try{
					castlewidth=Integer.parseInt(textField_1.getText());
			    	}catch(Exception e1){
			    		if(s.equals("")==false)s+='、';
			    		s+=textField_1.getText();
			    		flag=true;
			    		}
				try{
					guardnum=Integer.parseInt(textField_2.getText());	
			    	}catch(Exception e1){
			    		if(s.equals("")==false)s+='、';
			    		s+=textField_2.getText();
			    		flag=true;
			    		}
				if(s.equals("")==false){
					JOptionPane.showMessageDialog(new GUI(), s+"输入不正确","输入不正确",2);
		    		textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
		    		return;
				}
				else if(flag==true){
					JOptionPane.showMessageDialog(new GUI(), "输入不能为空","输入不正确",2);return;
				}
				else if(castleheight>50 || castlewidth>50 || guardnum>castleheight*castlewidth-3){
					if(castleheight>50&& castlewidth>50) s="地图太大：castleheight>50 && castlewidth>50";
					else if( castlewidth>50)s="地图太大 ：castlewidth>50";
					else if(castleheight>50)s="地图太大：castleheight>50";
					else if(guardnum>castleheight*castlewidth-3)s="敌人数过多";
					JOptionPane.showMessageDialog(new GUI(),s ,"输入不正确",2);
		    		textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
		    		return;
				}
				panel_3= new JPanel();
				panel_3.setBackground(new Color(255, 255, 255));
				panel_3.setBounds(0, 30, 784, 613);
				panel.add(panel_3);
				panel_3.setLayout(null);
				panel_3.setVisible(true);
				
				
				panel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				//GImage.setVisible(true);
				GImage.setVisible(false);
				//txtGo.setVisible(true);
				
				Printpicture();
				
				/*JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setBounds(0, 0, windowwidth/castlewidth, windowheight/castleheight);
				panel.add(lblNewLabel_3);
				lblNewLabel_3.setIcon(new ImageIcon("E:\\java\u6587\u4EF6\\save the princess\\\u7D20\u6750\\7.jpg"));
				lblNewLabel_3.setVisible(true); 
				//lblNewLabel_2.setVisible(false);
			*/
				//JLabel [][] picture;
				//Random random1 = new Random();
				//int princess=random1.nextInt(castlewidth*castleheight);
				//picture[princess/castlewidth][princess%castlewidth]=new JLabel();
				//picture[princess/castlewidth][princess%castlewidth].setIcon(new ImageIcon("E:\java文件\save the princess\素材\7.jpg"));
				//picture[princess/castlewidth][princess%castlewidth].setBounds(0, 0, windowwidth/castlewidth, windowheight/castleheight);
				//panel_1.add(picture[princess/castlewidth][princess%castlewidth]);
			}
		});
		
		
		button.setBackground(new Color(224, 255, 255));
		button.setBounds(25, 169, 93, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		button_1.setBackground(new Color(224, 255, 255));
		button_1.setBounds(170, 169, 93, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u6D88");
		button_2.setBackground(new Color(224, 255, 255));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(310, 169, 93, 23);
		panel_1.add(button_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(580, 268, 173, 70);
		ImageIcon prince = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/16.jpg")));
	    prince.getImage();
		Image img = prince.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_DEFAULT);
		prince=new ImageIcon(img);
		lblNewLabel_3.setIcon(prince);
		//lblNewLabel_3.setIcon(new ImageIcon(GUI.class.getResource("/picture/16.jpg")));
		lblNewLabel_3.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
			// 处理鼠标点击
				panel_4.setVisible(false);
				panel_1.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
			// 处理鼠标移入
				lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
			// 处理鼠标离开
			}
			public void mousePressed(MouseEvent e) {
			// 处理鼠标按下
			}
			public void mouseReleased(MouseEvent e) {
			// 处理鼠标释放
			}
			});
		panel_4.add(lblNewLabel_3);
		//lblNewLabel_3。requestFocus();
		
		
		
		JTextArea txtrCharStoryletgo = new JTextArea();
		txtrCharStoryletgo.setRows(8);
		txtrCharStoryletgo.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtrCharStoryletgo.setText("    \u8FD9\u662F\u4E00\u4E2A\u5173\u4E8E\u5931\u843D\u738B\u56FD--\u96F7\u59C6\u5229\u4E9A\u7684\u6545\u4E8B\uFF0C\u6545\u4E8B\u7684\u4E3B\u4EBA\u516C\u662F\u4E00\u4F4D\u5145\u6EE1\u5149\u8F89\u7684\u5973\u5B69\u3002\u5965\u5730\r\n\u5229\u66FE\u7ECF\u5728\u4E00\u4F4D\u516C\u7235\u7684\u7EDF\u6CBB\u4E4B\u4E0B\uFF0C\u5B89\u8D1D\u62C9\u662F\u8FD9\u4F4D\u516C\u7235\u7684\u5973\u513F\u3002\u5979\u7531\u4E00\u4F4D\u795E\u79D8\u7684\u516C\u7235\u592B\u4EBA\u6240\u751F\uFF0C\r\n\u4E5F\u662F\u5176\u7236\u4EB2\u7684\u638C\u4E0A\u660E\u73E0\u3002\u4E0D\u5E78\u7684\u662F\u5979\u7684\u6BCD\u4EB2\u5728\u4EA7\u540E\u4E0D\u4E45\u4FBF\u53BB\u4E16\u4E86\uFF0C\u516C\u7235\u72EC\u81EA\u4E00\u4EBA\u5C06\u5979\u517B\u5927\uFF0C\r\n\u5341\u5206\u75BC\u7231\u5979\u30021895\u5E74\uFF0C\u590D\u6D3B\u8282\u524D\u7684\u661F\u671F\u4E94\u3002\u4E00\u7FA4\u8868\u6F14\u8005\u5728\u516C\u7235\u7684\u9762\u524D\u6742\u800D\uFF0C\u4ED6\u7684\u65B0\u5A18\u5C31\u8EAB\r\n\u65C1\uFF0C\u800C\u90A3\u4E2A\u591C\u91CC\u7684\u5B89\u8D1D\u62C9\u7761\u7740\u4E86\u3002\u70DB\u706B\u8D8A\u6765\u8D8A\u5FAE\u5F31\uFF0C\u5B89\u8D1D\u62C9\u53D7\u5230\u98CE\u5BD2\u7684\u5F71\u54CD\uFF0C\u5979\u7684\u76AE\u80A4\u51BB\u50CF\r\n\u96EA\u4E00\u6837\u3002\u7B2C\u4E8C\u5929\u65E9\u6668\uFF0C\u4EBA\u4EEC\u53D1\u73B0\u5B89\u8D1D\u62C9\u9762\u65E0\u8868\u60C5\uFF0C\u5979\u773C\u4E2D\u7684\u5149\u8292\u6D88\u5931\u4E86\u3002\u4ED6\u7684\u7236\u4EB2\u60B2\u4F24\u6B32\u7EDD\r\n\uFF0C\u5374\u65E0\u80FD\u4E3A\u529B\u3002\u4EFB\u8C01\u770B\u4E86\u90FD\u4F1A\u660E\u767D\uFF0C\u6614\u65E5\u90A3\u9C9C\u6D3B\u7684\u5B89\u8D1D\u62C9\u6B7B\u4E86\u3002\u539F\u6765\u5979\u90A3\u53EF\u6076\u7684\u7EE7\u6BCD\u662F\u4E2A\u5DEB\r\n\u5A46\u3002\u800C\u5728\u90A3\u65F6\u7684\u5B89\u8D1D\u62C9\uFF0C\u7A81\u7136\u95F4\u5728\u4E00\u4E2A\u964C\u751F\u7684\u5927\u9646\u4E0A\u82CF\u9192\u4E86\u2026\u5618\u2026\uFF0C\u8FD9\u7684\u786E\u662F\u4E00\u4E2A\u6F02\u4EAE\u516C\u4E3B\r\n\u574F\u7EE7\u6BCD\u7684\u6545\u4E8B\uFF0C\u6211\u4EEC\u7684\u4F2F\u7235\u5927\u4EBA\u5F53\u7136\u5728\u53EC\u96C6\u5168\u5929\u4E0B\u6240\u6709\u7684\u52C7\u58EB\uFF0C\u53BB\u62EF\u6551\u6211\u4EEC\u7684\u5B89\u8D1D\u62C9\u2026\u4F60\u8981\r\n\u8BD5\u8BD5\u5417\uFF1FLet\u2019go\uFF01\r\n");
		txtrCharStoryletgo.setToolTipText("");
		txtrCharStoryletgo.setForeground(new Color(95, 158, 160));
		txtrCharStoryletgo.setColumns(10);
		txtrCharStoryletgo.setBounds(52, 27, 688, 262);
		panel_4.add(txtrCharStoryletgo);
		
		//新游戏
		JButton btnNewGame = new JButton("\u65B0\u6E38\u620F");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.setVisible(false);
				panel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				GImage.setVisible(true);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				/*frame.dispose();
				frame=new GUI();
				frame.setVisible(true);
				*/
			}
		});
		btnNewGame.setBackground(new Color(224, 255, 255));
		btnNewGame.setFont(new Font("幼圆", Font.PLAIN, 15));
		btnNewGame.setBounds(0, 0, 105, 31);
		panel.add(btnNewGame);
		
		JButton button_3 = new JButton("\u5E2E\u52A9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Help frame = new Help();
				frame.setVisible(true);
			}
		});
		button_3.setBackground(new Color(224, 255, 255));
		button_3.setFont(new Font("幼圆", Font.PLAIN, 15));
		button_3.setBounds(104, 0, 105, 31);
		panel.add(button_3);
		
		/*JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\java\u6587\u4EF6\\save the princess\\src\\1.png"));
		label.setBounds(10, 409, 754, 155);
		panel.add(label);
		*/
		
		
		

		
		}
	
	public void Printpicture()
	{
		panel_2 = new JPanel();
		panel_2.setBounds(0, 41, 784, 544);
		panel_3.add(panel_2);

		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);



		txtTime = new JTextField();
		txtTime.setBounds(0, 0, 784, 42);
		panel_3.add(txtTime);
		txtTime.setFont(new Font("华文琥珀", Font.PLAIN, 29));
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setText("");
		txtTime.setBackground(new Color(175, 238, 238));
		txtTime.setColumns(10);
		
				txtGo = new JTextField();
				txtGo.setBounds(0, 585, 784, 28);
				panel_3.add(txtGo);
				txtGo.setText("Let's go");
				txtGo.setHorizontalAlignment(SwingConstants.TRAILING);
				txtGo.setFont(new Font("Kristen ITC", Font.PLAIN, 21));
				txtGo.setBackground(new Color(175, 238, 238));
				txtGo.setColumns(10);
				txtGo.setVisible(true);
		txtTime.setVisible(false);
		
		
		
    	int a;
    	
    	Random random1 = new Random();
    	
    	
		System.out.println(castleheight+" "+castlewidth+" "+guardnum);
		a=random1.nextInt(castleheight*castlewidth);
		
		time=Math.max(castleheight,castlewidth)+2;
		txtTime.setText("Time:"+time);
		txtTime.setVisible(true);
		
		sizel=panel_2.getWidth()/castlewidth;
		sizeh=panel_2.getHeight()/castleheight;
		x=(a%castlewidth)*(panel_2.getWidth()/castlewidth);
		y=(a/castlewidth)*(panel_2.getHeight()/castleheight);
		
		now = new JLabel("");
		int []vis=new int [castlewidth*castlewidth+100];
		Map=new int[castleheight+10][];
		for(int i=0;i<castleheight;i++)Map[i]=new int[castlewidth+10]; 
		picture=new JLabel[castleheight+10][];
		for(int i=0;i<castleheight;i++)picture[i]=new JLabel[castlewidth+10];
		
		System.out.println(a);
		while(vis[a]==1) a=random1.nextInt(castleheight*castlewidth);
		vis[a]=1;
		now.setBounds((a%castlewidth)*(panel_2.getWidth()/castlewidth),(a/castlewidth)*(panel_2.getHeight()/castleheight) , panel_2.getWidth()/castlewidth, panel_2.getHeight()/castleheight);
		System.out.println((a/castlewidth)*(panel_2.getWidth()/castlewidth)+"  "+(a%castlewidth)*(panel_2.getHeight()/castleheight) +"  "+ panel_2.getWidth()/castlewidth+"   "+ panel_2.getHeight()/castleheight);
		panel_2.add(now);
		ImageIcon prince = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/2.png")));
	    prince.getImage();
		Image img = prince.getImage().getScaledInstance(now.getWidth(), now.getHeight(), Image.SCALE_DEFAULT);
		prince=new ImageIcon(img);
		now.setIcon(prince);
		now.setVisible(true); 
		now.requestFocus();
		 now.addKeyListener(new MoveListener());
		 
		
		
		a=random1.nextInt(castleheight*castlewidth);
		System.out.println(a);
		while(vis[a]==1) a=random1.nextInt(castleheight*castlewidth);
		vis[a]=1;
		int xx,yy,p,q;
		xx=a%castlewidth;
		yy=a/castlewidth;
		p=(a%castlewidth)*(panel_2.getWidth()/castlewidth);
		q=(a/castlewidth)*(panel_2.getHeight()/castleheight);
		ImageIcon princess = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/12.jpg")));				
		picture[yy][xx]=new JLabel();
		Map[yy][xx]=1;
		picture[yy][xx].setBounds(p,q, panel_2.getWidth()/castlewidth, panel_2.getHeight()/castleheight);
		panel_2.add(picture[yy][xx]);
	    prince.getImage();
		Image img1 = princess.getImage().getScaledInstance(now.getWidth(), now.getHeight(), Image.SCALE_DEFAULT);
		princess=new ImageIcon(img1);
		picture[yy][xx].setIcon(princess);
		picture[yy][xx].setVisible(true); 
		System.out.println("ans"+a);
		
		
		ImageIcon guardi = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/4.jpg")));
		//JLabel [] guard =new JLabel[guardnum];
		ImageIcon [] b = new ImageIcon[guardnum];
		Image img2;
		for(int i=0;i<guardnum;i++){
			a=random1.nextInt(castleheight*castlewidth);
			while(vis[a]==1) a=random1.nextInt(castleheight*castlewidth);
			p=(a%castlewidth)*(panel_2.getWidth()/castlewidth);
			q=(a/castlewidth)*(panel_2.getHeight()/castleheight);
			xx=a%castlewidth;
			yy=a/castlewidth;
			Map[yy][xx]=2;
			picture[yy][xx] = new JLabel();
			vis[a]=1;
			picture[yy][xx].setBounds(p,q , panel_2.getWidth()/castlewidth, panel_2.getHeight()/castleheight);
			panel_2.add(picture[yy][xx]);
		    prince.getImage();
			img2 = guardi.getImage().getScaledInstance(now.getWidth(), now.getHeight(), Image.SCALE_DEFAULT);
			b[i]=new ImageIcon(img2);
			picture[yy][xx].setIcon(b[i]);
			picture[yy][xx].setVisible(true); 
		}
		
		ImageIcon walli = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/1.jpg")));
		//JLabel [] wall =new JLabel[castlewidth*castleheight];
		ImageIcon [] c = new ImageIcon[castlewidth*castleheight];
		Image img3;
		for(int i=0;i<((castlewidth-1)*castleheight)/2 && i<castlewidth*castleheight-guardnum-2;i++){
			a=random1.nextInt(castleheight*castlewidth);
			while(vis[a]==1) a=random1.nextInt(castleheight*castlewidth);
			p=(a%castlewidth)*(panel_2.getWidth()/castlewidth);
			q=(a/castlewidth)*(panel_2.getHeight()/castleheight);
			xx=a%castlewidth;
			yy=a/castlewidth;
			Map[yy][xx]=3;
			picture[yy][xx] = new JLabel();
			vis[a]=1;
			picture[yy][xx].setBounds((a%castlewidth)*(panel_2.getWidth()/castlewidth),(a/castlewidth)*(panel_2.getHeight()/castleheight) , panel_2.getWidth()/castlewidth, panel_2.getHeight()/castleheight);
			panel_2.add(picture[yy][xx]);
		    prince.getImage();
			img3 = walli.getImage().getScaledInstance(now.getWidth(), now.getHeight(), Image.SCALE_DEFAULT);
			c[i]=new ImageIcon(img3);
			picture[yy][xx].setIcon(c[i]);
			picture[yy][xx].setVisible(true); 
			
		}
	}
	
	
	private class MoveListener extends KeyAdapter {
		int xx=x,yy=y;
		  @Override
		  public void keyPressed(KeyEvent e) {
			int sx=x/sizel,sy=y/sizeh;
			time--;
			
		   switch(e.getKeyCode()) {
		    case KeyEvent.VK_UP:
		     y -= sizeh;
		     txtGo.setText("Turn up");
		     break;
		    case KeyEvent.VK_DOWN:
		     y += sizeh;
		     txtGo.setText("Turn down");
		     break;
		    case KeyEvent.VK_LEFT:
		     x -= sizel;
		     txtGo.setText("Turn left");
		     break;
		    case KeyEvent.VK_RIGHT:
		     x += sizel;
		     txtGo.setText("Turn right");
		     break;
		    case KeyEvent.VK_I:
		    	txtGo.setText("Shit up");
			     while(Map[sy][sx]==0)sy--;
			     if(Map[sy][sx]==2){Map[sy][sx]=0;picture[sy][sx].setVisible(false);}
			     break;
		    case KeyEvent.VK_K:
		    	txtGo.setText("Shit down");
			     while(Map[sy][sx]==0)sy++;
			     if(Map[sy][sx]==2){Map[sy][sx]=0;picture[sy][sx].setVisible(false);}
			     break;

		    case KeyEvent.VK_J:
		    	txtGo.setText("Shit left");
			     while(Map[sy][sx]==0)sx--;
			     if(Map[sy][sx]==2){Map[sy][sx]=0;picture[sy][sx].setVisible(false);}
			     break;

		    case KeyEvent.VK_L:
		    	txtGo.setText("Shit right");
			     while(Map[sy][sx]==0)sx++;
			     if(Map[sy][sx]==2){Map[sy][sx]=0;picture[sy][sx].setVisible(false);}
			     break;
		   }
		   if(x<0 || x>panel_2.getWidth()-sizel || y<0 || y>panel_2.getHeight()-sizeh ||Map[y/sizeh][x/sizel]==3){x=xx;y=yy;}
		   System.out.println(Map[y/sizeh][x/sizel]);
		   txtTime.setText("Time:"+time);
		   if(Map[y/sizeh][x/sizel]==2){fail();}
		   xx=x;yy=y;
		   if(time<0)fail();
		   else if(Map[y/sizeh][x/sizel]==1) win();
		   
		   
			now.setBounds(x,y, sizel, sizeh);
		   System.out.println((panel_2.getWidth())+" "+(panel_2.getHeight())+" "+x+" "+y);
		  }
		
	 }
	private void win() {
		// TODO Auto-generated method stub
		panel_2.setVisible(false);
		txtGo.setText("You win");
		txtTime.setText("YOU WIN");
		String []s={"1.gif","4.gif","5.gif","14.jpg"};
		Random random1 = new Random();
		int a=random1.nextInt(4);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(152, 53, 479, 456);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/"+s[a]))));
		
		lblNewLabel_2.setVisible(true);
		panel.requestFocus();
	}
	private void fail() {
		// TODO Auto-generated method stub
		panel_2.setVisible(false);
		txtGo.setText("Game over");
		txtTime.setText("GAME OVER");
		String []s={"1.jpeg","2.gif","9.jpg","3.gif","6.gif"};
		Random random1 = new Random();
		int a=random1.nextInt(5);
		System.out.println(a);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(152, 53, 479, 456);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/"+s[a]))));
		lblNewLabel_2.setVisible(true);
		panel.requestFocus();
	}
}
