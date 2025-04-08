package ch07_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("***포인트 관리 프로그램입니다");

		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = sc1.next();
			
			if(name.equals("exit")) {
				System.out.println("종료합니다!");
				break;
			}
			
			int point = sc1.nextInt();
			
			//0.원래꺼 포인트를 키로 꺼내서, 추가되는 포인트를 합산해, put
			Integer point_origin = map.get(name);
			if(point_origin != null) {
				point = point + point_origin;
			}
			
			//1.입력 (여러번 입력해야하니까 반복안에 있음)
			map.put(name, point);
			
			//2.전체를 꺼낸다.
			Set<String> names = map.keySet();
			Iterator<String> iter = names.iterator();
			while(iter.hasNext()) {
				name = iter.next();
				point = map.get(name);
				System.out.print("("+name+", "+point+")");
			}
			System.out.println();
		}
	}

}
