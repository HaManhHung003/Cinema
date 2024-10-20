package ui;

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
import org.apache.batik.swing.JSVGCanvas;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	private JPanel pnKhachHang;
	private JPanel pnKhuyenMai;
	private JPanel pnNhanVien;
	private JPanel pnTroGiup;
	private JPanel pnTrangChu;
	private JPanel pnDatVe;
	private JPanel pnDangXuat;
	private JPanel pnThongKe;
	private Color defaultColor;
	private JPanel[] panels;
	private JLabel iconTrangChu;
	private JLabel iconDatVe;
	private JLabel iconLogo;
	private JLabel iconKhuyenMai;
	private JLabel iconNhanVien;
	private JLabel iconKhachHang;
	private JLabel iconThongKe;
	private JLabel iconTroGiup;
	private JLabel iconDangXuat;
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
	 */
	public Main_v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 1440, 1024);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(35, 33, 33));
		panel_left.setLocation(0, 0);
		contentPane.add(panel_left);
		panel_left.setSize(312, 1024);
        panel_left.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(58, 57, 57)));
        panel_left.setLayout(null);
//        JSVGCanvas iconLogo = new JSVGCanvas();
        iconLogo = new JLabel();
        iconLogo.setLocation(73, 32);
        iconLogo.setBackground(new Color(35, 33, 33));
//        iconLogo.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/logo.svg/");
        iconLogo.setIcon(new ImageIcon("src/icon/logo.png"));
        iconLogo.setSize(185, 63);
        panel_left.add(iconLogo);
        
        JLabel lbMenu = new JLabel("Menu");
        lbMenu.setForeground(new Color(255, 255, 255));
        lbMenu.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbMenu.setBounds(58, 100, 97, 48);
        panel_left.add(lbMenu);
        
        //Trang chu
        pnTrangChu = new JPanel();
        pnTrangChu.setBackground(new Color(35, 33, 33));
        pnTrangChu.setSize(200, 48);
        JLabel lbTrangChu = new JLabel(" Trang chủ ");
        lbTrangChu.setSize(160, 48);
        iconTrangChu = new JLabel();
        iconTrangChu.setLocation(20, 12);
        iconTrangChu.setBackground(new Color(35, 33, 33));
//        iconTrangChu.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/home.svg");
        iconTrangChu.setIcon(new ImageIcon("src/icon/home.png"));
        iconTrangChu.setSize(24, 24);
        lbTrangChu.setBackground(new Color(255, 0, 0));
        lbTrangChu.setHorizontalAlignment(SwingConstants.LEFT);
        lbTrangChu.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbTrangChu.setForeground(new Color(255, 255, 255));
        lbTrangChu.setLocation(60, 0);
        pnTrangChu.setBounds(40, 160, 218, 48);
        pnTrangChu.setLayout(null);
        pnTrangChu.add(iconTrangChu);
        pnTrangChu.add(lbTrangChu);
        panel_left.add(pnTrangChu);
        
        //Dat ve
        pnDatVe = new JPanel();
        pnDatVe.setBackground(new Color(35, 33, 33));
        pnDatVe.setSize(200, 48);
        JLabel lbDatVe= new JLabel(" Đặt vé ");
        lbDatVe.setSize(160, 48);
        iconDatVe = new JLabel();
        iconDatVe.setLocation(20, 12);
        iconDatVe.setBackground(new Color(35, 33, 33));
//        iconDatVe.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/bookTicket.svg");
        iconDatVe.setIcon(new ImageIcon("src/icon/bookTicket.png"));
        iconDatVe.setSize(24, 24);
        lbDatVe.setBackground(new Color(255, 0, 0));
        lbDatVe.setHorizontalAlignment(SwingConstants.LEFT);
        lbDatVe.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbDatVe.setForeground(new Color(255, 255, 255));
        lbDatVe.setLocation(60, 0);
        pnDatVe.setBounds(40, 240, 218, 48);
        pnDatVe.setLayout(null);
        pnDatVe.add(iconDatVe);
        pnDatVe.add(lbDatVe);
        panel_left.add(pnDatVe);
        
        //Khuyen mai
        pnKhuyenMai = new JPanel();
        pnKhuyenMai.setBackground(new Color(35, 33, 33));
        pnKhuyenMai.setSize(200, 48);
        JLabel lbKhuyenMai = new JLabel(" Khuyến mãi ");
        lbKhuyenMai.setSize(160, 48);
        iconKhuyenMai = new JLabel();
        iconKhuyenMai.setLocation(20, 12);
        iconKhuyenMai.setBackground(new Color(35, 33, 33));
