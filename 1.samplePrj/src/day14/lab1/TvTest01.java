package day14.lab1;

public class TvTest01 {
	public static void main(String[] args) {
		LTV user = new LTV();
		user.on();
		user.off();
		
		STV user1 = new STV();
		user1.powerOn();
		user1.powerOff();
		
		// user = new STV(); //ȣȯ �ȵ�.
		
	}
}

class LTV {
	void on(){
		System.out.println("LTV ���� on");
	}
	void off(){
		System.out.println("LTV ���� off");
	}	
}

class STV {
	void powerOn(){
		System.out.println("STV ���� on");
	}
	void powerOff(){
		System.out.println("STV ���� off");
	}
}