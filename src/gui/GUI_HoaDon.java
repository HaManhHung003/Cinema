package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JPanel;
import component.nut_gradient;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
public class GUI_HoaDon extends JPanel{
	private GradientPaint mau_gradient;
	private JPanel panel,panel_1;
	private JLabel rap_lbl,tenPhim_lbl,ngayChieu_lbl,phong_lbl,ghe_lbl,KhachHang_lbl,tongTien_lbl,sum,
	rap_lbl_1,tenPhim_lbl_1,ngayChieu_lbl_1,phong_lbl_1,ghe_lbl_1,KhachHang_lbl_1,khuyenMai_lbl,sum_km;
	private JTextArea the_lbl,diaChi_lbl,the_lbl_1;
	private JLabel thanh_ngang,thanh_ngang_1,thanh_ngang_2,thanh_ngang_2_1,thanh_ngang_3,thanh_ngang_1_1;
	private String tenPhim,ngayChieu,gioChieu,maPhong,gheDat,KH, gheDatRieng,tenNhanVien;
	private int Tongtien,KM,giaVe,giaGheRieng;
	private JLabel sum_km_1;
	private JLabel tongTien_lbl_1;
	private JLabel sum_1;
	public GUI_HoaDon(GUI_Man_hinh_chinh man_hinh, GUI_ChonGhe chon_ghe,GUI_DangNhap logIn) throws FontFormatException, IOException {
		setSize(1128,705);
		setLayout(null);
		setBackground(new Color(36,34,34));
		tenPhim = chon_ghe.getTenPhim();
		ngayChieu = chon_ghe.getNgayChieu();
		gioChieu = chon_ghe.getGioChieu();
		maPhong = chon_ghe.getMaPhong();
		KH = chon_ghe.getKH();
		gheDat = chon_ghe.getGheDat();
		Tongtien = chon_ghe.getTongTien();
		gheDatRieng = chon_ghe.getTenGheRieng();
		KM = chon_ghe.getKM();
		giaVe = chon_ghe.getGiaVe();
		tenNhanVien = logIn.getTenNV();
		giaGheRieng = chon_ghe.getGiaGheRieng();
		UI();
	}
	
