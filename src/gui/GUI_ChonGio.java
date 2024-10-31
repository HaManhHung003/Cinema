package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import component.nut_gradient;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUI_ChonGio extends JPanel{
	private JLabel hinh_phim,ten_phim;
	private JTextArea mo_ta;
	private JLabel lich_chieu;
	nut_gradient ngay_1,ngay_2,ngay_3,ngay_4,ngay_5,gio_1,gio_2,gio_3,gio_4,gio_5,gio_6,gio_7,gio_8,gio_9,gio_10,nut;
	private GradientPaint mau_gradient1,mau_gradient2;
	public GUI_ChonGio() throws FontFormatException, IOException {
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));
		
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
		hinh_phim.setIcon(new ImageIcon("src\\resources\\Image\\modomdom.jpg"));
		hinh_phim.setBounds(40, 21, 308, 412);
		add(hinh_phim);
		
		ten_phim = new JLabel();
		ten_phim.setText("MỘ ĐOM ĐÓM");
		ten_phim.setForeground(new Color(255, 142, 60));
		ten_phim.setFont(Dosis_Bold_20);
		ten_phim.setBounds(368, 11, 664, 63);
		add(ten_phim);
		
		mo_ta = new JTextArea();
		mo_ta.setText("Thể loại : Hoạt hình\n\nĐạo diễn : Takahata Isao \n\nThời lượng : 89 phút \n\nMô tả : Hai anh em Seita và Setsuko mất mẹ sau cuộc thả bom dữ dội của \n\nkhông quân Mỹ. Cả hai phải vật lộn để tồn tại ở Nhật Bản hậu Thế chiến II. \n\nNhưng xã hội khắc nghiệt và chúng vật lộn tìm kiếm thức ăn cũng như \n\nthoát khỏi những khó khăn giữa chiến tranh.");
		mo_ta.setOpaque(false);
		mo_ta.setEnabled(false);
		mo_ta.setEditable(false);
		mo_ta.setDisabledTextColor(new Color(255, 255, 255));
		mo_ta.setFont(Dosis_Bold_15);
		mo_ta.setBounds(368, 85, 760, 347);
		add(mo_ta);
		
		lich_chieu = new JLabel("Lịch chiếu");
		lich_chieu.setForeground(new Color(255, 255, 255));
		lich_chieu.setFont(Dosis_Bold_20);
		lich_chieu.setBounds(39, 444, 287, 48);
		add(lich_chieu);
		
		ngay_1 = new nut_gradient("7/10",mau_gradient2);
		ngay_1.setBounds(198, 486, 100, 44);
		ngay_1.setFont(Dosis_Bold_18);
		add(ngay_1);
		
		ngay_2 = new nut_gradient("8/10",mau_gradient2);
		ngay_2.setBounds(354, 486, 100, 44);
		ngay_2.setFont(Dosis_Bold_18);
		add(ngay_2);
		
		ngay_3 = new nut_gradient("9/10",mau_gradient2);
		ngay_3.setBounds(510, 486, 100, 44);
		ngay_3.setFont(Dosis_Bold_18);
		add(ngay_3);
		
		ngay_4 = new nut_gradient("10/10",mau_gradient2);
		ngay_4.setBounds(666, 486, 100, 44);
		ngay_4.setFont(Dosis_Bold_18);
		add(ngay_4);
		
		ngay_5 = new nut_gradient("11/10",mau_gradient2);
		ngay_5.setBounds(822, 486, 100, 44);
		ngay_5.setFont(Dosis_Bold_18);
		add(ngay_5);
		
		gio_1 = new nut_gradient("10:30",mau_gradient2);
		gio_1.setBounds(120, 564, 96, 38);
		gio_1.setFont(Dosis_Bold_18);
		add(gio_1);
		
		gio_2 = new nut_gradient("12:10",mau_gradient2);
		gio_2.setBounds(318, 564, 96, 38);
		gio_2.setFont(Dosis_Bold_18);
		add(gio_2);
		
		gio_3 = new nut_gradient("13:50",mau_gradient2);
		gio_3.setBounds(516, 564, 96, 38);
		gio_3.setFont(Dosis_Bold_18);
		add(gio_3);
		
		gio_4 = new nut_gradient("15:30",mau_gradient2);
		gio_4.setBounds(714, 564, 96, 38);
		gio_4.setFont(Dosis_Bold_18);
		add(gio_4);
		
		gio_5 = new nut_gradient("17:10",mau_gradient2);
		gio_5.setBounds(912, 564, 96, 38);
		gio_5.setFont(Dosis_Bold_18);
		add(gio_5);
		
		gio_6 = new nut_gradient("18:50",mau_gradient2);
		gio_6.setBounds(120, 640, 96, 38);
		gio_6.setFont(Dosis_Bold_18);
		add(gio_6);
		
		gio_7 = new nut_gradient("20:30",mau_gradient2);
		gio_7.setBounds(318, 640, 96, 38);
		gio_7.setFont(Dosis_Bold_18);
		add(gio_7);
		
		gio_8 = new nut_gradient("22:10",mau_gradient2);
		gio_8.setBounds(516, 640, 96, 38);
		gio_8.setFont(Dosis_Bold_18);
		add(gio_8);
		
		gio_9 = new nut_gradient("23:00",mau_gradient2);
		gio_9.setBounds(714, 640, 96, 38);
		gio_9.setFont(Dosis_Bold_18);
		add(gio_9);
		
		gio_10 = new nut_gradient("23:50",mau_gradient2);
		gio_10.setBounds(912, 640, 96, 38);
		gio_10.setFont(Dosis_Bold_18);
		add(gio_10);
		
		ngay_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        ngay_1.setGradient(mau_gradient1); 
		        ngay_2.setGradient(mau_gradient2); 
			    ngay_3.setGradient(mau_gradient2); 
			    ngay_4.setGradient(mau_gradient2); 
			    ngay_5.setGradient(mau_gradient2);  
			    gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		        ngay_1.repaint();
		        ngay_2.repaint();
		        ngay_3.repaint();
		        ngay_4.repaint();
		        ngay_5.repaint();
		    }
		});
		
		ngay_2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient1); 
		    	ngay_3.setGradient(mau_gradient2); 
		    	ngay_4.setGradient(mau_gradient2); 
		    	ngay_5.setGradient(mau_gradient2); 
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
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
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient2); 
		    	ngay_3.setGradient(mau_gradient1); 
		    	ngay_4.setGradient(mau_gradient2); 
		    	ngay_5.setGradient(mau_gradient2); 
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
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
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient2); 
		    	ngay_3.setGradient(mau_gradient2); 
		    	ngay_4.setGradient(mau_gradient1); 
		    	ngay_5.setGradient(mau_gradient2); 
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
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
		    	ngay_1.setGradient(mau_gradient2); 
		    	ngay_2.setGradient(mau_gradient2); 
		    	ngay_3.setGradient(mau_gradient2); 
		    	ngay_4.setGradient(mau_gradient2); 
		    	ngay_5.setGradient(mau_gradient1); 
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
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
		    	gio_1.setGradient(mau_gradient1); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient1); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient1); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_4.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient1); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_5.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient1); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		
		gio_6.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient1); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_7.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient1); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_8.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient1); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_9.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient1); 
		    	gio_10.setGradient(mau_gradient2); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
		
		gio_10.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	gio_1.setGradient(mau_gradient2); 
		    	gio_2.setGradient(mau_gradient2); 
		    	gio_3.setGradient(mau_gradient2); 
		    	gio_4.setGradient(mau_gradient2); 
		    	gio_5.setGradient(mau_gradient2); 
		    	gio_6.setGradient(mau_gradient2); 
		    	gio_7.setGradient(mau_gradient2); 
		    	gio_8.setGradient(mau_gradient2); 
		    	gio_9.setGradient(mau_gradient2); 
		    	gio_10.setGradient(mau_gradient1); 
		    	gio_1.repaint();
		    	gio_2.repaint();
		    	gio_3.repaint();
		    	gio_4.repaint();
		    	gio_5.repaint();
		    	gio_6.repaint();
		    	gio_7.repaint();
		    	gio_8.repaint();
		    	gio_9.repaint();
		    	gio_10.repaint();
		    }
		});
	}
}
