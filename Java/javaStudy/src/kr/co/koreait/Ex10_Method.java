package kr.co.koreait;

public class Ex10_Method {

	public static void main(String[] args) {
		// <메서드>
		// - 특정 기능을 수행하는 코드를 모아둔 집합
		
		// class명 변수명 = new class명();
		Ex10_Method i = new Ex10_Method(); // 객체 생성 or 인스턴스화 / 메모리에 등록하는 과정 <heap 주소> 
		Ex10_Jogger j = new Ex10_Jogger(); // run 메서드 만든 jogger class
		
		j.run();
		j.sayName("홍길동",10);
		j.sayName("철철",1557);
		j.sayName("짱짱",1557);
		j.sayName("맹맹",1557);
		
		i.printHello();
		i.print("Test");
		i.plus(10,20);
		i.minus(10, 20);
	}

	// "안녕하세요" 라는 문자열을 출력하는 printHello() 메서드 생성
	public void printHello() {
		System.out.println("안녕하세요");
	}
	
	public void print(String a) {
		System.out.println(a);
	}
	
	public void plus(int a, int b) {  // 덧셈 기능을 하는 메서드 
		System.out.println(a+b);
	}
	
	public void minus(int a,  int b) {
		System.out.println(a-b);
	}
	
	
	
}
