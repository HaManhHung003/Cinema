package page;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.*;
import javax.swing.Icon;
//import org.apache.batik.swing.JSVGCanvas;

//import model.KhachHang;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Main_v1 extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private JButton btnNewButton;
	private Component TrangChu;
	private JPanel customer_pnl;
	private JPanel sale_pnl;
	private JPanel staff_pnl;
	private JPanel help_pnl;
	private JPanel home_pnl;
	private JPanel bookTicket_pnl;
	private JPanel logOut_pnl;
	private JPanel statistic_pnl;
	private Color defaultColor;
	private JPanel[] panels;
	private JLabel home_icon;
	private JLabel bookTicket_icon;
	private JLabel logo;
	private JLabel sale_icon;
	private JLabel staff_icon;
	private JLabel customer_icon;
	private JLabel statistic_icon;
	private JLabel help_icon;
	private JLabel logOut_icon;
	private JLabel iconTimKiem;
	private JLabel iconLogo_1;
//	private ChonGhe chonGhePanel;
	public static JPanel panel_right;
	public static CardLayout cardLayout;
//	JPanel[] panels = {pnTrangChu, pnDatVe, pnKhuyenMai, pnNhanVien, pnKhachHang, pnThongKe, pnTroGiup, pnDangXuat};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_v1 frame = new Main_v1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public Main_v1() throws FontFormatException, IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 1440, 1024);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		JPanel panel_left = new JPanel();
//		panel_left.setBackground(new Color(35, 33, 33));
//		panel_left.setLocation(0, 0);
//		contentPane.add(panel_left);
//		panel_left.setSize(312, 1024);
//        panel_left.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(58, 57, 57)));
//        panel_left.setLayout(null);
//        iconLogo = new JLabel();
//        iconLogo.setLocation(73, 32);
//        iconLogo.setBackground(new Color(35, 33, 33));
//        iconLogo.setIcon(new ImageIcon("src/icon/logo.png"));
//        iconLogo.setSize(185, 63);
//        panel_left.add(iconLogo);
        
        panel_left.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(45, 45, 45)));
        panel_left.setBackground(new Color(36, 34, 34));
        panel_left.setBounds(0, 0, 312, 1024);
		contentPane.add(panel_left);
		panel_left.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIconTextGap(0);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("src\\Image\\smallLogo.png"));
		logo.setBounds(22, 11, 177, 59);
		panel_left.add(logo);
        
