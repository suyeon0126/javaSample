package day15.exception;

public class DiceGame {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();

		int result1 = 0;
		int result2 =0 ;
		try {
			result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	int countSameEye(int n) throws Exception {
		if(n < 0) {
			throw new Exception("0보다 작을 수 없습니다.");	
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
