package day16.exception;

public class Test02 {
	public static void main(String[] args){
		
		try{
		Account account = new Account("홍길동", 100);
		account.setMoney(-500);
		System.out.println(account);
		} catch (MoneyException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Main END");
	}
}

class Account {
	private String name;
	private int money;

	public Account() {
		super();
	}

	public Account(String name, int money) throws MoneyException{
		super();
		this.name = name;
		setMoney(money);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {
		if(money < 0) {
			throw new MoneyException("money는 양수만"); //예외처리를 할 때는 적절한 문구로 처리해줘야함.
		}
		this.money = money;
		
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}	
}


class MoneyException extends Exception{ //사용자정의 클래스를 만들때는 exception을 상속받아야함.
	
	MoneyException(){
		super("Money Error");
	}
	MoneyException(String msg){
		super(msg);
	}
}