//        JLabel lbMenu = new JLabel("Menu");
//        lbMenu.setForeground(new Color(255, 255, 255));
//        lbMenu.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbMenu.setBounds(58, 100, 97, 48);
//        panel_left.add(lbMenu);
		
		JLabel menu_title = new JLabel("Menu");
		menu_title.setForeground(new Color(255, 238, 231));
		menu_title.setFont(Dosis_Bold_20);
		menu_title.setBounds(44, 107, 82, 32);
		panel_left.add(menu_title);
        
		
		home_pnl = new JPanel();
		home_pnl.setBackground(new Color(36, 34, 34));
		home_pnl.setBounds(23, 150, 268, 56);
		panel_left.add(home_pnl);
		home_pnl.setLayout(null);
		
		home_icon = new JLabel("");
		home_icon.setIcon(new ImageIcon("src\\Icon\\home.png"));
		home_icon.setIconTextGap(0);
		home_icon.setHorizontalAlignment(SwingConstants.CENTER);
		home_icon.setBounds(22, 11, 32, 32);
		home_pnl.add(home_icon);
		
		JLabel home_label = new JLabel("Trang chủ");
		home_label.setForeground(new Color(255, 238, 231));
		home_label.setHorizontalAlignment(SwingConstants.LEFT);
		home_label.setFont(Dosis_Bold);
		home_label.setBounds(64, 0, 204, 57);
		home_pnl.add(home_label);
		
		bookTicket_pnl = new JPanel();
		bookTicket_pnl.setLayout(null);
		bookTicket_pnl.setBackground(new Color(36, 34, 34));
		bookTicket_pnl.setBounds(23, 258, 268, 56);
		panel_left.add(bookTicket_pnl);
		
		bookTicket_icon = new JLabel("");
		bookTicket_icon.setBounds(23, 11, 32, 32);
		bookTicket_pnl.add(bookTicket_icon);
		bookTicket_icon.setIcon(new ImageIcon("src\\Icon\\bookTicket.png"));
		bookTicket_icon.setIconTextGap(0);
		bookTicket_icon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel bookTicket_label = new JLabel("Đặt vé");
		bookTicket_label.setHorizontalAlignment(SwingConstants.LEFT);
		bookTicket_label.setForeground(new Color(255, 238, 231));
		bookTicket_label.setFont(Dosis_Bold);
		bookTicket_label.setBounds(65, 0, 203, 57);
		bookTicket_pnl.add(bookTicket_label);
		
		sale_pnl = new JPanel();
		sale_pnl.setLayout(null);
		sale_pnl.setBackground(new Color(36, 34, 34));
		sale_pnl.setBounds(23, 366, 268, 56);
		panel_left.add(sale_pnl);
		
		sale_icon = new JLabel("");
		sale_icon.setIcon(new ImageIcon("src\\Icon\\sale.png"));
		sale_icon.setForeground(new Color(64, 0, 128));
		sale_icon.setBounds(22, 11, 38, 32);
		sale_pnl.add(sale_icon);
		
		JLabel sale_label = new JLabel("Khuyến mãi");
		sale_label.setBackground(new Color(255, 255, 255));
		sale_label.setHorizontalAlignment(SwingConstants.LEFT);
		sale_label.setForeground(new Color(255, 238, 231));
		sale_label.setFont(Dosis_Bold);
		sale_label.setBounds(70, 0, 198, 57);
		sale_pnl.add(sale_label);
		
		staff_pnl = new JPanel();
		staff_pnl.setLayout(null);
		staff_pnl.setBackground(new Color(36, 34, 34));
		staff_pnl.setBounds(23, 474, 268, 56);
		panel_left.add(staff_pnl);
		
		staff_icon = new JLabel("");
		staff_icon.setIcon(new ImageIcon("src\\Icon\\staff.png"));
		staff_icon.setForeground(new Color(64, 0, 128));
		staff_icon.setBounds(22, 11, 32, 32);
		staff_pnl.add(staff_icon);
		
		JLabel staff_label = new JLabel("Nhân viên");
		staff_label.setHorizontalAlignment(SwingConstants.LEFT);
		staff_label.setForeground(new Color(255, 238, 231));
		staff_label.setFont(Dosis_Bold);
		staff_label.setBounds(64, 0, 204, 57);
		staff_pnl.add(staff_label);
		
		customer_pnl = new JPanel();
		customer_pnl.setLayout(null);
		customer_pnl.setBackground(new Color(36, 34, 34));
		customer_pnl.setBounds(23, 582, 268, 56);
		panel_left.add(customer_pnl);
		
		customer_icon = new JLabel("");
		customer_icon.setIcon(new ImageIcon("src\\Icon\\customer.png"));
		customer_icon.setForeground(new Color(64, 0, 128));
		customer_icon.setBounds(22, 11, 32, 32);
		customer_pnl.add(customer_icon);
		
		JLabel customer_label = new JLabel("Khách hàng");
		customer_label.setHorizontalAlignment(SwingConstants.LEFT);
		customer_label.setForeground(new Color(255, 238, 231));
		customer_label.setFont(Dosis_Bold);
		customer_label.setBounds(64, 0, 204, 57);
		customer_pnl.add(customer_label);
		
		statistic_pnl = new JPanel();
		statistic_pnl.setLayout(null);
		statistic_pnl.setBackground(new Color(36, 34, 34));
		statistic_pnl.setBounds(22, 690, 268, 56);
		panel_left.add(statistic_pnl);
		
		statistic_icon = new JLabel("");
		statistic_icon.setIcon(new ImageIcon("src\\Icon\\statistic.png"));
		statistic_icon.setForeground(new Color(64, 0, 128));
		statistic_icon.setBounds(22, 11, 32, 32);
		statistic_pnl.add(statistic_icon);
		
		JLabel statistic_label = new JLabel("Thống kê");
		statistic_label.setHorizontalAlignment(SwingConstants.LEFT);
		statistic_label.setForeground(new Color(255, 238, 231));
		statistic_label.setFont(Dosis_Bold);
		statistic_label.setBounds(64, 0, 204, 57);
		statistic_pnl.add(statistic_label);
		
		help_pnl = new JPanel();
		help_pnl.setLayout(null);
		help_pnl.setBackground(new Color(36, 34, 34));
		help_pnl.setBounds(22, 798, 268, 56);
		panel_left.add(help_pnl);
		
		help_icon = new JLabel("");
		help_icon.setIcon(new ImageIcon("src\\Icon\\help.png"));
		help_icon.setForeground(new Color(64, 0, 128));
		help_icon.setBounds(22, 11, 32, 32);
		help_pnl.add(help_icon);
		
		JLabel help_label = new JLabel("Trợ giúp");
		help_label.setHorizontalAlignment(SwingConstants.LEFT);
		help_label.setForeground(new Color(255, 238, 231));
		help_label.setFont(Dosis_Bold);
		help_label.setBounds(64, 0, 204, 57);
		help_pnl.add(help_label);
		
		logOut_pnl = new JPanel();
		logOut_pnl.setBorder(new LineBorder(new Color(65, 65, 65)));
		logOut_pnl.setLayout(null);
		logOut_pnl.setBackground(new Color(36, 34, 34));
		logOut_pnl.setBounds(22, 906, 268, 56);
		panel_left.add(logOut_pnl);
		
		logOut_icon = new JLabel("");
		logOut_icon.setIcon(new ImageIcon("src\\Icon\\logOut.png"));
		logOut_icon.setForeground(new Color(64, 0, 128));
		logOut_icon.setBounds(22, 11, 32, 32);
		logOut_pnl.add(logOut_icon);
		
		JLabel logOut_label = new JLabel("Đăng xuất");
		logOut_label.setBorder(null);
		logOut_label.setHorizontalAlignment(SwingConstants.LEFT);
		logOut_label.setForeground(new Color(255, 238, 231));
		logOut_label.setFont(Dosis_Bold);
		logOut_label.setBounds(64, 0, 204, 57);
		logOut_pnl.add(logOut_label);
        //Trang chu
