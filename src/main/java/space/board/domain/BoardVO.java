package space.board.domain;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int bNo;
	private String id;
	private String title;
	private String category;
	private String bDate;
	private String content;
	private MultipartFile multipartFile;
	
	public BoardVO() {
		super();
	}

	public BoardVO(int bNo, String id, String title, String category, String bDate, String content,
			MultipartFile multipartFile) {
		super();
		this.bNo = bNo;
		this.id = id;
		this.title = title;
		this.category = category;
		this.bDate = bDate;
		this.content = content;
		this.multipartFile = multipartFile;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	@Override
	public String toString() {
		return "BoardVO [bNo=" + bNo + ", id=" + id + ", title=" + title + ", category=" + category + ", bDate=" + bDate
				+ ", content=" + content + ", multipartFile=" + multipartFile + "]";
	}
	
	
}
