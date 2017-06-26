package space.product.domain;

import org.springframework.web.multipart.MultipartFile;

import space.hashtag.domain.HashtagVO;

public class ProductVO {
	private int p_no;
	private String title;
	private String price;
	private String content;
	private String area;
	private HashtagVO hashtagVO;
	private MultipartFile upload;
	private String pDate;
	private String category;
	private String crn;
	private String location;
	private String type;
	private String sTime;
	private String eTime;
	private String tel;
	private String originfilename;
	private String newfilename;
	private String id;
	public ProductVO() {
		super();
	}
	public ProductVO(int p_no, String title, String price, String content, String area, HashtagVO hashtagVO,
			MultipartFile upload, String pDate, String category, String crn, String location, String type, String sTime,
			String eTime, String tel, String originfilename, String newfilename, String id) {
		super();
		this.p_no = p_no;
		this.title = title;
		this.price = price;
		this.content = content;
		this.area = area;
		this.hashtagVO = hashtagVO;
		this.upload = upload;
		this.pDate = pDate;
		this.category = category;
		this.crn = crn;
		this.location = location;
		this.type = type;
		this.sTime = sTime;
		this.eTime = eTime;
		this.tel = tel;
		this.originfilename = originfilename;
		this.newfilename = newfilename;
		this.id = id;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public HashtagVO getHashtagVO() {
		return hashtagVO;
	}
	public void setHashtagVO(HashtagVO hashtagVO) {
		this.hashtagVO = hashtagVO;
	}
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCrn() {
		return crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String geteTime() {
		return eTime;
	}
	public void seteTime(String eTime) {
		this.eTime = eTime;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getOriginfilename() {
		return originfilename;
	}
	public void setOriginfilename(String originfilename) {
		this.originfilename = originfilename;
	}
	public String getNewfilename() {
		return newfilename;
	}
	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ProductVO [p_no=" + p_no + ", title=" + title + ", price=" + price + ", content=" + content + ", area="
				+ area + ", hashtagVO=" + hashtagVO + ", upload=" + upload + ", pDate=" + pDate + ", category="
				+ category + ", crn=" + crn + ", location=" + location + ", type=" + type + ", sTime=" + sTime
				+ ", eTime=" + eTime + ", tel=" + tel + ", originfilename=" + originfilename + ", newfilename="
				+ newfilename + ", id=" + id + "]";
	}
	
	
}
