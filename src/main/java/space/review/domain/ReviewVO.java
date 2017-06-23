package space.review.domain;

import org.springframework.web.multipart.MultipartFile;

public class ReviewVO {
	private int rNo;
	private int pNo;
	private String id;
	private String average;
	private String content;
	private int goodCount;
	private String rDate;
	private MultipartFile upload;
	
	public ReviewVO() {
		super();
	}

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(int goodCount) {
		this.goodCount = goodCount;
	}

	public String getrDate() {
		return rDate;
	}

	public void setrDate(String rDate) {
		this.rDate = rDate;
	}

	public MultipartFile getUpload() {
		return upload;
	}

	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}

	public ReviewVO(int rNo, int pNo, String id, String average, String content, int goodCount, String rDate,
			MultipartFile upload) {
		super();
		this.rNo = rNo;
		this.pNo = pNo;
		this.id = id;
		this.average = average;
		this.content = content;
		this.goodCount = goodCount;
		this.rDate = rDate;
		this.upload = upload;
		
		
	}

	@Override
	public String toString() {
		return "ReviewVO [rNo=" + rNo + ", pNo=" + pNo + ", id=" + id + ", average=" + average + ", content=" + content
				+ ", goodCount=" + goodCount + ", rDate=" + rDate + ", upload=" + upload + "]";
	}
	
	
	
}
