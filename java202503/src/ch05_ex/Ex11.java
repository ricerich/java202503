package ch05_ex;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate() ;
}

class Add extends Calc{
	@Override
	public int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	@Override
	public int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
	@Override
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	
	@Override
	public int calculate() {
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
		
		Calc calc1=null;
		switch(op1) {
			case "+":
				calc1 = new Add();
				break;
			case "-":
				calc1 = new Sub();
				break;
			case "*":
				calc1 = new Mul();
				break;
			case "/":
				calc1 = new Div();
				break;
			default :
				System.out.println("잘못된 연산자 입니다");
		}
		
		calc1.setValue(a, b);
		
		if(calc1 instanceof Div && b == 0)
			System.out.println("잘못된 연산입니다");
		else
			System.out.println(calc1.calculate());
		
		sc1.close();
	}
}

public class Ex11 
{
	public static void main(String[] args) 
	{
		new CalcManager().run();
	}
}
