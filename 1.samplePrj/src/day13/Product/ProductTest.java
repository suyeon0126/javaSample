package day13.Product;

public class ProductTest {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new TV());
		buyer.buy(new VCR());
		buyer.buy(new Audio());
		
	}
}
class Product {
	int price;
	int point;		
}

class TV extends Product {} //Product을 상속받은 buyer가 구매할 수 있는 구매목록
class Computer extends Product {}
class VCR extends Product {}
class HP extends Product {}
class Audio extends Product {}

class Buyer{
	int money;
	int point;
	
	void buy(Product t){
		money -= t.price;
		point += t.point;
	}
	/*
	void buy(TV t){ //살 수 있는 능력
		money -= t.price; //TV 가격 지불
		point += t.point; //구매해서 쌓이는 포인트.
	}
	void buy(Computer t){ 
		money -= t.price; 
		point += t.point; 
	} //void buy는 메소드 오버로딩. 계속 이렇게 기능추가를 하다보면 관리하기 힘들어짐.
	*/
}
