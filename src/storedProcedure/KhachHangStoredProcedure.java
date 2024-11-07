package storedProcedure;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import connectDB.JDBCUtil;
import connectDB.JDBCUtil2;
import entity.KhachHang;
//import util.JDBCUtil;

public class KhachHangStoredProcedure {
	private String maKhachHang;
	private String tenKhachHang;
	private String loaiKhachHang;
	private String soDienThoai;
	private String cCCD;
	private String email;
	private Date ngaySinh;

	public List<KhachHang> getAllCustomers() {
		List<KhachHang> customers = new ArrayList<>();
		String sql = "SELECT IDKH, maKhachHang, tenKhachHang, loaiKhachHang, soDienThoai, cCCD, email, ngaySinh FROM cinema.dbo.KhachHang";

		try (Connection conn = connectDB.JDBCUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
//                int id = rs.getInt("IDKH");
				String maKhachHang = rs.getString("maKhachHang");
				String tenKhachHang = rs.getString("tenKhachHang");
				String loaiKhachHang = rs.getString("loaiKhachHang");
				String soDienThoai = rs.getString("soDienThoai");
				String cCCD = rs.getString("cCCD");
				String email = rs.getString("email");
				Date ngaySinh = rs.getDate("ngaySinh");

				KhachHang customer = new KhachHang(maKhachHang, tenKhachHang, loaiKhachHang, soDienThoai, cCCD, email,
						ngaySinh);
				customers.add(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return customers;
	}

	public KhachHang getKhachHangTheoMaKH(String maKhachHang) {
		KhachHang khachHang = null;

		Connection con = null;
		PreparedStatement stmt = null;

		try {
			con = JDBCUtil2.getConnection();
			String sql = "SELECT * FROM KhachHang WHERE [maKH] = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, maKhachHang);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String maKH = rs.getString("maKH");
				String tenKH = rs.getNString("tenKH");
				String email = rs.getString("email");
				String sdt = rs.getString("sdt");
				String cccd = rs.getString("cccd");
				khachHang = new KhachHang(maKhachHang, maKhachHang, maKhachHang, sdt, cccd, email, ngaySinh);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return khachHang;
	}
}
