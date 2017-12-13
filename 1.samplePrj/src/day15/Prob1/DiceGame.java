package day15.Prob1;

public class DiceGame {
	public static void main(String[] args) {
		DiceGame game = new DiceGame(); 
		
		try{
		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
			 
		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			
		}		
		
		System.out.println("main END");
	}
	
	int countSameEye(int n) throws Exception {
		if(n < 0){
			throw new Exception("게임 회수는 음수 X");
			
		}
		 //구현
		int count = 0;
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		
		for(int i=0; i<n; i++){
			if(dice1.play()==dice2.play()) count++;
		}
		
		return count;

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


