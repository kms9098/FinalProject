package space.adeal.domain;

public class adealVO {
	private int aNo;
	private String id;
	private String fPrice;
	
	
	public adealVO() {
	}
	public adealVO(int aNo, String id, String fPrice) {
		super();
		this.aNo = aNo;
		this.id = id;
		this.fPrice = fPrice;
	}
	public int getaNo() {
		return aNo;
	}
	public void setaNo(int aNo) {
		this.aNo = aNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfPrice() {
		return fPrice;
	}
	public void setfPrice(String fPrice) {
		this.fPrice = fPrice;
	}
	@Override
	public String toString() {
		return "adealVO [aNo=" + aNo + ", id=" + id + ", fPrice=" + fPrice + "]";
	}
	
	
	
}
