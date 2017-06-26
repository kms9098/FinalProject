package space.deal.domain;

public class DealVO {
	private int d_no;
	private int p_no;
	private String sId;
	private String bId;
	private String price;
	private String resDate;
	private String resTime;
	private String sTel;
	private String bTel;
	private String title;
	private String area;
	private String grade;
	private String accept;
	public DealVO() {
		super();
	}
	public DealVO(int d_no, int p_no, String sId, String bId, String price, String resDate, String resTime, String sTel,
			String bTel, String title, String area, String grade, String accept) {
		super();
		this.d_no = d_no;
		this.p_no = p_no;
		this.sId = sId;
		this.bId = bId;
		this.price = price;
		this.resDate = resDate;
		this.resTime = resTime;
		this.sTel = sTel;
		this.bTel = bTel;
		this.title = title;
		this.area = area;
		this.grade = grade;
		this.accept = accept;
	}
	public int getD_no() {
		return d_no;
	}
	public void setD_no(int d_no) {
		this.d_no = d_no;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getResDate() {
		return resDate;
	}
	public void setResDate(String resDate) {
		this.resDate = resDate;
	}
	public String getResTime() {
		return resTime;
	}
	public void setResTime(String resTime) {
		this.resTime = resTime;
	}
	public String getsTel() {
		return sTel;
	}
	public void setsTel(String sTel) {
		this.sTel = sTel;
	}
	public String getbTel() {
		return bTel;
	}
	public void setbTel(String bTel) {
		this.bTel = bTel;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	@Override
	public String toString() {
		return "DealVO [d_no=" + d_no + ", p_no=" + p_no + ", sId=" + sId + ", bId=" + bId + ", price=" + price
				+ ", resDate=" + resDate + ", resTime=" + resTime + ", sTel=" + sTel + ", bTel=" + bTel + ", title="
				+ title + ", area=" + area + ", grade=" + grade + ", accept=" + accept + "]";
	}
	
	
}
