package space.complain.domain;

public class ComplainVO {
	private String id;
	private int cNo;
	private int pNo;
	private String content;
	private String title;
	private String cDate;
	public ComplainVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComplainVO(String id, int cNo, int pNo, String content, String title, String cDate) {
		super();
		this.id = id;
		this.cNo = cNo;
		this.pNo = pNo;
		this.content = content;
		this.title = title;
		this.cDate = cDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	
	
}
