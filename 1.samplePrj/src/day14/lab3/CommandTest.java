package day14.lab3;

public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null;
		
		if(args[0].equals("delete")){
			cmd = new DeleteCommand();
		}else if(args[0].equals("update")){
			cmd = new UpdateCommand();			
		}else{
			cmd = new InsertCommand();
		}
		//��� Ȯ���� ��ƴ�. �����ϴ�.
		cmd.exec();
		cmd.newMethod();

	}
}
