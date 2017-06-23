package space.deal.domain;

public class DealVO {
	private int dNo;
	private String id;
	private int pNo;
	private String price;
	private String resDate;
	private String resTime;
	private String bTel;
	private String sTel;
	private String title;
	private String area;
	private String grade;
	private String accept;
	public DealVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DealVO(int dNo, String id, int pNo, String price, String resDate, String resTime, String bTel, String sTel,
			String title, String area, String grade, String accept) {
		super();
		this.dNo = dNo;
		this.id = id;
		this.pNo = pNo;
		this.price = price;
		this.resDate = resDate;
		this.resTime = resTime;
		this.bTel = bTel;
		this.sTel = sTel;
		this.title = title;
		this.area = area;
		this.grade = grade;
		this.accept = accept;
	}
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
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
	public String getbTel() {
		return bTel;
	}
	public void setbTel(String bTel) {
		this.bTel = bTel;
	}
	public String getsTel() {
		return sTel;
	}
	public void setsTel(String sTel) {
		this.sTel = sTel;
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
		return "DealVO [dNo=" + dNo + ", id=" + id + ", pNo=" + pNo + ", price=" + price + ", resDate=" + resDate
				+ ", resTime=" + resTime + ", bTel=" + bTel + ", sTel=" + sTel + ", title=" + title + ", area=" + area
				+ ", grade=" + grade + ", accept=" + accept + "]";
	}
	
	
}
