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
		//기능 확장이 어렵다. 불편하다.
		cmd.exec();
		cmd.newMethod();

	}
}
