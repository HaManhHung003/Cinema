package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.print.attribute.AttributeSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import component.nut_gradient;
import component.MyPanel;
import connectDB.JDBCUtil;

public class GUI_ChonGhe extends JPanel{
	private JTextField txtKhachHang,txtKhuyenMai;
	private JSeparator thanh_ngang1,thanh_ngang2;
	private JLabel rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI,lbManHinh,lbSuat,lbGheChon,lbGhe,lbPhim,lbGheDon,lbGheDoi,lbGheDangChon,lbGheDaDat,lbGheTrong,lbTongCong,customer_check,promotion_check;
	private nut_gradient A01, A02, A03, A04, A05, A06, A07, A08, A09, A010, A011,B01, B02, B03, B04, B05, B06, B07, B08, B09, 
					B010, B011,C01, C02, C03, C04, C05, C06, C07, C08, C09, C010, C011,D01, D02, D03, D04, D05, D06, D07, D08, D09, D010, D011,
					E01, E02, E03, E04, E05, E06, E07, E08, E09, E010, E011,F01, F02, F03, F04, F05, F06, F07, F08, F09, F010, F011,
					G01, G02, G03, G04, G05, G06, G07, G08, G09, G010, G011,H01, H02, H03, H04, H05, H06, H07, H08, H09, H010, H011,
					I01, I02, I03, I04, I05, I06,gheTrong,gheDaDat,gheDangChon,gheDon,gheDoi,btn_DatVe;
	private String A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11,B1, B2, B3, B4, B5, B6, B7, B8, B9, 
	B10, B11,C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11,D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11,
	E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11,F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11,
	G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11,H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11,
	I1, I2, I3, I4, I5, I6,GheDat,gioChieu,ngayChieu,maPhim,tenPhim,tenKH,maPhong,maLichChieu,tenGheRieng;
	private int TTA1, TTA2, TTA3, TTA4, TTA5, TTA6, TTA7, TTA8, TTA9, TTA10, TTA11,TTB1, TTB2, TTB3, TTB4, TTB5, TTB6, TTB7, TTB8, TTB9, 
	TTB10, TTB11,TTC1, TTC2, TTC3, TTC4, TTC5, TTC6, TTC7, TTC8, TTC9, TTC10, TTC11,TTD1, TTD2, TTD3, TTD4, TTD5, TTD6, TTD7, TTD8, TTD9, TTD10, TTD11,
	TTE1, TTE2, TTE3, TTE4, TTE5, TTE6, TTE7, TTE8, TTE9, TTE10, TTE11,TTF1, TTF2, TTF3, TTF4, TTF5, TTF6, TTF7, TTF8, TTF9, TTF10, TTF11,
	TTG1, TTG2, TTG3, TTG4, TTG5, TTG6, TTG7, TTG8, TTG9, TTG10, TTG11,TTH1, TTH2, TTH3, TTH4, TTH5, TTH6, TTH7, TTH8, TTH9, TTH10, TTH11,
	TTI1, TTI2, TTI3, TTI4, TTI5, TTI6,out = 0;
	private int giaGheA01, giaGheA02, giaGheA03, giaGheA04, giaGheA05, giaGheA06, giaGheA07, giaGheA08, giaGheA09, giaGheA10, giaGheA11,
	giaGheB01, giaGheB02, giaGheB03, giaGheB04, giaGheB05, giaGheB06, giaGheB07, giaGheB08, giaGheB09, giaGheB10, giaGheB11,
	giaGheC01, giaGheC02, giaGheC03, giaGheC04, giaGheC05, giaGheC06, giaGheC07, giaGheC08, giaGheC09, giaGheC10, giaGheC11,
	giaGheD01, giaGheD02, giaGheD03, giaGheD04, giaGheD05, giaGheD06, giaGheD07, giaGheD08, giaGheD09, giaGheD10, giaGheD11,
	giaGheE01, giaGheE02, giaGheE03, giaGheE04, giaGheE05, giaGheE06, giaGheE07, giaGheE08, giaGheE09, giaGheE10, giaGheE11,
	giaGheF01, giaGheF02, giaGheF03, giaGheF04, giaGheF05, giaGheF06, giaGheF07, giaGheF08, giaGheF09, giaGheF10, giaGheF11,
	giaGheG01, giaGheG02, giaGheG03, giaGheG04, giaGheG05, giaGheG06, giaGheG07, giaGheG08, giaGheG09, giaGheG10, giaGheG11,
	giaGheH01, giaGheH02, giaGheH03, giaGheH04, giaGheH05, giaGheH06, giaGheH07, giaGheH08, giaGheH09, giaGheH10, giaGheH11,
	giaGheI01,giaGheI02,giaGheI03,giaGheI04,giaGheI05,giaGheI06,giaPhim,giaGheDoi,tongTien = 0,giaVe,KM,getGiaFilm,giaGheRieng;;
	private GradientPaint mau_Trong,mau_DaDat,mau_DangChon,mau_gradient;
	private MyPanel  promotion_in,customer_in;
	private JTextField promotion_out,customer_out,dateTime,sum;
	private Connection conn = JDBCUtil.getConnection();
	protected String codeKM,maNV;
	public GUI_ChonGhe(GUI_Man_hinh_chinh man_hinh,GUI_ChonGio chon_gio,GUI_DangNhap logIn) throws FontFormatException, IOException {
		setSize(1128,705);
		setBackground(new Color(36, 34, 34));
		setLayout(null);
	
		tenPhim = man_hinh.getTenPhim().getText();
		maPhim = man_hinh.getMaPhim().getText();
		ngayChieu = man_hinh.getNgayChieu().getText();
		gioChieu = man_hinh.getGioChieu().getText();
		maNV = logIn.getMaNV();
		connect(maPhim,ngayChieu,gioChieu);
		GheUI(man_hinh);
		kiemtraGhe();
	}
	
	protected void connect(String maPhim,String ngayChieu, String gioChieu) {
		// TODO Auto-generated method stub
		try(CallableStatement stmt = conn.prepareCall("{CALL getTTGhe(?,?,?)}")) {
			stmt.setNString(1, maPhim);
			stmt.setNString(2, ngayChieu);
			stmt.setNString(3, gioChieu);
			ResultSet rs = stmt.executeQuery();
			int  i =1;
			while (rs.next()) {
				switch (i) {
                case 1:
                	maLichChieu = rs.getString("maLichChieu");
                	getGiaFilm = rs.getInt("giave");
                	maPhong = rs.getString("maPhong");
                	
                	TTA1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 2:
                	TTA2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 3:
                	TTA3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 4:
                	TTA4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 5:
                	TTA5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 6:
                	TTA6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 7:
                	TTA7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 8:
                	TTA8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 9:
                	TTA9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 10:
                	TTA10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 11:
                	TTA11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 12:
                	TTB1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 13:
                	TTB2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 14:
                	TTB3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 15:
                	TTB4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 16:
                	TTB5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 17:
                	TTB6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 18:
                	TTB7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 19:
                	TTB8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 20:
                	TTB9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 21:
                	TTB10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 22:
                	TTB11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 23:
                	TTC1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 24:
                	TTC2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 25:
                	TTC3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 26:
                	TTC4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 27:
                	TTC5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 28:
                	TTC6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 29:
                	TTC7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 30:
                	TTC8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 31:
                	TTC9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 32:
                	TTC10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 33:
                	TTC11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 34:
                	TTD1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 35:
                	TTD2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 36:
                	TTD3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 37:
                	TTD4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 38:
                	TTD5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 39:
                	TTD6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 40:
                	TTD7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 41:
                	TTD8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 42:
                	TTD9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 43:
                	TTD10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 44:
                	TTD11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 45:
                	TTE1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 46:
                	TTE2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 47:
                	TTE3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 48:
                	TTE4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 49:
                	TTE5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 50:
                	TTE6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 51:
                	TTE7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 52:
                	TTE8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 53:
                	TTE9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 54:
                	TTE10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 55:
                	TTE11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 56:
                	TTF1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 57:
                	TTF2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 58:
                	TTF3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 59:
                	TTF4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 60:
                	TTF5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 61:
                	TTF6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 62:
                	TTF7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 63:
                	TTF8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 64:
                	TTF9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 65:
                	TTF10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 66:
                	TTF11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 67:
                	TTG1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 68:
                	TTG2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 69:
                	TTG3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 70:
                	TTG4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 71:
                	TTG5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 72:
                	TTG6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 73:
                	TTG7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 74:
                	TTG8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 75:
                	TTG9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 76:
                	TTG10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 77:
                	TTG11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 78:
                	TTH1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 79:
                	TTH2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 80:
                	TTH3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 81:
                	TTH4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 82:
                	TTH5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 83:
                	TTH6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 84:
                	TTH7 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 85:
                	TTH8 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 86:
                	TTH9 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 87:
                	TTH10 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 88:
                	TTH11 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 89:
                	TTI1 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 90:
                	TTI2 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 91:
                	TTI3 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 92:
                	TTI4 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 93:
                	TTI5 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
                case 94:
                	TTI6 = Integer.parseInt(rs.getString("trangThaiStatus"));
                    break;
				}
				i++;
			}
			
		} catch (SQLException e2) {
            e2.printStackTrace();
        } 
	}
	
