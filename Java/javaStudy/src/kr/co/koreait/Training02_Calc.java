package kr.co.koreait;

public class Training02_Calc {
	// 1. 덧셈을 수행하는 add() 작성
	// - 10 + 10의 결과를 출력
	public int add() { // return 받을 자료형 public ::int::
		/*int a = 10;
		int b = 10;
		System.out.println(a + " + " + b + " = "+ (a+b));*/
		
		return 10+10;
		
	}
	
	// 2. 뺄셈을 수행하는 sub() 작성 
	// - 숫자 2개를 매개변수로 받습니다.
	// - 각각의 값을 뺀 결과를 출력
	public void sub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
		// int result = a - b;
		// System.out.println(result);
	}
	
	// 3. 곱셈을 수행하는 mul() 작성
	// - 숫자 3개를 매개변수로 받습니다.
	// - 각각의 값을 곱한 결과를 출력
	public void mul(int a, int b, int c) {
		System.out.println(a + " * " + b + " * " + c + " = " + (a*b*c));
	}
	
	// 4. 나눗셈을 수행하는 div() 작성
	// - 숫자 2개를 매개변수로 받습니다.
	// - 각각의 값을 몫, 나머지로 나눈 결과를 출력
	// - 출력 예시 : "몫 : OO", "나머지 : OO"
	public void div(int a, int b) {
		System.out.printf("몫 : %d, 나머지 : %d\n",a/b, a%b);
	}
	
	public int sum(int[] numbers) {
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
}
