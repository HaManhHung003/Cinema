package entity;

import java.sql.Date;

public class KhachHang {  
    private String maKhachHang;
	private String tenKhachHang;
	private String loaiKhachHang;
	private String soDienThoai;
	private String cCCD;
	private String email;
	private Date ngaySinh;
	public KhachHang(String maKhachHang, String tenKhachHang, String loaiKhachHang, String soDienThoai, String cCCD,
			String email, Date ngaySinh) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.loaiKhachHang = loaiKhachHang;
		this.soDienThoai = soDienThoai;
		this.cCCD = cCCD;
		this.email = email;
		this.ngaySinh = ngaySinh;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getLoaiKhachHang() {
		return loaiKhachHang;
	}
	public void setLoaiKhachHang(String loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
	
}