	protected void kiemtraGhe() {
		if(TTA1 == 1 ) {
			A01.setGradient(mau_DaDat);
			A01.setEnabled(false);
			TTA1 = 0;
		}
		if(TTA2 == 1 ) {
			A02.setGradient(mau_DaDat);
			A02.setEnabled(false);
			TTA2 = 0;
		}
		if(TTA3 == 1 ) {
			A03.setGradient(mau_DaDat);
			A03.setEnabled(false);
			TTA3 = 0;
		}
		if(TTA4 == 1 ) {
			A04.setGradient(mau_DaDat);
			A04.setEnabled(false);
			TTA4 = 0;
		}
		if(TTA5 == 1 ) {
			A05.setGradient(mau_DaDat);
			A05.setEnabled(false);
			TTA5 = 0;
		}
		if(TTA6 == 1 ) {
			A06.setGradient(mau_DaDat);
			A06.setEnabled(false);
			TTA6 = 0;
		}
		if(TTA7 == 1 ) {
			A07.setGradient(mau_DaDat);
			A07.setEnabled(false);
			TTA7 = 0;
		}
		if(TTA8 == 1 ) {
			A08.setGradient(mau_DaDat);
			A08.setEnabled(false);
			TTA8 = 0;
		}
		if(TTA9 == 1 ) {
			A09.setGradient(mau_DaDat);
			A09.setEnabled(false);
			TTA9 = 0;
		}
		if(TTA10 == 1 ) {
			A010.setGradient(mau_DaDat);
			A010.setEnabled(false);
			TTA10 = 0;
		}
		if(TTA11 == 1 ) {
			A011.setGradient(mau_DaDat);
			A011.setEnabled(false);
			TTA11 = 0;
		}
		if(TTB1 == 1 ) {
			B01.setGradient(mau_DaDat);
			B01.setEnabled(false);
			TTB1 = 0;
		}
		if(TTB2 == 1 ) {
			B02.setGradient(mau_DaDat);
			B02.setEnabled(false);
			TTB2 = 0;
		}
		if(TTB3 == 1 ) {
			B03.setGradient(mau_DaDat);
			B03.setEnabled(false);
			TTB3 = 0;
		}
		if(TTB4 == 1 ) {
			B04.setGradient(mau_DaDat);
			B04.setEnabled(false);
			TTB4 = 0;
		}
		if(TTB5 == 1 ) {
			B05.setGradient(mau_DaDat);
			B05.setEnabled(false);
			TTB5 = 0;
		}
		if(TTB6 == 1 ) {
			B06.setGradient(mau_DaDat);
			B06.setEnabled(false);
			TTB6 = 0;
		}
		if(TTB7 == 1 ) {
			B07.setGradient(mau_DaDat);
			B07.setEnabled(false);
			TTB7 = 0;
		}
		if(TTB8 == 1 ) {
			B08.setGradient(mau_DaDat);
			B08.setEnabled(false);
			TTB8 = 0;
		}
		if(TTB9 == 1 ) {
			B09.setGradient(mau_DaDat);
			B09.setEnabled(false);
			TTB9 = 0;
		}
		if(TTB10 == 1 ) {
			B010.setGradient(mau_DaDat);
			B010.setEnabled(false);
			TTB10 = 0;
		}
		if(TTB11 == 1 ) {
			B011.setGradient(mau_DaDat);
			B011.setEnabled(false);
			TTB11 = 0;
		}
		if(TTC1 == 1 ) {
			C01.setGradient(mau_DaDat);
			C01.setEnabled(false);
			TTC1 = 0;
		}
		if(TTC2 == 1 ) {
			C02.setGradient(mau_DaDat);
			C02.setEnabled(false);
			TTC2 = 0;
		}
		if(TTC3 == 1 ) {
			C03.setGradient(mau_DaDat);
			C03.setEnabled(false);
			TTC3 = 0;
		}
		if(TTC4 == 1 ) {
			C04.setGradient(mau_DaDat);
			C04.setEnabled(false);
			TTC4 = 0;
		}
		if(TTC5 == 1 ) {
			C05.setGradient(mau_DaDat);
			C05.setEnabled(false);
			TTC5 = 0;
		}
		if(TTC6 == 1 ) {
			C06.setGradient(mau_DaDat);
			C06.setEnabled(false);
			TTC6 = 0;
		}
		if(TTC7 == 1 ) {
			C07.setGradient(mau_DaDat);
			C07.setEnabled(false);
			TTC7 = 0;
		}
		if(TTC8 == 1 ) {
			C08.setGradient(mau_DaDat);
			C08.setEnabled(false);
			TTC8 = 0;
		}
		if(TTC9 == 1 ) {
			C09.setGradient(mau_DaDat);
			C09.setEnabled(false);
			TTC9 = 0;
		}
		if(TTC10 == 1 ) {
			C010.setGradient(mau_DaDat);
			C010.setEnabled(false);
			TTC10 = 0;
		}
		if(TTC11 == 1 ) {
			C011.setGradient(mau_DaDat);
			C011.setEnabled(false);
			TTC11 = 0;
		}
		if(TTD1 == 1 ) {
			D01.setGradient(mau_DaDat);
			D01.setEnabled(false);
			TTD1 = 0;
		}
		if(TTD2 == 1 ) {
			D02.setGradient(mau_DaDat);
			D02.setEnabled(false);
			TTD2 = 0;
		}
		if(TTD3 == 1 ) {
			D03.setGradient(mau_DaDat);
			D03.setEnabled(false);
			TTD3 = 0;
		}
		if(TTD4 == 1 ) {
			D04.setGradient(mau_DaDat);
			D04.setEnabled(false);
			TTD4 = 0;
		}
		if(TTD5 == 1 ) {
			D05.setGradient(mau_DaDat);
			D05.setEnabled(false);
			TTD5 = 0;
		}
		if(TTD6 == 1 ) {
			D06.setGradient(mau_DaDat);
			D06.setEnabled(false);
			TTD6 = 0;
		}
		if(TTD7 == 1 ) {
			D07.setGradient(mau_DaDat);
			D07.setEnabled(false);
			TTD7 = 0;
		}
		if(TTD8 == 1 ) {
			D08.setGradient(mau_DaDat);
			D08.setEnabled(false);
			TTD8 = 0;
		}
		if(TTD9 == 1 ) {
			D09.setGradient(mau_DaDat);
			D09.setEnabled(false);
			TTD9 = 0;
		}
		if(TTD10 == 1 ) {
			D010.setGradient(mau_DaDat);
			D010.setEnabled(false);
			TTD10 = 0;
		}
		if(TTD11 == 1 ) {
			D011.setGradient(mau_DaDat);
			D011.setEnabled(false);
			TTD11 = 0;
		}
		if(TTE1 == 1 ) {
			E01.setGradient(mau_DaDat);
			E01.setEnabled(false);
			TTE1 = 0;
		}
		if(TTE2 == 1 ) {
			E02.setGradient(mau_DaDat);
			E02.setEnabled(false);
			TTE2 = 0;
		}
		if(TTE3 == 1 ) {
			E03.setGradient(mau_DaDat);
			E03.setEnabled(false);
			TTE3 = 0;
		}
		if(TTE4 == 1 ) {
			E04.setGradient(mau_DaDat);
			E04.setEnabled(false);
			TTE4 = 0;
		}
		if(TTE5 == 1 ) {
			E05.setGradient(mau_DaDat);
			E05.setEnabled(false);
			TTE5 = 0;
		}
		if(TTE6 == 1 ) {
			E06.setGradient(mau_DaDat);
			E06.setEnabled(false);
			TTE6 = 0;
		}
		if(TTE7 == 1 ) {
			E07.setGradient(mau_DaDat);
			E07.setEnabled(false);
			TTE7 = 0;
		}
		if(TTE8 == 1 ) {
			E08.setGradient(mau_DaDat);
			E08.setEnabled(false);
			TTE8 = 0;
		}
		if(TTE9 == 1 ) {
			E09.setGradient(mau_DaDat);
			E09.setEnabled(false);
			TTE9 = 0;
		}
		if(TTE10 == 1 ) {
			E010.setGradient(mau_DaDat);
			E010.setEnabled(false);
			TTE10 = 0;
		}
		if(TTE11 == 1 ) {
			E011.setGradient(mau_DaDat);
			E011.setEnabled(false);
			TTE11 = 0;
		}
		if(TTF1 == 1 ) {
			F01.setGradient(mau_DaDat);
			F01.setEnabled(false);
			TTF1 = 0;
		}
		if(TTF2 == 1 ) {
			F02.setGradient(mau_DaDat);
			F02.setEnabled(false);
			TTF2 = 0;
		}
		if(TTF3 == 1 ) {
			F03.setGradient(mau_DaDat);
			F03.setEnabled(false);
			TTF3 = 0;
		}
		if(TTF4 == 1 ) {
			F04.setGradient(mau_DaDat);
			F04.setEnabled(false);
			TTF4 = 0;
		}
		if(TTF5 == 1 ) {
			F05.setGradient(mau_DaDat);
			F05.setEnabled(false);
			TTF5 = 0;
		}
		if(TTF6 == 1 ) {
			F06.setGradient(mau_DaDat);
			F06.setEnabled(false);
			TTF6 = 0;
		}
		if(TTF7 == 1 ) {
			F07.setGradient(mau_DaDat);
			F07.setEnabled(false);
			TTF7 = 0;
		}
		if(TTF8 == 1 ) {
			F08.setGradient(mau_DaDat);
			F08.setEnabled(false);
			TTF8 = 0;
		}
		if(TTF9 == 1 ) {
			F09.setGradient(mau_DaDat);
			F09.setEnabled(false);
			TTF9 = 0;
		}
		if(TTF10 == 1 ) {
			F010.setGradient(mau_DaDat);
			F010.setEnabled(false);
			TTF10 = 0;
		}
		if(TTF11 == 1 ) {
			F011.setGradient(mau_DaDat);
			F011.setEnabled(false);
			TTF11 = 0;
		}
		if(TTG1 == 1 ) {
			G01.setGradient(mau_DaDat);
			G01.setEnabled(false);
			TTG1 = 0;
		}
		if(TTG2 == 1 ) {
			G02.setGradient(mau_DaDat);
			G02.setEnabled(false);
			TTG2 = 0;
		}
		if(TTG3 == 1 ) {
			G03.setGradient(mau_DaDat);
			G03.setEnabled(false);
			TTG3 = 0;
		}
		if(TTG4 == 1 ) {
			G04.setGradient(mau_DaDat);
			G04.setEnabled(false);
			TTG4 = 0;
		}
		if(TTG5 == 1 ) {
			G05.setGradient(mau_DaDat);
			G05.setEnabled(false);
			TTG5 = 0;
		}
		if(TTG6 == 1 ) {
			G06.setGradient(mau_DaDat);
			G06.setEnabled(false);
			TTG6 = 0;
		}
		if(TTG7 == 1 ) {
			G07.setGradient(mau_DaDat);
			G07.setEnabled(false);
			TTG7 = 0;
		}
		if(TTG8 == 1 ) {
			G08.setGradient(mau_DaDat);
			G08.setEnabled(false);
			TTG8 = 0;
		}
		if(TTG9 == 1 ) {
			G09.setGradient(mau_DaDat);
			G09.setEnabled(false);
			TTG9 = 0;
		}
		if(TTG10 == 1 ) {
			G010.setGradient(mau_DaDat);
			G010.setEnabled(false);
			TTG10 = 0;
		}
		if(TTG11 == 1 ) {
			G011.setGradient(mau_DaDat);
			G011.setEnabled(false);
			TTG11 = 0;
		}
		if(TTH1 == 1 ) {
			H01.setGradient(mau_DaDat);
			H01.setEnabled(false);
			TTH1 = 0;
		}
		if(TTH2 == 1 ) {
			H02.setGradient(mau_DaDat);
			H02.setEnabled(false);
			TTH2 = 0;
		}
		if(TTH3 == 1 ) {
			H03.setGradient(mau_DaDat);
			H03.setEnabled(false);
			TTH3 = 0;
		}
		if(TTH4 == 1 ) {
			H04.setGradient(mau_DaDat);
			H04.setEnabled(false);
			TTH4 = 0;
		}
		if(TTH5 == 1 ) {
			H05.setGradient(mau_DaDat);
			H05.setEnabled(false);
			TTH5 = 0;
		}
		if(TTH6 == 1 ) {
			H06.setGradient(mau_DaDat);
			H06.setEnabled(false);
			TTH6 = 0;
		}
		if(TTH7 == 1 ) {
			H07.setGradient(mau_DaDat);
			H07.setEnabled(false);
			TTH7 = 0;
		}
		if(TTH8 == 1 ) {
			H08.setGradient(mau_DaDat);
			H08.setEnabled(false);
			TTH8 = 0;
		}
		if(TTH9 == 1 ) {
			H09.setGradient(mau_DaDat);
			H09.setEnabled(false);
			TTH9 = 0;
		}
		if(TTH10 == 1 ) {
			H010.setGradient(mau_DaDat);
			H010.setEnabled(false);
			TTH10 = 0;
		}
		if(TTH11 == 1 ) {
			H011.setGradient(mau_DaDat);
			H011.setEnabled(false);
			TTH11 = 0;
		}
		if(TTI1 == 1 ) {
			I01.setGradient(mau_DaDat);
			I01.setEnabled(false);
			TTI1 = 0;
		}
		if(TTI2 == 1 ) {
			I02.setGradient(mau_DaDat);
			I02.setEnabled(false);
			TTI2 = 0;
		}
		if(TTI3 == 1 ) {
			I03.setGradient(mau_DaDat);
			I03.setEnabled(false);
			TTI3 = 0;
		}
		if(TTI4 == 1 ) {
			I04.setGradient(mau_DaDat);
			I04.setEnabled(false);
			TTI4 = 0;
		}
		if(TTI5 == 1 ) {
			I05.setGradient(mau_DaDat);
			I05.setEnabled(false);
			TTI5 = 0;
		}
		if(TTI6 == 1 ) {
			I06.setGradient(mau_DaDat);
			I06.setEnabled(false);
			TTI6 = 0;
		}
	}
	