//        pnTrangChu = new JPanel();
//        pnTrangChu.setBackground(new Color(35, 33, 33));
//        pnTrangChu.setSize(200, 48);
//        JLabel lbTrangChu = new JLabel(" Trang chủ ");
//        lbTrangChu.setSize(160, 48);
//        iconTrangChu = new JLabel();
//        iconTrangChu.setLocation(20, 12);
//        iconTrangChu.setBackground(new Color(35, 33, 33));
//        iconTrangChu.setIcon(new ImageIcon("src/icon/home.png"));
//        iconTrangChu.setSize(24, 24);
//        lbTrangChu.setBackground(new Color(255, 0, 0));
//        lbTrangChu.setHorizontalAlignment(SwingConstants.LEFT);
//        lbTrangChu.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbTrangChu.setForeground(new Color(255, 255, 255));
//        lbTrangChu.setLocation(60, 0);
//        pnTrangChu.setBounds(40, 160, 218, 48);
//        pnTrangChu.setLayout(null);
//        pnTrangChu.add(iconTrangChu);
//        pnTrangChu.add(lbTrangChu);
//        panel_left.add(pnTrangChu);
        
        //Dat ve
//        pnDatVe = new JPanel();
//        pnDatVe.setBackground(new Color(35, 33, 33));
//        pnDatVe.setSize(200, 48);
//        JLabel lbDatVe= new JLabel(" Đặt vé ");
//        lbDatVe.setSize(160, 48);
//        iconDatVe = new JLabel();
//        iconDatVe.setLocation(20, 12);
//        iconDatVe.setBackground(new Color(35, 33, 33));
//        iconDatVe.setIcon(new ImageIcon("src/icon/bookTicket.png"));
//        iconDatVe.setSize(24, 24);
//        lbDatVe.setBackground(new Color(255, 0, 0));
//        lbDatVe.setHorizontalAlignment(SwingConstants.LEFT);
//        lbDatVe.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbDatVe.setForeground(new Color(255, 255, 255));
//        lbDatVe.setLocation(60, 0);
//        pnDatVe.setBounds(40, 240, 218, 48);
//        pnDatVe.setLayout(null);
//        pnDatVe.add(iconDatVe);
//        pnDatVe.add(lbDatVe);
//        panel_left.add(pnDatVe);
        
        //Khuyen mai
