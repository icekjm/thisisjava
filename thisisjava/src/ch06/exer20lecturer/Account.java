package ch06.exer20lecturer;

public class Account {
	private String number;
	private String owner;
	private int balance;
	
	public Account(String number, String owner, int balance) {
		this.number = number;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