	public void UI() throws FontFormatException, IOException {
		

		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_30 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(30f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(20f);
		Font Dosis_Bold_18 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(18f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Bold_10 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(10f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
		
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		mau_gradient = new GradientPaint(p1,new Color(171,27,27),p2,new Color(171,27,27));
		
		panel = new JPanel();
		panel.setBounds(45, 66, 387, 487);
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
		tenPhim_lbl.setText(tenPhim);
		tenPhim_lbl.setBounds(28, 209, 217, 43);
		tenPhim_lbl.setFont(Dosis_Bold_18);
		panel.add(tenPhim_lbl);
		
		ngayChieu_lbl = new JLabel();
		ngayChieu_lbl.setBounds(28, 251, 306, 32);
		String[] thoiGian = gioChieu.split(":");
		int hour = Integer.parseInt(thoiGian[0]);
	    if (hour < 12) {
	    	ngayChieu_lbl.setText("Thời gian : "+ngayChieu+"/2024" +" - "+ gioChieu+" AM");
	    } else {
	    	ngayChieu_lbl.setText("Thời gian : "+ngayChieu+"/2024" +" - "+ gioChieu+ "PM");
	    }
		ngayChieu_lbl.setFont(Dosis_Bold_14);
		panel.add(ngayChieu_lbl);
		
		phong_lbl = new JLabel();
		phong_lbl.setBounds(28, 294, 94, 32);
		phong_lbl.setText("Phòng : "+maPhong);
		phong_lbl.setFont(Dosis_Bold_14);
		panel.add(phong_lbl);
		
		ghe_lbl = new JLabel();
		ghe_lbl.setBounds(221, 294, 156, 32);
		String gheChon = gheDatRieng.replaceAll(",$", "");
		ghe_lbl.setText("Ghế : "+gheChon);
		ghe_lbl.setFont(Dosis_Bold_14);
		panel.add(ghe_lbl);
		
		KhachHang_lbl = new JLabel();
		KhachHang_lbl.setBounds(28, 362, 257, 24);
		KhachHang_lbl.setText("Người lớn");
		KhachHang_lbl.setFont(Dosis_Bold_18);
		panel.add(KhachHang_lbl);
		
		tongTien_lbl = new JLabel();
		tongTien_lbl.setBounds(28, 401, 112, 24);
		tongTien_lbl.setText("- Tổng tiền : ");
		tongTien_lbl.setFont(Dosis_Bold_14);
		panel.add(tongTien_lbl);
		
		sum = new JLabel();
		sum.setBounds(221, 401, 130, 24);
		DecimalFormat formatter = new DecimalFormat("#,###");
        String tongTienGhePhim = formatter.format(giaGheRieng).replace(",", ".");
		sum.setText("VNĐ "+tongTienGhePhim);
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
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(217, 217, 217));
		panel_1.setBounds(570, 66, 387, 434);
		add(panel_1);
		
		the_lbl_1 = new JTextArea();
		the_lbl_1.setText("HÓA ĐƠN");
		the_lbl_1.setBorder(null);
		the_lbl_1.setDisabledTextColor(new Color(0, 0, 0));
		the_lbl_1.setEditable(false);
		the_lbl_1.setEnabled(false);
		the_lbl_1.setOpaque(false);
		the_lbl_1.setFont(Dosis_Bold_30);
		the_lbl_1.setBounds(148, 25, 156, 39);
		panel_1.add(the_lbl_1);
		
		rap_lbl_1 = new JLabel("Nhân viên : "+tenNhanVien);
		rap_lbl_1.setFont(Dosis_Bold_18);
		rap_lbl_1.setBounds(28, 74, 284, 32);
		panel_1.add(rap_lbl_1);
		
		tenPhim_lbl_1 = new JLabel();
		tenPhim_lbl_1.setText(tenPhim);
		tenPhim_lbl_1.setForeground(Color.BLACK);
		tenPhim_lbl_1.setFont(Dosis_Bold_18);
		tenPhim_lbl_1.setBounds(28, 130, 217, 43);
		panel_1.add(tenPhim_lbl_1);
		
		ngayChieu_lbl_1 = new JLabel();
	    if (hour < 12) {
	    	ngayChieu_lbl_1.setText("Thời gian : "+ngayChieu+"/2024" +" - "+ gioChieu+" AM");
	    } else {
	    	ngayChieu_lbl_1.setText("Thời gian : "+ngayChieu+"/2024" +" - "+ gioChieu+ "PM");
	    }
		ngayChieu_lbl_1.setFont(Dosis_Bold_14);
		ngayChieu_lbl_1.setBounds(28, 172, 306, 32);
		panel_1.add(ngayChieu_lbl_1);
		
		phong_lbl_1 = new JLabel();
		phong_lbl_1.setText("Phòng : "+maPhong);
		phong_lbl_1.setFont(Dosis_Bold_14);
		phong_lbl_1.setBounds(28, 215, 94, 32);
		panel_1.add(phong_lbl_1);
		
		ghe_lbl_1 = new JLabel();
		ghe_lbl_1.setText("Ghế : "+gheDat);
		ghe_lbl_1.setFont(Dosis_Bold_14);
		ghe_lbl_1.setBounds(221, 215, 156, 32);
		panel_1.add(ghe_lbl_1);
		
		KhachHang_lbl_1 = new JLabel();
		if(KH.equals("")) {
			KhachHang_lbl_1.setText("- Giá vé : ");
			KhachHang_lbl_1.setFont(Dosis_Bold_14);
		}else {
			KhachHang_lbl_1.setText(KH);
			KhachHang_lbl_1.setFont(Dosis_Bold_18);
		}
		KhachHang_lbl_1.setBounds(27, 286, 188, 24);
		panel_1.add(KhachHang_lbl_1);
		
		khuyenMai_lbl = new JLabel();
		khuyenMai_lbl.setText("- Khuyến mãi :");
		khuyenMai_lbl.setFont(Dosis_Bold_14);
		khuyenMai_lbl.setBounds(27, 325, 112, 24);
		panel_1.add(khuyenMai_lbl);
		
		sum_km = new JLabel();
		String kmMoi = formatter.format(KM).replace(",", ".");
		sum_km.setText("VNĐ "+kmMoi);
		sum_km.setFont(Dosis_Bold_14);
		sum_km.setBounds(220, 325, 130, 24);
		panel_1.add(sum_km);
		
		thanh_ngang_3 = new JLabel(".........................................................................................................................");
		thanh_ngang_3.setBounds(28, 110, 337, 14);
		panel_1.add(thanh_ngang_3);
		
		thanh_ngang_1_1 = new JLabel(".........................................................................................................................");
		thanh_ngang_1_1.setBounds(28, 253, 337, 14);
		panel_1.add(thanh_ngang_1_1);
		
		thanh_ngang_2_1 = new JLabel(".........................................................................................................................");
		thanh_ngang_2_1.setBounds(28, 397, 337, 14);
		panel_1.add(thanh_ngang_2_1);
		
		tongTien_lbl_1 = new JLabel();
		tongTien_lbl_1.setText("- Tổng tiền : ");
		tongTien_lbl_1.setFont(Dosis_Bold_14);
		tongTien_lbl_1.setBounds(27, 363, 112, 24);
		panel_1.add(tongTien_lbl_1);
		
		sum_1 = new JLabel();
		String tongMoi = formatter.format(Tongtien).replace(",", ".");
		sum_1.setText("VNĐ "+tongMoi);
		sum_1.setFont(Dosis_Bold_14);
		sum_1.setBounds(220, 363, 130, 24);
		panel_1.add(sum_1);
		
		sum_km_1 = new JLabel();
		String giaVeMoi = formatter.format(giaVe).replace(",", ".");
		sum_km_1.setText("VNĐ "+giaVeMoi);
		sum_km_1.setFont(Dosis_Bold_14);
		sum_km_1.setBounds(220, 286, 130, 24);
		panel_1.add(sum_km_1);
	}
}