//        iconKhuyenMai.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/coupon.svg");
        iconKhuyenMai.setIcon(new ImageIcon("src/icon/sale.png"));
        iconKhuyenMai.setSize(24, 24);
        lbKhuyenMai.setBackground(new Color(255, 0, 0));
        lbKhuyenMai.setHorizontalAlignment(SwingConstants.LEFT);
        lbKhuyenMai.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbKhuyenMai.setForeground(new Color(255, 255, 255));
        lbKhuyenMai.setLocation(60, 0);
        pnKhuyenMai.setBounds(40, 320, 220, 48);
        pnKhuyenMai.setLayout(null);
        pnKhuyenMai.add(iconKhuyenMai);
        pnKhuyenMai.add(lbKhuyenMai);
        panel_left.add(pnKhuyenMai);
        
        //Nhan vien
        pnNhanVien = new JPanel();
        pnNhanVien.setBackground(new Color(35, 33, 33));
        pnNhanVien.setSize(200, 48);
        JLabel lbNhanVien = new JLabel(" Nhân viên ");
        lbNhanVien.setSize(160, 48);
        iconNhanVien = new JLabel();
        iconNhanVien.setLocation(20, 12);
        iconNhanVien.setBackground(new Color(35, 33, 33));
//        iconNhanVien.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/staff.svg");
        iconNhanVien.setIcon(new ImageIcon("src/icon/staff.png"));
        iconNhanVien.setSize(24, 24);
        lbNhanVien.setBackground(new Color(255, 0, 0));
        lbNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
        lbNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbNhanVien.setForeground(new Color(255, 255, 255));
        lbNhanVien.setLocation(60, 0);
        pnNhanVien.setBounds(40, 400, 220, 48);
        pnNhanVien.setLayout(null);
        pnNhanVien.add(iconNhanVien);
        pnNhanVien.add(lbNhanVien);
        panel_left.add(pnNhanVien);
        
        //Khach hang
        pnKhachHang = new JPanel();
        pnKhachHang.setBackground(new Color(35, 33, 33));
        pnKhachHang.setSize(200, 48);
        JLabel lbKhachHang = new JLabel(" Khách hàng ");
        lbKhachHang.setSize(160, 48);
        iconKhachHang = new JLabel();
        iconKhachHang.setLocation(20, 12);
        iconKhachHang.setBackground(new Color(35, 33, 33));
//        iconKhachHang.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/staff.svg");
        iconKhachHang.setIcon(new ImageIcon("src/icon/customer.png"));
        iconKhachHang.setSize(24, 24);
        lbKhachHang.setBackground(new Color(255, 0, 0));
        lbKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
        lbKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbKhachHang.setForeground(new Color(255, 255, 255));
        lbKhachHang.setLocation(60, 0);
        pnKhachHang.setBounds(40, 480, 220, 48);
        pnKhachHang.setLayout(null);
        pnKhachHang.add(iconKhachHang);
        pnKhachHang.add(lbKhachHang);
        panel_left.add(pnKhachHang);
        
        //Thong Ke
        pnThongKe = new JPanel();
        pnThongKe.setBackground(new Color(35, 33, 33));
        pnThongKe.setSize(200, 48);
        JLabel lbThongKe = new JLabel(" Thống kê ");
        lbThongKe.setSize(160, 48);
        iconThongKe = new JLabel();
        iconThongKe.setLocation(20, 12);
        iconThongKe.setBackground(new Color(35, 33, 33));
//        iconThongKe.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/statistic.svg");
        iconThongKe.setIcon(new ImageIcon("src/icon/statistic.png"));
        iconThongKe.setSize(24, 24);
        lbThongKe.setBackground(new Color(255, 0, 0));
        lbThongKe.setHorizontalAlignment(SwingConstants.LEFT);
        lbThongKe.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbThongKe.setForeground(new Color(255, 255, 255));
        lbThongKe.setLocation(60, 0);
        pnThongKe.setBounds(40, 560, 220, 48);
        pnThongKe.setLayout(null);
        pnThongKe.add(iconThongKe);
        pnThongKe.add(lbThongKe);
        panel_left.add(pnThongKe);
        
        //Tro giup
        pnTroGiup = new JPanel();
        pnTroGiup.setBackground(new Color(35, 33, 33));
        pnTroGiup.setSize(200, 48);
        JLabel lbTroGiup = new JLabel(" Trợ giúp ");
        lbTroGiup.setSize(160, 48);
        iconTroGiup = new JLabel();
        iconTroGiup.setLocation(20, 12);
        iconTroGiup.setBackground(new Color(35, 33, 33));
