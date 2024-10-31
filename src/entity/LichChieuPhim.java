package entity;

import java.sql.Date;
import java.sql.Time;

public class LichChieuPhim {
    private String maLichChieu;
	private String maPhim;
	private Date ngayChieu;
	private Time gioChieu;
	private int giaVe;
	private boolean trangThai;
	public LichChieuPhim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LichChieuPhim(String maLichChieu, String maPhim, Date ngayChieu, Time gioChieu, int giaVe,
			boolean trangThai) {
		super();
		this.maLichChieu = maLichChieu;
		this.maPhim = maPhim;
		this.ngayChieu = ngayChieu;
		this.gioChieu = gioChieu;
		this.giaVe = giaVe;
		this.trangThai = trangThai;
	}
	public String getMaLichChieu() {
		return maLichChieu;
	}
	public void setMaLichChieu(String maLichChieu) {
		this.maLichChieu = maLichChieu;
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public Date getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Date ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public Time getGioChieu() {
		return gioChieu;
	}
	public void setGioChieu(Time gioChieu) {
		this.gioChieu = gioChieu;
	}
	public int getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	
	
}
