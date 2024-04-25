package exam01;


public class Account {
	private String accId;
	private long balance=1000000;
	/*
	 * public Account() { System.out.println("기본생성자 - Account"); }
	 */
	public Account(String accId, long balance) {
		super();
		this.accId = accId;
		this.balance = balance;
		System.out.println("매개변수 2개 생성자 - Account");
	}
	public void setAccId(String accId){
		this.accId = accId;
	}
	public String getAccId(){
		return this.accId;
	}
	//입금하기
	public void input(long money){
		balance = balance+money;
	}
	//출금하기
	public void output(long money){
		balance = balance-money;
	}
	//잔액조회하기
	public long getBalance(){
		return balance;
	}
}
