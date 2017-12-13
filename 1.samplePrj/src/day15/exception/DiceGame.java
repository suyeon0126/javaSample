package day15.exception;

public class DiceGame {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();

		int result1 = 0;
		int result2 =0 ;
		try {
			result1 = game.countSameEye(10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	int countSameEye(int n) throws Exception {
		if(n < 0) {
			throw new Exception("0���� ���� �� �����ϴ�.");	
		}
		
		int count = 0;
		Dice a = new Dice(8);
		Dice b = new Dice(8);
		
		for(int i=0; i<n; i++){
			if(a.play() == b.play()){
				count++;				
			}
		} return count;
	}
}

class Dice {
	int size;
	Dice(int size){
		this.size = size;
	}
       int play(){
 	int number = (int)(Math.random() * size) + 1;
        return number;
    }
}
