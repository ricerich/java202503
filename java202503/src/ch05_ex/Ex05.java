package ch05_ex;

class ColorPoint extends Point{

	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
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

public class Ex05 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		System.out.println(cp);
		
		Point p1 = new Point(1,3);
		System.out.println(p1);
		
	}

}
