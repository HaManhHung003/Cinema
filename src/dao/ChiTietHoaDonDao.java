package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;
import entity.Ghe;
import entity.HoaDon;
import entity.KhachHang;
import entity.MaGiamGia;
import entity.NhanVien;
import entity.Phim;
import entity.Phong;
import entity.Ve;

public class ChiTietHoaDonDao {
	private String maHD;
	private LocalDate ngayLapHD;
	private Double tienNhan;
	private double tongTien;
	private Phong maphong;
	private Phim maPhim;
	private Ghe maGhe;
	private KhachHang IDKH;
	private NhanVien IDNV;
	private MaGiamGia maGiamGia;

	@Override
	public String toString() {
		return "ChiTietHoaDonDao [maHD=" + maHD + ", ngayLapHD=" + ngayLapHD + ", tienNhan=" + tienNhan + ", tongTien="
				+ tongTien + ", maphong=" + maphong + ", maPhim=" + maPhim + ", maGhe=" + maGhe + ", IDKH=" + IDKH
				+ ", IDNV=" + IDNV + ", maGiamGia=" + maGiamGia + "]";
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}

	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	public Double getTienNhan() {
		return tienNhan;
	}

	public void setTienNhan(Double tienNhan) {
		this.tienNhan = tienNhan;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public Phong getMaphong() {
		return maphong;
	}

	public void setMaphong(Phong maphong) {
		this.maphong = maphong;
	}

	public Phim getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(Phim maPhim) {
		this.maPhim = maPhim;
	}

	public Ghe getMaGhe() {
		return maGhe;
	}

	public void setMaGhe(Ghe maGhe) {
		this.maGhe = maGhe;
	}

	public KhachHang getIDKH() {
		return IDKH;
	}

	public void setIDKH(KhachHang iDKH) {
		IDKH = iDKH;
	}

	public NhanVien getIDNV() {
		return IDNV;
	}

	public void setIDNV(NhanVien iDNV) {
		IDNV = iDNV;
	}

	public MaGiamGia getMaGiamGia() {
		return maGiamGia;
	}

	public void setMaGiamGia(MaGiamGia maGiamGia) {
		this.maGiamGia = maGiamGia;
	}

	public ChiTietHoaDonDao(String maHD, LocalDate ngayLapHD, Double tienNhan, double tongTien, Phong maphong,
			Phim maPhim, Ghe maGhe, KhachHang iDKH, NhanVien iDNV, MaGiamGia maGiamGia) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.tienNhan = tienNhan;
		this.tongTien = tongTien;
		this.maphong = maphong;
		this.maPhim = maPhim;
		this.maGhe = maGhe;
		IDKH = iDKH;
		IDNV = iDNV;
		this.maGiamGia = maGiamGia;
	}

	public ChiTietHoaDonDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDon getCTHDTheoMaChiTiet(String maChiTiet) { 
		Connection con = ConnectDB.getInstance().getConnection(); 
		PreparedStatement stmt =null; 
		ChiTietHoaDon cthd = null;
		try {       
			String sql = "Select * from ChiTietHoaDon where maChiTiet = ?"; 
			//String sql = "Select * from KhachHang"; 
			stmt = con.prepareStatement(sql); 
			stmt.setString(1, maChiTiet); 
			ResultSet rs = stmt.executeQuery(); 
			while (rs.next()) {
                String maHD = rs.getString("hoaDon");
                int soLuong=rs.getInt("soLuong");
                float thue=rs.getFloat("thue");
                
//                HoaDon hoaDon = new HoaDon(maHD);
                
//                ArrayList<Ve> danhSachVe = ve_Dao.getDsVeTheoMaChiTiet(maChiTiet);
                
                cthd = new ChiTietHoaDon();
			} 
		} catch (SQLException e) { 
			e.printStackTrace();     
		} 
		
		return cthd; 
	} 
}
