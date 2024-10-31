package entity;

public class Ghe {
    private String maGhe;
	private String tenGhe;
	private String loaiGhe;
	private String viTri;
	public Ghe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ghe(String maGhe, String tenGhe, String loaiGhe, String viTri) {
		super();
		this.maGhe = maGhe;
		this.tenGhe = tenGhe;
		this.loaiGhe = loaiGhe;
		this.viTri = viTri;
	}
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public String getTenGhe() {
		return tenGhe;
	}
	public void setTenGhe(String tenGhe) {
		this.tenGhe = tenGhe;
	}
	public String getLoaiGhe() {
		return loaiGhe;
	}
	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	
	
}
