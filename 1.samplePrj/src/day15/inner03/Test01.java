package day15.inner03;

public class Test01 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("select | delete | update | insert | search");
			System.out.println("중 하나를 파라미터로 입력해주세요.");
			return;
			
		}
		
		Command delete = new DeleteCommand();
		//delete.exec();
		
		Command insert = new Command(){ //익명 클래스.
			@Override
			public void exec() {
				System.out.println("등록 작업 수행");		
			}			
		}; 	
		//insert.exec();
		
		Command update = new Command(){
			@Override
			public void exec() {
				System.out.println("수정 작업 수행");				
			}			
		};
		//update.exec();
		
		Command select = new Command(){
			@Override
			public void exec() {
				System.out.println("선택 작업 수행");
			}
		};
		//select.exec();
		
		Command search = new Command() {			
			@Override
			public void exec() {
				System.out.println("검색 작업 수행");				
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
		System.out.println("삭제 작업 수행");
	}
	
}