//        pnKhuyenMai = new JPanel();
//        pnKhuyenMai.setBackground(new Color(35, 33, 33));
//        pnKhuyenMai.setSize(200, 48);
//        JLabel lbKhuyenMai = new JLabel(" Khuyến mãi ");
//        lbKhuyenMai.setSize(160, 48);
//        iconKhuyenMai = new JLabel();
//        iconKhuyenMai.setLocation(20, 12);
//        iconKhuyenMai.setBackground(new Color(35, 33, 33));
//        iconKhuyenMai.setIcon(new ImageIcon("src/icon/sale.png"));
//        iconKhuyenMai.setSize(24, 24);
//        lbKhuyenMai.setBackground(new Color(255, 0, 0));
//        lbKhuyenMai.setHorizontalAlignment(SwingConstants.LEFT);
//        lbKhuyenMai.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbKhuyenMai.setForeground(new Color(255, 255, 255));
//        lbKhuyenMai.setLocation(60, 0);
//        pnKhuyenMai.setBounds(40, 320, 220, 48);
//        pnKhuyenMai.setLayout(null);
//        pnKhuyenMai.add(iconKhuyenMai);
//        pnKhuyenMai.add(lbKhuyenMai);
//        panel_left.add(pnKhuyenMai);
        
        //Nhan vien
//        pnNhanVien = new JPanel();
//        pnNhanVien.setBackground(new Color(35, 33, 33));
//        pnNhanVien.setSize(200, 48);
//        JLabel lbNhanVien = new JLabel(" Nhân viên ");
//        lbNhanVien.setSize(160, 48);
//        iconNhanVien = new JLabel();
//        iconNhanVien.setLocation(20, 12);
//        iconNhanVien.setBackground(new Color(35, 33, 33));
//        iconNhanVien.setIcon(new ImageIcon("src/icon/staff.png"));
//        iconNhanVien.setSize(24, 24);
//        lbNhanVien.setBackground(new Color(255, 0, 0));
//        lbNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
//        lbNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbNhanVien.setForeground(new Color(255, 255, 255));
//        lbNhanVien.setLocation(60, 0);
//        pnNhanVien.setBounds(40, 400, 220, 48);
//        pnNhanVien.setLayout(null);
//        pnNhanVien.add(iconNhanVien);
//        pnNhanVien.add(lbNhanVien);
//        panel_left.add(pnNhanVien);
        
        //Khach hang
//        pnKhachHang = new JPanel();
//        pnKhachHang.setBackground(new Color(35, 33, 33));
//        pnKhachHang.setSize(200, 48);
//        JLabel lbKhachHang = new JLabel(" Khách hàng ");
//        lbKhachHang.setSize(160, 48);
//        iconKhachHang = new JLabel();
//        iconKhachHang.setLocation(20, 12);
//        iconKhachHang.setBackground(new Color(35, 33, 33));
//        iconKhachHang.setIcon(new ImageIcon("src/icon/customer.png"));
//        iconKhachHang.setSize(24, 24);
//        lbKhachHang.setBackground(new Color(255, 0, 0));
//        lbKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
//        lbKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbKhachHang.setForeground(new Color(255, 255, 255));
//        lbKhachHang.setLocation(60, 0);
//        pnKhachHang.setBounds(40, 480, 220, 48);
//        pnKhachHang.setLayout(null);
//        pnKhachHang.add(iconKhachHang);
//        pnKhachHang.add(lbKhachHang);
//        panel_left.add(pnKhachHang);
        
        //Thong Ke
