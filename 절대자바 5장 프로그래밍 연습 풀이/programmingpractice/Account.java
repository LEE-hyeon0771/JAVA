package programmingpractice;

public class Account {
	private String owner;
	private long balance;
	
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(long balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {
		return this.balance += amount;
	}
	public long withdraw(long amount) {
		return this.balance -= amount;
	}
	public static void main(String[] args) {
		Account act = new Account("이현", 10000000);
		act.deposit(1000000);
		act.withdraw(500000);
		
		System.out.println("현재 금액은 " + act.getBalance());
	}
	
	
}
