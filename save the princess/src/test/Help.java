package test;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Help extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Help() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/10.jpg")));
		setTitle("Help");
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().width;
    	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().height;
    	int windowwidth=400;
    	int windowheight=420;
    	//setLocation((screenWidth-windowwidth)/2,(screenHeight-windowheight)/2);
		setBounds((screenWidth-windowwidth)/2,(screenHeight-windowheight)/2, windowwidth, windowheight);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 25, 81, 59);
		ImageIcon prince = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/2.png")));
	    prince.getImage();
		Image img = prince.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT);
		prince=new ImageIcon(img);
		lblNewLabel.setIcon(prince);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(24, 101, 81, 59);
		ImageIcon princess = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/12.jpg")));
	    prince.getImage();
		Image img1 = princess.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_DEFAULT);
		princess=new ImageIcon(img1);
		lblNewLabel_1.setIcon(princess);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u8FD9\u4E2A\u662F\u4F60");
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setBounds(137, 41, 70, 23);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8FD9\u4E2A\u662F\u516C\u4E3B");
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
		label_1.setBounds(137, 117, 101, 23);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(24, 180, 81, 70);
		ImageIcon turn = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/4.png")));
	    prince.getImage();
		Image img2 = turn.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_DEFAULT);
		turn=new ImageIcon(img2);
		lblNewLabel_2.setIcon(turn);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_2 = new JLabel("\u4E0A\u4E0B\u5DE6\u53F3\u79FB\u52A8");
		label_2.setFont(new Font("宋体", Font.PLAIN, 15));
		label_2.setBounds(137, 204, 101, 23);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(24, 275, 81, 70);
		ImageIcon shit = new ImageIcon(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/picture/5.png")));
	    prince.getImage();
		Image img3 = shit.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_DEFAULT);
		shit=new ImageIcon(img3);
		lblNewLabel_3.setIcon(shit);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_3 = new JLabel("\u4E0A\u4E0B\u5DE6\u53F3\u5C04\u51FB");
		label_3.setFont(new Font("宋体", Font.PLAIN, 15));
		label_3.setBounds(137, 299, 101, 23);
		contentPane.add(label_3);
	}

}
