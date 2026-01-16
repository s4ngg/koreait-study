package kr.co.koreait;

import java.util.Random;
import java.util.Scanner;

public class Ex06_for {

	public static void main(String[] args) {
		// <for>
		// - 초기식, 조건식, 증감식으로 구성됨
		// - 조건이 만족하지 않을 때 까지 반복 실행
		// - 반복할 횟수를 알고 있는 경우에 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println("i의 값 :  " + i);
		}
		
		// 1부터 100까지의 합
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// Q1. 짝수를 출력하는 프로그램을 작성하시오.
		// - 범위는 1 ~ 20까지 입니다.
		// - 1 ~ 20사이의 짝수만 출력합니다.
		
		int count = 0;
		for (int i = 1; i<=20; i++) {
			if (i%2==0) {
				System.out.println(i);
				count ++;
			}
		}	System.out.println("짝수의 갯수 : "+ count);
		
		// Q2. 로또번호 생성기
		Random rd = new Random();
		
		for (int i=0; i<6; i++) {
			int lottoNumber = rd.nextInt(45)+1; // 1~45 무작위 번호
			System.out.println(lottoNumber);
		}
		
		// ----------------------------------------------
		// <중첩 for문>
		// - for문안에 또 다른 for문을 사용하는 구조
		
		int count2 = 0;
		
		for (int i=0; i<3; i++) {
			System.out.println("i의 값 : " + i);
			
			for (int j=0; j<5; j++) {
				System.out.println("j의 값 : " + j);
				count2 ++;
			}
		}
		
		System.out.println("반복 횟수: " + count2);
		
		
		
		// 구구단 출력하기
		// 2단부터 9단까지 출력 (이중 for문)
		// 출력 형식 : "2 * 1 = 2", "2 * 9 = 18"
		
		for (int i=2; i<10; i++) {
			System.out.println("--- " + i + "단 ---");
			for (int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
		}
		
		
		
		
		
	}

}
