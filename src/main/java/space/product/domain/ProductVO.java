package space.product.domain;

import org.springframework.web.multipart.MultipartFile;

import space.hashtag.domain.HashtagVO;

public class ProductVO {
	
	private int pNo;  //p_no
	private String title;
	private String price;
	private String content;

	private String area;	//���� �ּ�
	private HashtagVO hashtagVO;
	private MultipartFile upload;
	private String date;	//���೯¥
	private String category;//ī��, �Ҹ��Ӱ���, ���ǽ�  �������� ���
	private String crn;		//����ڵ�Ϲ�ȣ
	private String location; //map ���� ��ġ
	private String type;	//����ũ. �Ϲݰ��� ��ǰ
	private String time;	//����ð�
	private String tel;		//�Ǹ��� ��ȣ

	public ProductVO(int pNo, String title, String price, String content, String area, HashtagVO hashtagVO,
			MultipartFile upload, String date, String category, String crn, String location, String type, String time,
			String tel) {
		super();
		this.pNo = pNo;
		this.title = title;
		this.price = price;
		this.content = content;
		this.area = area;
		this.hashtagVO = hashtagVO;
		this.upload = upload;
		this.date = date;
		this.category = category;
		this.crn = crn;
		this.location = location;
		this.type = type;
		this.time = time;
		this.tel = tel;
	}

	public ProductVO(){
		
	}
	
	public HashtagVO getHashtagVO() {
		return hashtagVO;
	}

	public void setHashtagVO(HashtagVO hashtagVO) {
		this.hashtagVO = hashtagVO;
	}

	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
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

	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "ProductVO [pNo=" + pNo + ", title=" + title + ", price=" + price + ", content=" + content + ", area="
				+ area + ", hashtagVO=" + hashtagVO + ", upload=" + upload + ", date=" + date + ", category=" + category
				+ ", crn=" + crn + ", location=" + location + ", type=" + type + ", time=" + time + ", tel=" + tel
				+ "]";
	}
}


