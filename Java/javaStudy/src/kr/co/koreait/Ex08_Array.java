package kr.co.koreait;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex08_Array {

	public static void main(String[] args) {
		
		// <배열>
		// - 같은 자료형을 가진 값을 하나로 묶어서 관리함
		
		// <배열 선언>
		// 1. 자료형[] 변수명;   *사용 권장
		// 2. 자료형   변수명[];
		
		// <배열 선언 및 초기화>
		// 1. 자료형[] 배열명   = new 자료형 [크기]; *사용권장 
		// 2. 자료형   배열명[] = new 자료형 [크기];
		
		int[] intArr = new int[4];
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		
		System.out.println(intArr[2]);
		
		int[] intArr2 = {10, 20, 30, 40};
		char[] chArr = {'a', 'b'};
		
		int[] numbers = new int[10];
		
		// 배열 요소에 10~19 넣기
		// 배열명.length : 배열의 크기를 구해줌
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i + 10;
			System.out.println(numbers[i]);
		}
		
		// 배열의 요소를 1개씩 꺼내서 짝수인 것만 sum에 합계 저장 후 출력
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
			
		}
		System.out.println("합계 = " + sum);
		
		// 1. scores 배열을 만드는데, 각각의 값은 아래와 같습니다.
		// - {60, 77, 56, 89}
		// - 0번 인덱스 국어 점수, 1번 인덱스 영어 점수, 2번 인덱스 수학점수, 3번 인덱스 과학 점수
		
		// 2. 반복문을 활용해서 평균 점수를 구하세요.
		// 3. 반복문 안에서 "국어 점수는 OO점 입니다." 출력
		// - 전 과목 다
		int scores[] = {60, 77, 56, 89};
		String sub[] = {"국어", "영어", "수학", "과학"};
		
		int avg = 0;
		
		for(int i=0; i<scores.length; i++) {
			avg += scores[i];
			System.out.println(sub[i] + "점수는 " + scores[i] + "점 입니다.");
		}
		System.out.println("평균 점수는 " + avg/sub.length + "입니다.");
		
		
		
		// 1. 사용자로부터 숫자 5개 입력받아서 배열에 넣음
		// 2. 반복문을 활용하여 해당 배열에서 짝수의 개수와 홀수의 개수를 구하세요
		
		int[] inputNumbers = new int[5];
		int odd = 0;
		int even = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<inputNumbers.length; i++) {
			System.out.printf("숫자를 입력하세요(남은 횟수 %d회): ", inputNumbers.length-i);
			inputNumbers[i] = sc.nextInt();
			
			if (inputNumbers[i] % 2 != 0) {
				odd ++;
			} else {
				even ++;
			}
		}
		System.out.printf("홀수의 개수 : %d, 짝수의 개수 : %d\n", odd, even);
		
		System.out.println(Arrays.toString(inputNumbers)); // 문자열 출력
		
		Arrays.sort(inputNumbers); // 오름차순 정렬
		System.out.println(Arrays.toString(inputNumbers));

		Integer[] inputNumbers2 = {10, 50, 30, 70, 100}; // 기본형 int > 참조형 Integer/ Wrapper class.
		Arrays.sort(inputNumbers2, Comparator.reverseOrder()); // 내림차순 Comparator.reversOrder()는 wrapper 클래스로만 사용 가능
		System.out.println(Arrays.toString(inputNumbers2));
		
		// ----------------------------------------
		// <얕은 복사>
		// - 배열의 주소 값만 가져와 참조하는 방식
		// - 하나의 배열 객체를 두 변수가 공유함
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		int[] copyArr = arr; //arr 주소를 받아 사용하는거라 같은 주소 사용
		copyArr[1] = 999;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));

		// <깊은 복사> -> 그냥 새로운 배열만들어서 옮겨 적는 것
		// - 새로운 배열 객체를 생성하면서 기존 배열의 데이터를 복사
		int[] arr2 = {10, 20, 30};
		int[] copyArr2 = new int[arr2.length];
		
		for(int i=0; i<arr2.length; i++) {
			copyArr2[i] = arr2[i];
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(copyArr2));
		
		
		// ---------------------------------------
		// <2차원 배열>
		// - 배열을 행과 열 형태로 구성하여 표처럼 나타낼 수 있는 배열
		
		int[][] arr3 = {{10, 20, 30},{70, 80, 90}};
		// -> int [][] arr3 = new int  [1][2];
		
		// for-each(향상된 for문)
		// for(int i : arr) {print(i);}  
		
		
	}

}
