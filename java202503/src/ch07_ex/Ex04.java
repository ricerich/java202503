package ch07_ex;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("2000~2009년까지 1년 단위의 키(cm) 입력");
		System.out.print(">>");
		for(int i=0; i<10;i++) {
			double height = sc1.nextDouble();
			v.add(height);
		}
		
//		double max=v.get(1)-v.get(0);
		double max=0.0;
		int max_index=0;
		
		for(int i=0; i<v.size()-1;i++) {//9번 해야함, 사이값이기때문에
			double gap = v.get(i+1)-v.get(i);
			
			if(gap>max) {
				max = gap;
				max_index = i;
			}
		}
		
		max = (int)(max*100)/100.0;
		
		System.out.println("가장 키가 큰 년도는 "+(2000+max_index)+"년에 "+max+"cm입니다");
		
	}

}
