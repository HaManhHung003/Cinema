package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import component.MyPanel;

public class GUI_Man_hinh_chinh extends JFrame{
	private JPanel menu_pnl,main_pnl,inform_pnl,header_pnl;
	private JLabel logo,menu_title,home_icon,home_label,bookTicket_icon,bookTicket_label,sale_icon,sale_label,staff_icon,staff_label,customer_icon,customer_label,statistic_icon,statistic_label,help_icon,help_label,logOut_icon,logOut_label,avatar,search_icon,back_icon,back_label,clear_label,search_icon2,close_icon;
	private JTextField find_container,find_container2; 
	private Color black;
	public static CardLayout cardLayout;
	public static final long serialVersionUID = 1L;
	private JPanel[] panels;
	private JLabel add_icon,add_label,update_icon,update_label,remove_icon,remove_label;
	private MyPanel home_pnl,bookTicket_pnl,sale_pnl,staff_pnl,customer_pnl,statistic_pnl,help_pnl,logOut_pnl,staffFind_pnl,filmFind_pnl,back_pnl,clear_pnl,add_pnl,update_pnl,remove_pnl;
	public GUI_Man_hinh_chinh() throws FontFormatException, IOException {
		setSize(1425,820);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(18f);
		Font Dosis_Bold_22 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(22f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);

		menu_pnl = new JPanel();
		menu_pnl.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(45, 45, 45)));
		menu_pnl.setBackground(new Color(36, 34, 34));
		menu_pnl.setBounds(0, 0, 280, 781);
		getContentPane().add(menu_pnl);
		menu_pnl.setLayout(null);
		
		logo = new JLabel("");
		logo.setIconTextGap(0);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("src\\resources\\Image\\smallLogo.png"));
		logo.setBounds(28, 11, 177, 59);
		menu_pnl.add(logo);
		
		menu_title = new JLabel("Menu");
		menu_title.setForeground(new Color(178, 176, 176));
		menu_title.setFont(Dosis_Bold_22);
		menu_title.setBounds(44, 81, 82, 32);
		menu_pnl.add(menu_title);
		
		home_pnl = new MyPanel();
		home_pnl.setColor(new Color(171, 27, 27));;
		home_pnl.setRadius(50);
		home_pnl.setBorderColor(new Color(36, 34, 34));
		home_pnl.setColorOver(new Color(171, 27, 27));
		home_pnl.setColorClick(new Color(138,11,11));
		home_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home_pnl.setBounds(22, 124, 235, 50);
		menu_pnl.add(home_pnl);
		home_pnl.setLayout(null);
		
		home_icon = new JLabel("");
		home_icon.setIcon(new ImageIcon("src\\resources\\Icon\\home.png"));
		home_icon.setIconTextGap(0);
		home_icon.setHorizontalAlignment(SwingConstants.CENTER);
		home_icon.setBounds(22, 11, 28, 28);
		home_pnl.add(home_icon);
		
		home_label = new JLabel("Trang chủ");
		home_label.setForeground(new Color(255, 238, 231));
		home_label.setHorizontalAlignment(SwingConstants.LEFT);
		home_label.setFont(Dosis_Bold_22);
		home_label.setBounds(64, 0, 171, 50);
		home_pnl.add(home_label);
		
		bookTicket_pnl = new MyPanel();
		bookTicket_pnl.setLayout(null);
		bookTicket_pnl.setColor(new Color(36, 34, 34));;
		bookTicket_pnl.setRadius(50);
		bookTicket_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bookTicket_pnl.setBorderColor(new Color(36, 34, 34));
		bookTicket_pnl.setColorOver(new Color(171, 27, 27));
		bookTicket_pnl.setColorClick(new Color(138, 11, 11));
		bookTicket_pnl.setBounds(22, 209, 235, 50);
		menu_pnl.add(bookTicket_pnl);
		
		bookTicket_icon = new JLabel("");
		bookTicket_icon.setBounds(23, 11, 28, 28);
		bookTicket_pnl.add(bookTicket_icon);
		bookTicket_icon.setIcon(new ImageIcon("src\\resources\\Icon\\bookTicket.png"));
		bookTicket_icon.setIconTextGap(0);
		bookTicket_icon.setHorizontalAlignment(SwingConstants.CENTER);
		
		bookTicket_label = new JLabel("Đặt vé");
		bookTicket_label.setHorizontalAlignment(SwingConstants.LEFT);
		bookTicket_label.setForeground(new Color(255, 238, 231));
		bookTicket_label.setFont(Dosis_Bold_22);
		bookTicket_label.setBounds(65, 0, 170, 50);
		bookTicket_pnl.add(bookTicket_label);
		
		sale_pnl = new MyPanel();
		sale_pnl.setLayout(null);
		sale_pnl.setColor(new Color(36, 34, 34));;
		sale_pnl.setRadius(50);
		sale_pnl.setBorderColor(new Color(36, 34, 34));
		sale_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sale_pnl.setColorOver(new Color(171, 27, 27));
		sale_pnl.setColorClick(new Color(138, 11, 11));
		sale_pnl.setBounds(22, 294, 235, 50);
		menu_pnl.add(sale_pnl);
		
		sale_icon = new JLabel("");
		sale_icon.setIcon(new ImageIcon("src\\resources\\Icon\\sale.png"));
		sale_icon.setForeground(new Color(64, 0, 128));
		sale_icon.setBounds(22, 11, 33, 28);
		sale_pnl.add(sale_icon);
		
		sale_label = new JLabel("Khuyến mãi");
		sale_label.setBackground(new Color(255, 255, 255));
		sale_label.setHorizontalAlignment(SwingConstants.LEFT);
		sale_label.setForeground(new Color(255, 238, 231));
		sale_label.setFont(Dosis_Bold_22);
		sale_label.setBounds(70, 0, 165, 50);
		sale_pnl.add(sale_label);
		
		staff_pnl = new MyPanel();
		staff_pnl.setLayout(null);
		staff_pnl.setColor(new Color(36, 34, 34));
		staff_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		staff_pnl.setRadius(50);
		staff_pnl.setBorderColor(new Color(36, 34, 34));
		staff_pnl.setColorOver(new Color(171, 27, 27));
		staff_pnl.setColorClick(new Color(138, 11, 11));
		staff_pnl.setBounds(22, 379, 235, 50);
		menu_pnl.add(staff_pnl);
		
		staff_icon = new JLabel("");
		staff_icon.setIcon(new ImageIcon("src\\resources\\Icon\\staff.png"));
		staff_icon.setForeground(new Color(64, 0, 128));
		staff_icon.setBounds(22, 11, 28, 28);
		staff_pnl.add(staff_icon);
		
		staff_label = new JLabel("Nhân viên");
		staff_label.setHorizontalAlignment(SwingConstants.LEFT);
		staff_label.setForeground(new Color(255, 238, 231));
		staff_label.setFont(Dosis_Bold_22);
		staff_label.setBounds(64, 0, 171, 50);
		staff_pnl.add(staff_label);
		
		customer_pnl = new MyPanel();
		customer_pnl.setLayout(null);
		customer_pnl.setColor(new Color(36, 34, 34));
		customer_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		customer_pnl.setRadius(50);
		customer_pnl.setBorderColor(new Color(36, 34, 34));
		customer_pnl.setColorOver(new Color(171, 27, 27));
		customer_pnl.setColorClick(new Color(138, 11, 11));
		customer_pnl.setBounds(22, 464, 235, 50);
		menu_pnl.add(customer_pnl);
		
		customer_icon = new JLabel("");
		customer_icon.setIcon(new ImageIcon("src\\resources\\Icon\\customer.png"));
		customer_icon.setForeground(new Color(64, 0, 128));
		customer_icon.setBounds(22, 11, 28, 28);
		customer_pnl.add(customer_icon);
		
		customer_label = new JLabel("Khách hàng");
		customer_label.setHorizontalAlignment(SwingConstants.LEFT);
		customer_label.setForeground(new Color(255, 238, 231));
		customer_label.setFont(Dosis_Bold_22);
		customer_label.setBounds(64, 0, 171, 50);
		customer_pnl.add(customer_label);
		
		statistic_pnl = new MyPanel();
		statistic_pnl.setLayout(null);
		statistic_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		statistic_pnl.setColor(new Color(36, 34, 34));;
		statistic_pnl.setRadius(50);
		statistic_pnl.setBorderColor(new Color(36, 34, 34));
		statistic_pnl.setColorOver(new Color(171, 27, 27));
		statistic_pnl.setColorClick(new Color(138, 11, 11));
		statistic_pnl.setBounds(22, 549, 235, 50);
		menu_pnl.add(statistic_pnl);
		
		statistic_icon = new JLabel("");
		statistic_icon.setIcon(new ImageIcon("src\\resources\\Icon\\statistic.png"));
		statistic_icon.setForeground(new Color(64, 0, 128));
		statistic_icon.setBounds(22, 11, 28, 28);
		statistic_pnl.add(statistic_icon);
		
		statistic_label = new JLabel("Thống kê");
		statistic_label.setHorizontalAlignment(SwingConstants.LEFT);
		statistic_label.setForeground(new Color(255, 238, 231));
		statistic_label.setFont(Dosis_Bold_22);
		statistic_label.setBounds(64, 0, 171, 50);
		statistic_pnl.add(statistic_label);
		
		help_pnl = new MyPanel();
		help_pnl.setLayout(null);
		help_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		help_pnl.setColor(new Color(36, 34, 34));;
		help_pnl.setRadius(50);
		help_pnl.setBorderColor(new Color(36, 34, 34));
		help_pnl.setColorOver(new Color(171, 27, 27));
		help_pnl.setColorClick(new Color(138, 11, 11));
		help_pnl.setBounds(22, 634, 235, 50);
		menu_pnl.add(help_pnl);
		
		help_icon = new JLabel("");
		help_icon.setIcon(new ImageIcon("src\\resources\\Icon\\help.png"));
		help_icon.setForeground(new Color(64, 0, 128));
		help_icon.setBounds(22, 11, 28, 28);
		help_pnl.add(help_icon);
		
		help_label = new JLabel("Trợ giúp");
		help_label.setHorizontalAlignment(SwingConstants.LEFT);
		help_label.setForeground(new Color(255, 238, 231));
		help_label.setFont(Dosis_Bold_22);
		help_label.setBounds(64, 0, 171, 50);
		help_pnl.add(help_label);
		
		logOut_pnl = new MyPanel();
		logOut_pnl.setLayout(null);
		logOut_pnl.setColor(new Color(36, 34, 34));
		logOut_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut_pnl.setRadius(50);
		logOut_pnl.setBorderColor(new Color(178, 176, 176));
		logOut_pnl.setColorOver(new Color(36, 34, 34));
		logOut_pnl.setColorClick(new Color(36, 34, 34));
		logOut_pnl.setBounds(22, 719, 235, 50);
		menu_pnl.add(logOut_pnl);
		
		logOut_icon = new JLabel("");
		logOut_icon.setIcon(new ImageIcon("src\\resources\\Icon\\logOut.png"));
		logOut_icon.setForeground(new Color(64, 0, 128));
		logOut_icon.setBounds(22, 11, 28, 28);
		logOut_pnl.add(logOut_icon);
		
		logOut_label = new JLabel("Đăng xuất");
		logOut_label.setBorder(null);
		logOut_label.setHorizontalAlignment(SwingConstants.LEFT);
		logOut_label.setForeground(new Color(255, 238, 231));
		logOut_label.setFont(Dosis_Bold_22);
		logOut_label.setBounds(64, 0, 171, 50);
		logOut_pnl.add(logOut_label);
		
		main_pnl = new JPanel();
		main_pnl.setBackground(new Color(36, 34, 34));
		main_pnl.setBounds(280, 0, 1129, 781);
		getContentPane().add(main_pnl);
		main_pnl.setLayout(null);
		
		header_pnl = new JPanel();
		header_pnl.setBackground(new Color(36, 34, 34));
		header_pnl.setBounds(0, 0, 1128, 76);
		header_pnl.setFocusable(true);
		main_pnl.add(header_pnl);
		header_pnl.setLayout(null);
		
		filmFind_pnl = new MyPanel();
		filmFind_pnl.setOpaque(false);
		filmFind_pnl.setBounds(745, 15, 274, 44);
		filmFind_pnl.setColor(new Color(36, 34, 34));
		filmFind_pnl.setRadius(30);
		filmFind_pnl.setBorderColor(new Color(110, 110, 110));
		filmFind_pnl.setColorOver(new Color(36, 34, 34));
		filmFind_pnl.setColorClick(new Color(36, 34, 34));
		header_pnl.add(filmFind_pnl);
		filmFind_pnl.setLayout(null);
		
		search_icon2 = new JLabel("");
		search_icon2.setBounds(7, 7, 30, 30);
		filmFind_pnl.add(search_icon2);
		search_icon2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search_icon2.setIcon(new ImageIcon("src\\resources\\Icon\\search2.png"));
		search_icon2.setIconTextGap(0);
		search_icon2.setHorizontalAlignment(SwingConstants.CENTER);
		
		close_icon = new JLabel("");
		close_icon.setBounds(232, 10, 24, 24);
		filmFind_pnl.add(close_icon);
		close_icon.setIconTextGap(0);
		close_icon.setIcon(new ImageIcon("src\\resources\\Icon\\close.png"));
		close_icon.setHorizontalAlignment(SwingConstants.CENTER);
		close_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		find_container2 = new JTextField();
		find_container2.setBorder(null);
		find_container2.setBounds(0, 0, 274, 44);
		filmFind_pnl.add(find_container2);
		find_container2.setText("Tìm kiếm phim");
		find_container2.setOpaque(false);
		find_container2.setHorizontalAlignment(SwingConstants.CENTER);
		find_container2.setFont(Dosis_Bold_20);
		find_container2.setForeground(new Color(178, 176, 176));
		find_container2.setColumns(10);
		
		staffFind_pnl = new MyPanel();
		staffFind_pnl.setOpaque(false);
		staffFind_pnl.setBounds(795, 15, 224, 44);
		staffFind_pnl.setColor(new Color(36, 34, 34));
		staffFind_pnl.setRadius(30);
		staffFind_pnl.setBorderColor(new Color(110, 110, 110));
		staffFind_pnl.setColorOver(new Color(36, 34, 34));
		staffFind_pnl.setColorClick(new Color(36, 34, 34));
		header_pnl.add(staffFind_pnl);
		staffFind_pnl.setLayout(null);
		
		search_icon = new JLabel("");
		search_icon.setBounds(7, 7, 30, 30);
		staffFind_pnl.add(search_icon);
		
		search_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search_icon.setIcon(new ImageIcon("src\\resources\\Icon\\search2.png"));
		search_icon.setIconTextGap(0);
		search_icon.setHorizontalAlignment(SwingConstants.CENTER);
		
		find_container = new JTextField();
		find_container.setBorder(null);
		find_container.setBounds(0, 0, 224, 44);
		staffFind_pnl.add(find_container);
		find_container.setOpaque(false);
		find_container.setText("Tìm kiếm nhân viên");
		find_container.setHorizontalAlignment(SwingConstants.CENTER);
		find_container.setFont(Dosis_Bold_20);
		find_container.setForeground(new Color(178, 176, 176));
		find_container.setColumns(10);
		
		avatar = new JLabel("");
		avatar.setIcon(new ImageIcon("src\\resources\\Image\\subLogo.png"));
		avatar.setIconTextGap(0);
		avatar.setHorizontalAlignment(SwingConstants.CENTER);
		avatar.setBounds(1052, 11, 55, 55);
		header_pnl.add(avatar);
		
		back_pnl = new MyPanel();
		back_pnl.setOpaque(false);
		back_pnl.setColor(new Color(36, 34, 34));
		back_pnl.setRadius(25);
		back_pnl.setBorderColor(new Color(110, 110, 110));
		back_pnl.setColorOver(new Color(36, 34, 34));
		back_pnl.setColorClick(new Color(36, 34, 34));
		back_pnl.setBounds(30, 15, 124, 44);
		header_pnl.add(back_pnl);
		back_pnl.setLayout(null);
		
		back_icon = new JLabel("");
		back_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back_icon.setIcon(new ImageIcon("src\\resources\\Icon\\back.png"));
		back_icon.setIconTextGap(0);
		back_icon.setHorizontalAlignment(SwingConstants.CENTER);
		back_icon.setBounds(10, 11, 24, 24);
		back_pnl.add(back_icon);
		
		back_label = new JLabel("Quay lại");
		back_label.setForeground(new Color(178,176,176));
		back_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back_label.setBounds(44, 0, 78, 44);
		back_label.setFont(Dosis_Bold_20);
		back_pnl.add(back_label);
		
		add_pnl = new MyPanel();
		add_pnl.setLayout(null);
		add_pnl.setOpaque(false);
		add_pnl.setColor(new Color(36, 34, 34));
		add_pnl.setRadius(25);
		add_pnl.setBorderColor(new Color(110, 110, 110));
		add_pnl.setColorOver(new Color(36, 34, 34));
		add_pnl.setColorClick(new Color(36, 34, 34));
		add_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add_pnl.setBounds(30, 15, 98, 44);
		header_pnl.add(add_pnl);
		
		add_icon = new JLabel("");
		add_icon.setIconTextGap(0);
		add_icon.setIcon(new ImageIcon("src\\resources\\Icon\\type.png"));
		add_icon.setHorizontalAlignment(SwingConstants.CENTER);
		add_icon.setBounds(10, 11, 24, 24);
		add_pnl.add(add_icon);
		
		add_label = new JLabel("Thêm");
		add_label.setForeground(new Color(178, 176, 176));
		add_label.setFont(null);
		add_label.setFont(Dosis_Bold_20);
		add_label.setBounds(44, 0, 54, 44);
		add_pnl.add(add_label);
		
		update_pnl = new MyPanel();
		update_pnl.setLayout(null);
		update_pnl.setOpaque(false);
		update_pnl.setColor(new Color(36, 34, 34));
		update_pnl.setRadius(25);
		update_pnl.setBorderColor(new Color(110, 110, 110));
		update_pnl.setColorOver(new Color(36, 34, 34));
		update_pnl.setColorClick(new Color(36, 34, 34));
		update_pnl.setBounds(30, 15, 98, 44);
		update_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		header_pnl.add(update_pnl);
		
		update_icon = new JLabel("");
		update_icon.setIconTextGap(0);
		update_icon.setIcon(new ImageIcon("src\\resources\\Icon\\type.png"));
		update_icon.setHorizontalAlignment(SwingConstants.CENTER);
		update_icon.setBounds(10, 11, 24, 24);
		update_pnl.add(update_icon);
		
		update_label = new JLabel("Sửa");
		update_label.setForeground(new Color(178, 176, 176));
		update_label.setFont(null);
		update_label.setFont(Dosis_Bold_20);
		update_label.setBounds(44, 0, 54, 44);
		update_pnl.add(update_label);
		
		remove_pnl = new MyPanel();
		remove_pnl.setLayout(null);
		remove_pnl.setOpaque(false);
		remove_pnl.setColor(new Color(36, 34, 34));
		remove_pnl.setRadius(25);
		remove_pnl.setBorderColor(new Color(110, 110, 110));
		remove_pnl.setColorOver(new Color(36, 34, 34));
		remove_pnl.setColorClick(new Color(36, 34, 34));
		remove_pnl.setBounds(30, 15, 98, 44);
		remove_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		header_pnl.add(remove_pnl);
		
		remove_icon = new JLabel("");
		remove_icon.setIconTextGap(0);
		remove_icon.setIcon(new ImageIcon("src\\resources\\Icon\\type.png"));
		remove_icon.setHorizontalAlignment(SwingConstants.CENTER);
		remove_icon.setBounds(10, 11, 24, 24);
		remove_pnl.add(remove_icon);
		
		remove_label = new JLabel("Xóa");
		remove_label.setForeground(new Color(178, 176, 176));
		remove_label.setFont(null);
		remove_label.setFont(Dosis_Bold_20);
		remove_label.setBounds(44, 0, 54, 44);
		remove_pnl.add(remove_label);
		
		clear_pnl = new MyPanel();
		clear_pnl.setOpaque(false);
		clear_pnl.setBounds(144, 15, 104, 44);
		clear_pnl.setColor(new Color(36, 34, 34));
		clear_pnl.setRadius(25);
		clear_pnl.setBorderColor(new Color(110, 110, 110));
		clear_pnl.setColorOver(new Color(36, 34, 34));
		clear_pnl.setColorClick(new Color(36, 34, 34));
		header_pnl.add(clear_pnl);
		clear_pnl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clear_pnl.setLayout(null);
		
		clear_label = new JLabel("Xóa trắng");
		clear_label.setHorizontalAlignment(SwingConstants.CENTER);
		clear_label.setHorizontalTextPosition(SwingConstants.CENTER);
		clear_label.setBounds(0, 0, 104, 44);
		clear_pnl.add(clear_label);
		clear_label.setForeground(new Color(178, 176, 176));
		clear_label.setFont(Dosis_Bold_20);
		
		inform_pnl = new JPanel();
		inform_pnl.setBackground(new Color(36, 34, 34));
		inform_pnl.setBounds(0, 76, 1128, 705);
		main_pnl.add(inform_pnl);
		inform_pnl.setLayout(new CardLayout());
		cardLayout = (CardLayout) inform_pnl.getLayout();
		
		//Trang_chu
		GUI_TrangChu homePanel = new GUI_TrangChu(this);
		inform_pnl.add(homePanel, "homePanel");
		//khuyen_mai
		GUI_Khuyen_Mai promotionPanel = new GUI_Khuyen_Mai();
		inform_pnl.add(promotionPanel, "promotionPanel");
		//nhan_vien
		GUI_NhanVien staffPanel = new GUI_NhanVien(this);
		inform_pnl.add(staffPanel, "staffPanel");
		//dat_ve
		GUI_DatVe bookTicketPanel = new GUI_DatVe(this);
		inform_pnl.add(bookTicketPanel, "bookTicketPanel");
		//chon_gio
		GUI_ChonGio chonGioPanel = new GUI_ChonGio(bookTicketPanel,homePanel,this);
		inform_pnl.add(chonGioPanel, "chonGioPanel");
		//tro_giup
		GUI_TroGiup troGiupPanel = new GUI_TroGiup();
		inform_pnl.add(troGiupPanel, "troGiupPanel");
		//chon_ghe
		GUI_ChonGhe chonGhePanel = new GUI_ChonGhe(this);
		inform_pnl.add(chonGhePanel,"chonGhePanel");
		black = new Color(36,34,34);
		
		add_pnl.setVisible(false);
        remove_pnl.setVisible(false);
        update_pnl.setVisible(false);
        back_pnl.setVisible(false);
        clear_pnl.setVisible(false);
        staffFind_pnl.setVisible(false);
        filmFind_pnl.setVisible(false);
        
        home_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//            	resetPanelColors();
                cardLayout.show(inform_pnl, "homePanel");
                home_pnl.setColor(new Color(171, 27, 27));
                sale_pnl.setColor(black);
                bookTicket_pnl.setColor(black);
                staff_pnl.setColor(black);
                customer_pnl.setColor(black);
                statistic_pnl.setColor(black);
                help_pnl.setColor(black);
                logOut_pnl.setColor(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
                clear_pnl.setVisible(false);
                staffFind_pnl.setVisible(false);
                filmFind_pnl.setVisible(false);
            }
        });
        
        bookTicket_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "bookTicketPanel");
                bookTicket_pnl.setColor(new Color(171, 27, 27));
                home_pnl.setColor(black);
                staff_pnl.setColor(black);
                sale_pnl.setColor(black);
                customer_pnl.setColor(black);
                statistic_pnl.setColor(black);
                help_pnl.setColor(black);
                logOut_pnl.setColor(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
                clear_pnl.setVisible(false);
                staffFind_pnl.setVisible(false);
                filmFind_pnl.setVisible(true);
                find_container2.addFocusListener(new FocusAdapter() {
        			@Override
        			public void focusGained(FocusEvent e) {
        				if(find_container2.getText().toString().equals("Tìm kiếm phim")) {
        					find_container2.setText("");
        					find_container2.setForeground(new Color(178, 176, 176));
        				}
        			}
        			@Override
        			public void focusLost(FocusEvent e) {
        				if(find_container2.getText().toString().equals("")) {
        					find_container2.setText("Tìm kiếm phim");
        					find_container2.setForeground(new Color(178, 176, 176));
        				}
        			}
        		});
            }
        });
		
		sale_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "promotionPanel");
                sale_pnl.setColor(new Color(171, 27, 27));
                home_pnl.setColor(black);
                bookTicket_pnl.setColor(black);
                staff_pnl.setColor(black);
                customer_pnl.setColor(black);
                statistic_pnl.setColor(black);
                help_pnl.setColor(black);
                logOut_pnl.setColor(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
                clear_pnl.setVisible(false);
                staffFind_pnl.setVisible(false);
                filmFind_pnl.setVisible(false);
            }
        });
		
		staff_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "staffPanel");
                staff_pnl.setColor(new Color(171, 27, 27));
                home_pnl.setColor(black);
                bookTicket_pnl.setColor(black);
                sale_pnl.setColor(black);
                customer_pnl.setColor(black);
                statistic_pnl.setColor(black);
                help_pnl.setColor(black);
                logOut_pnl.setColor(black);
                add_pnl.setVisible(true);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
                clear_pnl.setVisible(true);
                staffFind_pnl.setVisible(true);
                filmFind_pnl.setVisible(false);
                find_container.addFocusListener(new FocusAdapter() {
        			@Override
        			public void focusGained(FocusEvent e) {
        				if(find_container.getText().toString().equals("Tìm kiếm nhân viên")) {
        					find_container.setText("");
        					find_container.setForeground(new Color(178, 176, 176));
        				}
        			}
        			@Override
        			public void focusLost(FocusEvent e) {
        				if(find_container.getText().toString().equals("")) {
        					find_container.setText("Tìm kiếm nhân viên");
        					find_container.setForeground(new Color(178, 176, 176));
        				}
        			}
        		});
                update_label.addMouseListener(new MouseAdapter() {

        			@Override
        			public void mouseClicked(MouseEvent e) {
        				update_pnl.setVisible(false);
        				add_pnl.setVisible(false);
        				back_pnl.setVisible(false);
        				remove_pnl.setVisible(true);
        			}
        			
        		});
                
                remove_label.addMouseListener(new MouseAdapter() {

        			@Override
        			public void mouseClicked(MouseEvent e) {
        				update_pnl.setVisible(false);
        				add_pnl.setVisible(true);
        				back_pnl.setVisible(false);
        				remove_pnl.setVisible(false);
        			}
        			
        		});
                
                add_label.addMouseListener(new MouseAdapter() {

        			@Override
        			public void mouseClicked(MouseEvent e) {
        				update_pnl.setVisible(true);
        				add_pnl.setVisible(false);
        				back_pnl.setVisible(false);
        				remove_pnl.setVisible(false);
        			}
        			
        		});
            }
        });
		
		
		
		help_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "troGiupPanel");
                help_pnl.setColor(new Color(171, 27, 27));
                home_pnl.setColor(black);
                staff_pnl.setColor(black);
                sale_pnl.setColor(black);
                customer_pnl.setColor(black);
                statistic_pnl.setColor(black);
                bookTicket_pnl.setColor(black);
                logOut_pnl.setColor(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
                clear_pnl.setVisible(false);
                staffFind_pnl.setVisible(false);
                filmFind_pnl.setVisible(false);
            }
        });
		
		logOut_pnl.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        dispose();
		        GUI_DangNhap loginFrame = null;
				try {
					loginFrame = new GUI_DangNhap();
				} catch (FontFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		        loginFrame.setVisible(true);
		    }
		});
		

	}
	
	public JTextField getFind() {
		return find_container;
	}
	
	public JTextField getFind2() {
		return find_container2;
	}
	
	public JLabel getRemove() {
		return remove_label;
	}
	
	public JLabel getAdd() {
		return add_label;
	}
	
	public JLabel getUpdate() {
		return update_label;
	}
	
	public JLabel getBack() {
		return back_label;
	}
	
	public JLabel getClear() {
		return clear_label;
	}
	
	public JLabel getSearch() {
		return search_icon;
	}
	
	public JLabel getSearch2() {
		return search_icon2;
	}
	
	public JLabel getClose() {
		return close_icon;
	}
	
	public JPanel getRemovePnl() {
		return remove_pnl;
	}
	
	public JPanel getUpdatePnl() {
		return add_pnl;
	}
	
	public JPanel getAddPnl() {
		return remove_pnl;
	}
	
	public JPanel getBackPnl() {
		return back_pnl;
	}
	

	public void showChonGioPanel() {
        cardLayout.show(inform_pnl, "chonGioPanel");
        add_pnl.setVisible(false);
        remove_pnl.setVisible(false);
        update_pnl.setVisible(false);
        back_pnl.setVisible(true);
    }
	
	public void showDatVe() {
		cardLayout.show(inform_pnl, "bookTicketPanel");
		bookTicket_pnl.setColor(new Color(171, 27, 27));
        home_pnl.setColor(black);
		add_pnl.setVisible(false);
        remove_pnl.setVisible(false);
        update_pnl.setVisible(false);
        back_pnl.setVisible(false);
    }
	
	public void showChonGhePanel() {
		cardLayout.show(inform_pnl, "chonGhePanel");
	}

	public static void main(String[] args) throws FontFormatException, IOException {
		
		GUI_Man_hinh_chinh lg = new GUI_Man_hinh_chinh();
		lg.setVisible(true);
		lg.setResizable(false);
	}
}
