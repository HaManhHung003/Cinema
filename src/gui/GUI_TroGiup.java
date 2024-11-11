package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
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
import javax.swing.JButton;
import component.nut_gradient;
import javax.swing.JTextArea;

public class GUI_TroGiup extends JPanel{
	private JLabel title,name,phone,email,name_txt,phone_txt,email_txt,name_icon,phone_icon,email_icon;
	private JLabel book_img1,book_img2,book_img3,book_img4,book_img5,staff_img1,staff_img2,staff_img3,staff_img4,staff_img5,staff_img6;
	private JScrollPane scroll_book,scroll_staff;
	private JPanel book_pnl,staff_pnl;
	private ScrollBarCustom book_Sb,staff_sb;
	private nut_gradient book_btn,staff_btn;
	private GradientPaint mau_gradient1,mau_gradient2;
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
		
		Point2D.Double p1 = new Point2D.Double(50, 50); 
		Point2D.Double p2 = new Point2D.Double(100, 50); 
		mau_gradient1 = new GradientPaint(p1,new Color(255,80,67),p2,new Color(255,130,62));
		mau_gradient2 = new GradientPaint(p1,new Color(217,217,217),p2,new Color(217,217,217));
		
		scroll_staff  = new JScrollPane();
		staff_sb = new ScrollBarCustom();
		staff_sb.setUnitIncrement(30);
		staff_sb.setForeground(new Color(166, 186, 188));
		scroll_staff.setVerticalScrollBar(staff_sb);
		scroll_staff.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll_staff.setViewportBorder(null);
		scroll_staff.getVerticalScrollBar().setBorder(null);
		scroll_staff.getHorizontalScrollBar().setBorder(null);
		scroll_staff.setBorder(null);
		scroll_staff.setBounds(30, 131, 1098, 574);
		add(scroll_staff);
		
		staff_pnl = new JPanel();
		staff_pnl.setBackground(new Color(36, 34, 34));
		scroll_staff.setViewportView(staff_pnl);
		staff_pnl.setLayout(null);
		staff_pnl.setPreferredSize(new Dimension(216,3597));
		
		staff_img1 = new JLabel("");
		staff_img1.setBounds(50, 25, 971, 510);
		staff_img1.setIcon(new ImageIcon("src\\resources\\Image\\help\\staff_1.png"));
		staff_pnl.add(staff_img1);
		
		staff_img2 = new JLabel("");
		staff_img2.setOpaque(false);
		staff_img2.setBounds(50, 597, 971, 510);
		staff_img2.setIcon(new ImageIcon("src\\resources\\Image\\help\\staff_2.png"));
		staff_pnl.add(staff_img2);
		
		staff_img3 = new JLabel("");
		staff_img3.setOpaque(false);
		staff_img3.setBounds(50, 1169, 971, 510);
		staff_img3.setIcon(new ImageIcon("src\\resources\\Image\\help\\staff_3.png"));
		staff_pnl.add(staff_img3);
		
		staff_img4 = new JLabel("");
		staff_img4.setOpaque(false);
		staff_img4.setBounds(50, 1741, 971, 510);
		staff_img4.setIcon(new ImageIcon("src\\resources\\Image\\help\\staff_4.png"));
		staff_pnl.add(staff_img4);
		
		staff_img5 = new JLabel("");
		staff_img5.setOpaque(false);
		staff_img5.setBounds(50, 2313, 971, 510);
		staff_img5.setIcon(new ImageIcon("src\\resources\\Image\\help\\staff_5.png"));
		staff_pnl.add(staff_img5);
		
		staff_img6 = new JLabel("");
		staff_img6.setOpaque(false);
		staff_img6.setBounds(50, 3025, 971, 510);
		staff_img6.setIcon(new ImageIcon("src\\resources\\Image\\help\\staff_6.png"));
		staff_pnl.add(staff_img6);
		scroll_staff.setVisible(false);
		
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
		name_txt.setBounds(114, 38, 239, 27);
		add(name_txt);
		
		phone = new JLabel("Số điện thoại : ");
		phone.setForeground(new Color(254, 114, 67));
		phone.setFont(Dosis_Bold_21);
		phone.setBounds(56, 66, 120, 27);
		add(phone);
		
		phone_txt = new JLabel("0987654321");
		phone_txt.setForeground(new Color(255, 255, 255));
		phone_txt.setFont(Dosis_Bold_21);
		phone_txt.setBounds(173, 66, 209, 27);
		add(phone_txt);
		
