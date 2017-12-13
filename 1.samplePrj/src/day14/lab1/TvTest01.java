package day14.lab1;

public class TvTest01 {
	public static void main(String[] args) {
		LTV user = new LTV();
		user.on();
		user.off();
		
		STV user1 = new STV();
		user1.powerOn();
		user1.powerOff();
		
		// user = new STV(); //호환 안됨.
		
	}
}

class LTV {
	void on(){
		System.out.println("LTV 전원 on");
	}
	void off(){
		System.out.println("LTV 전원 off");
	}	
}

class STV {
	void powerOn(){
		System.out.println("STV 전원 on");
	}
	void powerOff(){
		System.out.println("STV 전원 off");
	}
}