//        iconTroGiup.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/help.svg");
        iconTroGiup.setIcon(new ImageIcon("src/icon/help.png"));
        iconTroGiup.setSize(24, 24);
        lbTroGiup.setBackground(new Color(255, 0, 0));
        lbTroGiup.setHorizontalAlignment(SwingConstants.LEFT);
        lbTroGiup.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbTroGiup.setForeground(new Color(255, 255, 255));
        lbTroGiup.setLocation(60, 0);
        pnTroGiup.setBounds(40, 640, 220, 48);
        pnTroGiup.setLayout(null);
        pnTroGiup.add(iconTroGiup);
        pnTroGiup.add(lbTroGiup);
        panel_left.add(pnTroGiup);
        
        //Dang xuat
        pnDangXuat = new JPanel();
        pnDangXuat.setBorder(new LineBorder(new Color(255,238,231), 2, true));
        pnDangXuat.setBackground(new Color(35, 33, 33));
        pnDangXuat.setSize(200, 48);
        JLabel lbDangXuat = new JLabel(" Đăng xuất ");
        lbDangXuat.setSize(160, 48);
        iconDangXuat = new JLabel();
        iconDangXuat.setLocation(40, 12);
        iconDangXuat.setBackground(new Color(35, 33, 33));
//        iconDangXuat.setURI("file:///C:/Users/fptshop/Desktop/N4_K1/HSK/Project/Cinema/src/icon/logOut.svg");
        iconDangXuat.setIcon(new ImageIcon("src/icon/logOut.png"));
        iconDangXuat.setSize(24, 24);
        lbDangXuat.setBackground(new Color(255, 0, 0));
        lbDangXuat.setHorizontalAlignment(SwingConstants.LEFT);
        lbDangXuat.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lbDangXuat.setForeground(new Color(255, 255, 255));
        lbDangXuat.setLocation(80, 0);
        pnDangXuat.setBounds(22, 720, 240, 48);
        pnDangXuat.setLayout(null);
        pnDangXuat.add(iconDangXuat);
        pnDangXuat.add(lbDangXuat);
        panel_left.add(pnDangXuat);
        
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
//		DatVe datVePanel = new DatVe();
//		ChonGhe chonGhePanel = new ChonGhe();
//		chonGhePanel = new ChonGhe();
//		HoaDon hoaDon = new HoaDon();
//		panel_right.add(datVePanel, "DatVe");
//		panel_right.add(chonGhePanel,"ChonGhe");
        panels = new JPanel[]{pnTrangChu, pnDatVe, pnKhuyenMai, pnNhanVien, pnKhachHang, pnThongKe, pnTroGiup, pnDangXuat};
		defaultColor = new Color(35, 33, 33);
        pnTrangChu.setBackground(new Color(171, 27, 27));
        iconTrangChu.setBackground(new Color(171, 27, 27));


		pnTrangChu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	resetPanelColors();
                cardLayout.show(panel_right, "TrangChu");
                pnTrangChu.setBackground(new Color(171, 27, 27));
                iconTrangChu.setBackground(new Color(171, 27, 27));
            }
        });
		pnDatVe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	resetPanelColors();
                cardLayout.show(panel_right, "DatVe");
                pnDatVe.setBackground(new Color(171, 27, 27));
                iconDatVe.setBackground(new Color(171, 27, 27));
            }
        });
	}
	public void resetPanelColors() {
		for (JPanel panel : panels) {
			panel.setBackground(defaultColor);
			iconTrangChu.setBackground(defaultColor);
			iconDatVe.setBackground(defaultColor);
		}
	}
	public static void showChonGhePanel() {
        cardLayout.show(panel_right, "ChonGhe");
    }
	public static void showHoaDon() {
        cardLayout.show(panel_right, "HoaDon");
    }
}