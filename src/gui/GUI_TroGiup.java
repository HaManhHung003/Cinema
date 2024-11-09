package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import connectDB.JDBCUtil;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import component.ModernScrollBarUI;
import component.ScrollBarCustom;

public class GUI_TroGiup extends JPanel{
	private JLabel title,name,phone,email,name_txt,phone_txt,email_txt,name_icon,phone_icon,email_icon;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JLabel name_icon_1;
	private JLabel name_icon_2;
	public GUI_TroGiup() throws FontFormatException, IOException {
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_21 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(18f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		scrollPane  = new JScrollPane();
		ScrollBarCustom sb = new ScrollBarCustom();
        sb.setUnitIncrement(30);
        sb.setForeground(new Color(200, 213, 214));
		scrollPane.setVerticalScrollBar(sb);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setViewportBorder(null);
		scrollPane.getVerticalScrollBar().setBorder(null);
		scrollPane.getHorizontalScrollBar().setBorder(null);
		scrollPane.setBorder(null);
		scrollPane.setBounds(30, 131, 1098, 574);
		add(scrollPane);
		
		
		
		panel = new JPanel();
		panel.setBackground(new Color(36, 34, 34));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(216,1200));
		
		title = new JLabel("THÔNG TIN LIÊN HỆ");
		title.setBounds(30, 11, 317, 27);
		title.setForeground(new Color(254, 114, 67));
		title.setFont(Dosis_Bold_20);
		add(title);
		
		name = new JLabel("Quản lí :");
		name.setForeground(new Color(254, 114, 67));
		name.setFont(Dosis_Bold_21);
		name.setBounds(56, 38, 68, 27);
		add(name);
		
		name_txt = new JLabel(" Nguyễn Hoàng Sơn");
		name_txt.setForeground(new Color(255, 255, 255));
		name_txt.setFont(Dosis_Bold_21);
		name_txt.setBounds(114, 38, 317, 27);
		add(name_txt);
		
		phone = new JLabel("Số điện thoại : ");
		phone.setForeground(new Color(254, 114, 67));
		phone.setFont(Dosis_Bold_21);
		phone.setBounds(56, 66, 120, 27);
		add(phone);
		
		phone_txt = new JLabel("0987654321");
		phone_txt.setForeground(new Color(255, 255, 255));
		phone_txt.setFont(Dosis_Bold_21);
		phone_txt.setBounds(173, 66, 317, 27);
		add(phone_txt);
		
		email = new JLabel("Email : ");
		email.setForeground(new Color(254, 114, 67));
		email.setFont(Dosis_Bold_21);
		email.setBounds(56, 93, 120, 27);
		add(email);
		
		email_txt = new JLabel(" nguyenhoangson@gmail.com");
		email_txt.setForeground(new Color(255, 255, 255));
		email_txt.setFont(Dosis_Bold_21);
		email_txt.setBounds(110, 93, 317, 27);
		add(email_txt);
		
		name_icon = new JLabel("New label");
		name_icon.setIcon(new ImageIcon("src\\Resources\\Icon\\contact_name.png"));
		name_icon.setBounds(31, 44, 16, 16);
		add(name_icon);
		
		phone_icon = new JLabel("New label");
		phone_icon.setBounds(30, 72, 16, 16);
		phone_icon.setIcon(new ImageIcon("src\\Resources\\Icon\\contact_phone.png"));
		add(phone_icon);
		
		email_icon = new JLabel("New label");
		email_icon.setBounds(31, 99, 16, 16);
		email_icon.setIcon(new ImageIcon("src\\Resources\\Icon\\contact_email.png"));
		add(email_icon);
	
	}
}