	private void GheUI(GUI_Man_hinh_chinh man_hinh) throws FontFormatException, IOException {
		// TODO Auto-generated method stub
		Point2D.Double p1 = new Point2D.Double(100, 100); 
		Point2D.Double p2 = new Point2D.Double(200, 100); 
		Point2D.Double p3 = new Point2D.Double(50, 50); 
		Point2D.Double p4 = new Point2D.Double(100, 50); 
		mau_Trong = new GradientPaint(p1,new Color(217,217,217),p2,new Color(217,217,217));
		mau_DaDat = new GradientPaint(p1,new Color(113,101,101),p2,new Color(113,101,101));
		mau_DangChon = new GradientPaint(p1,new Color(255,80,67),p2,new Color(255,130,62));
		mau_gradient = new GradientPaint(p3,new Color(255,80,67),p4,new Color(255,130,62));
		
		File DosisB = new File("src\\resources\\fonts\\Dosis-Bold.ttf");
		File Dosis = new File("src\\resources\\fonts\\Dosis-Regular.ttf");
		Font Dosis_Bold = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(25f);
		Font Dosis_Bold_20 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(19f);
		Font Dosis_Bold_22 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(22f);
		Font Dosis_Bold_14 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(16f);
		Font Dosis_Bold_13 = Font.createFont(Font.TRUETYPE_FONT, DosisB).deriveFont(12f);
		Font Dosis_Regular = Font.createFont(Font.TRUETYPE_FONT, Dosis).deriveFont(21f);
        
        thanh_ngang1 = new JSeparator();
        thanh_ngang1.setBounds(60, 58, 1050, 4);
        add(thanh_ngang1);
        
        lbManHinh = new JLabel(" Màn hình");
        lbManHinh.setForeground(new Color(255, 255, 255));
        lbManHinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbManHinh.setBounds(520, 20, 100, 30);
        lbManHinh.setFont(Dosis_Bold);
        add(lbManHinh);
        
        rowA = new JLabel("A");
        rowA.setHorizontalAlignment(SwingConstants.CENTER);
        rowA.setForeground(new Color(255, 255, 255));
        rowA.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowA.setBounds(20, 95, 20, 20);
        rowA.setFont(Dosis_Bold_20);
        add(rowA);
        
        
        rowB = new JLabel("B");
        rowB.setHorizontalAlignment(SwingConstants.CENTER);
        rowB.setForeground(Color.WHITE);
        rowB.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowB.setBounds(20, 145, 20, 20);
        rowB.setFont(Dosis_Bold_20);
        add(rowB);
        
        rowC = new JLabel("C");
        rowC.setHorizontalAlignment(SwingConstants.CENTER);
        rowC.setForeground(Color.WHITE);
        rowC.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowC.setBounds(20, 195, 20, 20);
        rowC.setFont(Dosis_Bold_20);
        add(rowC);
        
        rowD = new JLabel("D");
        rowD.setHorizontalAlignment(SwingConstants.CENTER);
        rowD.setForeground(Color.WHITE);
        rowD.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowD.setBounds(20, 245, 20, 20);
        rowD.setFont(Dosis_Bold_20);
        add(rowD);
        
        rowE = new JLabel("E");
        rowE.setHorizontalAlignment(SwingConstants.CENTER);
        rowE.setForeground(Color.WHITE);
        rowE.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowE.setBounds(20, 295, 20, 20);
        rowE.setFont(Dosis_Bold_20);
        add(rowE);
        
        rowF = new JLabel("F");
        rowF.setHorizontalAlignment(SwingConstants.CENTER);
        rowF.setForeground(Color.WHITE);
        rowF.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowF.setBounds(20, 345, 20, 20);
        rowF.setFont(Dosis_Bold_20);
        add(rowF);
        
        rowG = new JLabel("G");
        rowG.setHorizontalAlignment(SwingConstants.CENTER);
        rowG.setForeground(Color.WHITE);
        rowG.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowG.setBounds(20, 395, 20, 20);
        rowG.setFont(Dosis_Bold_20);
        add(rowG);
        
        rowH = new JLabel("H");
        rowH.setHorizontalAlignment(SwingConstants.CENTER);
        rowH.setForeground(Color.WHITE);
        rowH.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowH.setBounds(20, 445, 20, 20);
        rowH.setFont(Dosis_Bold_20);
        add(rowH);
        
        rowI = new JLabel("I");
        rowI.setHorizontalAlignment(SwingConstants.CENTER);
        rowI.setForeground(Color.WHITE);
        rowI.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rowI.setBounds(20, 495, 20, 20);
        rowI.setFont(Dosis_Bold_20);
        add(rowI);
        
        A01 = new nut_gradient("A01",mau_Trong);
        A01.setFont(Dosis_Bold_13);
        A01.setRadius(10);
        A01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A01.setBounds(83, 90, 55, 30);
        add(A01);
        
        A02 = new nut_gradient("A02",mau_Trong);
        A02.setFont(Dosis_Bold_13);
        A02.setRadius(10);
        A02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A02.setBounds(178, 90, 55, 30);
        add(A02);
        
        A03 = new nut_gradient("A03",mau_Trong);
        A03.setFont(Dosis_Bold_13);
        A03.setRadius(10);
        A03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A03.setBounds(273, 90, 55, 30);
        add(A03);
        
        A04 = new nut_gradient("A04",mau_Trong);
        A04.setFont(Dosis_Bold_13);
        A04.setRadius(10);
        A04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A04.setBounds(368, 90, 55, 30);
        add(A04);
        
        A05 = new nut_gradient("A05",mau_Trong);
        A05.setFont(Dosis_Bold_13);
        A05.setRadius(10);
        A05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A05.setBounds(463, 90, 55, 30);
        add(A05);
        
        A06 = new nut_gradient("A06",mau_Trong);
        A06.setFont(Dosis_Bold_13);
        A06.setRadius(10);
        A06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A06.setBounds(558, 90, 55, 30);
        add(A06);
        
        A07 = new nut_gradient("A07",mau_Trong);
        A07.setFont(Dosis_Bold_13);
        A07.setRadius(10);
        A07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A07.setBounds(653, 90, 55, 30);
        add(A07);
        
        A08 = new nut_gradient("A08",mau_Trong);
        A08.setFont(Dosis_Bold_13);
        A08.setRadius(10);
        A08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A08.setBounds(748, 90, 55, 30);
        add(A08);
        
        A09 = new nut_gradient("A09",mau_Trong);
        A09.setFont(Dosis_Bold_13);
        A09.setRadius(10);
        A09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A09.setBounds(843, 90, 55, 30);
        add(A09);
        
        A010 = new nut_gradient("A10",mau_Trong);
        A010.setFont(Dosis_Bold_13);
        A010.setRadius(10);
        A010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A010.setBounds(938, 90, 55, 30);
        add(A010);
        
        A011 = new nut_gradient("A011",mau_Trong);
        A011.setFont(Dosis_Bold_13);
        A011.setRadius(10);
        A011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        A011.setBounds(1033, 90, 55, 30);
        add(A011);
        
        B01 = new nut_gradient("B01",mau_Trong);
        B01.setFont(Dosis_Bold_13);
        B01.setRadius(10);
        B01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B01.setBounds(83, 140, 55, 30);
        add(B01);
        
        B02 = new nut_gradient("B02",mau_Trong);
        B02.setFont(Dosis_Bold_13);
        B02.setRadius(10);
        B02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B02.setBounds(178, 140, 55, 30);
        add(B02);
        
        B03 = new nut_gradient("B03",mau_Trong);
        B03.setFont(Dosis_Bold_13);
        B03.setRadius(10);
        B03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B03.setBounds(273, 140, 55, 30);
        add(B03);
        
        B04 = new nut_gradient("B04",mau_Trong);
        B04.setFont(Dosis_Bold_13);
        B04.setRadius(10);
        B04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B04.setBounds(368, 140, 55, 30);
        add(B04);
        
        B05 = new nut_gradient("B05",mau_Trong);
        B05.setFont(Dosis_Bold_13);
        B05.setRadius(10);
        B05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B05.setBounds(463, 140, 55, 30);
        add(B05);
        
        B06 = new nut_gradient("B06",mau_Trong);
        B06.setFont(Dosis_Bold_13);
        B06.setRadius(10);
        B06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B06.setBounds(558, 140, 55, 30);
        add(B06);
        
        B07 = new nut_gradient("B07",mau_Trong);
        B07.setFont(Dosis_Bold_13);
        B07.setRadius(10);
        B07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B07.setBounds(653, 140, 55, 30);
        add(B07);
        
        B08 = new nut_gradient("B08",mau_Trong);
        B08.setFont(Dosis_Bold_13);
        B08.setRadius(10);
        B08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B08.setBounds(748, 140, 55, 30);
        add(B08);
        
        B09 = new nut_gradient("B09",mau_Trong);
        B09.setFont(Dosis_Bold_13);
        B09.setRadius(10);
        B09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B09.setBounds(843, 140, 55, 30);
        add(B09);
        
        B010 = new nut_gradient("B10",mau_Trong);
        B010.setFont(Dosis_Bold_13);
        B010.setRadius(10);
        B010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B010.setBounds(938, 140, 55, 30);
        add(B010);
        
        B011 = new nut_gradient("B011",mau_Trong);
        B011.setFont(Dosis_Bold_13);
        B011.setRadius(10);
        B011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        B011.setBounds(1033, 140, 55, 30);
        add(B011);
        
        C01 = new nut_gradient("C01",mau_Trong);
        C01.setFont(Dosis_Bold_13);
        C01.setRadius(10);
        C01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C01.setBounds(83, 190, 55, 30);
        add(C01);
        
        C02 = new nut_gradient("C02",mau_Trong);
        C02.setFont(Dosis_Bold_13);
        C02.setRadius(10);
        C02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C02.setBounds(178, 190, 55, 30);
        add(C02);
        
        C03 = new nut_gradient("C03",mau_Trong);
        C03.setFont(Dosis_Bold_13);
        C03.setRadius(10);
        C03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C03.setBounds(273, 190, 55, 30);
        add(C03);
        
        C04 = new nut_gradient("C04",mau_Trong);
        C04.setFont(Dosis_Bold_13);
        C04.setRadius(10);
        C04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C04.setBounds(368, 190, 55, 30);
        add(C04);
        
        C05 = new nut_gradient("C05",mau_Trong);
        C05.setFont(Dosis_Bold_13);
        C05.setRadius(10);
        C05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C05.setBounds(463, 190, 55, 30);
        add(C05);
        
        C06 = new nut_gradient("C06",mau_Trong);
        C06.setFont(Dosis_Bold_13);
        C06.setRadius(10);
        C06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C06.setBounds(558, 190, 55, 30);
        add(C06);
        
        C07 = new nut_gradient("C07",mau_Trong);
        C07.setFont(Dosis_Bold_13);
        C07.setRadius(10);
        C07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C07.setBounds(653, 190, 55, 30);
        add(C07);
        
        C08 = new nut_gradient("C08",mau_Trong);
        C08.setFont(Dosis_Bold_13);
        C08.setRadius(10);
        C08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C08.setBounds(748, 190, 55, 30);
        add(C08);
        
        C09 = new nut_gradient("C09",mau_Trong);
        C09.setFont(Dosis_Bold_13);
        C09.setRadius(10);
        C09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C09.setBounds(843, 190, 55, 30);
        add(C09);
        
        C010 = new nut_gradient("C10",mau_Trong);
        C010.setFont(Dosis_Bold_13);
        C010.setRadius(10);
        C010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C010.setBounds(938, 190, 55, 30);
        add(C010);
        
        C011 = new nut_gradient("C011",mau_Trong);
        C011.setFont(Dosis_Bold_13);
        C011.setRadius(10);
        C011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        C011.setBounds(1033, 190, 55, 30);
        add(C011);
        
        D01 = new nut_gradient("D01",mau_Trong);
        D01.setFont(Dosis_Bold_13);
        D01.setRadius(10);
        D01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D01.setBounds(83, 240, 55, 30);
        add(D01);
        
        D02 = new nut_gradient("D02",mau_Trong);
        D02.setFont(Dosis_Bold_13);
        D02.setRadius(10);
        D02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D02.setBounds(178, 240, 55, 30);
        add(D02);
        
        D03 = new nut_gradient("D03",mau_Trong);
        D03.setFont(Dosis_Bold_13);
        D03.setRadius(10);
        D03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D03.setBounds(273, 240, 55, 30);
        add(D03);
        
        D04 = new nut_gradient("D04",mau_Trong);
        D04.setFont(Dosis_Bold_13);
        D04.setRadius(10);
        D04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D04.setBounds(368, 240, 55, 30);
        add(D04);
        
        D05 = new nut_gradient("D05",mau_Trong);
        D05.setFont(Dosis_Bold_13);
        D05.setRadius(10);
        D05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D05.setBounds(463, 240, 55, 30);
        add(D05);
        
        D06 = new nut_gradient("D06",mau_Trong);
        D06.setFont(Dosis_Bold_13);
        D06.setRadius(10);
        D06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D06.setBounds(558, 240, 55, 30);
        add(D06);
        
        D07 = new nut_gradient("D07",mau_Trong);
        D07.setFont(Dosis_Bold_13);
        D07.setRadius(10);
        D07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D07.setBounds(653, 240, 55, 30);
        add(D07);
        
        D08 = new nut_gradient("D08",mau_Trong);
        D08.setFont(Dosis_Bold_13);
        D08.setRadius(10);
        D08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D08.setBounds(748, 240, 55, 30);
        add(D08);
        
        D09 = new nut_gradient("D09",mau_Trong);
        D09.setFont(Dosis_Bold_13);
        D09.setRadius(10);
        D09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D09.setBounds(843, 240, 55, 30);
        add(D09);
        
        D010 = new nut_gradient("D10",mau_Trong);
        D010.setFont(Dosis_Bold_13);
        D010.setRadius(10);
        D010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D010.setBounds(938, 240, 55, 30);
        add(D010);
        
        D011 = new nut_gradient("D011",mau_Trong);
        D011.setFont(Dosis_Bold_13);
        D011.setRadius(10);
        D011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        D011.setBounds(1033, 240, 55, 30);
        add(D011);
        
        E01 = new nut_gradient("E01",mau_Trong);
        E01.setFont(Dosis_Bold_13);
        E01.setRadius(10);
        E01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E01.setBounds(83, 290, 55, 30);
        add(E01);
        
        E02 = new nut_gradient("E02",mau_Trong);
        E02.setFont(Dosis_Bold_13);
        E02.setRadius(10);
        E02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E02.setBounds(178, 290, 55, 30);
        add(E02);
        
        E03 = new nut_gradient("E03",mau_Trong);
        E03.setFont(Dosis_Bold_13);
        E03.setRadius(10);
        E03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E03.setBounds(273, 290, 55, 30);
        add(E03);
        
        E04 = new nut_gradient("E04",mau_Trong);
        E04.setFont(Dosis_Bold_13);
        E04.setRadius(10);
        E04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E04.setBounds(368, 290, 55, 30);
        add(E04);
        
        E05 = new nut_gradient("E05",mau_Trong);
        E05.setFont(Dosis_Bold_13);
        E05.setRadius(10);
        E05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E05.setBounds(463, 290, 55, 30);
        add(E05);
        
        E06 = new nut_gradient("E06",mau_Trong);
        E06.setFont(Dosis_Bold_13);
        E06.setRadius(10);
        E06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E06.setBounds(558, 290, 55, 30);
        add(E06);
        
        E07 = new nut_gradient("E07",mau_Trong);
        E07.setFont(Dosis_Bold_13);
        E07.setRadius(10);
        E07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E07.setBounds(653, 290, 55, 30);
        add(E07);
        
        E08 = new nut_gradient("E08",mau_Trong);
        E08.setFont(Dosis_Bold_13);
        E08.setRadius(10);
        E08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E08.setBounds(748, 290, 55, 30);
        add(E08);
        
        E09 = new nut_gradient("E09",mau_Trong);
        E09.setFont(Dosis_Bold_13);
        E09.setRadius(10);
        E09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E09.setBounds(843, 290, 55, 30);
        add(E09);
        
        E010 = new nut_gradient("E10",mau_Trong);
        E010.setFont(Dosis_Bold_13);
        E010.setRadius(10);
        E010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E010.setBounds(938, 290, 55, 30);
        add(E010);
        
        E011 = new nut_gradient("E011",mau_Trong);
        E011.setFont(Dosis_Bold_13);
        E011.setRadius(10);
        E011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E011.setBounds(1033, 290, 55, 30);
        add(E011);
        
        F01 = new nut_gradient("F01",mau_Trong);
        F01.setFont(Dosis_Bold_13);
        F01.setRadius(10);
        F01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F01.setBounds(83, 340, 55, 30);
        add(F01);
        
        F02 = new nut_gradient("F02",mau_Trong);
        F02.setFont(Dosis_Bold_13);
        F02.setRadius(10);
        F02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F02.setBounds(178, 340, 55, 30);
        add(F02);
        
        F03 = new nut_gradient("F03",mau_Trong);
        F03.setFont(Dosis_Bold_13);
        F03.setRadius(10);
        F03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F03.setBounds(273, 340, 55, 30);
        add(F03);
        
        F04 = new nut_gradient("F04",mau_Trong);
        F04.setFont(Dosis_Bold_13);
        F04.setRadius(10);
        F04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F04.setBounds(368, 340, 55, 30);
        add(F04);
        
        F05 = new nut_gradient("F05",mau_Trong);
        F05.setFont(Dosis_Bold_13);
        F05.setRadius(10);
        F05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F05.setBounds(463, 340, 55, 30);
        add(F05);
        
        F06 = new nut_gradient("F06",mau_Trong);
        F06.setFont(Dosis_Bold_13);
        F06.setRadius(10);
        F06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F06.setBounds(558, 340, 55, 30);
        add(F06);
        
        F07 = new nut_gradient("F07",mau_Trong);
        F07.setFont(Dosis_Bold_13);
        F07.setRadius(10);
        F07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F07.setBounds(653, 340, 55, 30);
        add(F07);
        
        F08 = new nut_gradient("F08",mau_Trong);
        F08.setFont(Dosis_Bold_13);
        F08.setRadius(10);
        F08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F08.setBounds(748, 340, 55, 30);
        add(F08);
        
        F09 = new nut_gradient("F09",mau_Trong);
        F09.setFont(Dosis_Bold_13);
        F09.setRadius(10);
        F09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F09.setBounds(843, 340, 55, 30);
        add(F09);
        
        F010 = new nut_gradient("F10",mau_Trong);
        F010.setFont(Dosis_Bold_13);
        F010.setRadius(10);
        F010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F010.setBounds(938, 340, 55, 30);
        add(F010);
        
        F011 = new nut_gradient("F011",mau_Trong);
        F011.setFont(Dosis_Bold_13);
        F011.setRadius(10);
        F011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        F011.setBounds(1033, 340, 55, 30);
        add(F011);
        
        G01 = new nut_gradient("G01",mau_Trong);
        G01.setFont(Dosis_Bold_13);
        G01.setRadius(10);
        G01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G01.setBounds(83, 390, 55, 30);
        add(G01);
        
        G02 = new nut_gradient("G02",mau_Trong);
        G02.setFont(Dosis_Bold_13);
        G02.setRadius(10);
        G02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G02.setBounds(178, 390, 55, 30);
        add(G02);
        
        G03 = new nut_gradient("G03",mau_Trong);
        G03.setFont(Dosis_Bold_13);
        G03.setRadius(10);
        G03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G03.setBounds(273, 390, 55, 30);
        add(G03);
        
        G04 = new nut_gradient("G04",mau_Trong);
        G04.setFont(Dosis_Bold_13);
        G04.setRadius(10);
        G04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G04.setBounds(368, 390, 55, 30);
        add(G04);
        
        G05 = new nut_gradient("G05",mau_Trong);
        G05.setFont(Dosis_Bold_13);
        G05.setRadius(10);
        G05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G05.setBounds(463, 390, 55, 30);
        add(G05);
        
        G06 = new nut_gradient("G06",mau_Trong);
        G06.setFont(Dosis_Bold_13);
        G06.setRadius(10);
        G06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G06.setBounds(558, 390, 55, 30);
        add(G06);
        
        G07 = new nut_gradient("G07",mau_Trong);
        G07.setFont(Dosis_Bold_13);
        G07.setRadius(10);
        G07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G07.setBounds(653, 390, 55, 30);
        add(G07);
        
        G08 = new nut_gradient("G08",mau_Trong);
        G08.setFont(Dosis_Bold_13);
        G08.setRadius(10);
        G08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G08.setBounds(748, 390, 55, 30);
        add(G08);
        
        G09 = new nut_gradient("G09",mau_Trong);
        G09.setFont(Dosis_Bold_13);
        G09.setRadius(10);
        G09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G09.setBounds(843, 390, 55, 30);
        add(G09);
        
        G010 = new nut_gradient("G10",mau_Trong);
        G010.setFont(Dosis_Bold_13);
        G010.setRadius(10);
        G010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G010.setBounds(938, 390, 55, 30);
        add(G010);
        
        G011 = new nut_gradient("G011",mau_Trong);
        G011.setFont(Dosis_Bold_13);
        G011.setRadius(10);
        G011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        G011.setBounds(1033, 390, 55, 30);
        add(G011);
        
        H01 = new nut_gradient("H01",mau_Trong);
        H01.setFont(Dosis_Bold_13);
        H01.setRadius(10);
        H01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H01.setBounds(83, 440, 55, 30);
        add(H01);
        
        H02 = new nut_gradient("H02",mau_Trong);
        H02.setFont(Dosis_Bold_13);
        H02.setRadius(10);
        H02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H02.setBounds(178, 440, 55, 30);
        add(H02);
        
        H03 = new nut_gradient("H03",mau_Trong);
        H03.setFont(Dosis_Bold_13);
        H03.setRadius(10);
        H03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H03.setBounds(273, 440, 55, 30);
        add(H03);
        
        H04 = new nut_gradient("H04",mau_Trong);
        H04.setFont(Dosis_Bold_13);
        H04.setRadius(10);
        H04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H04.setBounds(368, 440, 55, 30);
        add(H04);
        
        H05 = new nut_gradient("H05",mau_Trong);
        H05.setFont(Dosis_Bold_13);
        H05.setRadius(10);
        H05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H05.setBounds(463, 440, 55, 30);
        add(H05);
        
        H06 = new nut_gradient("H06",mau_Trong);
        H06.setFont(Dosis_Bold_13);
        H06.setRadius(10);
        H06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H06.setBounds(558, 440, 55, 30);
        add(H06);
        
        H07 = new nut_gradient("H07",mau_Trong);
        H07.setFont(Dosis_Bold_13);
        H07.setRadius(10);
        H07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H07.setBounds(653, 440, 55, 30);
        add(H07);
        
        H08 = new nut_gradient("H08",mau_Trong);
        H08.setFont(Dosis_Bold_13);
        H08.setRadius(10);
        H08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H08.setBounds(748, 440, 55, 30);
        add(H08);
        
        H09 = new nut_gradient("H09",mau_Trong);
        H09.setFont(Dosis_Bold_13);
        H09.setRadius(10);
        H09.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H09.setBounds(843, 440, 55, 30);
        add(H09);
        
        H010 = new nut_gradient("H10",mau_Trong);
        H010.setFont(Dosis_Bold_13);
        H010.setRadius(10);
        H010.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H010.setBounds(938, 440, 55, 30);
        add(H010);
        
        H011 = new nut_gradient("H011",mau_Trong);
        H011.setFont(Dosis_Bold_13);
        H011.setRadius(10);
        H011.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        H011.setBounds(1033, 440, 55, 30);
        add(H011);
        
        I01 = new nut_gradient("I01",mau_Trong);
        I01.setFont(Dosis_Bold_13);
        I01.setRadius(10);
        I01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I01.setBounds(109, 490, 95, 30);
        add(I01);

        I02 = new nut_gradient("I02",mau_Trong);
        I02.setFont(Dosis_Bold_13);
        I02.setRadius(10);
        I02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I02.setBounds(270, 490, 100, 30);
        add(I02);
        
        I03 = new nut_gradient("I03",mau_Trong);
        I03.setFont(Dosis_Bold_13);
        I03.setRadius(10);
        I03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I03.setBounds(450, 490, 100, 30);
        add(I03);
        
        I04 = new nut_gradient("I04",mau_Trong);
        I04.setFont(Dosis_Bold_13);
        I04.setRadius(10);
        I04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I04.setBounds(630, 490, 100, 30);
        add(I04);
        
        I05 = new nut_gradient("I05",mau_Trong);
        I05.setFont(Dosis_Bold_13);
        I05.setRadius(10);
        I05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I05.setBounds(800, 490, 100, 30);
        add(I05);

        I06 = new nut_gradient("I06",mau_Trong);
        I06.setFont(Dosis_Bold_13);
        I06.setRadius(10);
        I06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        I06.setBounds(970, 490, 100, 30);
        add(I06);
        
        thanh_ngang2 = new JSeparator();
        thanh_ngang2.setBounds(60, 590, 1050, 4);
        add(thanh_ngang2);
        
        lbGheTrong = new JLabel("Ghế trống");
        lbGheTrong.setForeground(new Color(255, 255, 255));
        lbGheTrong.setBounds(120, 550, 70, 20);
        lbGheTrong.setFont(Dosis_Bold_14);
        add(lbGheTrong);
        
        lbGheDaDat = new JLabel("Ghế đã đặt");
        lbGheDaDat.setForeground(Color.WHITE);
        lbGheDaDat.setBounds(290, 550, 70, 20);
        lbGheDaDat.setFont(Dosis_Bold_14);
        add(lbGheDaDat);
        
        lbGheDangChon = new JLabel("Ghế đang chọn");
        lbGheDangChon.setForeground(Color.WHITE);
        lbGheDangChon.setBounds(452, 550, 100, 20);
        lbGheDangChon.setFont(Dosis_Bold_14);
        add(lbGheDangChon);
        
        lbGheDon = new JLabel("Ghế đơn");
        lbGheDon.setForeground(Color.WHITE);
        lbGheDon.setBounds(791, 550, 70, 20);
        lbGheDon.setFont(Dosis_Bold_14);
        add(lbGheDon);
        
        lbGheDoi = new JLabel("Ghế đôi");
        lbGheDoi.setForeground(Color.WHITE);
        lbGheDoi.setBounds(1000, 550, 70, 20);
        lbGheDoi.setFont(Dosis_Bold_14);
        add(lbGheDoi);
        
        lbPhim = new JLabel(tenPhim);
        lbPhim.setForeground(new Color(255, 130, 62));
        lbPhim.setFont(Dosis_Bold_22);
        lbPhim.setBounds(50, 610, 250, 30);
        add(lbPhim);
        
        btn_DatVe = new nut_gradient("ĐẶT VÉ",mau_gradient);
        btn_DatVe.setForeground(new Color(0, 0, 0));
        btn_DatVe.setRadius(10);
        btn_DatVe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_DatVe.setBounds(960, 610, 100, 84);
        btn_DatVe.setFont(Dosis_Bold_20);
        add(btn_DatVe);
        
        lbGhe = new JLabel("Ghế : ");
        lbGhe.setForeground(new Color(255, 130, 62));
        lbGhe.setBounds(50, 664, 50, 30);
        lbGhe.setFont(Dosis_Bold_20);
        add(lbGhe);
        
        lbGheChon = new JLabel(GheDat);
        lbGheChon.setForeground(new Color(255, 255, 255));
        lbGheChon.setFont(Dosis_Bold_14);
        lbGheChon.setBounds(95, 664, 212, 30);
        add(lbGheChon);
        
        lbSuat = new JLabel("Suất : ");
        lbSuat.setForeground(new Color(255, 130, 62));
        lbSuat.setFont(Dosis_Bold_14);
        lbSuat.setBounds(692, 610, 55, 30);
        lbSuat.setFont(Dosis_Bold_20);
        add(lbSuat);
        
        lbTongCong = new JLabel("Tổng cộng :");
        lbTongCong.setForeground(new Color(255, 130, 62));
        lbTongCong.setBounds(692, 662, 111, 30);
        lbTongCong.setFont(Dosis_Bold_20);
        add(lbTongCong);
        
        gheDangChon = new nut_gradient("",mau_DangChon);
        gheDangChon.setRadius(10);
        gheDangChon.setBounds(402, 550, 40, 25);
        add(gheDangChon);
        
        gheDaDat = new nut_gradient("",mau_DaDat);
        gheDaDat.setRadius(10);
        gheDaDat.setBounds(240, 550, 40, 25);
        add(gheDaDat);
        
        gheTrong = new nut_gradient("",mau_Trong);
        gheTrong.setRadius(10);
        gheTrong.setBounds(70, 550, 40, 25);
        add(gheTrong);
        
        gheDon = new nut_gradient("",mau_Trong);
        gheDon.setRadius(10);
        gheDon.setBounds(741, 550, 40, 25);
        add(gheDon);
        
        gheDoi = new nut_gradient("",mau_Trong);
        gheDoi.setRadius(10);
        gheDoi.setBounds(910, 550, 80, 25);
        add(gheDoi); 
        
        customer_in = new MyPanel();
        customer_in.setColor(new Color(255,255,255));
        customer_in.setColorClick(new Color(255,255,255));
        customer_in.setColorOver(new Color(255,255,255));
        customer_in.setBorderColor(new Color(255,255,255));
        customer_in.setRadius(10);
        customer_in.setBounds(319, 662, 161, 30);
        add(customer_in);
        customer_in.setLayout(null);
        
        customer_check = new JLabel("");
        customer_check.setIcon(new ImageIcon("src\\resources\\Icon\\check.png"));
        customer_check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        customer_check.setIconTextGap(0);
        customer_check.setHorizontalAlignment(SwingConstants.CENTER);
        customer_check.setBounds(135, 7, 16, 16);
        customer_in.add(customer_check);
        
        txtKhachHang = new JTextField();
        txtKhachHang.setOpaque(false);
        txtKhachHang.setBorder(null);
        txtKhachHang.setBounds(10, 0, 145, 30);
        customer_in.add(txtKhachHang);
        txtKhachHang.setText("CCCD Khách Hàng");
        txtKhachHang.setFont(Dosis_Bold_20);
        txtKhachHang.setForeground(new Color(178,176,176));
        txtKhachHang.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtKhachHang.getText().toString().equals("CCCD Khách Hàng")) {
        			txtKhachHang.setText("");
        			txtKhachHang.setForeground(new Color(178, 176, 176));
				}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		if(txtKhachHang.getText().toString().equals("")) {
        			txtKhachHang.setText("CCCD Khách Hàng");
        			txtKhachHang.setForeground(new Color(178, 176, 176));
				}
        	}
        });
        
        txtKhachHang.setFont(Dosis_Bold_13);
        txtKhachHang.setColumns(10);
        
        promotion_in = new MyPanel();
        promotion_in.setLayout(null);
        promotion_in.setColor(new Color(255,255,255));
        promotion_in.setColorClick(new Color(255,255,255));
        promotion_in.setColorOver(new Color(255,255,255));
        promotion_in.setBorderColor(new Color(255,255,255));
        promotion_in.setRadius(10);
        promotion_in.setBounds(319, 610, 161, 30);
        add(promotion_in);
        
        promotion_check = new JLabel("");
        promotion_check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        promotion_check.setIconTextGap(0);
        promotion_check.setHorizontalAlignment(SwingConstants.CENTER);
        promotion_check.setIcon(new ImageIcon("src\\resources\\Icon\\check.png"));
        promotion_check.setBounds(135, 7, 16, 16);
        promotion_in.add(promotion_check);
        
        txtKhuyenMai = new JTextField();
        txtKhuyenMai.setOpaque(false);
        txtKhuyenMai.setText("Mã khuyến mãi");
        txtKhuyenMai.setFont(Dosis_Bold_13);
        txtKhuyenMai.setForeground(new Color(178,176,176));
        txtKhuyenMai.setColumns(10);
        txtKhuyenMai.setBorder(null);
        txtKhuyenMai.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtKhuyenMai.getText().toString().equals("Mã khuyến mãi")) {
        			txtKhuyenMai.setText("");
        			txtKhuyenMai.setForeground(new Color(178, 176, 176));
				}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		if(txtKhuyenMai.getText().toString().equals("")) {
        			txtKhuyenMai.setText("Mã khuyến mãi");
        			txtKhuyenMai.setForeground(new Color(178, 176, 176));
				}
        	}
        });
        txtKhuyenMai.setBounds(10, 3, 145, 24);
        promotion_in.add(txtKhuyenMai);
        
        promotion_out = new JTextField();
        promotion_out.setEnabled(false);
        promotion_out.setDisabledTextColor(new Color(255, 255, 255));
        promotion_out.setBorder(null);
        promotion_out.setOpaque(false);
        promotion_out.setFont(Dosis_Bold_14);
        promotion_out.setText("");
        promotion_out.setBounds(490, 610, 182, 30);
        add(promotion_out);
        promotion_out.setColumns(10);
        
        customer_out = new JTextField();
        customer_out.setEnabled(false);
        customer_out.setDisabledTextColor(new Color(255, 255, 255));
        customer_out.setBorder(null);
        customer_out.setOpaque(false);
        customer_out.setFont(Dosis_Bold_14);
        customer_out.setText("");
        customer_out.setColumns(10);
        customer_out.setBounds(490, 662, 182, 30);
        add(customer_out);
        
        dateTime = new JTextField();
        dateTime.setEnabled(false);
        dateTime.setDisabledTextColor(new Color(255, 255, 255));
        dateTime.setText(gioChieu+"   "+ngayChieu+"/2024");
        dateTime.setFont(Dosis_Bold_14);
        dateTime.setBorder(null);
        dateTime.setOpaque(false);
        dateTime.setBounds(748, 612, 150, 30);
        add(dateTime);
        dateTime.setColumns(10);
        
        sum = new JTextField();
        sum.setEnabled(false);
        sum.setDisabledTextColor(new Color(255, 255, 255));
        sum.setText("");
        sum.setFont(Dosis_Bold_14);
        sum.setOpaque(false);
        sum.setColumns(10);
        sum.setBorder(null);
        sum.setBounds(785, 665, 123, 30);
        add(sum);
        
         A1 = ""; A2 = ""; A3 = ""; A4 = ""; A5 = ""; A6 = ""; A7 = ""; A8 = ""; A9 = ""; A10 = ""; A11 = "";
         B1 = ""; B2 = ""; B3 = ""; B4 = ""; B5 = ""; B6 = ""; B7 = ""; B8 = ""; B9 = ""; B10 = ""; B11 = "";
         C1 = ""; C2 = ""; C3 = ""; C4 = ""; C5 = ""; C6 = ""; C7 = ""; C8 = ""; C9 = ""; C10 = ""; C11 = "";
         D1 = ""; D2 = ""; D3 = ""; D4 = ""; D5 = ""; D6 = ""; D7 = ""; D8 = ""; D9 = ""; D10 = ""; D11 = "";
         E1 = ""; E2 = ""; E3 = ""; E4 = ""; E5 = ""; E6 = ""; E7 = ""; E8 = ""; E9 = ""; E10 = ""; E11 = "";
         F1 = ""; F2 = ""; F3 = ""; F4 = ""; F5 = ""; F6 = ""; F7 = ""; F8 = ""; F9 = ""; F10 = ""; F11 = "";
         G1 = ""; G2 = ""; G3 = ""; G4 = ""; G5 = ""; G6 = ""; G7 = ""; G8 = ""; G9 = ""; G10 = ""; G11 = "";
         H1 = ""; H2 = ""; H3 = ""; H4 = ""; H5 = ""; H6 = ""; H7 = ""; H8 = ""; H9 = ""; H10 = ""; H11 = "";
         I1 = ""; I2 = ""; I3 = ""; I4 = ""; I5 = ""; I6 = "";
         
        giaGheA01 = 0; giaGheA02 = 0; giaGheA03 = 0; giaGheA04 = 0; giaGheA05 = 0; giaGheA06 = 0; giaGheA07 = 0; giaGheA08 = 0; giaGheA09 = 0; giaGheA10 = 0; giaGheA11 = 0;
        giaGheB01 = 0; giaGheB02 = 0; giaGheB03 = 0; giaGheB04 = 0; giaGheB05 = 0; giaGheB06 = 0; giaGheB07 = 0; giaGheB08 = 0; giaGheB09 = 0; giaGheB10 = 0; giaGheB11 = 0;
        giaGheC01 = 0; giaGheC02 = 0; giaGheC03 = 0; giaGheC04 = 0; giaGheC05 = 0; giaGheC06 = 0; giaGheC07 = 0; giaGheC08 = 0; giaGheC09 = 0; giaGheC10 = 0; giaGheC11 = 0;
        giaGheD01 = 0; giaGheD02 = 0; giaGheD03 = 0; giaGheD04 = 0; giaGheD05 = 0; giaGheD06 = 0; giaGheD07 = 0; giaGheD08 = 0; giaGheD09 = 0; giaGheD10 = 0; giaGheD11 = 0;
        giaGheE01 = 0; giaGheE02 = 0; giaGheE03 = 0; giaGheE04 = 0; giaGheE05 = 0; giaGheE06 = 0; giaGheE07 = 0; giaGheE08 = 0; giaGheE09 = 0; giaGheE10 = 0; giaGheE11 = 0;
        giaGheF01 = 0; giaGheF02 = 0; giaGheF03 = 0; giaGheF04 = 0; giaGheF05 = 0; giaGheF06 = 0; giaGheF07 = 0; giaGheF08 = 0; giaGheF09 = 0; giaGheF10 = 0; giaGheF11 = 0;
        giaGheG01 = 0; giaGheG02 = 0; giaGheG03 = 0; giaGheG04 = 0; giaGheG05 = 0; giaGheG06 = 0; giaGheG07 = 0; giaGheG08 = 0; giaGheG09 = 0; giaGheG10 = 0; giaGheG11 = 0;
        giaGheH01 = 0; giaGheH02 = 0; giaGheH03 = 0; giaGheH04 = 0; giaGheH05 = 0; giaGheH06 = 0; giaGheH07 = 0; giaGheH08 = 0; giaGheH09 = 0; giaGheH10 = 0; giaGheH11 = 0;
        giaGheI01 = 0; giaGheI02 = 0; giaGheI03 = 0; giaGheI04 = 0; giaGheI05 = 0; giaGheI06 = 0;
        giaGheDoi = 100000;
        
        A01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A01.getRadiant() == mau_Trong) {
					A01.setGradient(mau_DangChon);
					A1 = "A01,";
					TTA1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A01.getRadiant() == mau_DangChon) {
					A01.setGradient(mau_Trong);
					A1 = "";
					TTA1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A02.getRadiant() == mau_Trong) {
					A02.setGradient(mau_DangChon);
					A2 = "A02,";
					TTA2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A02.getRadiant() == mau_DangChon) {
					A02.setGradient(mau_Trong);
					A2 = "";
					TTA2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A03.getRadiant() == mau_Trong) {
					A03.setGradient(mau_DangChon);
					A3 = "A03,";
					TTA3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A03.getRadiant() == mau_DangChon) {
					A03.setGradient(mau_Trong);
					A3 = "";
					TTA3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A04.getRadiant() == mau_Trong) {
					A04.setGradient(mau_DangChon);
					A4 = "A04,";
					TTA4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A04.getRadiant() == mau_DangChon) {
					A04.setGradient(mau_Trong);
					A4 = "";
					TTA4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A05.getRadiant() == mau_Trong) {
					A05.setGradient(mau_DangChon);
					A5 = "A05,";
					TTA5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A05.getRadiant() == mau_DangChon) {
					A05.setGradient(mau_Trong);
					A5 = "";
					TTA5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A06.getRadiant() == mau_Trong) {
					A06.setGradient(mau_DangChon);
					A6 = "A06,";
					TTA6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A06.getRadiant() == mau_DangChon) {
					A06.setGradient(mau_Trong);
					A6 = "";
					TTA6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A07.getRadiant() == mau_Trong) {
					A07.setGradient(mau_DangChon);
					A7 = "A07,";
					TTA7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A07.getRadiant() == mau_DangChon) {
					A07.setGradient(mau_Trong);
					A7 = "";
					TTA7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A08.getRadiant() == mau_Trong) {
					A08.setGradient(mau_DangChon);
					A8 = "A08,";
					TTA8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A08.getRadiant() == mau_DangChon) {
					A08.setGradient(mau_Trong);
					A8 = "";
					TTA8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A09.getRadiant() == mau_Trong) {
					A09.setGradient(mau_DangChon);
					A9 = "A09,";
					TTA9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A09.getRadiant() == mau_DangChon) {
					A09.setGradient(mau_Trong);
					A9 = "";
					TTA9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A010.getRadiant() == mau_Trong) {
					A010.setGradient(mau_DangChon);
					A10 = "A10,";
					TTA10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A010.getRadiant() == mau_DangChon) {
					A010.setGradient(mau_Trong);
					A10 = "";
					TTA10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        A011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(A011.getRadiant() == mau_Trong) {
					A011.setGradient(mau_DangChon);
					A11 = "A11,";
					TTA11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(A011.getRadiant() == mau_DangChon) {
					A011.setGradient(mau_Trong);
					A11 = "";
					TTA11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B01.getRadiant() == mau_Trong) {
					B01.setGradient(mau_DangChon);
					B1 = "B01,";
					TTB1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B01.getRadiant() == mau_DangChon) {
					B01.setGradient(mau_Trong);
					B1 = "";
					TTB1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B02.getRadiant() == mau_Trong) {
					B02.setGradient(mau_DangChon);
					B2 = "B02,";
					TTB2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B02.getRadiant() == mau_DangChon) {
					B02.setGradient(mau_Trong);
					B2 = "";
					TTB2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B03.getRadiant() == mau_Trong) {
					B03.setGradient(mau_DangChon);
					B3 = "B03,";
					TTB3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B03.getRadiant() == mau_DangChon) {
					B03.setGradient(mau_Trong);
					B3 = "";
					TTB3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B04.getRadiant() == mau_Trong) {
					B04.setGradient(mau_DangChon);
					B4 = "B04,";
					TTB4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B04.getRadiant() == mau_DangChon) {
					B04.setGradient(mau_Trong);
					B4 = "";
					TTB4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B05.getRadiant() == mau_Trong) {
					B05.setGradient(mau_DangChon);
					B5 = "B05,";
					TTB5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B05.getRadiant() == mau_DangChon) {
					B05.setGradient(mau_Trong);
					B5 = "";
					TTB5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B06.getRadiant() == mau_Trong) {
					B06.setGradient(mau_DangChon);
					B6 = "B06,";
					TTB6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B06.getRadiant() == mau_DangChon) {
					B06.setGradient(mau_Trong);
					B6 = "";
					TTB6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B07.getRadiant() == mau_Trong) {
					B07.setGradient(mau_DangChon);
					B7 = "B07,";
					TTB7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B07.getRadiant() == mau_DangChon) {
					B07.setGradient(mau_Trong);
					B7 = "";
					TTB7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B08.getRadiant() == mau_Trong) {
					B08.setGradient(mau_DangChon);
					B8 = "B08,";
					TTB8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B08.getRadiant() == mau_DangChon) {
					B08.setGradient(mau_Trong);
					B8 = "";
					TTB8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B09.getRadiant() == mau_Trong) {
					B09.setGradient(mau_DangChon);
					B9 = "B09,";
					TTB9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B09.getRadiant() == mau_DangChon) {
					B09.setGradient(mau_Trong);
					B9 = "";
					TTB9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B010.getRadiant() == mau_Trong) {
					B010.setGradient(mau_DangChon);
					B10 = "B10,";
					TTB10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B010.getRadiant() == mau_DangChon) {
					B010.setGradient(mau_Trong);
					B10 = "";
					TTB10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        B011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(B011.getRadiant() == mau_Trong) {
					B011.setGradient(mau_DangChon);
					B11 = "B11,";
					TTB11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(B011.getRadiant() == mau_DangChon) {
					B011.setGradient(mau_Trong);
					B11 = "";
					TTB11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C01.getRadiant() == mau_Trong) {
					C01.setGradient(mau_DangChon);
					C1 = "C01,";
					TTC1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C01.getRadiant() == mau_DangChon) {
					C01.setGradient(mau_Trong);
					C1 = "";
					TTC1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C02.getRadiant() == mau_Trong) {
					C02.setGradient(mau_DangChon);
					C2 = "C02,";
					TTC2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C02.getRadiant() == mau_DangChon) {
					C02.setGradient(mau_Trong);
					C2 = "";
					TTC2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C03.getRadiant() == mau_Trong) {
					C03.setGradient(mau_DangChon);
					C3 = "C03,";
					TTC3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C03.getRadiant() == mau_DangChon) {
					C03.setGradient(mau_Trong);
					C3 = "";
					TTC3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C04.getRadiant() == mau_Trong) {
					C04.setGradient(mau_DangChon);
					C4 = "C04,";
					TTC4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C04.getRadiant() == mau_DangChon) {
					C04.setGradient(mau_Trong);
					C4 = "";
					TTC4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C05.getRadiant() == mau_Trong) {
					C05.setGradient(mau_DangChon);
					C5 = "C05,";
					TTC5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C05.getRadiant() == mau_DangChon) {
					C05.setGradient(mau_Trong);
					C5 = "";
					TTC5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C06.getRadiant() == mau_Trong) {
					C06.setGradient(mau_DangChon);
					C6 = "C06,";
					TTC6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C06.getRadiant() == mau_DangChon) {
					C06.setGradient(mau_Trong);
					C6 = "";
					TTC6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C07.getRadiant() == mau_Trong) {
					C07.setGradient(mau_DangChon);
					C7 = "C07,";
					TTC7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C07.getRadiant() == mau_DangChon) {
					C07.setGradient(mau_Trong);
					C7 = "";
					TTC7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C08.getRadiant() == mau_Trong) {
					C08.setGradient(mau_DangChon);
					C8 = "C08,";
					TTC8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C08.getRadiant() == mau_DangChon) {
					C08.setGradient(mau_Trong);
					C8 = "";
					TTC8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C09.getRadiant() == mau_Trong) {
					C09.setGradient(mau_DangChon);
					C9 = "C09,";
					TTC9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C09.getRadiant() == mau_DangChon) {
					C09.setGradient(mau_Trong);
					C9 = "";
					TTC9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C010.getRadiant() == mau_Trong) {
					C010.setGradient(mau_DangChon);
					C10 = "C10,";
					TTC10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C010.getRadiant() == mau_DangChon) {
					C010.setGradient(mau_Trong);
					C10 = "";
					TTC10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        C011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(C011.getRadiant() == mau_Trong) {
					C011.setGradient(mau_DangChon);
					C11 = "C11,";
					TTC11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(C011.getRadiant() == mau_DangChon) {
					C011.setGradient(mau_Trong);
					C11 = "";
					TTC11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D01.getRadiant() == mau_Trong) {
					D01.setGradient(mau_DangChon);
					D1 = "D01,";
					TTD1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D01.getRadiant() == mau_DangChon) {
					D01.setGradient(mau_Trong);
					D1 = "";
					TTD1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D02.getRadiant() == mau_Trong) {
					D02.setGradient(mau_DangChon);
					D2 = "D02,";
					TTD2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D02.getRadiant() == mau_DangChon) {
					D02.setGradient(mau_Trong);
					D2 = "";
					TTD2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D03.getRadiant() == mau_Trong) {
					D03.setGradient(mau_DangChon);
					D3 = "D03,";
					TTD3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D03.getRadiant() == mau_DangChon) {
					D03.setGradient(mau_Trong);
					D3 = "";
					TTD3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D04.getRadiant() == mau_Trong) {
					D04.setGradient(mau_DangChon);
					D4 = "D04,";
					TTD4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D04.getRadiant() == mau_DangChon) {
					D04.setGradient(mau_Trong);
					D4 = "";
					TTD4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D05.getRadiant() == mau_Trong) {
					D05.setGradient(mau_DangChon);
					D5 = "D05,";
					TTD5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D05.getRadiant() == mau_DangChon) {
					D05.setGradient(mau_Trong);
					D5 = "";
					TTD5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D06.getRadiant() == mau_Trong) {
					D06.setGradient(mau_DangChon);
					D6 = "D06,";
					TTD6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D06.getRadiant() == mau_DangChon) {
					D06.setGradient(mau_Trong);
					D6 = "";
					TTD6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D07.getRadiant() == mau_Trong) {
					D07.setGradient(mau_DangChon);
					D7 = "D07,";
					TTD7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D07.getRadiant() == mau_DangChon) {
					D07.setGradient(mau_Trong);
					D7 = "";
					TTD7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D08.getRadiant() == mau_Trong) {
					D08.setGradient(mau_DangChon);
					D8 = "D08,";
					TTD8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D08.getRadiant() == mau_DangChon) {
					D08.setGradient(mau_Trong);
					D8 = "";
					TTD8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D09.getRadiant() == mau_Trong) {
					D09.setGradient(mau_DangChon);
					D9 = "D09,";
					TTD9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D09.getRadiant() == mau_DangChon) {
					D09.setGradient(mau_Trong);
					D9 = "";
					TTD9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D010.getRadiant() == mau_Trong) {
					D010.setGradient(mau_DangChon);
					D10 = "D10,";
					TTD10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D010.getRadiant() == mau_DangChon) {
					D010.setGradient(mau_Trong);
					D10 = "";
					TTD10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        D011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(D011.getRadiant() == mau_Trong) {
					D011.setGradient(mau_DangChon);
					D11 = "D11,";
					TTD11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(D011.getRadiant() == mau_DangChon) {
					D011.setGradient(mau_Trong);
					D11 = "";
					TTD11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E01.getRadiant() == mau_Trong) {
					E01.setGradient(mau_DangChon);
					E1 = "E01,";
					TTE1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E01.getRadiant() == mau_DangChon) {
					E01.setGradient(mau_Trong);
					E1 = "";
					TTE1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E02.getRadiant() == mau_Trong) {
					E02.setGradient(mau_DangChon);
					E2 = "E02,";
					TTE2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E02.getRadiant() == mau_DangChon) {
					E02.setGradient(mau_Trong);
					E2 = "";
					TTE2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E03.getRadiant() == mau_Trong) {
					E03.setGradient(mau_DangChon);
					E3 = "E03,";
					TTE3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E03.getRadiant() == mau_DangChon) {
					E03.setGradient(mau_Trong);
					E3 = "";
					TTE3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E04.getRadiant() == mau_Trong) {
					E04.setGradient(mau_DangChon);
					E4 = "E04,";
					TTE4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E04.getRadiant() == mau_DangChon) {
					E04.setGradient(mau_Trong);
					E4 = "";
					TTE4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E05.getRadiant() == mau_Trong) {
					E05.setGradient(mau_DangChon);
					E5 = "E05,";
					TTE5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E05.getRadiant() == mau_DangChon) {
					E05.setGradient(mau_Trong);
					E5 = "";
					TTE5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E06.getRadiant() == mau_Trong) {
					E06.setGradient(mau_DangChon);
					E6 = "E06,";
					TTE6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E06.getRadiant() == mau_DangChon) {
					E06.setGradient(mau_Trong);
					E6 = "";
					TTE6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E07.getRadiant() == mau_Trong) {
					E07.setGradient(mau_DangChon);
					E7 = "E07,";
					TTE7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E07.getRadiant() == mau_DangChon) {
					E07.setGradient(mau_Trong);
					E7 = "";
					TTE7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E08.getRadiant() == mau_Trong) {
					E08.setGradient(mau_DangChon);
					E8 = "E08,";
					TTE8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E08.getRadiant() == mau_DangChon) {
					E08.setGradient(mau_Trong);
					E8 = "";
					TTE8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E09.getRadiant() == mau_Trong) {
					E09.setGradient(mau_DangChon);
					E9 = "E09,";
					TTE9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E09.getRadiant() == mau_DangChon) {
					E09.setGradient(mau_Trong);
					E9 = "";
					TTE9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E010.getRadiant() == mau_Trong) {
					E010.setGradient(mau_DangChon);
					E10 = "E10,";
					TTE10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E010.getRadiant() == mau_DangChon) {
					E010.setGradient(mau_Trong);
					E10 = "";
					TTE10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        E011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(E011.getRadiant() == mau_Trong) {
					E011.setGradient(mau_DangChon);
					E11 = "E11,";
					TTE11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(E011.getRadiant() == mau_DangChon) {
					E011.setGradient(mau_Trong);
					E11 = "";
					TTE11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F01.getRadiant() == mau_Trong) {
					F01.setGradient(mau_DangChon);
					F1 = "F01,";
					TTF1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F01.getRadiant() == mau_DangChon) {
					F01.setGradient(mau_Trong);
					F1 = "";
					TTF1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F02.getRadiant() == mau_Trong) {
					F02.setGradient(mau_DangChon);
					F2 = "F02,";
					TTF2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F02.getRadiant() == mau_DangChon) {
					F02.setGradient(mau_Trong);
					F2 = "";
					TTF2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F03.getRadiant() == mau_Trong) {
					F03.setGradient(mau_DangChon);
					F3 = "F03,";
					TTF3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F03.getRadiant() == mau_DangChon) {
					F03.setGradient(mau_Trong);
					F3 = "";
					TTF3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F04.getRadiant() == mau_Trong) {
					F04.setGradient(mau_DangChon);
					F4 = "F04,";
					TTF4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F04.getRadiant() == mau_DangChon) {
					F04.setGradient(mau_Trong);
					F4 = "";
					TTF4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F05.getRadiant() == mau_Trong) {
					F05.setGradient(mau_DangChon);
					F5 = "F05,";
					TTF5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F05.getRadiant() == mau_DangChon) {
					F05.setGradient(mau_Trong);
					F5 = "";
					TTF5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F06.getRadiant() == mau_Trong) {
					F06.setGradient(mau_DangChon);
					F6 = "F06,";
					TTF6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F06.getRadiant() == mau_DangChon) {
					F06.setGradient(mau_Trong);
					F6 = "";
					TTF6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F07.getRadiant() == mau_Trong) {
					F07.setGradient(mau_DangChon);
					F7 = "F07,";
					TTF7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F07.getRadiant() == mau_DangChon) {
					F07.setGradient(mau_Trong);
					F7 = "";
					TTF7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F08.getRadiant() == mau_Trong) {
					F08.setGradient(mau_DangChon);
					F8 = "F08,";
					TTF8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F08.getRadiant() == mau_DangChon) {
					F08.setGradient(mau_Trong);
					F8 = "";
					TTF8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F09.getRadiant() == mau_Trong) {
					F09.setGradient(mau_DangChon);
					F9 = "F09,";
					TTF9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F09.getRadiant() == mau_DangChon) {
					F09.setGradient(mau_Trong);
					F9 = "";
					TTF9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F010.getRadiant() == mau_Trong) {
					F010.setGradient(mau_DangChon);
					F10 = "F10,";
					TTF10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F010.getRadiant() == mau_DangChon) {
					F010.setGradient(mau_Trong);
					F10 = "";
					TTF10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        F011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(F011.getRadiant() == mau_Trong) {
					F011.setGradient(mau_DangChon);
					F11 = "F11,";
					TTF11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(F011.getRadiant() == mau_DangChon) {
					F011.setGradient(mau_Trong);
					F11 = "";
					TTF11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G01.getRadiant() == mau_Trong) {
					G01.setGradient(mau_DangChon);
					G1 = "G01,";
					TTG1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G01.getRadiant() == mau_DangChon) {
					G01.setGradient(mau_Trong);
					G1 = "";
					TTG1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G02.getRadiant() == mau_Trong) {
					G02.setGradient(mau_DangChon);
					G2 = "G02,";
					TTG2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G02.getRadiant() == mau_DangChon) {
					G02.setGradient(mau_Trong);
					G2 = "";
					TTG2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G03.getRadiant() == mau_Trong) {
					G03.setGradient(mau_DangChon);
					G3 = "G03,";
					TTG3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G03.getRadiant() == mau_DangChon) {
					G03.setGradient(mau_Trong);
					G3 = "";
					TTG3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G04.getRadiant() == mau_Trong) {
					G04.setGradient(mau_DangChon);
					G4 = "G04,";
					TTG4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G04.getRadiant() == mau_DangChon) {
					G04.setGradient(mau_Trong);
					G4 = "";
					TTG4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G05.getRadiant() == mau_Trong) {
					G05.setGradient(mau_DangChon);
					G5 = "G05,";
					TTG5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G05.getRadiant() == mau_DangChon) {
					G05.setGradient(mau_Trong);
					G5 = "";
					TTG5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G06.getRadiant() == mau_Trong) {
					G06.setGradient(mau_DangChon);
					G6 = "G06,";
					TTG6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G06.getRadiant() == mau_DangChon) {
					G06.setGradient(mau_Trong);
					G6 = "";
					TTG6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G07.getRadiant() == mau_Trong) {
					G07.setGradient(mau_DangChon);
					G7 = "G07,";
					TTG7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G07.getRadiant() == mau_DangChon) {
					G07.setGradient(mau_Trong);
					G7 = "";
					TTG7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G08.getRadiant() == mau_Trong) {
					G08.setGradient(mau_DangChon);
					G8 = "G08,";
					TTG8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G08.getRadiant() == mau_DangChon) {
					G08.setGradient(mau_Trong);
					G8 = "";
					TTG8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G09.getRadiant() == mau_Trong) {
					G09.setGradient(mau_DangChon);
					G9 = "G09,";
					TTG9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G09.getRadiant() == mau_DangChon) {
					G09.setGradient(mau_Trong);
					G9 = "";
					TTG9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G010.getRadiant() == mau_Trong) {
					G010.setGradient(mau_DangChon);
					G10 = "G10,";
					TTG10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G010.getRadiant() == mau_DangChon) {
					G010.setGradient(mau_Trong);
					G10 = "";
					TTG10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        G011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(G011.getRadiant() == mau_Trong) {
					G011.setGradient(mau_DangChon);
					G11 = "G11,";
					TTG11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(G011.getRadiant() == mau_DangChon) {
					G011.setGradient(mau_Trong);
					G11 = "";
					TTG11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H01.getRadiant() == mau_Trong) {
					H01.setGradient(mau_DangChon);
					H1 = "H01,";
					TTH1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H01.getRadiant() == mau_DangChon) {
					H01.setGradient(mau_Trong);
					H1 = "";
					TTH1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H02.getRadiant() == mau_Trong) {
					H02.setGradient(mau_DangChon);
					H2 = "H02,";
					TTH2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H02.getRadiant() == mau_DangChon) {
					H02.setGradient(mau_Trong);
					H2 = "";
					TTH2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H03.getRadiant() == mau_Trong) {
					H03.setGradient(mau_DangChon);
					H3 = "H03,";
					TTH3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H03.getRadiant() == mau_DangChon) {
					H03.setGradient(mau_Trong);
					H3 = "";
					TTH3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H04.getRadiant() == mau_Trong) {
					H04.setGradient(mau_DangChon);
					H4 = "H04,";
					TTH4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H04.getRadiant() == mau_DangChon) {
					H04.setGradient(mau_Trong);
					H4 = "";
					TTH4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H05.getRadiant() == mau_Trong) {
					H05.setGradient(mau_DangChon);
					H5 = "H05,";
					TTH5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H05.getRadiant() == mau_DangChon) {
					H05.setGradient(mau_Trong);
					H5 = "";
					TTH5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H06.getRadiant() == mau_Trong) {
					H06.setGradient(mau_DangChon);
					H6 = "H06,";
					TTH6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H06.getRadiant() == mau_DangChon) {
					H06.setGradient(mau_Trong);
					H6 = "";
					TTH6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H07.getRadiant() == mau_Trong) {
					H07.setGradient(mau_DangChon);
					H7 = "H07,";
					TTH7 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H07.getRadiant() == mau_DangChon) {
					H07.setGradient(mau_Trong);
					H7 = "";
					TTH7 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H08.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H08.getRadiant() == mau_Trong) {
					H08.setGradient(mau_DangChon);
					H8 = "H08,";
					TTH8 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H08.getRadiant() == mau_DangChon) {
					H08.setGradient(mau_Trong);
					H8 = "";
					TTH8 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H09.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H09.getRadiant() == mau_Trong) {
					H09.setGradient(mau_DangChon);
					H9 = "H09,";
					TTH9 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H09.getRadiant() == mau_DangChon) {
					H09.setGradient(mau_Trong);
					H9 = "";
					TTH9 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H010.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H010.getRadiant() == mau_Trong) {
					H010.setGradient(mau_DangChon);
					H10 = "H10,";
					TTH10 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H010.getRadiant() == mau_DangChon) {
					H010.setGradient(mau_Trong);
					H10 = "";
					TTH10 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        H011.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(H011.getRadiant() == mau_Trong) {
					H011.setGradient(mau_DangChon);
					H11 = "H11,";
					TTH11 = 1;
					GheDuocChon();
					TinhTien();
				}else if(H011.getRadiant() == mau_DangChon) {
					H011.setGradient(mau_Trong);
					H11 = "";
					TTH11 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        I01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(I01.getRadiant() == mau_Trong) {
					I01.setGradient(mau_DangChon);
					I1 = "I01,";
					TTI1 = 1;
					GheDuocChon();
					TinhTien();
				}else if(I01.getRadiant() == mau_DangChon) {
					I01.setGradient(mau_Trong);
					I1 = "";
					TTI1 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        I02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(I02.getRadiant() == mau_Trong) {
					I02.setGradient(mau_DangChon);
					I2 = "I02,";
					TTI2 = 1;
					GheDuocChon();
					TinhTien();
				}else if(I02.getRadiant() == mau_DangChon) {
					I02.setGradient(mau_Trong);
					I2 = "";
					TTI2 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        I03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(I03.getRadiant() == mau_Trong) {
					I03.setGradient(mau_DangChon);
					I3 = "I03,";
					TTI3 = 1;
					GheDuocChon();
					TinhTien();
				}else if(I03.getRadiant() == mau_DangChon) {
					I03.setGradient(mau_Trong);
					I3 = "";
					TTI3 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        I04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(I04.getRadiant() == mau_Trong) {
					I04.setGradient(mau_DangChon);
					I4 = "I04,";
					TTI4 = 1;
					GheDuocChon();
					TinhTien();
				}else if(I04.getRadiant() == mau_DangChon) {
					I04.setGradient(mau_Trong);
					I4 = "";
					TTI4 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        I05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(I05.getRadiant() == mau_Trong) {
					I05.setGradient(mau_DangChon);
					I5 = "I05,";
					TTI5 = 1;
					GheDuocChon();
					TinhTien();
				}else if(I05.getRadiant() == mau_DangChon) {
					I05.setGradient(mau_Trong);
					I5 = "";
					TTI5 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        I06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(I06.getRadiant() == mau_Trong) {
					I06.setGradient(mau_DangChon);
					I6 = "I06,";
					TTI6 = 1;
					GheDuocChon();
					TinhTien();
				}else if(I06.getRadiant() == mau_DangChon) {
					I06.setGradient(mau_Trong);
					I6 = "";
					TTI6 = 0;
					GheDuocChon();
					TinhTien();
				}
			}
        });
        
        promotion_check.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				codeKM = txtKhuyenMai.getText();
				try (CallableStatement stmt = conn.prepareCall("{CALL getMaGiamGia(?)}")) {
	                stmt.setString(1, codeKM);
	                try (ResultSet rs = stmt.executeQuery()) {
	                    if (rs.next()) {  
	                    	out = rs.getInt("soTienGiamInt");
	                    	if(out == 0 ) {
	                    		promotion_in.setBorderColor(new Color(171,27,27));
	                    		promotion_in.repaint();
	                    		promotion_out.setText("Không tồn tại mã");
	                    	}else{
	                    		promotion_in.setBorderColor(new Color(255,255,255));
	                    		promotion_in.repaint();
	                    		if(out < 100) {
	                    			promotion_out.setText("Giảm "+out+"%" );
	                    		}else if(out > 100 && out != 45000) {
	                    			promotion_out.setText("Giảm "+out+" vnđ" );
	                    		}else {
	                    			promotion_out.setText("Ghế đơn còn "+out+" vnđ" );
	                    		}
		    	                TinhTien();
	                    	}
	                    } 
	                }  
	            } catch (SQLException e2) {
	                e2.printStackTrace();
	            } 
			}
		});
        
        customer_check.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String code = txtKhachHang.getText();
				try (CallableStatement stmt = conn.prepareCall("{CALL getKhachHang(?)}")) {
	                stmt.setString(1, code);
	                try (ResultSet rs = stmt.executeQuery()) {
	                    if (rs.next()) {  
	                    	tenKH = rs.getString("tenKH");
	                    	if(tenKH.equalsIgnoreCase("notfound")) {
	                    		customer_in.setBorderColor(new Color(171,27,27));
	                    		customer_in.repaint();
	                    		customer_out.setText("Không tồn tại cccd");
	                    	}else {
	                    		customer_in.setBorderColor(new Color(255,255,255));
	                    		customer_in.repaint();
	                    		customer_out.setText(tenKH);
	                    	} 
	                    } 
	                }  
	            } catch (SQLException e2) {
	                e2.printStackTrace();
	            } 
			}
		});
        
        btn_DatVe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int ct = 0;
				int vitri = 0;
				int[] TTGhe = {
					    TTA1, TTA2, TTA3, TTA4, TTA5, TTA6, TTA7, TTA8, TTA9, TTA10, TTA11,
					    TTB1, TTB2, TTB3, TTB4, TTB5, TTB6, TTB7, TTB8, TTB9, TTB10, TTB11,
					    TTC1, TTC2, TTC3, TTC4, TTC5, TTC6, TTC7, TTC8, TTC9, TTC10, TTC11,
					    TTD1, TTD2, TTD3, TTD4, TTD5, TTD6, TTD7, TTD8, TTD9, TTD10, TTD11,
					    TTE1, TTE2, TTE3, TTE4, TTE5, TTE6, TTE7, TTE8, TTE9, TTE10, TTE11,
					    TTF1, TTF2, TTF3, TTF4, TTF5, TTF6, TTF7, TTF8, TTF9, TTF10, TTF11,
					    TTG1, TTG2, TTG3, TTG4, TTG5, TTG6, TTG7, TTG8, TTG9, TTG10, TTG11,
					    TTH1, TTH2, TTH3, TTH4, TTH5, TTH6, TTH7, TTH8, TTH9, TTH10, TTH11,
					    TTI1, TTI2, TTI3, TTI4, TTI5, TTI6
				};
				String[] array = {
	            	    A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11,
	            	    B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11,
	            	    C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11,
	            	    D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11,
	            	    E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11,
	            	    F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11,
	            	    G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11,
	            	    H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11,
	            	    I1, I2, I3, I4, I5, I6
	            };
				int[] giaGheArray = {
					    giaGheA01, giaGheA02, giaGheA03, giaGheA04, giaGheA05, giaGheA06, giaGheA07, giaGheA08, giaGheA09, giaGheA10, giaGheA11,
					    giaGheB01, giaGheB02, giaGheB03, giaGheB04, giaGheB05, giaGheB06, giaGheB07, giaGheB08, giaGheB09, giaGheB10, giaGheB11,
					    giaGheC01, giaGheC02, giaGheC03, giaGheC04, giaGheC05, giaGheC06, giaGheC07, giaGheC08, giaGheC09, giaGheC10, giaGheC11,
					    giaGheD01, giaGheD02, giaGheD03, giaGheD04, giaGheD05, giaGheD06, giaGheD07, giaGheD08, giaGheD09, giaGheD10, giaGheD11,
					    giaGheE01, giaGheE02, giaGheE03, giaGheE04, giaGheE05, giaGheE06, giaGheE07, giaGheE08, giaGheE09, giaGheE10, giaGheE11,
					    giaGheF01, giaGheF02, giaGheF03, giaGheF04, giaGheF05, giaGheF06, giaGheF07, giaGheF08, giaGheF09, giaGheF10, giaGheF11,
					    giaGheG01, giaGheG02, giaGheG03, giaGheG04, giaGheG05, giaGheG06, giaGheG07, giaGheG08, giaGheG09, giaGheG10, giaGheG11,
					    giaGheH01, giaGheH02, giaGheH03, giaGheH04, giaGheH05, giaGheH06, giaGheH07, giaGheH08, giaGheH09, giaGheH10, giaGheH11,
					    giaGheI01, giaGheI02, giaGheI03, giaGheI04, giaGheI05, giaGheI06
				};
    			for (int i = 0; i < TTGhe.length; i++) {
    			        if (TTGhe[i] == 1) {
    			            ct++; 
    			            vitri = i;
    			            try (CallableStatement stmt = conn.prepareCall("{CALL themChiTietHD(?,?,?,?,?,?,?,?)}")) {
    	    	                stmt.setString(1, ngayChieu);
    	    	                stmt.setString(2, gioChieu);
    	    	                stmt.setString(3, String.valueOf(tongTien)); 
    	    	                stmt.setString(4, maPhong);
    	    	                stmt.setString(5, maPhim);
    	    	                stmt.setString(6, codeKM);
    	    	                stmt.setString(7, maNV);
    	    	                stmt.setString(8, String.valueOf(giaPhim));
    	    	                stmt.execute();
    	    	            } catch (SQLException e2) {
    	    	                e2.printStackTrace();
    	    	            } 
    			        }
    			}
    			tenGheRieng = array[vitri];
    			giaGheRieng = giaGheArray[vitri];
    			System.out.println(ct);
    			if(ct !=0) {
    				try (CallableStatement stmt = conn.prepareCall("{CALL themHD(?,?,?,?,?,?,?)}")) {
    	                stmt.setString(1, ngayChieu);
    	                stmt.setString(2, gioChieu);
    	                stmt.setString(3, String.valueOf(tongTien)); 
    	                stmt.setString(4, maPhong);
    	                stmt.setString(5, maPhim);
    	                stmt.setString(6, codeKM);
    	                stmt.setString(7, maNV);
    	                stmt.execute();
    	                if(out < 100) {
    	                	KM = giaVe / 100 * out; 
                		}else if(out > 100 && out != 45000) {
                			KM = out;
                		}else {
                			
                			KM = out*ct;
                		}
    	                updateTTGhe();
    	                man_hinh.showHoaDon();
    	            } catch (SQLException e2) {
    	                e2.printStackTrace();
    	            } 
    			}else {
    				JOptionPane.showMessageDialog(null, "Vui lòng chọn ghế", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
    			}
			}
		});
        
	}
	
	protected void updateTTGhe() {
		nut_gradient[] nutGradientArray = {
			    A01, A02, A03, A04, A05, A06, A07, A08, A09, A010, A011,
			    B01, B02, B03, B04, B05, B06, B07, B08, B09, B010, B011,
			    C01, C02, C03, C04, C05, C06, C07, C08, C09, C010, C011,
			    D01, D02, D03, D04, D05, D06, D07, D08, D09, D010, D011,
			    E01, E02, E03, E04, E05, E06, E07, E08, E09, E010, E011,
			    F01, F02, F03, F04, F05, F06, F07, F08, F09, F010, F011,
			    G01, G02, G03, G04, G05, G06, G07, G08, G09, G010, G011,
			    H01, H02, H03, H04, H05, H06, H07, H08, H09, H010, H011,
			    I01, I02, I03, I04, I05, I06
		};
		String[] array = {
        	    A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11,
        	    B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11,
        	    C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11,
        	    D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11,
        	    E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11,
        	    F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11,
        	    G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11,
        	    H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11,
        	    I1, I2, I3, I4, I5, I6
        };
		for(int i = 0;i<nutGradientArray.length;i++) {
			if(nutGradientArray[i].getRadiant() == mau_DangChon) {
				try (CallableStatement stmt = conn.prepareCall("{CALL UpdateTTGhe(?,?)}")) {
	                stmt.setString(1, array[i].replaceAll(",$", ""));
	                stmt.setString(2, maLichChieu);
	                stmt.execute();
	            } catch (SQLException e2) {
	                e2.printStackTrace();
	            } 
			}
		}
	}
	
	protected void GheDuocChon() {
		// TODO Auto-generated method stub
		GheDat = 
       		 A1.trim()+ A2.trim()+ A3.trim()+ A4.trim()+ A5.trim()+ A6.trim()+ A7.trim()+ A8.trim()+ A9.trim()+ A10.trim()+ A11.trim()+
       		 B1.trim()+ B2.trim()+ B3.trim()+ B4.trim()+ B5.trim()+ B6.trim()+ B7.trim()+ B8.trim()+ B9.trim()+ B10.trim()+ B11.trim()+
       		 C1.trim()+ C2.trim()+ C3.trim()+ C4.trim()+ C5.trim()+ C6.trim()+ C7.trim()+ C8.trim()+ C9.trim()+ C10.trim()+ C11.trim()+
       		 D1.trim()+ D2.trim()+ D3.trim()+ D4.trim()+ D5.trim()+ D6.trim()+ D7.trim()+ D8.trim()+ D9.trim()+ D10.trim()+ D11.trim()+
       		 E1.trim()+ E2.trim()+ E3.trim()+ E4.trim()+ E5.trim()+ E6.trim()+ E7.trim()+ E8.trim()+ E9.trim()+ E10.trim()+ E11.trim()+
       		 F1.trim()+ F2.trim()+ F3.trim()+ F4.trim()+ F5.trim()+ F6.trim()+ F7.trim()+ F8.trim()+ F9.trim()+ F10.trim()+ F11.trim()+
       		 G1.trim()+ G2.trim()+ G3.trim()+ G4.trim()+ G5.trim()+ G6.trim()+ G7.trim()+ G8.trim()+ G9.trim()+ G10.trim()+ G11.trim()+
       		 H1.trim()+ H2.trim()+ H3.trim()+ H4.trim()+ H5.trim()+ H6.trim()+ H7.trim()+ H8.trim()+ H9.trim()+ H10.trim()+ H11.trim()+
       		 I1.trim()+ I2.trim()+ I3.trim()+ I4.trim()+ I5.trim()+ I6.trim();
		lbGheChon.setText(GheDat);
	}
	
	protected void TinhTien() {
		// TODO Auto-generated method stub
		if( out == 45000) {
			giaPhim = out;
		}else {
			giaPhim = getGiaFilm;
		}
		//hang_A
		if(TTA1 == 1) {
			giaGheA01 = giaPhim;
		}else {
			giaGheA01 = 0;
		}
		
		if(TTA2 == 1) {
			giaGheA02 = giaPhim;
		}else {
			giaGheA02 = 0;
		}
		
		if(TTA3 == 1) {
			giaGheA03 = giaPhim;
		}else {
			giaGheA03 = 0;
		}
		
		if(TTA4 == 1) {
			giaGheA04 = giaPhim;
		}else {
			giaGheA04 = 0;
		}
		
		if(TTA5 == 1) {
			giaGheA05 = giaPhim;
		}else {
			giaGheA05 = 0;
		}
		
		if(TTA6 == 1) {
			giaGheA06 = giaPhim;
		}else {
			giaGheA06 = 0;
		}
		
		if(TTA7 == 1) {
			giaGheA07 = giaPhim;
		}else {
			giaGheA07 = 0;
		}
		
		if(TTA8 == 1) {
			giaGheA08 = giaPhim;
		}else {
			giaGheA08 = 0;
		}
		
		if(TTA9 == 1) {
			giaGheA09 = giaPhim;
		}else {
			giaGheA09 = 0;
		}
		
		if(TTA10 == 1) {
			giaGheA10 = giaPhim;
		}else {
			giaGheA10 = 0;
		}
		
		if(TTA11 == 1) {
			giaGheA11 = giaPhim;
		}else {
			giaGheA11 = 0;
		}
		//hang_B
		if(TTB1 == 1) {
			giaGheB01 = giaPhim;
		}else {
			giaGheB01 = 0;
		}
		
		if(TTB2 == 1) {
			giaGheB02 = giaPhim;
		}else {
			giaGheB02 = 0;
		}
		
		if(TTB3 == 1) {
			giaGheB03 = giaPhim;
		}else {
			giaGheB03 = 0;
		}
		
		if(TTB4 == 1) {
			giaGheB04 = giaPhim;
		}else {
			giaGheB04 = 0;
		}
		
		if(TTB5 == 1) {
			giaGheB05 = giaPhim;
		}else {
			giaGheB05 = 0;
		}
		
		if(TTB6 == 1) {
			giaGheB06 = giaPhim;
		}else {
			giaGheB06 = 0;
		}
		
		if(TTB7 == 1) {
			giaGheB07 = giaPhim;
		}else {
			giaGheB07 = 0;
		}
		
		if(TTB8 == 1) {
			giaGheB08 = giaPhim;
		}else {
			giaGheB08 = 0;
		}
		
		if(TTB9 == 1) {
			giaGheB09 = giaPhim;
		}else {
			giaGheB09 = 0;
		}
		
		if(TTB10 == 1) {
			giaGheB10 = giaPhim;
		}else {
			giaGheB10 = 0;
		}
		
		if(TTB11 == 1) {
			giaGheB11 = giaPhim;
		}else {
			giaGheB11 = 0;
		}
		//hang_C
		if(TTC1 == 1) {
			giaGheC01 = giaPhim;
		}else {
			giaGheC01 = 0;
		}
		
		if(TTC2 == 1) {
			giaGheC02 = giaPhim;
		}else {
			giaGheC02 = 0;
		}
		
		if(TTC3 == 1) {
			giaGheC03 = giaPhim;
		}else {
			giaGheC03 = 0;
		}
		
		if(TTC4 == 1) {
			giaGheC04 = giaPhim;
		}else {
			giaGheC04 = 0;
		}
		
		if(TTC5 == 1) {
			giaGheC05 = giaPhim;
		}else {
			giaGheC05 = 0;
		}
		
		if(TTC6 == 1) {
			giaGheC06 = giaPhim;
		}else {
			giaGheC06 = 0;
		}
		
		if(TTC7 == 1) {
			giaGheC07 = giaPhim;
		}else {
			giaGheC07 = 0;
		}
		
		if(TTC8 == 1) {
			giaGheC08 = giaPhim;
		}else {
			giaGheC08 = 0;
		}
		
		if(TTC9 == 1) {
			giaGheC09 = giaPhim;
		}else {
			giaGheC09 = 0;
		}
		
		if(TTC10 == 1) {
			giaGheC10 = giaPhim;
		}else {
			giaGheC10 = 0;
		}
		
		if(TTC11 == 1) {
			giaGheC11 = giaPhim;
		}else {
			giaGheC11 = 0;
		}
		//hang_D
		if(TTD1 == 1) {
			giaGheD01 = giaPhim;
		}else {
			giaGheD01 = 0;
		}
		
		if(TTD2 == 1) {
			giaGheD02 = giaPhim;
		}else {
			giaGheD02 = 0;
		}
		
		if(TTD3 == 1) {
			giaGheD03 = giaPhim;
		}else {
			giaGheD03 = 0;
		}
		
		if(TTD4 == 1) {
			giaGheD04 = giaPhim;
		}else {
			giaGheD04 = 0;
		}
		
		if(TTD5 == 1) {
			giaGheD05 = giaPhim;
		}else {
			giaGheD05 = 0;
		}
		
		if(TTD6 == 1) {
			giaGheD06 = giaPhim;
		}else {
			giaGheD06 = 0;
		}
		
		if(TTD7 == 1) {
			giaGheD07 = giaPhim;
		}else {
			giaGheD07 = 0;
		}
		
		if(TTD8 == 1) {
			giaGheD08 = giaPhim;
		}else {
			giaGheD08 = 0;
		}
		
		if(TTD9 == 1) {
			giaGheD09 = giaPhim;
		}else {
			giaGheD09 = 0;
		}
		
		if(TTD10 == 1) {
			giaGheD10 = giaPhim;
		}else {
			giaGheD10 = 0;
		}
		
		if(TTD11 == 1) {
			giaGheD11 = giaPhim;
		}else {
			giaGheD11 = 0;
		}
		//hang_E
		if(TTE1 == 1) {
			giaGheE01 = giaPhim;
		}else {
			giaGheE01 = 0;
		}
		
		if(TTE2 == 1) {
			giaGheE02 = giaPhim;
		}else {
			giaGheE02 = 0;
		}
		
		if(TTE3 == 1) {
			giaGheE03 = giaPhim;
		}else {
			giaGheE03 = 0;
		}
		
		if(TTE4 == 1) {
			giaGheE04 = giaPhim;
		}else {
			giaGheE04 = 0;
		}
		
		if(TTE5 == 1) {
			giaGheE05 = giaPhim;
		}else {
			giaGheE05 = 0;
		}
		
		if(TTE6 == 1) {
			giaGheE06 = giaPhim;
		}else {
			giaGheE06 = 0;
		}
		
		if(TTE7 == 1) {
			giaGheE07 = giaPhim;
		}else {
			giaGheE07 = 0;
		}
		
		if(TTE8 == 1) {
			giaGheE08 = giaPhim;
		}else {
			giaGheE08 = 0;
		}
		
		if(TTE9 == 1) {
			giaGheE09 = giaPhim;
		}else {
			giaGheE09 = 0;
		}
		
		if(TTE10 == 1) {
			giaGheE10 = giaPhim;
		}else {
			giaGheE10 = 0;
		}
		
		if(TTE11 == 1) {
			giaGheE11 = giaPhim;
		}else {
			giaGheE11 = 0;
		}
		//hang_F
		if(TTF1 == 1) {
			giaGheF01 = giaPhim;
		}else {
			giaGheF01 = 0;
		}
		
		if(TTF2 == 1) {
			giaGheF02 = giaPhim;
		}else {
			giaGheF02 = 0;
		}
		
		if(TTF3 == 1) {
			giaGheF03 = giaPhim;
		}else {
			giaGheF03 = 0;
		}
		
		if(TTF4 == 1) {
			giaGheF04 = giaPhim;
		}else {
			giaGheF04 = 0;
		}
		
		if(TTF5 == 1) {
			giaGheF05 = giaPhim;
		}else {
			giaGheF05 = 0;
		}
		
		if(TTF6 == 1) {
			giaGheF06 = giaPhim;
		}else {
			giaGheF06 = 0;
		}
		
		if(TTF7 == 1) {
			giaGheF07 = giaPhim;
		}else {
			giaGheF07 = 0;
		}
		
		if(TTF8 == 1) {
			giaGheF08 = giaPhim;
		}else {
			giaGheF08 = 0;
		}
		
		if(TTF9 == 1) {
			giaGheF09 = giaPhim;
		}else {
			giaGheF09 = 0;
		}
		
		if(TTF10 == 1) {
			giaGheF10 = giaPhim;
		}else {
			giaGheF10 = 0;
		}
		
		if(TTF11 == 1) {
			giaGheF11 = giaPhim;
		}else {
			giaGheF11 = 0;
		}
		//hang_G
		if(TTG1 == 1) {
			giaGheG01 = giaPhim;
		}else {
			giaGheG01 = 0;
		}
		
		if(TTG2 == 1) {
			giaGheG02 = giaPhim;
		}else {
			giaGheG02 = 0;
		}
		
		if(TTG3 == 1) {
			giaGheG03 = giaPhim;
		}else {
			giaGheG03 = 0;
		}
		
		if(TTG4 == 1) {
			giaGheG04 = giaPhim;
		}else {
			giaGheG04 = 0;
		}
		
		if(TTG5 == 1) {
			giaGheG05 = giaPhim;
		}else {
			giaGheG05 = 0;
		}
		
		if(TTG6 == 1) {
			giaGheG06 = giaPhim;
		}else {
			giaGheG06 = 0;
		}
		
		if(TTG7 == 1) {
			giaGheG07 = giaPhim;
		}else {
			giaGheG07 = 0;
		}
		
		if(TTG8 == 1) {
			giaGheG08 = giaPhim;
		}else {
			giaGheG08 = 0;
		}
		
		if(TTG9 == 1) {
			giaGheG09 = giaPhim;
		}else {
			giaGheG09 = 0;
		}
		
		if(TTG10 == 1) {
			giaGheG10 = giaPhim;
		}else {
			giaGheG10 = 0;
		}
		
		if(TTG11 == 1) {
			giaGheG11 = giaPhim;
		}else {
			giaGheG11 = 0;
		}
		//hang_H
		if(TTH1 == 1) {
			giaGheH01 = giaPhim;
		}else {
			giaGheH01 = 0;
		}
		
		if(TTH2 == 1) {
			giaGheH02 = giaPhim;
		}else {
			giaGheH02 = 0;
		}
		
		if(TTH3 == 1) {
			giaGheH03 = giaPhim;
		}else {
			giaGheH03 = 0;
		}
		
		if(TTH4 == 1) {
			giaGheH04 = giaPhim;
		}else {
			giaGheH04 = 0;
		}
		
		if(TTH5 == 1) {
			giaGheH05 = giaPhim;
		}else {
			giaGheH05 = 0;
		}
		
		if(TTH6 == 1) {
			giaGheH06 = giaPhim;
		}else {
			giaGheH06 = 0;
		}
		
		if(TTH7 == 1) {
			giaGheH07 = giaPhim;
		}else {
			giaGheH07 = 0;
		}
		
		if(TTH8 == 1) {
			giaGheH08 = giaPhim;
		}else {
			giaGheH08 = 0;
		}
		
		if(TTH9 == 1) {
			giaGheH09 = giaPhim;
		}else {
			giaGheH09 = 0;
		}
		
		if(TTH10 == 1) {
			giaGheH10 = giaPhim;
		}else {
			giaGheH10 = 0;
		}
		
		if(TTH11 == 1) {
			giaGheH11 = giaPhim;
		}else {
			giaGheH11 = 0;
		}
		//hang_I
		if(TTI1 == 1) {
			giaGheI01 = giaGheDoi;
		}else {
			giaGheI01 = 0;
		}
		
		if(TTI2 == 1) {
			giaGheI02 = giaGheDoi;
		}else {
			giaGheI02 = 0;
		}
		
		if(TTI3 == 1) {
			giaGheI03 = giaGheDoi;
		}else {
			giaGheI03 = 0;
		}
		
		if(TTI4 == 1) {
			giaGheI04 = giaGheDoi;
		}else {
			giaGheI04 = 0;
		}
		
		if(TTI5 == 1) {
			giaGheI05 = giaGheDoi;
		}else {
			giaGheI05 = 0;
		}
		
		if(TTI6 == 1) {
			giaGheI06 = giaGheDoi;
		}else {
			giaGheI06 = 0;
		}
		giaVe =
					giaGheA01 + giaGheA02 + giaGheA03 + giaGheA04 + giaGheA05 + giaGheA06 + giaGheA07 + giaGheA08 + giaGheA09 + giaGheA10 + giaGheA11
	             + 	giaGheB01 + giaGheB02 + giaGheB03 + giaGheB04 + giaGheB05 + giaGheB06 + giaGheB07 + giaGheB08 + giaGheB09 + giaGheB10 + giaGheB11
	             + 	giaGheC01 + giaGheC02 + giaGheC03 + giaGheC04 + giaGheC05 + giaGheC06 + giaGheC07 + giaGheC08 + giaGheC09 + giaGheC10 + giaGheC11
	             + 	giaGheD01 + giaGheD02 + giaGheD03 + giaGheD04 + giaGheD05 + giaGheD06 + giaGheD07 + giaGheD08 + giaGheD09 + giaGheD10 + giaGheD11
	             + 	giaGheE01 + giaGheE02 + giaGheE03 + giaGheE04 + giaGheE05 + giaGheE06 + giaGheE07 + giaGheE08 + giaGheE09 + giaGheE10 + giaGheE11
	             + 	giaGheF01 + giaGheF02 + giaGheF03 + giaGheF04 + giaGheF05 + giaGheF06 + giaGheF07 + giaGheF08 + giaGheF09 + giaGheF10 + giaGheF11
	             + 	giaGheG01 + giaGheG02 + giaGheG03 + giaGheG04 + giaGheG05 + giaGheG06 + giaGheG07 + giaGheG08 + giaGheG09 + giaGheG10 + giaGheG11
	             + 	giaGheH01 + giaGheH02 + giaGheH03 + giaGheH04 + giaGheH05 + giaGheH06 + giaGheH07 + giaGheH08 + giaGheH09 + giaGheH10 + giaGheH11
	             +	giaGheI01 + giaGheI02 + giaGheI03 + giaGheI04 + giaGheI05 + giaGheI06;
		if( out <100) {
			tongTien = giaVe / 100 * (100-out);
		}else if(out > 100 && out != 45000) {
			tongTien = giaVe - out;
		}else {
			tongTien = giaVe;
		}
		if(tongTien < 0) {
			tongTien = 0;
		}
		
		DecimalFormat formatter = new DecimalFormat("#,###");
        String tongTienGhePhim = formatter.format(tongTien).replace(",", ".");
        sum.setText(tongTienGhePhim +" vnđ");
	}
	public void clearUI() {
		removeAll();
		revalidate();
		repaint();
	}
	
	public String getNgayChieu() {
		return ngayChieu;
	}
	public int  getTongTien() {
		return tongTien;
	}
	
	public String getGioChieu() {
		return gioChieu;
	}
	
	public String getTenPhim() {
		return tenPhim;
	}
	
	public String getMaPhong() {
		return maPhong;
	}
	
	public String getKH() {
		return tenKH;
	}
	
	public String getGheDat() {
		return GheDat;
	}
	
	public int getGiaVe() {
		return giaVe;
	}
	
	public int getKM() {
		return KM; 
	}
	
	public String getTenGheRieng() {
		return tenGheRieng;
	}
	
	public int getGiaGheRieng() {
		return giaGheRieng;
	}
}
