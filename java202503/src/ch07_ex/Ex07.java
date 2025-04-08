package ch07_ex;

import java.util.ArrayList;
import java.util.Scanner;

class Location{
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(Location loc) {
		double distance = Math.sqrt((x-loc.x)*(x-loc.x)+(y-loc.y)*(y-loc.y));
		return distance;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		
		ArrayList<Location> ar1 = new ArrayList<Location>();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("쥐가 이동한 위치 (x,y)를 5개 입력하시오>>");
		
		//1.원점 추가
		ar1.add(new Location(0,0));
		
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			int x = sc1.nextInt();
			int y = sc1.nextInt();
			//만약에 객체 배열이면, 
			//Location ar1[] = new Location[5];
			//ar1[0] = new Location();
			
			//2.점 5개 추가
			ar1.add(new Location(x,y));
		}
		//3.원점으로 돌아감
		ar1.add(new Location(0,0));
		
		
		double sum = 0.0;
		for(int i=0; i<ar1.size()-1; i++) {
			Location loc1 = ar1.get(i);
			Location loc2 = ar1.get(i+1);
			double dist = loc1.getDistance(loc2);
			sum = sum + dist;
		}
		
		System.out.println("총 이동 거리는 "+ (int)(sum*100)/100.0);
		sc1.close();
		
	}

}







