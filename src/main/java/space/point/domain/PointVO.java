package space.point.domain;

public class PointVO {
	private String id;
	private String amount;
	
	public PointVO() {
		super();
	}

	public PointVO(String id, String amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "PointVO [id=" + id + ", amount=" + amount + "]";
	}
	
}