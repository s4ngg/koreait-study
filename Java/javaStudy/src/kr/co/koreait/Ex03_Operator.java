package kr.co.koreait;

public class Ex03_Operator {

	public static void main(String[] args) {
		// <산술 연산자>
		// - 사칙 연산(+,-,*,/)과 나머지를 구하는 연산자(%)를 의미
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);

		int result;
		int firstNumber = 50;
		int secondNumber = 20;
		
		result = firstNumber + secondNumber;
		System.out.println(result);
		
		result = firstNumber / secondNumber;
		System.out.println("나누기(몫) : " + result);
		
		result = firstNumber % secondNumber;
		System.out.println("나누기(나머지) : " + result);
		
		// <증감 연산자>
		// - 1 증가(++) or 1 감소(--)
		
		// 기존 방식에서 1 증가 시키기
		int num3 = 10;
		num3 = num3 + 1;
		
		// 증감 연산자로 1 증가 시키기
		num3 ++;
		
		// 1. 전위 증가 연산자 ++num;
		// 2. 후위 증가 연산자 num++;
		// 3. 전위 증감 연산자 --num;
		// 4. 후위 증감 연산자 num--;
		int num4 = 10;
		System.out.println("후위 연산자 : " + num4++);
		// num4 = num4 + 1;
		System.out.println("이후 값 : " + num4);
		
		int num5 = 10;
		//num5 = num5 + 1;
		System.out.println("전위 연산자 : " + ++num5);
		System.out.println("이후 값 : " + num5);
		
		// <비교 연산자>
		// - 숫자를 비교할 때 쓰이는 연산자 
		// - 결과가 항상 true or false.
		
		// 1. a > b : a가 b보다 크다 (초과)
		// 2. a < b : a가 b보다 작다 (미만)
		// 3. a >= b : a가 b보다 크거나 같다 (이상)
		// 4. a <= b : a가 b보다 작거나 같다 (이하)
		// 5. a == b : a와 b가 같다.
		// 6. a != b : a와 b가 같지 않다.
		int num6 = 50;
		int num7 = 20;
		System.out.println(num6 > num7);
		System.out.println(num6 >= 50);
		
		String firstStr = "hi";
		String secondStr = new String("hi");
		
		System.out.println(firstStr);
		System.out.println(secondStr);
		System.out.println(firstStr == secondStr); // string 참조형이라 주소차이. 값이 다름
		
		System.out.println(firstStr.equals(secondStr)); // 문자열 비교 equals();
		System.out.println("hi".equals("hi"));
		
		// <논리 부정 연산자>
		// - true -> false, false -> true로 반환.
		// - 논리형을 부정하여 반대로 사용
		boolean isTrue = true;
		System.out.println(isTrue);
		System.out.println(!isTrue);
		
		//  <논리 연산자>
		// - 논리식으로 판단하여 true or false를 반환
		
		// 1. a && b : a와 b가 모두 true 일 때 true 반환
		// 2. a || b : a or b가 둘 중 하나라도 true 일 때 true 반환
		
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		
		System.out.println(10 > 5 && 5 == 5);
		// && (AND) : 그리고 
		// || (OR) : 또는
		
		// Q1. num8 변수에 값 100으로 할당
		// Q2. num9 변수에 값 87으로 할당
		// Q3. num8은 100보다 작거나 또는 num9가 50보다 크다.
		// Q4. num8은 67보다 크거나 그리고 num9는 100보다 작다.
		
		int num8 = 100;
		int num9 = 87;
		System.out.println(num8 < 100 || num9 > 50);
		System.out.println(num8 > 67 && num9 < 100);
		
		// <복합 대입 연산자>
		// - 산술 연산자와 대입 연산자를 하나로 나타내는 기호
		int num10 = 100;
		
		num10 += 5;
		System.out.println(num10);
		
		// <삼항 연산자>
		// - 조건식을 간단하게 줄여서 사용하기 위한 방식
		// - 아주 간단한 조건식의 경우 사용하면 코드의 길이가 줄어들지만
		// 무분별하게 사용할 경우 코드의 가독성을 매우 떨어트림
		int num11 = 10;
		int num12 = 20;
		
		// (조건식 ? true 일 때 실행할 코드 : false일 때 실행할 코드)
		System.out.println(num11 > num12 ? num11+15 : num12-5);
		
	}
}
