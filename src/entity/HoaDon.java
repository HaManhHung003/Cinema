package entity;

import java.time.LocalDateTime;

public class HoaDon {
    private int maHD;
	private LocalDateTime ngayLapHD;
	private double tienNhan;
	private double tienDu;
	private double tongTien;
	private String maKhachHang;
	private String maNhanVien;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(int maHD, LocalDateTime ngayLapHD, double tienNhan, double tienDu, double tongTien,
			String maKhachHang, String maNhanVien) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.tienNhan = tienNhan;
		this.tienDu = tienDu;
		this.tongTien = tongTien;
		this.maKhachHang = maKhachHang;
		this.maNhanVien = maNhanVien;
	}
	public int getMaHD() {
		return maHD;
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	public LocalDateTime getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(LocalDateTime ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public double getTienNhan() {
		return tienNhan;
	}
	public void setTienNhan(double tienNhan) {
		this.tienNhan = tienNhan;
	}
	public double getTienDu() {
		return tienDu;
	}
	public void setTienDu(double tienDu) {
		this.tienDu = tienDu;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	
	
}

