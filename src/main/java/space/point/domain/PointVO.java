package space.point.domain;

public class PointVO {
	private String kind;
	private String balance;
	private String amount;
	
	
	
	public PointVO() {
		super();
	}
	public PointVO(String kind, String balance, String amount) {
		super();
		this.kind = kind;
		this.balance = balance;
		this.amount = amount;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PointVO [kind=" + kind + ", balance=" + balance + ", amount=" + amount + "]";
	}
	
	

}
