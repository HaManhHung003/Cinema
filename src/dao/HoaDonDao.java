package dao;

import connectDB.JDBCUtil;
import connectDB.JDBCUtil2;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HoaDonDao {
	
	ArrayList<HoaDon> dsHoaDon;

	public HoaDonDao() {
		dsHoaDon = new ArrayList<HoaDon>();
	}

	public ArrayList<HoaDon> docTuBang() {
		try {
			JDBCUtil.getInstance();
			Connection con = JDBCUtil.getConnection();
			String sql = "Select * from HoaDon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String maHD = rs.getString("maHD");
				LocalDateTime ngayLapHD = rs.getTimestamp("ngayLapHD").toLocalDateTime();
				String tienNhan = rs.getString("tienNhan");
				String tienDu = rs.getString("tienDu");
				Double tongTien = rs.getDouble("tongTien");
				String maPhong = rs.getString("maPhong");
				String maPhim = rs.getString("maPhim");
				String maGhe = rs.getString("maGhe");
				String IDKH = rs.getString("IDNV");
				String IDNV = rs.getString("IDNV");
				String maGiamGia = rs.getString("maGiamGia");

//				// Sử dụng constructor copy
//				NhanVien nhanVien = new NhanVien(IDNV);
//				KhachHang khachHang = new KhachHang(IDKH);
//				ChiTietHoaDon chiTiet = new ChiTietHoaDon(chitiet)
//				HoaDon hoaDon = new HoaDon(0, ngayLapHD, 0, 0, 0, IDNV, maGiamGia);
//				dsHoaDon.add(hoaDon);
				
				HoaDon hd = new HoaDon();
				hd.setMaHD(maHD);
				hd.setNgayLapHD(ngayLapHD);
				hd.setTongTien(tongTien);
				
				dsHoaDon.add(hd);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsHoaDon;
	}
	
//	public boolean create(HoaDon HoaDon) {
//		Connection con = JDBCUtil.getConnection();
//		PreparedStatement stmt = null;
//		int n = 0;
//		try {
//			stmt = con.prepareStatement("insert into HoaDon values(?, ?, ?, ?, ?, ?)");
//			stmt.setInt(1, HoaDon.getMaHD());
//			stmt.setObject(2, HoaDon.getNgayLapHoaDon());
//			stmt.setString(3, HoaDon.getNhanVien().getMaNV());
//			stmt.setString(4, HoaDon.getKhachHang().getMaKH());
//			stmt.setBoolean(5, HoaDon.getDaHoanVe());
//			stmt.setBoolean(6, HoaDon.getDaHoanTien());
//			n = stmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return n > 0;
//	}
	
	public Map<Integer, Double> thongKeDoanhTungThangTheoNam(int nam) {
	    Map<Integer, Double> map = new HashMap<>();
	    
	    String sql = "SELECT MONTH(ngayLapHD) AS thang, SUM(tongTien) AS TongTien "
	               + "FROM HoaDon "
	               + "WHERE YEAR(ngayLapHD) = ? "
	               + "GROUP BY YEAR(ngayLapHD), MONTH(ngayLapHD) "
	               + "ORDER BY thang";
	    
	    try (Connection con = JDBCUtil2.getConnection();
	         PreparedStatement pstmt = con.prepareStatement(sql)) {
	         
	        pstmt.setInt(1, nam);  // Thiết lập giá trị cho tham số nam
	        ResultSet rs = pstmt.executeQuery();
	        
	        while (rs.next()) {
	            Integer thang = rs.getInt("thang");
	            Double tongTien = rs.getDouble("TongTien");
	            map.put(thang, tongTien);
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return map;
	}
	
	public double getTongDoanhThu() {
	    double tongDoanhThu = 0;
	    String sql = "select sum(tongTien) as tongTien from HoaDon";
	    
	    try (Connection con = JDBCUtil2.getConnection();
	         PreparedStatement pstmt = con.prepareStatement(sql)) {
	         
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) { // Di chuyển con trỏ đến dòng đầu tiên
	            tongDoanhThu = rs.getDouble("tongTien");
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return tongDoanhThu;
	}


		
	public static void main(String[] args) {
		
//		for (Map.Entry<Integer, Double> entry : new HoaDonDao().thongKeDoanhTungThangTheoNam(2024).entrySet()) {
//		    Integer thang = entry.getKey();    // Lấy ra khóa (tháng)
//		    Double doanhThu = entry.getValue(); // Lấy ra giá trị (doanh thu)
//
////		    dataset.addValue(doanhThu, "Doanh thu", thang.toString());
//		    System.out.println(thang + " "  + doanhThu);
//		}
		
		System.out.println(new HoaDonDao().getTongDoanhThu());
	}
	
	
} 