package day15.exception;

public class Test04 {
	public static void main(String[] args) {
		Account a = new Account();
		
		try {
			a.setMoney(-900);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--------------------");
		
		try {
			Account b = new Account("OOO", -500);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}

class Account{
	String name;
	int money;
		
	public Account() {
		super();
	}

	public Account(String name, int money) throws Exception {
		this.name = name;
		setMoney(money);
	}
	
	public void setMoney(int money) throws Exception {
		if(money < 0){
			throw new Exception("money Error"); //예외객체 생성.			
		}
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
	
}