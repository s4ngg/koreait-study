package kr.co.koreait;

public class Ex11_Jogger {
	// 1.sayName () 메서드를 작성하세요.
	// - 매개변수로 이름을 전달 받습니다.
	// - "안녕하세요. 제 이름은 OOO 입니다." 라는 문자열을 반환합니다.
	public String sayName(String name) {
		return "안녕하세요. 제 이름은 " + name +" 입니다.";
	}
	
	// 2. 속도를 매개변수로 받는 run() 메서드를 작성하세요.
	// - 매개변수로 속도(speed)를 받습니다.
	// - "시속 OOO/km의 속도로 달립니다." 라는 문자열을 반환합니다.
	public String run(int speed) {
		return "시속 " + speed + "/km의 속도로 달립니다.";
	}
	
	// 3. 거리와 시간을 매개변수로 받는 run() 메서드를 작성하세요.
	// - 아래의 숫자들은 모두 double 타입으로 받으세요.
	// - 매개변수로 거리(distance)와 시간(time)을 받습니다.
	// - 평균 속도를 계산하여 변수 pace에 저장하세요. (거리 / 시간)
	// - "거리 OOO km를 OO시간 동안 달렸습니다. 평균 속도 : OOkm/h" 라는 문자열을 반환합니다.
	
	public String run(double distance, double time) { // run 메서드가 2개지만 서로 다른 매개변수라 오버로딩
		double pace = distance / time;
		return "거리 " + distance + " km를 " + time + "시간동안 달렸습니다. 평균 속도 : " + pace + "km/h";
	}
}
