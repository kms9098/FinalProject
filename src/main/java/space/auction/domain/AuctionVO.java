package space.auction.domain;

import org.springframework.web.multipart.MultipartFile;

public class AuctionVO {
	private int aNo;
	private String price;
	private String content;
	private String area;
	private MultipartFile multipartFile;
	private String location;
	private String tel;
	private String crn;
	private String aDate;
	private String confirm;
	private String title;
	
	public AuctionVO() {
		
	}
	public AuctionVO(int aNo, String price, String content, String area, MultipartFile multipartFile, String location,
			String tel, String crn, String aDate, String confirm, String title) {
		super();
		this.aNo = aNo;
		this.price = price;
		this.content = content;
		this.area = area;
		this.multipartFile = multipartFile;
		this.location = location;
		this.tel = tel;
		this.crn = crn;
		this.aDate = aDate;
		this.confirm = confirm;
		this.title = title;
	}
	public int getaNo() {
		return aNo;
	}
	public void setaNo(int aNo) {
		this.aNo = aNo;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCrn() {
		return crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}
	public String getaDate() {
		return aDate;
	}
	public void setaDate(String aDate) {
		this.aDate = aDate;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
