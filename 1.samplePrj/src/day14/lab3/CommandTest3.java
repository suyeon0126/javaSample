package day14.lab3;

public class CommandTest3 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		cmd = new day14.lab3.DeleteCommand(); //������Ÿ�Կ� ����.
		
		Class cls = Class.forName("day14.lab3.DeleteCommand"); //��Ÿ�Կ� ����.
		cmd = (Command) cls.newInstance();
				
		cmd.exec();

	}
}
