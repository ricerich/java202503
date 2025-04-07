package ch07_ex;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		//1.벡터를 만든다(cf:배열을 만든다)
		//2.벡터에 값을 넣는다
		//3.벡터의 값을 꺼낸다
		//4.3 대신에 큰값 1개만 꺼낸다(=배열의 max값찾기)
		
		Vector<Double> v = new Vector<Double>();
		System.out.print("입력>>");
		Scanner sc1 = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			double d = sc1.nextDouble();
			v.add(d);
		}
		
		double max = v.get(0);
		int max_index = 0;
		
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)>max) {
				max = v.get(i);
				max_index = i;
			}
		}
		
		System.out.println("가장 큰 수는" + max);
		System.out.println("가장 큰 수는 " + (max_index+1) + "번째 있습니다!");
		sc1.close();
		
		
		
		
		

	}

}
