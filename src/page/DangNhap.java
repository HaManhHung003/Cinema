package page;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DangNhap extends JFrame{
	private JFrame frame;
	private JPanel panel,pass_pnl;
	private JLabel logo,hiddenPass,background;
	private JButton logIn;
	private JTextField account,pass_txtf;
	public DangNhap() throws FontFormatException, IOException{
		frame = new JFrame();
		frame.setSize(1457,1063);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_15 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(15f);
		Font Dosis_Bold_10 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(10f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(20f);
		
		panel = new JPanel();
		panel.setBounds(514, 281, 412, 463);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("src\\resources\\Image\\logo.png"));
		logo.setBounds(105, 23, 213, 103);
		panel.add(logo);
		
		account = new JTextField();
		account.setBorder(null);
		account.setBackground(new Color(215, 215, 215));
		account.setFont(Dosis_Regular);
		account.setText("Mã nhân viên");
		account.setBounds(35, 173, 342, 62);
		panel.add(account);
		account.setColumns(10);
		
		logIn = new JButton("Đăng nhập");
		logIn.setForeground(new Color(255, 255, 255));
		logIn.setBorder(null);
		logIn.setBackground(new Color(255, 78, 67));
		logIn.setFont(Dosis_Bold_20);
		logIn.setBounds(35, 360, 342, 45);
		panel.add(logIn);
		
		pass_pnl = new JPanel();
		pass_pnl.setBounds(35, 262, 342, 62);
		panel.add(pass_pnl);
		pass_pnl.setLayout(null);
		
		hiddenPass = new JLabel("New label");
		hiddenPass.setIcon(new ImageIcon("src\\resources\\Icon\\hidePass.png"));
		hiddenPass.setBounds(303, 23, 24, 24);
		pass_pnl.add(hiddenPass);
		
		pass_txtf = new JTextField();
		pass_txtf.setBorder(null);
		pass_txtf.setBackground(new Color(215, 215, 215));
		pass_txtf.setBounds(0, 0, 342, 62);
		pass_pnl.add(pass_txtf);
		pass_txtf.setText("Mật khẩu");
		pass_txtf.setFont(Dosis_Regular);
		pass_txtf.setColumns(10);
		
		background = new JLabel("");
		background.setBounds(0, 0, 1820, 1024);
		background.setIcon(new ImageIcon("src\\resources\\Image\\logInBackground.png"));
		frame.getContentPane().add(background);
	}
	
	public static void main(String[] args) throws FontFormatException, IOException {
		DangNhap lg = new DangNhap();
		lg.frame.setVisible(true);
		lg.frame.setResizable(false);
	}
}
