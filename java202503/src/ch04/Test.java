package ch04;

public class Test {

	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
//		c1.name = "강감찬";//멤버변수에 직접 접근 금지!
		c1.setName("강감찬");
//		double area = c1.getArea();
//		System.out.println(area);
		
		c1.printArea();
		
//		System.out.println(c1.name);
		System.out.println(c1.getName());

	}

}
