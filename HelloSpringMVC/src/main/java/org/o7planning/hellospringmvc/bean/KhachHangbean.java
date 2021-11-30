package org.o7planning.hellospringmvc.bean;

public class KhachHangbean {
	private long makh;
	private String tenkh;
	private String tendn;
	private String matkhau;
	private String diachi;
	private String email;
	private String Sdt;
	
	
	
	public KhachHangbean(String tenkh, String tendn, String diachi, String email, String sdt) {
		super();
		this.tenkh = tenkh;
		this.tendn = tendn;
		this.diachi = diachi;
		this.email = email;
		Sdt = sdt;
	}

	public KhachHangbean() {
		super();
	}
	
	public KhachHangbean(long makh, String tenkh, String tendn, String matkhau, String diachi, String email,
			String sdt) {
		super();
		this.makh = makh;
		this.tenkh = tenkh;
		this.tendn = tendn;
		this.matkhau = matkhau;
		this.diachi = diachi;
		this.email = email;
		Sdt = sdt;
	}
	public long getMakh() {
		return makh;
	}
	public void setMakh(long makh) {
		this.makh = makh;
	}
	public String getTenkh() {
		return tenkh;
	}
	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}
	public String getTendn() {
		return tendn;
	}
	public void setTendn(String tendn) {
		this.tendn = tendn;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return Sdt;
	}
	public void setSdt(String sdt) {
		Sdt = sdt;
	}
	
}
