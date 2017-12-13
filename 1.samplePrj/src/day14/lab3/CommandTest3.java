package day14.lab3;

public class CommandTest3 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		cmd = new day14.lab3.DeleteCommand(); //컴파일타입에 결정.
		
		Class cls = Class.forName("day14.lab3.DeleteCommand"); //런타입에 결정.
		cmd = (Command) cls.newInstance();
				
		cmd.exec();

	}
}
