package day15.inner03;

public class Test01 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("select | delete | update | insert | search");
			System.out.println("�� �ϳ��� �Ķ���ͷ� �Է����ּ���.");
			return;
			
		}
		
		Command delete = new DeleteCommand();
		//delete.exec();
		
		Command insert = new Command(){ //�͸� Ŭ����.
			@Override
			public void exec() {
				System.out.println("��� �۾� ����");		
			}			
		}; 	
		//insert.exec();
		
		Command update = new Command(){
			@Override
			public void exec() {
				System.out.println("���� �۾� ����");				
			}			
		};
		//update.exec();
		
		Command select = new Command(){
			@Override
			public void exec() {
				System.out.println("���� �۾� ����");
			}
		};
		//select.exec();
		
		Command search = new Command() {			
			@Override
			public void exec() {
				System.out.println("�˻� �۾� ����");				
			}
		};
		//search.exec();
		
		switch(args[0]){
			case "delete" :
				delete.exec();
				break;
			case "insert" :
				insert.exec();
				break;
			case "update" :
				update.exec();
				break;
			case "select" :
				select.exec();
				break;
			case "search" :
				search.exec();
				break;
		     default :
		    	 break;
		     }
	
	}	
}

interface Command{
	void exec();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("���� �۾� ����");
	}
	
}