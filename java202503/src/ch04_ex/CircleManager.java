package ch04_ex;

import java.util.Scanner;

public class CircleManager 
{
	void run() {
		
		Scanner sc1 = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x,y,r>>");
			double x = sc1.nextDouble();
			double y = sc1.nextDouble();
			int r = sc1.nextInt();
			c[i] = new Circle(x, y, r);
		}
		
		for(int i=0; i<c.length; i++) {
			c[i].show();
		}
		
//		double max=0;
//		int idx=0;
//		for(int i=0; i<c.length; i++) {
//			if(max < c[i].getArea()) {
//				max = c[i].getArea();
//				idx = i;
//			}
//		}
		
//		int idx=0;
//		for(int i=0; i<c.length; i++) {
//			if(c[idx].getArea() < c[i].getArea()) {
//				idx=i;
//			}
//		}
//		
//		System.out.println("가장 면적이 큰 원은 ("+c[idx].getX()+","+c[idx].getY()+")"+c[idx].getR()+"");
		
		Circle.max(c);
		
		
		
	
	}

}



