package util;

public class Account {
	
	
	
	
	int balance ;//잔고
	
	 //Deposit deposit= new deposit(); //입금
	//int withdraw ; //출금
	//String account ;//계좌이체
	//String information; //통장정보출력
	
	public void deposit(int monny){
		balance += monny ;
	}
	public void withdraw(int monny) {
		balance -= monny ;
	}
	
	int information;
	public void display( ){
		
	}
           
}
