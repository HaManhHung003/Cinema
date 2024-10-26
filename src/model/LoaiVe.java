package model;

public class LoaiVe {
	private String tenLoaiVe;
	private String moTaLoaiVe;
	public LoaiVe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiVe(String tenLoaiVe, String moTaLoaiVe) {
		super();
		this.tenLoaiVe = tenLoaiVe;
		this.moTaLoaiVe = moTaLoaiVe;
	}
	public String getTenLoaiVe() {
		return tenLoaiVe;
	}
	public void setTenLoaiVe(String tenLoaiVe) {
		this.tenLoaiVe = tenLoaiVe;
	}
	public String getMoTaLoaiVe() {
		return moTaLoaiVe;
	}
	public void setMoTaLoaiVe(String moTaLoaiVe) {
		this.moTaLoaiVe = moTaLoaiVe;
	}

	
}
