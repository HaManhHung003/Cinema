package entity;

public class Phim {	    
	 private String maPhim;
	 private String tenPhim;
	 private String theLoai;
	 private String daoDien;
	 private String dienVien;
	 private int namSanXuat;
	 private int thoiLuong;
	 private String moTa;
	public Phim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phim(String maPhim, String tenPhim, String theLoai, String daoDien, String dienVien, int namSanXuat,
			int thoiLuong, String moTa) {
		super();
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.theLoai = theLoai;
		this.daoDien = daoDien;
		this.dienVien = dienVien;
		this.namSanXuat = namSanXuat;
		this.thoiLuong = thoiLuong;
		this.moTa = moTa;
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public String getDaoDien() {
		return daoDien;
	}
	public void setDaoDien(String daoDien) {
		this.daoDien = daoDien;
	}
	public String getDienVien() {
		return dienVien;
	}
	public void setDienVien(String dienVien) {
		this.dienVien = dienVien;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public int getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	 
	 
}
