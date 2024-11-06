package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import component.nut_gradient;
import java.sql.*;
import connectDB.JDBCUtil;

public class GUI_DatVe extends JPanel{
	nut_gradient book_phim1,book_phim2,book_phim3,book_phim4,book_phim5,book_phim6;
	private GradientPaint mau_gradient;
	private JPanel phim1,phim2,phim3,phim4,phim5,phim6;
	private JLabel hinh_phim1,hinh_phim2,hinh_phim3,hinh_phim4,hinh_phim5,hinh_phim6;
	private JTextArea theloai_phim1,theloai_phim2,theloai_phim3,theloai_phim4,theloai_phim5,theloai_phim6,tieude_phim1,tieude_phim2,tieude_phim3,tieude_phim4,tieude_phim5,tieude_phim6;
	private String tenPhim1,tenPhim2,tenPhim3,tenPhim4,tenPhim5,tenPhim6,theLoai1,theLoai2,theLoai3,theLoai4,theLoai5,theLoai6,link1,link2,link3,link4,link5,link6;
	private int thoiLuong1,thoiLuong2,thoiLuong3,thoiLuong4,thoiLuong5,thoiLuong6;
	private JPanel[] pnl_phim;
	private JTextArea[] phim;
	private JTextField s;
	private Connection conn = JDBCUtil.getConnection();
	public GUI_DatVe(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(19f);
		Font Dosis_Bold_16 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(15f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		mau_gradient = new GradientPaint(p1,new Color(255,80,67),p2,new Color(255,130,62));
		
		try(CallableStatement stmt = conn.prepareCall("{CALL GetFilm()}")) {
            ResultSet rs = stmt.executeQuery();
            int i = 1;

            while (rs.next()) {
                switch (i) {
                    case 1:
                        tenPhim1 = rs.getString("tenPhim");
                        thoiLuong1 = rs.getInt("thoiLuong");
                        theLoai1 = rs.getString("theLoai");
                        link1 = rs.getString("hinhAnh");
                        break;
                    case 2:
                        tenPhim2 = rs.getString("tenPhim");
                        thoiLuong2 = rs.getInt("thoiLuong");
                        theLoai2 = rs.getString("theLoai");
                        link2 = rs.getString("hinhAnh");
                        break;
                    case 3:
                        tenPhim3 = rs.getString("tenPhim");
                        thoiLuong3 = rs.getInt("thoiLuong");
                        theLoai3 = rs.getString("theLoai");
                        link3 = rs.getString("hinhAnh");
                        break;
                    case 4:
                        tenPhim4 = rs.getString("tenPhim");
                        thoiLuong4 = rs.getInt("thoiLuong");
                        theLoai4 = rs.getString("theLoai");
                        link4 = rs.getString("hinhAnh");
                        break;
                    case 5:
                        tenPhim5 = rs.getString("tenPhim");
                        thoiLuong5 = rs.getInt("thoiLuong");
                        theLoai5 = rs.getString("theLoai");
                        link5 = rs.getString("hinhAnh");
                        break;
                    case 6:
                        tenPhim6 = rs.getString("tenPhim");
                        thoiLuong6 = rs.getInt("thoiLuong");
                        theLoai6 = rs.getString("theLoai");
                        link6 = rs.getString("hinhAnh");
                        break;
                }
                i++;
            }
		} catch (SQLException e2) {
            e2.printStackTrace();
        } 
		s = man_hinh.getFind2();
		phim1 = new JPanel();
		phim1.setOpaque(false);
		phim1.setBounds(52, 11, 262, 325);
		add(phim1);
		phim1.setLayout(null);
		
		hinh_phim1 = new JLabel("New label");
		hinh_phim1.setBorder(null);
		hinh_phim1.setIcon(new ImageIcon(link1));
		hinh_phim1.setBackground(new Color(0, 0, 0));
		hinh_phim1.setBounds(0, 0, 262, 195);
		phim1.add(hinh_phim1);
		
		book_phim1 = new nut_gradient("Mua vé", mau_gradient);
		book_phim1.setBounds(0, 295, 262, 30);
		book_phim1.setRadius(25);
		book_phim1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book_phim1.setForeground(new Color(0,0,0));;
		book_phim1.setFont(Dosis_Bold_14);
		phim1.add(book_phim1);
		
		theloai_phim1 = new JTextArea();
		theloai_phim1.setTabSize(2);
		theloai_phim1.setText("Thể loại : "+theLoai1+"\nThời lượng :  "+thoiLuong1+" phút");
		theloai_phim1.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim1.setFont(Dosis_Bold_16);
		theloai_phim1.setOpaque(false);
		theloai_phim1.setEnabled(false);
		theloai_phim1.setEditable(false);
		theloai_phim1.setBounds(0, 236, 262, 64);
		phim1.add(theloai_phim1);
		
		tieude_phim1 = new JTextArea();
		tieude_phim1.setText(tenPhim1);
		tieude_phim1.setOpaque(false);
		tieude_phim1.setBackground(new Color(112, 128, 144));
		tieude_phim1.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim1.setFont(Dosis_Bold_20);
		tieude_phim1.setEnabled(false);
		tieude_phim1.setEditable(false);
		tieude_phim1.setBounds(0, 207, 262, 39);
		phim1.add(tieude_phim1);
		
		phim2 = new JPanel();
		phim2.setOpaque(false);
		phim2.setBounds(418, 11, 262, 325);
		add(phim2);
		phim2.setLayout(null);
		
		hinh_phim2 = new JLabel("New label");
		hinh_phim2.setIcon(new ImageIcon(link2));
		hinh_phim2.setBounds(0, 0, 262, 195);
		phim2.add(hinh_phim2);
		
		book_phim2 = new nut_gradient("Mua vé", mau_gradient);
		book_phim2.setBounds(0, 295, 262, 30);
		book_phim2.setForeground(new Color(0,0,0));
		book_phim2.setRadius(25);
		book_phim2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book_phim2.setFont(Dosis_Bold_14);
		phim2.add(book_phim2);
		
		theloai_phim2 = new JTextArea();
		theloai_phim2.setText("Thể loại : "+theLoai2+"\nThời lượng :  "+thoiLuong2+" phút");
		theloai_phim2.setOpaque(false);
		theloai_phim2.setFont(null);
		theloai_phim2.setEnabled(false);
		theloai_phim2.setEditable(false);
		theloai_phim2.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim2.setBackground(new Color(112, 128, 144));
		theloai_phim2.setBounds(0, 236, 262, 64);
		theloai_phim2.setFont(Dosis_Bold_16);
		phim2.add(theloai_phim2);
		
		tieude_phim2 = new JTextArea();
		tieude_phim2.setText(tenPhim2);
		tieude_phim2.setOpaque(false);
		tieude_phim2.setFont(null);
		tieude_phim2.setEnabled(false);
		tieude_phim2.setEditable(false);
		tieude_phim2.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim2.setBounds(0, 207, 262, 64);
		tieude_phim2.setFont(Dosis_Bold_20);
		phim2.add(tieude_phim2);
		
		phim3 = new JPanel();
		phim3.setOpaque(false);
		phim3.setBounds(784, 11, 262, 325);
		add(phim3);
		phim3.setLayout(null);
		
		hinh_phim3 = new JLabel("New label");
		hinh_phim3.setBounds(0, 0, 262, 195);
		hinh_phim3.setIcon(new ImageIcon(link6));
		phim3.add(hinh_phim3);
		
		book_phim3 = new nut_gradient("Mua vé", mau_gradient);
		book_phim3.setBounds(0, 295, 262, 30);
		book_phim3.setRadius(25);
		book_phim3.setForeground(new Color(0,0,0));
		book_phim3.setFont(Dosis_Bold_14);
		book_phim3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		phim3.add(book_phim3);
		
		theloai_phim3 = new JTextArea();
		theloai_phim3.setText("Thể loại : "+theLoai6+"\nThời lượng :  "+thoiLuong6+" phút");
		theloai_phim3.setOpaque(false);
		theloai_phim3.setFont(null);
		theloai_phim3.setEnabled(false);
		theloai_phim3.setEditable(false);
		theloai_phim3.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim3.setBackground(new Color(112, 128, 144));
		theloai_phim3.setBounds(0, 236, 262, 64);
		theloai_phim3.setFont(Dosis_Bold_16);
		phim3.add(theloai_phim3);
		
		tieude_phim3 = new JTextArea();
		tieude_phim3.setText(tenPhim6);
		tieude_phim3.setOpaque(false);
		tieude_phim3.setFont(null);
		tieude_phim3.setEnabled(false);
		tieude_phim3.setEditable(false);
		tieude_phim3.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim3.setBounds(0, 207, 262, 64);
		tieude_phim3.setFont(Dosis_Bold_20);
		phim3.add(tieude_phim3);
		
		phim4 = new JPanel();
		phim4.setOpaque(false);
		phim4.setBounds(52, 368, 262, 325);
		add(phim4);
		phim4.setLayout(null);
		
		hinh_phim4 = new JLabel("New label");
		hinh_phim4.setBounds(0, 0, 262, 195);
		hinh_phim4.setIcon(new ImageIcon(link3));
		phim4.add(hinh_phim4);
		
		book_phim4 = new nut_gradient("Mua vé", mau_gradient);
		book_phim4.setBounds(0, 295, 262, 30);
		book_phim4.setForeground(new Color(0,0,0));
		book_phim4.setRadius(25);
		book_phim4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book_phim4.setFont(Dosis_Bold_14);
		phim4.add(book_phim4);
		
		theloai_phim4 = new JTextArea();
		theloai_phim4.setText("Thể loại : "+theLoai3+"\nThời lượng :  "+thoiLuong3+" phút");
		theloai_phim4.setOpaque(false);
		theloai_phim4.setFont(null);
		theloai_phim4.setEnabled(false);
		theloai_phim4.setEditable(false);
		theloai_phim4.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim4.setBackground(new Color(112, 128, 144));
		theloai_phim4.setBounds(0, 236, 262, 64);
		theloai_phim4.setFont(Dosis_Bold_16);
		phim4.add(theloai_phim4);
		
		tieude_phim4 = new JTextArea();
		tieude_phim4.setText(tenPhim3);
		tieude_phim4.setOpaque(false);
		tieude_phim4.setFont(null);
		tieude_phim4.setEnabled(false);
		tieude_phim4.setEditable(false);
		tieude_phim4.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim4.setBounds(0, 207, 262, 64);
		tieude_phim4.setFont(Dosis_Bold_20);
		phim4.add(tieude_phim4);
		
		phim5 = new JPanel();
		phim5.setOpaque(false);
		phim5.setBounds(418, 368, 262, 325);
		add(phim5);
		phim5.setLayout(null);
		
		hinh_phim5 = new JLabel("New label");
		hinh_phim5.setBounds(0, 0, 262, 195);
		hinh_phim5.setIcon(new ImageIcon(link4));
		phim5.add(hinh_phim5);
		
		book_phim5 = new nut_gradient("Mua vé", mau_gradient);
		book_phim5.setBounds(0, 295, 262, 30);
		book_phim5.setForeground(new Color(0,0,0));
		book_phim5.setRadius(25);
		book_phim5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book_phim5.setFont(Dosis_Bold_14);
		phim5.add(book_phim5);
		
		theloai_phim5 = new JTextArea();
		theloai_phim5.setText("Thể loại : "+theLoai4+"\nThời lượng :  "+thoiLuong4+" phút");
		theloai_phim5.setOpaque(false);
		theloai_phim5.setFont(null);
		theloai_phim5.setEnabled(false);
		theloai_phim5.setEditable(false);
		theloai_phim5.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim5.setBounds(0, 236, 262, 64);
		theloai_phim5.setFont(Dosis_Bold_16);
		phim5.add(theloai_phim5);
		
		tieude_phim5 = new JTextArea();
		tieude_phim5.setText(tenPhim4);
		tieude_phim5.setOpaque(false);
		tieude_phim5.setFont(null);
		tieude_phim5.setEnabled(false);
		tieude_phim5.setEditable(false);
		tieude_phim5.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim5.setBackground(new Color(112, 128, 144));
		tieude_phim5.setBounds(0, 207, 262, 39);
		tieude_phim5.setFont(Dosis_Bold_20);
		phim5.add(tieude_phim5);
		
		phim6 = new JPanel();
		phim6.setOpaque(false);
		phim6.setBounds(784, 368, 262, 325);
		add(phim6);
		phim6.setLayout(null);
		
		hinh_phim6 = new JLabel("New label");
		hinh_phim6.setBounds(0, 0, 262, 195);
		hinh_phim6.setIcon(new ImageIcon(link5));
		phim6.add(hinh_phim6);
		
		book_phim6 = new nut_gradient("Mua vé", mau_gradient);
		book_phim6.setBounds(0, 295, 262, 30);
		book_phim6.setForeground(new Color(0,0,0));
		book_phim6.setRadius(25);
		book_phim6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book_phim6.setFont(Dosis_Bold_14);
		phim6.add(book_phim6);
		
		theloai_phim6 = new JTextArea();
		theloai_phim6.setText("Thể loại : "+theLoai5+"\nThời lượng :  "+thoiLuong5+" phút");
		theloai_phim6.setOpaque(false);
		theloai_phim6.setFont(null);
		theloai_phim6.setEnabled(false);
		theloai_phim6.setEditable(false);
		theloai_phim6.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim6.setBounds(0, 236, 262, 64);
		theloai_phim6.setFont(Dosis_Bold_16);
		phim6.add(theloai_phim6);
		
		tieude_phim6 = new JTextArea();
		tieude_phim6.setText(tenPhim5);
		tieude_phim6.setOpaque(false);
		tieude_phim6.setFont(null);
		tieude_phim6.setEnabled(false);
		tieude_phim6.setEditable(false);
		tieude_phim6.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim6.setBackground(new Color(112, 128, 144));
		tieude_phim6.setBounds(0, 207, 262, 39);
		tieude_phim6.setFont(Dosis_Bold_20);
		phim6.add(tieude_phim6);
		
		pnl_phim = new JPanel[]{phim1, phim2, phim3, phim4, phim5, phim6};
		phim = new JTextArea[]{tieude_phim1, tieude_phim2, tieude_phim3, tieude_phim4, tieude_phim5, tieude_phim6};
		
		book_phim1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });
		
