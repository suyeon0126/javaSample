package day18;

import java.util.Arrays;

public class StackTest {
	public static void main(String[] args) {		
		MyStack stack = new MyStack(10);
		
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack { // 데이터
	int[] list = new int[10];
	int count = 0;

	public MyStack() {
	}

	public MyStack(int size) {
		if (size < 0) {
			list = new int[10];
		} else {
			list = new int[size];
		}
	}

	public void push(int a) { //

		/*
		 * if (list.length <= count) { System.out.println("공간이 없습니다."); return;
		 * }
		 */
		list[count] = a;
		count++;
	}

	boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	boolean isFull() {
		if (list.length <= count) {
			return true;
		}
		return false;
	}

	public int top() {
		if (count == 0) {
			return -1;
		}
		int a = list[count - 1];
		return a;
	}

	public int pop() {
		if (count == 0) {
			return -1;
		}
		int b = list[count - 1];
		count--;
		return b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + Arrays.hashCode(list);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (count != other.count)
			return false;
		if (!Arrays.equals(list, other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyStack [list=" + Arrays.toString(list) + ", count=" + count + "]";
	}

}
