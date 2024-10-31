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

public class GUI_Man_hinh_chinh extends JFrame{
	private JPanel menu_pnl,home_pnl,bookTicket_pnl,sale_pnl,staff_pnl,customer_pnl,statistic_pnl,help_pnl,logOut_pnl,main_pnl,inform_pnl,header_pnl,back_pnl;
	private JLabel logo,menu_title,home_icon,home_label,bookTicket_icon,bookTicket_label,sale_icon,sale_label,staff_icon,staff_label,customer_icon,customer_label,statistic_icon,statistic_label,help_icon,help_label,logOut_icon,logOut_label,avatar,search_icon,back_icon,back_label;
	private JTextField find_container; 
	private Color black;
	public static CardLayout cardLayout;
	public static final long serialVersionUID = 1L;
	private JPanel[] panels;
	private JPanel add_pnl;
	private JLabel add_icon;
	private JLabel add_label;
	private JPanel update_pnl;
	private JLabel update_icon;
	private JLabel update_label;
	private JPanel remove_pnl;
	private JLabel remove_icon;
	private JLabel remove_label;
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
		menu_title.setForeground(new Color(255, 238, 231));
		menu_title.setFont(Dosis_Bold);
		menu_title.setBounds(44, 81, 82, 32);
		menu_pnl.add(menu_title);
		
		home_pnl = new JPanel();
		home_pnl.setBackground(new Color(171, 27, 27));
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
		
		bookTicket_pnl = new JPanel();
		bookTicket_pnl.setLayout(null);
		bookTicket_pnl.setBackground(new Color(36, 34, 34));
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
		
		sale_pnl = new JPanel();
		sale_pnl.setLayout(null);
		sale_pnl.setBackground(new Color(36, 34, 34));
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
		
		staff_pnl = new JPanel();
		staff_pnl.setLayout(null);
		staff_pnl.setBackground(new Color(36, 34, 34));
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
		
		customer_pnl = new JPanel();
		customer_pnl.setLayout(null);
		customer_pnl.setBackground(new Color(36, 34, 34));
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
		
		statistic_pnl = new JPanel();
		statistic_pnl.setLayout(null);
		statistic_pnl.setBackground(new Color(36, 34, 34));
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
		
		help_pnl = new JPanel();
		help_pnl.setLayout(null);
		help_pnl.setBackground(new Color(36, 34, 34));
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
		
		logOut_pnl = new JPanel();
		logOut_pnl.setBorder(new LineBorder(new Color(65, 65, 65)));
		logOut_pnl.setLayout(null);
		logOut_pnl.setBackground(new Color(36, 34, 34));
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
		main_pnl.add(header_pnl);
		header_pnl.setLayout(null);
		
		avatar = new JLabel("");
		avatar.setIcon(new ImageIcon("src\\resources\\Image\\subLogo.jpg"));
		avatar.setIconTextGap(0);
		avatar.setHorizontalAlignment(SwingConstants.CENTER);
		avatar.setBounds(1052, 11, 55, 55);
		header_pnl.add(avatar);
		
		search_icon = new JLabel("");
		search_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search_icon.setIcon(new ImageIcon("src\\resources\\Icon\\search2.png"));
		search_icon.setBounds(655, 23, 30, 30);
		header_pnl.add(search_icon);
		search_icon.setIconTextGap(0);
		search_icon.setHorizontalAlignment(SwingConstants.CENTER);
		
		find_container = new JTextField();
		find_container.setOpaque(false);
		find_container.setBounds(645, 15, 324, 44);
		header_pnl.add(find_container);
		find_container.setHorizontalAlignment(SwingConstants.CENTER);
		find_container.setFont(Dosis_Bold_20);
		find_container.setForeground(new Color(178, 176, 176));
		find_container.setText("Tìm kiếm nhân viên");
		find_container.setBorder(new LineBorder(new Color(110, 110, 110), 1, true));
		find_container.setColumns(10);
		
		back_pnl = new JPanel();
		back_pnl.setBorder(new LineBorder(new Color(110, 110, 110)));
		back_pnl.setOpaque(false);
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
		
		add_pnl = new JPanel();
		add_pnl.setLayout(null);
		add_pnl.setOpaque(false);
		add_pnl.setBorder(new LineBorder(new Color(110, 110, 110)));
		add_pnl.setBounds(30, 15, 98, 44);
		header_pnl.add(add_pnl);
		
		add_icon = new JLabel("");
		add_icon.setIconTextGap(0);
		add_icon.setIcon(new ImageIcon("src\\resources\\Icon\\type.png"));
		add_icon.setHorizontalAlignment(SwingConstants.CENTER);
		add_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add_icon.setBounds(10, 11, 24, 24);
		add_pnl.add(add_icon);
		
		add_label = new JLabel("Thêm");
		add_label.setForeground(new Color(178, 176, 176));
		add_label.setFont(null);
		add_label.setFont(Dosis_Bold_20);
		add_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add_label.setBounds(44, 0, 54, 44);
		add_pnl.add(add_label);
		
