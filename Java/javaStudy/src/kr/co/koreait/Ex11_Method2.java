package kr.co.koreait;

public class Ex11_Method2 {

	public static void main(String[] args) {
		Ex11_Method2 m = new Ex11_Method2();
		m.exOverloading();
		m.exOverloading(10);
		m.exOverloading("ㅇㅇ");
		
		Ex11_Jogger j = new Ex11_Jogger();
		String name = j.sayName("홍길동");
		String speed = j.run(10);
		String pace = j.run(10.0,1.0);
		
		System.out.println(name);
		System.out.println(speed);
		System.out.println(pace);
		
//		System.out.println(j.sayName("김철수"));
//		System.out.println(j.run(10));
//		System.out.println(j.run(10.0, 1.0));
	}
	
	public void exOverloading() {
		System.out.println("매개변수를 안받는 메서드입니다.");
	}
	
	
	public void exOverloading(int num) {
		System.out.println("전달받은 매개변수는 " + num + " 입니다.");
	}
	
	public void exOverloading(String test) {
		System.out.println("테스트 : " + test);
	} 
}
