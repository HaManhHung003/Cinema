package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import component.nut_gradient;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
public class GUI_HoaDon extends JPanel{
	private GradientPaint mau_gradient;
	private JPanel panel;
	private JLabel rap_lbl,tenPhim_lbl,ngayChieu_lbl,gioChieu_lbl,phong_lbl,ghe_lbl,KhachHang_lbl,tongTien_lbl,sum;
	private JTextArea the_lbl,diaChi_lbl;
	private JLabel thanh_ngang;
	private JLabel thanh_ngang_1;
	private JLabel thanh_ngang_2;
	public GUI_HoaDon(GUI_Man_hinh_chinh man_hinh, GUI_ChonGhe chon_ghe) throws FontFormatException, IOException {
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));

		UI();
	}
	
	public void UI() throws FontFormatException, IOException {
		

		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_18 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(18f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Bold_10 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(10f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		mau_gradient = new GradientPaint(p1,new Color(171,27,27),p2,new Color(171,27,27));
		
		panel = new JPanel();
		panel.setBounds(362, 61, 387, 487);
		panel.setBackground(new Color(217,217,217));
		add(panel);
		panel.setLayout(null);
		
		the_lbl = new JTextArea();
		the_lbl.setBorder(null);
		the_lbl.setDisabledTextColor(new Color(0, 0, 0));
		the_lbl.setEditable(false);
		the_lbl.setEnabled(false);
		the_lbl.setOpaque(false);
		the_lbl.setFont(Dosis_Bold);
		the_lbl.setText("THẺ VÀO PHÒNG\n    CHIẾU PHIM");
		the_lbl.setBounds(118, 25, 167, 90);
		panel.add(the_lbl);
		
		rap_lbl = new JLabel("H2N Cinema");
		rap_lbl.setBounds(28, 103, 284, 32);
		rap_lbl.setFont(Dosis_Bold_18);
		panel.add(rap_lbl);
		
		diaChi_lbl = new JTextArea();
		diaChi_lbl.setText("Tầng 2 Gigamall, 240 Phạm Văn Đồng, Phường \nHiệp Bình Chánh, TP. Thủ Đức, TP.HCM");
		diaChi_lbl.setDisabledTextColor(new Color(0, 0, 0));
		diaChi_lbl.setEditable(false);
		diaChi_lbl.setEnabled(false);
		diaChi_lbl.setOpaque(false);
		diaChi_lbl.setFont(Dosis_Bold_14);
		diaChi_lbl.setBounds(28, 141, 306, 57);
		panel.add(diaChi_lbl);
		
		tenPhim_lbl = new JLabel();
		tenPhim_lbl.setForeground(new Color(0, 0, 0));
		tenPhim_lbl.setText("MỘ ĐOM ĐÓM");
		tenPhim_lbl.setBounds(28, 209, 217, 43);
		tenPhim_lbl.setFont(Dosis_Bold_18);
		panel.add(tenPhim_lbl);
		
		ngayChieu_lbl = new JLabel();
		ngayChieu_lbl.setBounds(28, 251, 306, 32);
		ngayChieu_lbl.setText("Thời gian : "+"27/10"+"/2024" +" - "+ "19:35");
		ngayChieu_lbl.setFont(Dosis_Bold_14);
		panel.add(ngayChieu_lbl);
		
		phong_lbl = new JLabel();
		phong_lbl.setBounds(28, 294, 94, 32);
		phong_lbl.setText("Phòng : "+"P03");
		phong_lbl.setFont(Dosis_Bold_14);
		panel.add(phong_lbl);
		
		ghe_lbl = new JLabel();
		ghe_lbl.setBounds(221, 294, 156, 32);
		ghe_lbl.setText("Ghế : "+"K03,K14,K12");
		ghe_lbl.setFont(Dosis_Bold_14);
		panel.add(ghe_lbl);
		
		KhachHang_lbl = new JLabel();
		KhachHang_lbl.setBounds(28, 362, 257, 24);
		KhachHang_lbl.setText("LÊ VĂN TUẤN NGUYÊN");
		KhachHang_lbl.setFont(Dosis_Bold_18);
		panel.add(KhachHang_lbl);
		
		tongTien_lbl = new JLabel();
		tongTien_lbl.setBounds(28, 401, 112, 24);
		tongTien_lbl.setText("- Tổng tiền : ");
		tongTien_lbl.setFont(Dosis_Bold_14);
		panel.add(tongTien_lbl);
		
		sum = new JLabel();
		sum.setBounds(221, 401, 130, 24);
		sum.setText("VNĐ "+"365.000");
		sum.setFont(Dosis_Bold_14);
		panel.add(sum);
		
		thanh_ngang = new JLabel(".........................................................................................................................");
		thanh_ngang.setBounds(28, 184, 337, 14);
		panel.add(thanh_ngang);
		
		thanh_ngang_1 = new JLabel(".........................................................................................................................");
		thanh_ngang_1.setBounds(28, 337, 337, 14);
		panel.add(thanh_ngang_1);
		
		thanh_ngang_2 = new JLabel(".........................................................................................................................");
		thanh_ngang_2.setBounds(28, 436, 337, 14);
		panel.add(thanh_ngang_2);
	}
}
