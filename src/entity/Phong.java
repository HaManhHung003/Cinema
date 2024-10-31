package entity;

public class Phong {
	private String tenPhong;
	private String loaiPhong;
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phong(String tenPhong, String loaiPhong) {
		super();
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	
	
}
