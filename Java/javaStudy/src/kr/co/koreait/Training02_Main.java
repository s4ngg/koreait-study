package kr.co.koreait;

public class Training02_Main {

	public static void main(String[] args) {
		// Training02_Calc 객체를 생성하세요.
		// - 변수명 : calc
		Training02_Calc calc = new Training02_Calc();
		
		int result = calc.add();
		System.out.println(result); // calc에서 변수 안받고 return 사용해서 sysout로 출력
		System.out.println(calc.add()); // 위랑 동일
		
		calc.add();
		calc.sub(10, 5);
		calc.mul(3, 6, 9);
		calc.div(10, 2);
		
		
		int[] numbers = {10, 20, 30};
		int sumResult = calc.sum(numbers);
		System.out.println("합계 : " + sumResult);
		
		
		//해당 객체의 모든 메서드를 1번 이상 씩 호출하세요.
		
		
	}

}
