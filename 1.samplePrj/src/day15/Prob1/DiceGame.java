package day15.Prob1;

public class DiceGame {
	public static void main(String[] args) {
		DiceGame game = new DiceGame(); 
		
		try{
		int result1 = game.countSameEye(10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
			 
		int result2 = game.countSameEye(-10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			
		}		
		
		System.out.println("main END");
	}
	
	int countSameEye(int n) throws Exception {
		if(n < 0){
			throw new Exception("���� ȸ���� ���� X");
			
		}
		 //����
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


