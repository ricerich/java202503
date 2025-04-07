package ch07_ex;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put("에스프레소", 2000);
		map.put("아메리카노", 2580);
		map.put("카푸치노", 3000);
		map.put("카페라테", 3500);
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라테가 있습니다");
		
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.print("주문>>");
			String coffee = sc1.next();			
			if(coffee.equals("그만")) {
				System.out.println("종료합니다!");
				break;
			}
			
			Integer price = map.get(coffee);
			if(price != null)
				System.out.println(coffee+"는 "+price+"원 입니다");
			else
				System.out.println("그런 메뉴 없어요!");
		}

	}

}



