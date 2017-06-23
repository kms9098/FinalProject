package space.hashtag.domain;

public class HashtagVO {
	private String h_name;
	
	

	public HashtagVO() {
		super();
	}
	public HashtagVO(String h_name) {
		super();
		this.h_name = h_name;
	}


	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	
	@Override
	public String toString() {
		return "hashtagVO [h_name=" + h_name + "]";
	}
	
	

}
