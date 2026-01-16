package kr.co.koreait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex09_Collection {

	public static void main(String[] args) {
		// <컬렉션>
		// - 동일한 자료형을 묶어서 관리하는 자료구조
		// - 저장 공간의 크기를 동적으로 관리
		// - List, Set // Map -> 은 컬렉션은 아니지만 묶어서 사용
		
		// <ArrayList>
		// - 기존 배열과 동일한 구조를 가짐 (인덱스 사용 등)
		// - 크기가 동적으로 관리됨
		
		ArrayList<Integer> intList = new ArrayList<>(); // ArrayList <wrapper class>
		
		intList.add(1);
		intList.add(3);
		intList.add(5);
		
		intList.add(2, 10); // 2번 인덱스 자리에 10의 값 추가 (기존 값 밀려남)
		
		System.out.println(intList);
		
		intList.remove(3); // 3번 인덱스 제거
		System.out.println(intList);
		
		for(int i=0; i<intList.size(); i++) { // size()= length()
			System.out.println(intList.get(i)); // intList[i] -> intList.get(i)
		}
		
		// <LinekedList>
		// - 각각의 노드가 데이터와 포인트를 가지고 연결된, 링크된 형식을 가진 자료구조 (배열)
		LinkedList<String> linked = new LinkedList <>();
		linked.add("길동");
		linked.add("철수");
		
		System.out.println(linked);
		
		// <HashSet>
		// - 순서를 보장하지 않고 중복을 허용하지 않는 특징을 가진 자료구조
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(5);
		hashSet.add(5);
		hashSet.add(7);
		
		System.out.println(hashSet);
		
		
		// <HashMap>   -> index에 의미를 가지지 않아서 순서 상관없.
		// - Key - Value 형태를 가진 자료구조
		// - Key는 중복 불가
		// - Value는 중복 허용
		
		//       key    value   <- 자료형들
 		HashMap<String, Integer> hashMap = new HashMap<>();
 		hashMap.put("숫자1", 10);
 		hashMap.put("숫자2", 20);
 		hashMap.put("숫자2", 30); // key가 동일하면 value는 수정됨.
 		hashMap.put("숫자3", 50); 
 		hashMap.put("숫자4", 70); 
 		//hashMap.remove("key"); index 사용 안하고 key 입력.
 		
 		
 		System.out.println(hashMap);
 		System.out.println(hashMap.get("숫자2")); // 숫자2라는 키의 value 30 반환
 		System.out.println(hashMap.keySet()); // 전체 키를 배열 형태로 반환
		
 		for(String i : hashMap.keySet()) { // for(자료형 변수명 : 배열 or 값) 이라 hashMap.keySet()으로 배열생성 
 			System.out.println("key : " + i + ", Value : " + hashMap.get(i));
 		}
		
	}

}
