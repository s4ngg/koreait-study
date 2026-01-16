package kr.co.koreait;

import java.util.ArrayList;
import java.util.Scanner;

public class Training01_Student {

	public static void main(String[] args) {
		// <학생 관리 프로그램>
		// - 사용자로부터 아래와 같은 메뉴를 입력 받음
		// 1. 학생 추가
		// 2. 학생 목록 조회
		// 0. 프로그램 종료
		
		// - 1번 누르면 사용자로부터 학생의 이름을 입력 받고 ArrayList에 추가
		// - 2번 누르면 ArrayList에 저장된 모든 학생의 이름을 출력
		//   출력 형식 : "1. OOO 학생","2. OOO 학생", ...
		// - 0번 누르면 프로그램 종료
		
		// - 사용자가 프로그램 종료 선택할 때 까지 메뉴를 반복적으로 계속 제공
		
		ArrayList<String> student = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("===== 학생 관리 프로그램=====");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록 조회");
			System.out.println("3. 학생 삭제");
			System.out.println("0. 프로그램 종료\n메뉴 :");
			
			int menu = sc.nextInt();
			sc.nextLine(); // buffer에 남아있는 엔터비우기용
			
			switch(menu) {
			case 1:
				System.out.printf("학생 이름: ");
				String name = sc.nextLine(); // nextString은 없어서 nextLine 사용 / nextLine은 엔터를 기준으로 입력받음
				student.add(name);
				System.out.println(name + "학생이 추가되었습니다.");
				break;
			case 2:
				for (int i=0; i<student.size(); i++) {
					System.out.println(i+1 + "." + student.get(i) +"학생");
				}
				break;
			case 3:
				// 1. 사용자로부터 학생 이름을 입력받음.
				// 2. 그 학생의 인덱스 번호를 찾아서 제거
				System.out.println("학생 이름 :");
				String removeName = sc.nextLine();
				for (int i=0; i<student.size(); i++) {
					// String studentName = student.get(i) ;; 로 아래 get(i) 부분을 대체할 수 있다
					
					/* int removeIndex = student.indexOf(removeName);
					student.remove(removeIndex); */
					
					if (removeName.equals(student.get(i))) { // heap이라 equals 사용하기. 주소값 비교
						student.remove(i);
						System.out.println(removeName + "학생이 제거되었습니다.");
					}
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
				break;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
		
	}

}
