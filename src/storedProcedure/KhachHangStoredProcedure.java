package storedProcedure;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.KhachHang;
//import util.JDBCUtil;

public class KhachHangStoredProcedure {

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

                KhachHang customer = new KhachHang(maKhachHang, tenKhachHang, loaiKhachHang, soDienThoai, cCCD, email, ngaySinh);
                customers.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return customers;
    }
}
