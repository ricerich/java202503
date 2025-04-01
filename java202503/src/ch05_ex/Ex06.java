package ch05_ex;

class ColorPoint2 extends Point{
	
	private String color;
	
	public ColorPoint2() {
//		super(0,0);
//		color="BLACK";
		this(0,0);
	}
	
	public ColorPoint2(int x, int y) {
		super(x,y);
		color = "BLACK";
	}

	public void setXY(int x, int y) {
//		this.x = x;
//		this.y = y;// 직접접근 안된 x가 private이니까!		
		move(x,y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color +"색의 ("+getX()+","+getY()+")의 점";
	}
	
	
	
}

public class Ex06 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); // BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);
//		System.out.println(cp.toString() + "입니다.");
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