//        pnThongKe = new JPanel();
//        pnThongKe.setBackground(new Color(35, 33, 33));
//        pnThongKe.setSize(200, 48);
//        JLabel lbThongKe = new JLabel(" Thống kê ");
//        lbThongKe.setSize(160, 48);
//        iconThongKe = new JLabel();
//        iconThongKe.setLocation(20, 12);
//        iconThongKe.setBackground(new Color(35, 33, 33));
//        iconThongKe.setIcon(new ImageIcon("src/icon/statistic.png"));
//        iconThongKe.setSize(24, 24);
//        lbThongKe.setBackground(new Color(255, 0, 0));
//        lbThongKe.setHorizontalAlignment(SwingConstants.LEFT);
//        lbThongKe.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbThongKe.setForeground(new Color(255, 255, 255));
//        lbThongKe.setLocation(60, 0);
//        pnThongKe.setBounds(40, 560, 220, 48);
//        pnThongKe.setLayout(null);
//        pnThongKe.add(iconThongKe);
//        pnThongKe.add(lbThongKe);
//        panel_left.add(pnThongKe);
        
        //Tro giup
//        pnTroGiup = new JPanel();
//        pnTroGiup.setBackground(new Color(35, 33, 33));
//        pnTroGiup.setSize(200, 48);
//        JLabel lbTroGiup = new JLabel(" Trợ giúp ");
//        lbTroGiup.setSize(160, 48);
//        iconTroGiup = new JLabel();
//        iconTroGiup.setLocation(20, 12);
//        iconTroGiup.setBackground(new Color(35, 33, 33));
//        iconTroGiup.setIcon(new ImageIcon("src/icon/help.png"));
//        iconTroGiup.setSize(24, 24);
//        lbTroGiup.setBackground(new Color(255, 0, 0));
//        lbTroGiup.setHorizontalAlignment(SwingConstants.LEFT);
//        lbTroGiup.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbTroGiup.setForeground(new Color(255, 255, 255));
//        lbTroGiup.setLocation(60, 0);
//        pnTroGiup.setBounds(40, 640, 220, 48);
//        pnTroGiup.setLayout(null);
//        pnTroGiup.add(iconTroGiup);
//        pnTroGiup.add(lbTroGiup);
//        panel_left.add(pnTroGiup);
        
        //Dang xuat
//        pnDangXuat = new JPanel();
//        pnDangXuat.setBorder(new LineBorder(new Color(255,238,231), 2, true));
//        pnDangXuat.setBackground(new Color(35, 33, 33));
//        pnDangXuat.setSize(200, 48);
//        JLabel lbDangXuat = new JLabel(" Đăng xuất ");
//        lbDangXuat.setSize(160, 48);
//        iconDangXuat = new JLabel();
//        iconDangXuat.setLocation(40, 12);
//        iconDangXuat.setBackground(new Color(35, 33, 33));
//        iconDangXuat.setIcon(new ImageIcon("src/icon/logOut.png"));
//        iconDangXuat.setSize(24, 24);
//        lbDangXuat.setBackground(new Color(255, 0, 0));
//        lbDangXuat.setHorizontalAlignment(SwingConstants.LEFT);
//        lbDangXuat.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        lbDangXuat.setForeground(new Color(255, 255, 255));
//        lbDangXuat.setLocation(80, 0);
//        pnDangXuat.setBounds(22, 720, 240, 48);
//        pnDangXuat.setLayout(null);
//        pnDangXuat.add(iconDangXuat);
//        pnDangXuat.add(lbDangXuat);
//        panel_left.add(pnDangXuat);
        
        //pannel top
        JPanel panel_top = new JPanel();
        panel_top.setBackground(new Color(35, 33, 33));
        panel_top.setBounds(312, 0, 1128, 134);
        contentPane.add(panel_top);
        panel_top.setLayout(null);
        JPanel pnSearch = new JPanel();
        pnSearch.setBackground(new Color(35, 33, 33));
        pnSearch.setSize(380, 48);
        pnSearch.setLocation(500, 40);
        iconTimKiem = new JLabel();
        iconTimKiem.setLocation(12, 12);
        iconTimKiem.setBackground(new Color(35, 33, 33));
