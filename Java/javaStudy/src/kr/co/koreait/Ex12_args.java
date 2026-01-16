package kr.co.koreait;

import java.util.Arrays;

public class Ex12_args {

	public static void main(String[] args) {
		Ex12_args a = new Ex12_args();
		//a.printNumbers(10);
		a.printNumbers(10, 20);
		a.printNumbers(10, 20, 30);
	}
	public void printNumbers(int num1, int num2, int... numbers) { // ... 은 매개변수가 있어도 되고 없어도 됨. 맨 뒤에 사용
		System.out.println(Arrays.toString(numbers));              // -> 가변이라고  부름
	}

}
