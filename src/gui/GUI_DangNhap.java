package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import connectDB.JDBCUtil;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GUI_DangNhap extends JFrame{
	private JFrame frame;
	private JPanel panel,pass_pnl;
	private JLabel logo,hiddenPass,background;
	private JButton logIn;
	private JTextField account;
	private JPasswordField pass_txtf;
	private Connection conn = JDBCUtil.getConnection();
	public GUI_DangNhap() throws FontFormatException, IOException{
		setResizable(false);
		setSize(1457,820);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_15 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(15f);
		Font Dosis_Bold_10 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(10f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(20f);
		
		panel = new JPanel();
		panel.setBounds(551, 157, 361, 406);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("src\\resources\\Image\\logo.png"));
		logo.setBounds(73, 24, 213, 103);
		panel.add(logo);
		
		JPanel account_pnl = new JPanel();
		account_pnl.setBackground(new Color(215, 215, 215));
		account_pnl.setBounds(34, 150, 299, 62);
		panel.add(account_pnl);
		account_pnl.setLayout(null);
		account_pnl.setFocusable(true);
		
		account = new JTextField();
		account.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(account.getText().equals("Mã nhân viên")) {
					account.setText("");
					account.setForeground(new Color(153,153,153));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(account.getText().equals("")) {
					account.setText("Mã nhân viên");
					account.setForeground(new Color(153,153,153));
				}
			}
		});
		account.setBounds(10, 0, 248, 62);
		account_pnl.add(account);
		account.setBorder(null);
		account.setBackground(new Color(215, 215, 215));
		account.setForeground(new Color(153,153,153));
		account.setFont(Dosis_Regular);
		account.setText("Mã nhân viên");
		account.setColumns(10);
		
		pass_pnl = new JPanel();
		pass_pnl.setBackground(new Color(215, 215, 215));
		pass_pnl.setBounds(34, 249, 299, 62);
		panel.add(pass_pnl);
		pass_pnl.setLayout(null);
		
		hiddenPass = new JLabel("");
		hiddenPass.setIcon(new ImageIcon("src\\resources\\Icon\\hidePass.png"));
		hiddenPass.setBounds(264, 19, 24, 24);
		pass_pnl.add(hiddenPass);
		
		pass_txtf = new JPasswordField();
		pass_txtf.setEchoChar('\u0000');
		pass_txtf.setForeground(new Color(153,153,153));
		pass_txtf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				char[] pass = pass_txtf.getPassword();
				String Pass = new String(pass);
				if(Pass.equals("Mật khẩu")) {
					pass_txtf.setText("");
					pass_txtf.setForeground(new Color(153,153,153));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				char[] pass = pass_txtf.getPassword();
				String Pass = new String(pass);
				if(Pass.equals("")) {
					pass_txtf.setText("Mật khẩu");
					pass_txtf.setForeground(new Color(153,153,153));
				}
			}
		});
		pass_txtf.setBorder(null);
		pass_txtf.setBackground(new Color(215, 215, 215));
		pass_txtf.setBounds(10, 0, 248, 62);
		pass_pnl.add(pass_txtf);
		pass_txtf.setText("Mật khẩu");
		pass_txtf.setFont(Dosis_Regular);
		pass_txtf.setColumns(10);
		
		logIn = new JButton("Đăng nhập");
		logIn.setForeground(new Color(255, 255, 255));
		logIn.setBorder(null);
		logIn.setBackground(new Color(255, 78, 67));
		logIn.setFont(Dosis_Bold_20);
		logIn.setBounds(34, 336, 299, 45);
		panel.add(logIn);

		
		logIn.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        try {
		        	String Acc = account.getText();
		        	char[] matkhau = pass_txtf.getPassword();
		        	String Pass = new String(matkhau);
		        	try (CallableStatement stmt = conn.prepareCall("{CALL CheckLogin(?,?)}")) {
		                stmt.setString(1, Acc);
		                stmt.setString(2, Pass);
		                ResultSet rs = stmt.executeQuery();

		                if (rs.next()) {
		                    String result = rs.getString("Result");
		                    if ("khop".equals(result)) {
		                    	GUI_Man_hinh_chinh main_screen = new GUI_Man_hinh_chinh(); 
		    					main_screen.setVisible(true);
		    					dispose();
		    					JDBCUtil.closeConnection(); 
		                    } else {
		                        System.out.println("khongKhop");
		                    }
		                }
		            } catch (SQLException e2) {
		                e2.printStackTrace();
		            } 
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		});
		
		hiddenPass.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	if ( pass_txtf.getEchoChar() != '\u0000' ) {
		    		pass_txtf.setEchoChar('\u0000');
		    	} else {
		    		pass_txtf.setEchoChar('*');
		    	}
		    }
		});
		
		pass_txtf.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	pass_txtf.setEchoChar('*');
		    }
		});
		
		background = new JLabel("");
		background.setBounds(0, 0, 1820, 781);
		background.setIcon(new ImageIcon("src\\resources\\Image\\logInBackground2.png"));
		getContentPane().add(background);
		
	}
}
