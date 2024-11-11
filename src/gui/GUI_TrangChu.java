package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import connectDB.JDBCUtil;

public class GUI_TrangChu extends JPanel{
	private JLabel poster;
	private JPanel phim1, phim2, phim3;
	private JLabel hinh_phim1, hinh_phim2, hinh_phim3;
	private JTextArea theloai_phim1, theloai_phim2, theloai_phim3;
	private JTextArea tieude_phim1, tieude_phim2, tieude_phim3;
	private String tenPhim1, tenPhim2, tenPhim3;
	private String link1, link2, link3;
	private int thoiLuong1, thoiLuong2, thoiLuong3;
	private String theLoai1, theLoai2, theLoai3;
	private Connection conn = JDBCUtil.getConnection();

	public GUI_TrangChu(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		setLayout(null);
		setSize(1128, 705);
		setBackground(new Color(35,33,33));
		poster = new JLabel();
		poster.setLocation(5, 0);
		poster.setIcon(new ImageIcon("src\\resources\\Image\\banner\\poster2.png"));
		poster.setSize(1118, 378);
		add(poster);
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(19f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		//do du lieu
		try(CallableStatement stmt = conn.prepareCall("{CALL GetFilm()}")) {
            ResultSet rs = stmt.executeQuery();
            int i = 1;

            while (rs.next()) {
                switch (i) {
                    case 4:
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
                    case 5:
                        tenPhim3 = rs.getString("tenPhim");
                        thoiLuong3 = rs.getInt("thoiLuong");
                        theLoai3 = rs.getString("theLoai");
                        link3 = rs.getString("hinhAnh");
                        break;
                }
                i++;
            }
		} catch (SQLException e2) {
            e2.printStackTrace();
        } 
		
		//phim1
		phim1 = new JPanel();
		phim1.setOpaque(false);
		phim1.setBackground(new Color(0, 100, 0));
		phim1.setBounds(52, 415, 262, 284);
		add(phim1);
		phim1.setLayout(null);
		
		hinh_phim1 = new JLabel("New label");
		hinh_phim1.setBorder(null);
		hinh_phim1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hinh_phim1.setIcon(new ImageIcon(link1));
		hinh_phim1.setBackground(new Color(0, 0, 0));
		hinh_phim1.setBounds(0, 0, 262, 195);
		phim1.add(hinh_phim1);
		theloai_phim1 = new JTextArea();
		theloai_phim1.setOpaque(false);
		theloai_phim1.setBackground(new Color(0, 255, 255));
		theloai_phim1.setTabSize(2);
		
		theloai_phim1.setText("Thể loại : "+theLoai1+"\nThời lượng :  "+thoiLuong1+" phút");
		theloai_phim1.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim1.setFont(Dosis_Bold_14);
		theloai_phim1.setEnabled(false);
		theloai_phim1.setEditable(false);
		theloai_phim1.setBounds(0, 236, 262, 48);
		phim1.add(theloai_phim1);
		
		tieude_phim1 = new JTextArea();
		tieude_phim1.setText(tenPhim1);
		tieude_phim1.setOpaque(false);
		tieude_phim1.setBackground(new Color(112, 128, 144));
		tieude_phim1.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim1.setFont(Dosis_Bold_20);
		tieude_phim1.setEnabled(false);
		tieude_phim1.setEditable(false);
		tieude_phim1.setBounds(0, 207, 262, 28);
		phim1.add(tieude_phim1);
		
		//phim2
		phim2 = new JPanel();
		phim2.setOpaque(false);
		phim2.setBounds(418, 415, 262, 284);
		add(phim2);
		phim2.setLayout(null);
		
		hinh_phim2 = new JLabel("New label");
		hinh_phim2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hinh_phim2.setBounds(0, 0, 262, 195);
		hinh_phim2.setIcon(new ImageIcon(link2));
		phim2.add(hinh_phim2);
		
		theloai_phim2 = new JTextArea();
		theloai_phim2.setText("Thể loại : "+theLoai2+"\nThời lượng :  "+thoiLuong2+" phút");
		theloai_phim2.setOpaque(false);
		theloai_phim2.setFont(null);
		theloai_phim2.setEnabled(false);
		theloai_phim2.setEditable(false);
		theloai_phim2.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim2.setBounds(0, 236, 262, 48);
		theloai_phim2.setFont(Dosis_Bold_14);
		phim2.add(theloai_phim2);
		
		tieude_phim2 = new JTextArea();
		tieude_phim2.setText(tenPhim2);
		tieude_phim2.setOpaque(false);
		tieude_phim2.setFont(null);
		tieude_phim2.setEnabled(false);
		tieude_phim2.setEditable(false);
		tieude_phim2.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim2.setBackground(new Color(112, 128, 144));
		tieude_phim2.setBounds(0, 207, 262, 39);
		tieude_phim2.setFont(Dosis_Bold_20);
		phim2.add(tieude_phim2);
		
		//phim3
		phim3 = new JPanel();
		phim3.setOpaque(false);
		phim3.setBounds(784, 415, 262, 284);
		add(phim3);
		phim3.setLayout(null);
		
		hinh_phim3 = new JLabel("New label");
		hinh_phim3.setBounds(0, 0, 262, 195);
		hinh_phim3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hinh_phim3.setIcon(new ImageIcon(link3));
		phim3.add(hinh_phim3);
		
		theloai_phim3 = new JTextArea();
		theloai_phim3.setText("Thể loại : "+theLoai3+"\nThời lượng :  "+thoiLuong3+" phút");
		theloai_phim3.setOpaque(false);
		theloai_phim3.setFont(null);
		theloai_phim3.setEnabled(false);
		theloai_phim3.setEditable(false);
		theloai_phim3.setDisabledTextColor(new Color(255, 238, 231));
		theloai_phim3.setBounds(0, 236, 262, 48);
		theloai_phim3.setFont(Dosis_Bold_14);
		phim3.add(theloai_phim3);
		
		tieude_phim3 = new JTextArea();
		tieude_phim3.setText(tenPhim3);
		tieude_phim3.setOpaque(false);
		tieude_phim3.setFont(null);
		tieude_phim3.setEnabled(false);
		tieude_phim3.setEditable(false);
		tieude_phim3.setDisabledTextColor(new Color(255, 238, 231));
		tieude_phim3.setBackground(new Color(112, 128, 144));
		tieude_phim3.setBounds(0, 207, 262, 39);
		tieude_phim3.setFont(Dosis_Bold_20);
		phim3.add(tieude_phim3);
		
		hinh_phim1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	man_hinh.showChonGioPanel();
		    }
		});
		
		hinh_phim2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	man_hinh.showChonGioPanel();
		    }
		});
		
		hinh_phim3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	man_hinh.showChonGioPanel();
		    }
		});
	}
	
	public JLabel getPhim1() {
		return hinh_phim1;
	}
	public JLabel getPhim2() {
		return hinh_phim2;
	}
	public JLabel getPhim3() {
		return hinh_phim3;
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
}
