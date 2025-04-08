package ch07_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");
		
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구 >>");
			String name = sc1.next();
			int count = sc1.nextInt();
			
			map.put(name, count);			
		}
		
//		for(int i=0; i<map.size(); i++) {
//			
//		}
		
		int max = 0;
		String max_name="";
		
		Set<String> names = map.keySet();
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			int count = map.get(name);
			
			if(count > max) {
				max = count;
				max_name = name;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 ("+max_name+", "+max+")");
	}

}