		email = new JLabel("Email : ");
		email.setForeground(new Color(254, 114, 67));
		email.setFont(Dosis_Bold_21);
		email.setBounds(56, 93, 120, 27);
		add(email);
		
		email_txt = new JLabel(" nguyenhoangson@gmail.com");
		email_txt.setForeground(new Color(255, 255, 255));
		email_txt.setFont(Dosis_Bold_21);
		email_txt.setBounds(110, 93, 254, 27);
		add(email_txt);
		
		name_icon = new JLabel("New label");
		name_icon.setIcon(new ImageIcon("src\\resources\\Icon\\contact_name.png"));
		name_icon.setBounds(31, 44, 16, 16);
		add(name_icon);
		
		phone_icon = new JLabel("New label");
		phone_icon.setBounds(30, 72, 16, 16);
		phone_icon.setIcon(new ImageIcon("src\\resources\\Icon\\contact_phone.png"));
		add(phone_icon);
		
		email_icon = new JLabel("New label");
		email_icon.setBounds(31, 99, 16, 16);
		email_icon.setIcon(new ImageIcon("src\\resources\\Icon\\contact_email.png"));
		add(email_icon);
		
		book_btn = new nut_gradient("Đặt vé",mau_gradient1);
		book_btn.setRadius(10);
		book_btn.setFont(Dosis_Bold_21);
		book_btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book_btn.setBounds(363, 66, 108, 49);
		add(book_btn);
		
		staff_btn = new nut_gradient("Nhân viên",mau_gradient2);
		staff_btn.setRadius(10);
		staff_btn.setFont(Dosis_Bold_21);
		staff_btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		staff_btn.setBounds(514, 66, 108, 49);
		add(staff_btn);
		
		scroll_book  = new JScrollPane();
		book_Sb = new ScrollBarCustom();
		book_Sb.setUnitIncrement(30);
		book_Sb.setForeground(new Color(166, 186, 188));
        scroll_book.setVerticalScrollBar(book_Sb);
        scroll_book.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll_book.setViewportBorder(null);
        scroll_book.getVerticalScrollBar().setBorder(null);
        scroll_book.getHorizontalScrollBar().setBorder(null);
        scroll_book.setBorder(null);
        scroll_book.setBounds(30, 131, 1098, 574);
		add(scroll_book);
		
		book_pnl = new JPanel();
		book_pnl.setBackground(new Color(36, 34, 34));
		scroll_book.setViewportView(book_pnl);
		book_pnl.setLayout(null);
		book_pnl.setPreferredSize(new Dimension(216,3025));
		
		book_img1 = new JLabel("");
		book_img1.setOpaque(false);
		book_img1.setBounds(50, 25, 971, 510);
		book_img1.setIcon(new ImageIcon("src\\resources\\Image\\help\\book_1.png"));
		book_pnl.add(book_img1);
		
		book_img2 = new JLabel("");
		book_img2.setOpaque(false);
		book_img2.setBounds(50, 597, 971, 510);
		book_img2.setIcon(new ImageIcon("src\\resources\\Image\\help\\book_2.png"));
		book_pnl.add(book_img2);
		
		book_img3 = new JLabel("");
		book_img3.setOpaque(false);
		book_img3.setBounds(50, 1169, 971, 510);
		book_img3.setIcon(new ImageIcon("src\\resources\\Image\\help\\book_3.png"));
		book_pnl.add(book_img3);
		
		book_img4 = new JLabel("");
		book_img4.setOpaque(false);
		book_img4.setBounds(50, 1741, 971, 510);
		book_img4.setIcon(new ImageIcon("src\\resources\\Image\\help\\book_4.png"));
		book_pnl.add(book_img4);
		
		book_img5 = new JLabel("");
		book_img5.setOpaque(false);
		book_img5.setBounds(50, 2313, 971, 510);
		book_img5.setIcon(new ImageIcon("src\\resources\\Image\\help\\book_5.png"));
		book_pnl.add(book_img5);
		
		scroll_book.setVisible(true);
		
		book_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				book_btn.setGradient(mau_gradient1);
				staff_btn.setGradient(mau_gradient2);
				scroll_book.setVisible(true);
				scroll_staff.setVisible(false);
				book_btn.repaint();
				staff_btn.repaint();
			}
		});
		
		staff_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				staff_btn.setGradient(mau_gradient1);
				book_btn.setGradient(mau_gradient2);
				scroll_book.setVisible(false);
				scroll_staff.setVisible(true);
				book_btn.repaint();
				staff_btn.repaint();
			}
		});
	
	}
}