		update_pnl = new JPanel();
		update_pnl.setLayout(null);
		update_pnl.setOpaque(false);
		update_pnl.setBorder(new LineBorder(new Color(110, 110, 110)));
		update_pnl.setBounds(30, 15, 98, 44);
		header_pnl.add(update_pnl);
		
		update_icon = new JLabel("");
		update_icon.setIconTextGap(0);
		update_icon.setIcon(new ImageIcon("src\\resources\\Icon\\type.png"));
		update_icon.setHorizontalAlignment(SwingConstants.CENTER);
		update_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		update_icon.setBounds(10, 11, 24, 24);
		update_pnl.add(update_icon);
		
		update_label = new JLabel("Sửa");
		update_label.setForeground(new Color(178, 176, 176));
		update_label.setFont(null);
		update_label.setFont(Dosis_Bold_20);
		update_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		update_label.setBounds(44, 0, 54, 44);
		update_pnl.add(update_label);
		
		remove_pnl = new JPanel();
		remove_pnl.setLayout(null);
		remove_pnl.setOpaque(false);
		remove_pnl.setBorder(new LineBorder(new Color(110, 110, 110)));
		remove_pnl.setBounds(30, 15, 98, 44);
		header_pnl.add(remove_pnl);
		
		remove_icon = new JLabel("");
		remove_icon.setIconTextGap(0);
		remove_icon.setIcon(new ImageIcon("src\\resources\\Icon\\type.png"));
		remove_icon.setHorizontalAlignment(SwingConstants.CENTER);
		remove_icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		remove_icon.setBounds(10, 11, 24, 24);
		remove_pnl.add(remove_icon);
		
		remove_label = new JLabel("Xóa");
		remove_label.setForeground(new Color(178, 176, 176));
		remove_label.setFont(null);
		remove_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		remove_label.setFont(Dosis_Bold_20);
		remove_label.setBounds(44, 0, 54, 44);
		remove_pnl.add(remove_label);
		
		inform_pnl = new JPanel();
		inform_pnl.setBackground(new Color(36, 34, 34));
		inform_pnl.setBounds(0, 76, 1128, 705);
		main_pnl.add(inform_pnl);
		inform_pnl.setLayout(new CardLayout());
		cardLayout = (CardLayout) inform_pnl.getLayout();
		
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
		GUI_ChonGio chonGioPanel = new GUI_ChonGio();
		inform_pnl.add(chonGioPanel, "chonGioPanel");
		//tro_giup
		GUI_TroGiup troGiupPanel = new GUI_TroGiup();
		inform_pnl.add(troGiupPanel, "troGiupPanel");
		black = new Color(36,34,34);
		
		add_pnl.setVisible(false);
        remove_pnl.setVisible(false);
        update_pnl.setVisible(false);
        back_pnl.setVisible(false);
		
		sale_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "promotionPanel");
                sale_pnl.setBackground(new Color(171, 27, 27));
                home_pnl.setBackground(black);
                bookTicket_pnl.setBackground(black);
                staff_pnl.setBackground(black);
                customer_pnl.setBackground(black);
                statistic_pnl.setBackground(black);
                help_pnl.setBackground(black);
                logOut_pnl.setBackground(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
            }
        });
		
		staff_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "staffPanel");
                staff_pnl.setBackground(new Color(171, 27, 27));
                home_pnl.setBackground(black);
                bookTicket_pnl.setBackground(black);
                sale_pnl.setBackground(black);
                customer_pnl.setBackground(black);
                statistic_pnl.setBackground(black);
                help_pnl.setBackground(black);
                logOut_pnl.setBackground(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(true);
                back_pnl.setVisible(false);
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
		
		bookTicket_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "bookTicketPanel");
                bookTicket_pnl.setBackground(new Color(171, 27, 27));
                home_pnl.setBackground(black);
                staff_pnl.setBackground(black);
                sale_pnl.setBackground(black);
                customer_pnl.setBackground(black);
                statistic_pnl.setBackground(black);
                help_pnl.setBackground(black);
                logOut_pnl.setBackground(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
            }
        });
		
		help_pnl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(inform_pnl, "troGiupPanel");
                help_pnl.setBackground(new Color(171, 27, 27));
                home_pnl.setBackground(black);
                staff_pnl.setBackground(black);
                sale_pnl.setBackground(black);
                customer_pnl.setBackground(black);
                statistic_pnl.setBackground(black);
                bookTicket_pnl.setBackground(black);
                logOut_pnl.setBackground(black);
                add_pnl.setVisible(false);
                remove_pnl.setVisible(false);
                update_pnl.setVisible(false);
                back_pnl.setVisible(false);
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
		add_pnl.setVisible(false);
        remove_pnl.setVisible(false);
        update_pnl.setVisible(false);
        back_pnl.setVisible(false);
    }

	public static void main(String[] args) throws FontFormatException, IOException {
		GUI_Man_hinh_chinh lg = new GUI_Man_hinh_chinh();
		lg.setVisible(true);
		lg.setResizable(false);
	}
}
