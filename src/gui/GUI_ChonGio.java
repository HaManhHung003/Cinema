package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import component.nut_gradient;
import connectDB.JDBCUtil;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUI_ChonGio extends JPanel{
	private JLabel hinh_phim,ten_phim,lich_chieu,type_lbl,director_lbl,duration_lbl,description_lbl;
	private JTextArea mo_ta,dao_dien,thoi_luong,the_loai;
	private String[] status;
	private nut_gradient[] tohop;
	nut_gradient ngay_1,ngay_2,ngay_3,ngay_4,ngay_5,gio_1,gio_2,gio_3,gio_4,gio_5,gio_6,gio_7,gio_8,gio_9,gio_10,nut;
	private GradientPaint mau_gradient1,mau_gradient2;
	private String tenPhim,theloai,daodien,thoiluong,mota,motabreak,link,maphim,ngaychieu1,ngaychieu2,ngaychieu3,ngaychieu4,ngaychieu5,giochieu1,giochieu2,giochieu3,giochieu4,giochieu5,giochieu6,giochieu7,giochieu8,giochieu9,giochieu10,trangthai1,trangthai2,trangthai3,trangthai4,trangthai5,trangthai6,trangthai7,trangthai8,trangthai9,trangthai10;
	private Connection conn = JDBCUtil.getConnection();
	public GUI_ChonGio(GUI_DatVe datve, GUI_TrangChu trangchu,GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException{
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
		
		datve.getPhim1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tenPhim = datve.getTenPhim1().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        datve.getPhim2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tenPhim = datve.getTenPhim2().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        datve.getPhim3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tenPhim = datve.getTenPhim3().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        datve.getPhim4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tenPhim = datve.getTenPhim4().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        datve.getPhim5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tenPhim = datve.getTenPhim5().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        datve.getPhim6().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tenPhim = datve.getTenPhim6().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        trangchu.getPhim1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	tenPhim = trangchu.getTenPhim1().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        trangchu.getPhim2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	tenPhim = trangchu.getTenPhim2().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
        
        trangchu.getPhim3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	tenPhim = trangchu.getTenPhim3().getText();
            	connect(tenPhim);
            	getGioChieu(tenPhim,ngaychieu1);
            	try {
            		clearUI();
					UI(man_hinh);
					resetTime();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });;
	}
	protected void resetTime() {
		// TODO Auto-generated method stub
		int dem = 0;
		for(int j = 1;j<=10;j++) {
			tohop[j-1].setVisible(true);
			if(status[j-1].equals("1")) {	
				dem++;
				switch(dem) {
					case 1 : 
						tohop[j-1].setBounds(120, 564, 96, 38);
						break;
					case 2 :
						tohop[j-1].setBounds(318, 564, 96, 38);
						break;
					case 3 : 
						tohop[j-1].setBounds(516, 564, 96, 38);
						break;
					case 4 :
						tohop[j-1].setBounds(714, 564, 96, 38);
						break;
					case 5 : 
						tohop[j-1].setBounds(912, 564, 96, 38);
						break;
					case 6 :
						tohop[j-1].setBounds(120, 640, 96, 38);
						break;
					case 7 :
						tohop[j-1].setBounds(318, 640, 96, 38);
						break;
					case 8 :
						tohop[j-1].setBounds(516, 640, 96, 38);
						break;
					case 9 :
						tohop[j-1].setBounds(714, 640, 96, 38);
						break;
					case 10 :
						tohop[j-1].setBounds(912, 640, 96, 38);
						break;
				}
			}else {
				tohop[j-1].setVisible(false);
			}
		}
	}
	protected void getGioChieu(String maPhim,String ngayChieu) {
		// TODO Auto-generated method stub
		try(CallableStatement stmt = conn.prepareCall("{CALL getGioChieu(?,?)}")) {
			stmt.setNString(1, tenPhim);
			stmt.setNString(2, ngayChieu);
			ResultSet rs = stmt.executeQuery();
			int i = 1;
			while (rs.next()) {
				switch (i) {
                case 1:
                    giochieu1 = rs.getString("gioChieu1");
                    trangthai1 = rs.getString("trangThai");
                    break;
                case 2:
                	giochieu2 = rs.getString("gioChieu1");
                	trangthai2 = rs.getString("trangThai");
                    break;
                case 3:
                	giochieu3 = rs.getString("gioChieu1");
                	trangthai3 = rs.getString("trangThai");
                    break;
                case 4:
                	giochieu4 = rs.getString("gioChieu1");
                	trangthai4 = rs.getString("trangThai");
                    break;
                case 5:
                	giochieu5 = rs.getString("gioChieu1");
                	trangthai5 = rs.getString("trangThai");
                    break;
                case 6:
                	giochieu6 = rs.getString("gioChieu1");
                	trangthai6 = rs.getString("trangThai");
                    break;
                case 7:
                	giochieu7 = rs.getString("gioChieu1");
                	trangthai7 = rs.getString("trangThai");
                    break;
                case 8:
                	giochieu8 = rs.getString("gioChieu1");
                	trangthai8 = rs.getString("trangThai");
                    break;
                case 9:
                	giochieu9 = rs.getString("gioChieu1");
                	trangthai9 = rs.getString("trangThai");
                    break;
                case 10:
                	giochieu10 = rs.getString("gioChieu1");
                	trangthai10 = rs.getString("trangThai");
                    break;
				}
				i++;
			}
		} catch (SQLException e2) {
            e2.printStackTrace();
        } 
	}
	protected void connect(String tenPhim) {
		// TODO Auto-generated method stub
		try(CallableStatement stmt = conn.prepareCall("{CALL getThongTinPhim(?)}")) {
			stmt.setNString(1, tenPhim);
			ResultSet rs = stmt.executeQuery();
			int i = 1;
			while (rs.next()) {
				switch (i) {
                case 1:
                    theloai = rs.getString("theLoai");
                    daodien = rs.getString("daoDien");
                    thoiluong = Integer.toString(rs.getInt("thoiLuong"));
                    mota = rs.getString("moTa");
                    link = rs.getString("link");
                    maphim = rs.getString("maPhim");
                    ngaychieu1 = rs.getString("ngayChieu1");
                    break;
                case 2:
                	ngaychieu2 = rs.getString("ngayChieu1");
                    break;
                case 3:
                	ngaychieu3 = rs.getString("ngayChieu1");
                    break;
                case 4:
                	ngaychieu4 = rs.getString("ngayChieu1");
                    break;
                case 5:
                	ngaychieu5 = rs.getString("ngayChieu1");
                    break;
				}
				i++;
			}
		} catch (SQLException e2) {
            e2.printStackTrace();
        } 
	}
	private void UI(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		// TODO Auto-generated method stub
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_15 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_18 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(15f);
		Font Dosis_Bold_40 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(40f);
		Font Dosis_Bold_35 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(35f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		Point2D.Double p1 = new Point2D.Double(50, 50); 
		Point2D.Double p2 = new Point2D.Double(100, 50); 
		mau_gradient1 = new GradientPaint(p1,new Color(255,80,67),p2,new Color(255,130,62));
		mau_gradient2 = new GradientPaint(p1,new Color(217,217,217),p2,new Color(217,217,217));
		
		hinh_phim = new JLabel("New label");
		hinh_phim.setIcon(new ImageIcon(link));
		hinh_phim.setBounds(40, 21, 308, 412);
		add(hinh_phim);
		
		ten_phim = new JLabel();
		ten_phim.setText(tenPhim);
		ten_phim.setForeground(new Color(255, 142, 60));
		ten_phim.setFont(Dosis_Bold_20);
		ten_phim.setBounds(368, 11, 664, 63);
		add(ten_phim);
		
		type_lbl = new JLabel("Thể loại :");
		type_lbl.setBounds(368, 86, 100, 25);
		type_lbl.setForeground(new Color(255, 142, 60));
		type_lbl.setFont(Dosis_Bold_15);
		add(type_lbl);
		
		director_lbl = new JLabel("Đạo diễn :");
		director_lbl.setBounds(368, 138, 100, 25);
		director_lbl.setForeground(new Color(255, 142, 60));
		director_lbl.setFont(Dosis_Bold_15);
		add(director_lbl);
		
		duration_lbl = new JLabel("Thời lượng :");
		duration_lbl.setBounds(368, 190, 100, 25);
		duration_lbl.setForeground(new Color(255, 142, 60));
		duration_lbl.setFont(Dosis_Bold_15);
		add(duration_lbl);
		
		description_lbl = new JLabel("Mô tả :");
		description_lbl.setBounds(368, 242, 100, 25);
		description_lbl.setForeground(new Color(255, 142, 60));
		description_lbl.setFont(Dosis_Bold_15);
		add(description_lbl);
		
		the_loai = new JTextArea();
		the_loai.setText(theloai);
		the_loai.setOpaque(false);
		the_loai.setEnabled(false);
		the_loai.setEditable(false);
		the_loai.setDisabledTextColor(new Color(255, 255, 255));
		the_loai.setFont(Dosis_Bold_15);
		the_loai.setBounds(447, 86, 648, 25);
		add(the_loai);
		
		dao_dien = new JTextArea();
		dao_dien.setText(daodien);
		dao_dien.setOpaque(false);
		dao_dien.setEnabled(false);
		dao_dien.setEditable(false);
		dao_dien.setDisabledTextColor(new Color(255, 255, 255));
		dao_dien.setFont(Dosis_Bold_15);
		dao_dien.setBounds(452, 138, 648, 25);
		add(dao_dien);
		
		thoi_luong = new JTextArea();
		thoi_luong.setText(thoiluong+" phút");
		thoi_luong.setOpaque(false);
		thoi_luong.setEnabled(false);
		thoi_luong.setEditable(false);
		thoi_luong.setDisabledTextColor(new Color(255, 255, 255));
		thoi_luong.setFont(Dosis_Bold_15);
		thoi_luong.setBounds(470, 190, 648, 25);
		add(thoi_luong);
		
		mo_ta = new JTextArea();
		motabreak = breakDown(mota.toString());
		mo_ta.setText("               "+motabreak);
		mo_ta.setOpaque(false);
		mo_ta.setEnabled(false);
		mo_ta.setEditable(false);
		mo_ta.setDisabledTextColor(new Color(255, 255, 255));
		mo_ta.setFont(Dosis_Bold_15);
		mo_ta.setBounds(368, 242, 750, 191);
		add(mo_ta);
		
		lich_chieu = new JLabel("Lịch chiếu");
		lich_chieu.setForeground(new Color(255, 255, 255));
		lich_chieu.setFont(Dosis_Bold_20);
		lich_chieu.setBounds(39, 444, 287, 48);
		add(lich_chieu);
		
		ngay_1 = new nut_gradient(ngaychieu1,mau_gradient1);
		ngay_1.setForeground(new Color(255,238,231));
		ngay_1.setBounds(198, 486, 100, 44);	
		ngay_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ngay_1.setRadius(10);
		ngay_1.setFont(Dosis_Bold_18);
		add(ngay_1);
		
		ngay_2 = new nut_gradient(ngaychieu2,mau_gradient2);
		ngay_2.setBounds(354, 486, 100, 44);
		ngay_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ngay_2.setRadius(10);
		ngay_2.setFont(Dosis_Bold_18);
		add(ngay_2);
		
		ngay_3 = new nut_gradient(ngaychieu3,mau_gradient2);
		ngay_3.setBounds(510, 486, 100, 44);
		ngay_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ngay_3.setRadius(10);
		ngay_3.setFont(Dosis_Bold_18);
		add(ngay_3);
		
		ngay_4 = new nut_gradient(ngaychieu4,mau_gradient2);
		ngay_4.setBounds(666, 486, 100, 44);
		ngay_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ngay_4.setRadius(10);
		ngay_4.setFont(Dosis_Bold_18);
		add(ngay_4);
		
		ngay_5 = new nut_gradient(ngaychieu5,mau_gradient2);
		ngay_5.setBounds(822, 486, 100, 44);
		ngay_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ngay_5.setRadius(10);
		ngay_5.setFont(Dosis_Bold_18);
		add(ngay_5);
		
		gio_1 = new nut_gradient(giochieu1,mau_gradient2);
		gio_1.setBounds(120, 564, 96, 38);
		gio_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_1.setRadius(10);
		gio_1.setFont(Dosis_Bold_18);
		add(gio_1);
		
		gio_2 = new nut_gradient(giochieu2,mau_gradient2);
		gio_2.setBounds(318, 564, 96, 38);
		gio_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_2.setRadius(10);
		gio_2.setFont(Dosis_Bold_18);
		add(gio_2);
		
		gio_3 = new nut_gradient(giochieu3,mau_gradient2);
		gio_3.setBounds(516, 564, 96, 38);
		gio_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_3.setRadius(10);
		gio_3.setFont(Dosis_Bold_18);
		add(gio_3);
		
		gio_4 = new nut_gradient(giochieu4,mau_gradient2);
		gio_4.setBounds(714, 564, 96, 38);
		gio_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_4.setRadius(10);
		gio_4.setFont(Dosis_Bold_18);
		add(gio_4);
		
		gio_5 = new nut_gradient(giochieu5,mau_gradient2);
		gio_5.setBounds(912, 564, 96, 38);
		gio_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_5.setRadius(10);
		gio_5.setFont(Dosis_Bold_18);
		add(gio_5);
		
		gio_6 = new nut_gradient(giochieu6,mau_gradient2);
		gio_6.setBounds(120, 640, 96, 38);
		gio_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_6.setRadius(10);
		gio_6.setFont(Dosis_Bold_18);
		add(gio_6);
		
		gio_7 = new nut_gradient(giochieu7,mau_gradient2);
		gio_7.setBounds(318, 640, 96, 38);
		gio_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_7.setRadius(10);
		gio_7.setFont(Dosis_Bold_18);
		add(gio_7);
		
		gio_8 = new nut_gradient(giochieu8,mau_gradient2);
		gio_8.setBounds(516, 640, 96, 38);
		gio_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_8.setRadius(10);
		gio_8.setFont(Dosis_Bold_18);
		add(gio_8);
		
		gio_9 = new nut_gradient(giochieu9,mau_gradient2);
		gio_9.setBounds(714, 640, 96, 38);
		gio_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_9.setRadius(10);
		gio_9.setFont(Dosis_Bold_18);
		add(gio_9);
		
		gio_10 = new nut_gradient(giochieu10,mau_gradient2);
		gio_10.setBounds(912, 640, 96, 38);
		gio_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gio_10.setRadius(10);
		gio_10.setFont(Dosis_Bold_18);
		add(gio_10);
		
		status = new String[] {trangthai1,trangthai2,trangthai3,trangthai4,trangthai5,trangthai6,trangthai7,trangthai8,trangthai9,trangthai10};
		tohop = new nut_gradient[] {gio_1,gio_2,gio_3,gio_4,gio_5,gio_6,gio_7,gio_8,gio_9,gio_10};
		
		ngay_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        ngay_1.setGradient(mau_gradient1); 
		        ngay_2.setGradient(mau_gradient2); 
			    ngay_3.setGradient(mau_gradient2); 
			    ngay_4.setGradient(mau_gradient2); 
			    ngay_5.setGradient(mau_gradient2); 
			    ngay_1.setForeground(new Color(255,238,231));
			    ngay_2.setForeground(new Color(0,0,0));
			    ngay_3.setForeground(new Color(0,0,0));
			    ngay_4.setForeground(new Color(0,0,0));
			    ngay_5.setForeground(new Color(0,0,0));
		        ngay_1.repaint();
		        ngay_2.repaint();
		        ngay_3.repaint();
		        ngay_4.repaint();
		        ngay_5.repaint();
		        getGioChieu(tenPhim,ngaychieu1);
		        clearUI();
				try {
					UI(man_hinh);
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        resetTime();
		    }
		});
		
		ngay_2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	getGioChieu(tenPhim,ngaychieu2);
		        clearUI();
				try {
					UI(man_hinh);
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        resetTime();
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient1); 
		    	ngay_3.setGradient(mau_gradient2); 
		    	ngay_4.setGradient(mau_gradient2); 
		    	ngay_5.setGradient(mau_gradient2); 
		    	ngay_2.setForeground(new Color(255,238,231));
		    	ngay_1.setForeground(new Color(0,0,0));
			    ngay_3.setForeground(new Color(0,0,0));
			    ngay_4.setForeground(new Color(0,0,0));
			    ngay_5.setForeground(new Color(0,0,0));
		    	ngay_1.repaint();
		        ngay_2.repaint();
		        ngay_3.repaint();
		        ngay_4.repaint(); 
		        ngay_5.repaint();
		        
		    }
		});
		
		ngay_3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	getGioChieu(tenPhim,ngaychieu3);
		        clearUI();
				try {
					UI(man_hinh);
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        resetTime();
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient2); 
		    	ngay_3.setGradient(mau_gradient1); 
		    	ngay_4.setGradient(mau_gradient2); 
		    	ngay_5.setGradient(mau_gradient2); 
		    	ngay_3.setForeground(new Color(255,238,231));
		    	ngay_1.setForeground(new Color(0,0,0));
			    ngay_2.setForeground(new Color(0,0,0));
			    ngay_4.setForeground(new Color(0,0,0));
			    ngay_5.setForeground(new Color(0,0,0));
		    	ngay_1.repaint();
		        ngay_2.repaint();
		        ngay_3.repaint();
		        ngay_4.repaint();
		        ngay_5.repaint();
		        
		    }
		});
		
		ngay_4.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	getGioChieu(tenPhim,ngaychieu4);
		        clearUI();
				try {
					UI(man_hinh);
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        resetTime();
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient2); 
		    	ngay_3.setGradient(mau_gradient2); 
		    	ngay_4.setGradient(mau_gradient1); 
		    	ngay_5.setGradient(mau_gradient2); 
		    	ngay_4.setForeground(new Color(255,238,231));
		    	ngay_1.setForeground(new Color(0,0,0));
			    ngay_2.setForeground(new Color(0,0,0));
			    ngay_3.setForeground(new Color(0,0,0));
			    ngay_5.setForeground(new Color(0,0,0));
		    	ngay_1.repaint();
		        ngay_2.repaint();
		        ngay_3.repaint();
		        ngay_4.repaint();
		        ngay_5.repaint();
		        
		    }
		});
		
		ngay_5.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	getGioChieu(tenPhim,ngaychieu5);
		        clearUI();
				try {
					UI(man_hinh);
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        resetTime();
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient2); 
		    	ngay_3.setGradient(mau_gradient2); 
		    	ngay_4.setGradient(mau_gradient2); 
		    	ngay_5.setGradient(mau_gradient1); 
		    	ngay_5.setForeground(new Color(255,238,231));
		    	ngay_1.setForeground(new Color(0,0,0));
			    ngay_2.setForeground(new Color(0,0,0));
			    ngay_3.setForeground(new Color(0,0,0));
			    ngay_4.setForeground(new Color(0,0,0));
		    	ngay_1.repaint();
		        ngay_2.repaint();
		        ngay_3.repaint();
		        ngay_4.repaint();
		        ngay_5.repaint();
		        
		    }
		});
		
		gio_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_4.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_5.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		
		gio_6.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_7.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_8.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_9.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    }
		});
		
		gio_10.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	man_hinh.showChonGhePanel();
		    }
		});
	}
	public static String breakDown(String in) {
		return in.replace("\\n", "\n");
	}
	
	public void clearUI() {
		removeAll();
		revalidate();
		repaint();
	}
	
}
