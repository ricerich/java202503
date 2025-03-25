package ch04_ex;

public class Circle 
{
	private double x;
	private double y;
	private int r;
	
	public Circle(double x, double y, int r) 
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void show()
	{
		System.out.println("("+x+","+y+")"+r);
	}
	
	private double getArea()
	{
		return r*r*3.14;
	}
	
	public static void max(Circle c[]) {
		int idx=0;
		for(int i=0; i<c.length; i++) {
			if(c[idx].getArea() < c[i].getArea()) {
				idx=i;
			}
		}
		System.out.println("가장 면적이 큰 원은 ("+c[idx].x+","+c[idx].y+")"+c[idx].r+"");
	}
	
	

//	public double getX() {
//		return x;
//	}
//
//	public double getY() {
//		return y;
//	}
//
//	public int getR() {
//		return r;
//	}


	
	
	
	
	
	
	
	
	

}