		book_phim2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });
		
		book_phim3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });
		
		book_phim4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });
		
		book_phim5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });
		
		book_phim6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	man_hinh.showChonGioPanel();
            }
        });
		man_hinh.getBack().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	phimClose();
		        man_hinh.showDatVe();
		    }
		});
		
		man_hinh.getSearch2().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String ten_phim = man_hinh.getFind2().getText().trim();
				int dem = 0;
				for(int i = 1;i<=phim.length;i++) {
					pnl_phim[i-1].setVisible(true);
					if(phim[i-1].getText().toLowerCase().contains(ten_phim.toLowerCase())) {	
						dem++;
						switch(dem) {
							case 1 : 
								pnl_phim[i-1].setBounds(52, 11, 262, 325);
								break;
							case 2 :
								pnl_phim[i-1].setBounds(418, 11, 262, 325);
								break;
							case 3 : 
								pnl_phim[i-1].setBounds(784, 11, 262, 325);
								break;
							case 4 :
								pnl_phim[i-1].setBounds(52, 368, 262, 325);
								break;
							case 5 : 
								pnl_phim[i-1].setBounds(418, 368, 262, 325);
								break;
							case 6 :
								pnl_phim[i-1].setBounds(784, 368, 262, 325);
								break;
						}
					}else {
						pnl_phim[i-1].setVisible(false);
					}
				}
				if(dem == 0) {
					ShowCanhBao("Không tìm thấy phim");
				}
				
			}
			
		});
		
		man_hinh.getClose().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				phimClose();
			}
			
		});

	}
	protected void phimClose() {
		// TODO Auto-generated method stub
		for(int i = 1;i<=phim.length;i++) {
			pnl_phim[i-1].setVisible(true);
			s.setText("Tìm kiếm phim");
			switch(i) {
			case 1 : 
				pnl_phim[i-1].setBounds(52, 11, 262, 325);
				break;
			case 2 :
				pnl_phim[i-1].setBounds(418, 11, 262, 325);
				break;
			case 3 : 
				pnl_phim[i-1].setBounds(784, 11, 262, 325);
				break;
			case 4 :
				pnl_phim[i-1].setBounds(52, 368, 262, 325);
				break;
			case 5 : 
				pnl_phim[i-1].setBounds(418, 368, 262, 325);
				break;
			case 6 :
				pnl_phim[i-1].setBounds(784, 368, 262, 325);
				break;
			}
		}
	}
	public static void ShowCanhBao(String mess) {
		JOptionPane.showMessageDialog(null, mess, "Cảnh báo", JOptionPane.WARNING_MESSAGE);
	}
	
	public nut_gradient getPhim1() {
		return book_phim1;
	}
	
	public nut_gradient getPhim2() {
		return book_phim2;
	}
	
	public nut_gradient getPhim3() {
		return book_phim3;
	}
	
	public nut_gradient getPhim4() {
		return book_phim4;
	}
	
	public nut_gradient getPhim5() {
		return book_phim5;
	}
	
	public nut_gradient getPhim6() {
		return book_phim6;
	}
	
	public JTextArea getTenPhim1() {
		return tieude_phim1;
	}
	
	public JTextArea getTenPhim2() {
		return tieude_phim2;
	}
	
	public JTextArea getTenPhim3() {
		return tieude_phim3;
	}
	
	public JTextArea getTenPhim4() {
		return tieude_phim4;
	}
	
	public JTextArea getTenPhim5() {
		return tieude_phim5;
	}
	
	public JTextArea getTenPhim6() {
		return tieude_phim6;
	}
	
}
