package day12;

public class Student extends Object {
	private String name;
	private int age;
	private int id;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {//toString은 객체를 표현하는 방법.
		//return "Student["+name+","+ age+","+"id"+"]" ; 
		StringBuilder sb = new StringBuilder();
		sb.append("Student[");
		sb.append(name);
		sb.append(",");
		sb.append(age);
		sb.append(",");
		sb.append(id);
		sb.append("]");
		return sb.toString();
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			if(((Student)obj).age != this.age){
				return false;
			}
			if(((Student)obj).id != this.id){
				return false;
			}
			if(!((Student)obj).name.equals(this.name)){
				return false;
			}
				return true;	
		}
		return false ;
	}*/
	
	@Override //17.11.15
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student data = (Student) obj;
		if(id == data.id && age ==data.age && name.equals(data.name)){
			return true;
		}
		return false;
	}
}
