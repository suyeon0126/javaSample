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

class TV extends Product {} //Product�� ��ӹ��� buyer�� ������ �� �ִ� ���Ÿ��
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
	void buy(TV t){ //�� �� �ִ� �ɷ�
		money -= t.price; //TV ���� ����
		point += t.point; //�����ؼ� ���̴� ����Ʈ.
	}
	void buy(Computer t){ 
		money -= t.price; 
		point += t.point; 
	} //void buy�� �޼ҵ� �����ε�. ��� �̷��� ����߰��� �ϴٺ��� �����ϱ� �������.
	*/
}
