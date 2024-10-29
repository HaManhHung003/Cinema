package entity;

import java.sql.Date;

public class MaGiamGia {
    private String maGiamGia;
	private int phanTramGiam;
	private Date ngayBatDau;
	private Date NgayKetThuc;
	private String dieuKienApDung;
	public MaGiamGia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaGiamGia(String maGiamGia, int phanTramGiam, Date ngayBatDau, Date ngayKetThuc, String dieuKienApDung) {
		super();
		this.maGiamGia = maGiamGia;
		this.phanTramGiam = phanTramGiam;
		this.ngayBatDau = ngayBatDau;
		NgayKetThuc = ngayKetThuc;
		this.dieuKienApDung = dieuKienApDung;
	}
	public String getMaGiamGia() {
		return maGiamGia;
	}
	public void setMaGiamGia(String maGiamGia) {
		this.maGiamGia = maGiamGia;
	}
	public int getPhanTramGiam() {
		return phanTramGiam;
	}
	public void setPhanTramGiam(int phanTramGiam) {
		this.phanTramGiam = phanTramGiam;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
	}
	public String getDieuKienApDung() {
		return dieuKienApDung;
	}
	public void setDieuKienApDung(String dieuKienApDung) {
		this.dieuKienApDung = dieuKienApDung;
	}
	
	
}
