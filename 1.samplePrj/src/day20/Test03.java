package day20;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("delete, update, select, insert ��� �� �ϳ��� �Է��ϼ���.");
			return;
		}
		
		Map<String, Command> m = new HashMap<>();
		m.put("Delete", new Delete());
		m.put("Select", new Select());
		m.put("Update", new Update());
		m.put("Insert", new Insert());
		
		Command command = m.get(args[0]);
		if(command == null){
			System.out.println(args[0]+" �� ���� ������ ����� �ƴմϴ�.");
			return;
		}
		
		command.exec();
		
		
				
		/*		
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
				
		if(args[0].equals("delete")){
			delete.exec();			
		}else if(args[0].equals("insert")){
			insert.exec();
		}else if(args[0].equals("update")){
			update.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else{
			System.out.println(args[0] +" ����� ������ �ȵ˴ϴ�.");
		}
		
		System.out.println("Main End");*/
			

	}
}

interface Command {
	public void exec();
}

class Delete implements Command {
	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");
	}
}

class Insert implements Command {
	@Override
	public void exec() {
		System.out.println("InsertCommand ����");
	}
}

class Update implements Command {
	@Override
	public void exec() {
		System.out.println("UpdateCommand ����");
	}
}

class Select implements Command {
	@Override
	public void exec() {
		System.out.println("SelectCommand ����");
	}
}
