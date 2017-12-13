package day14;

public class Test01 {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		//a = b;
		
		A[] aaa = { new AA(), new BB()};
		B[] bbb = { new AA(), new BB()};
		C[] ccc = { new AA(), new BB()};
		I[] iii = { new AA(), new BB()};
		
		for(int i=0; i<aaa.length; i++){
			aaa[i].a();
			bbb[i].b();
			ccc[i].c();
			iii[i].a(); //iii만 a,b,c 다 사용 가능
			iii[i].b();
			iii[i].c();
		}
		
	}
}

class AA extends Object implements I {

	@Override
	public void c() {}

	@Override
	public void b() {}

	@Override
	public void a() {}	
}

class BB extends Object implements I {

	@Override
	public void c() {}

	@Override
	public void b() {}

	@Override
	public void a() {}	
}

interface I extends A,B,C { //인터페이스의 다중상속
	
}

interface A{
	void a();
}

interface B{
	void b();
}

interface C{
	void c();
}
