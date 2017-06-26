package space.hashtag.domain;

public class HashtagVO {
	private String h_name;
	private int p_no;
	public HashtagVO() {
		super();
	}
	public HashtagVO(String h_name, int p_no) {
		super();
		this.h_name = h_name;
		this.p_no = p_no;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	@Override
	public String toString() {
		return "HashtagVO [h_name=" + h_name + ", p_no=" + p_no + "]";
	}
	
}