//        iconTimKiem.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/search.svg");
        iconTimKiem.setIcon(new ImageIcon("src/icon/search.png"));
        iconTimKiem.setSize(24, 24);
        JTextField txtSearch = new JTextField();
        txtSearch.setToolTipText("");
        txtSearch.setForeground(new Color(255, 255, 255));
        txtSearch.setBackground(new Color(35, 33, 33));
        txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 24));
        txtSearch.setBounds(50, 4, 328, 40);
        txtSearch.setBorder(null);
        pnSearch.setLayout(null);
        pnSearch.setBorder(new LineBorder(new Color(255,255,255),2,true));
        pnSearch.add(iconTimKiem);
        pnSearch.add(txtSearch);
        panel_top.add(pnSearch);
        JPanel pnLogo = new JPanel();
        pnLogo.setSize(48, 48);
        pnLogo.setLocation(940, 40);
        pnLogo.setLayout(null);
        iconLogo_1 = new JLabel();
        iconLogo_1.setLocation(0, 0);
        iconLogo_1.setBackground(new Color(35, 33, 33));
//        iconLogo_1.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/search.svg");
        iconLogo_1.setIcon(new ImageIcon("src/icon/search.png"));
        iconLogo_1.setSize(48, 48);
        pnLogo.add(iconLogo_1);
        panel_top.add(pnLogo);
        
        
        //switch pannel
		panel_right = new JPanel();
		panel_right.setBackground(new Color(35, 33, 33));
		panel_right.setLocation(312, 134);
		contentPane.add(panel_right);
		panel_right.setSize(1128, 865);
		panel_right.setLayout(new CardLayout());
		cardLayout = (CardLayout) panel_right.getLayout();
		TrangChu trangChuPanel = new TrangChu();
		panel_right.add(trangChuPanel, "TrangChu");
		DatVe datVePanel = new DatVe();
		panel_right.add(datVePanel, "DatVe");
//		ChonGhe chonGhePanel = new ChonGhe();
//		chonGhePanel = new ChonGhe();
//		HoaDon hoaDon = new HoaDon();
//		panel_right.add(chonGhePanel,"ChonGhe");
        panels = new JPanel[]{home_pnl, bookTicket_pnl, sale_pnl, staff_pnl, customer_pnl, statistic_pnl, help_pnl, logOut_pnl};
		defaultColor = new Color(35, 33, 33);
		home_pnl.setBackground(new Color(171, 27, 27));
		home_icon.setBackground(new Color(171, 27, 27));


		home_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	resetPanelColors();
                cardLayout.show(panel_right, "TrangChu");
                home_pnl.setBackground(new Color(171, 27, 27));
                home_icon.setBackground(new Color(171, 27, 27));
            }
        });
		bookTicket_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	resetPanelColors();
                cardLayout.show(panel_right, "DatVe");
                bookTicket_pnl.setBackground(new Color(171, 27, 27));
                bookTicket_icon.setBackground(new Color(171, 27, 27));
            }
        });
		customer_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	resetPanelColors();
                cardLayout.show(panel_right, "KhachHang");
                customer_pnl.setBackground(new Color(171, 27, 27));
                customer_icon.setBackground(new Color(171, 27, 27));
            }
        });
		staff_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	resetPanelColors();
                cardLayout.show(panel_right, "NhanVien");
                staff_pnl.setBackground(new Color(171, 27, 27));
                staff_icon.setBackground(new Color(171, 27, 27));
            }
        });
	}
	public void resetPanelColors() {
		for (JPanel panel : panels) {
			panel.setBackground(defaultColor);
			home_pnl.setBackground(defaultColor);
			bookTicket_pnl.setBackground(defaultColor);
		}
	}
	public static void showChonGhePanel() {
        cardLayout.show(panel_right, "ChonGhe");
    }
	public static void showHoaDon() {
        cardLayout.show(panel_right, "HoaDon");
    }
}