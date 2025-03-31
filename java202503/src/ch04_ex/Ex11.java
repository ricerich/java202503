package ch04_ex;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a+b;
	}
}

class Sub{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a-b;
	}
}

class Mul{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a*b;
	}
}

class Div{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		int c=0;
		try {
			return a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요!");
		}
		return c;
	}
}

class CalcManager {

	public void run() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 수와 연산자를 입력하시오>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		String op1 = sc1.next();
		char ch = op1.charAt(0);
		
		switch(op1) {
			case "+":
				Add add1 = new Add();
				add1.setValue(a, b);
				System.out.println(add1.calculate());
				break;
			case "-":
				Sub sub1 = new Sub();
				sub1.setValue(a, b);
				System.out.println(sub1.calculate());
				break;
			case "*":
				Mul mul1 = new Mul();
				mul1.setValue(a, b);
				System.out.println(mul1.calculate());
				break;
			case "/":
				Div div1 = new Div();
				div1.setValue(a, b);
				System.out.println(div1.calculate());
				break;
			default :
				System.out.println("잘못된 연산자 입니다");
		}
		
		sc1.close();
	}
}

public class Ex11 {


	public static void main(String[] args) 
	{
		new CalcManager().run();
		
	}

}



