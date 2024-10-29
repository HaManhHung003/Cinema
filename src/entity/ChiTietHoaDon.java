package entity;

public class ChiTietHoaDon {
    private String maChiTiet;
	private int soLuong;
	private double donGia;
	private double thanhTien;
	private double thue;
	private String donViTinh;
	private int maHD;
	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDon(String maChiTiet, int soLuong, double donGia, double thanhTien, double thue, String donViTinh,
			int maHD) {
		super();
		this.maChiTiet = maChiTiet;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
		this.thue = thue;
		this.donViTinh = donViTinh;
		this.maHD = maHD;
	}
	public String getMaChiTiet() {
		return maChiTiet;
	}
	public void setMaChiTiet(String maChiTiet) {
		this.maChiTiet = maChiTiet;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getMaHD() {
		return maHD;
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	
	
}
