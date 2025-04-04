package ch05_ex;

import java.util.Scanner;

interface Stack 
{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 실수 저장
	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

class StringStack implements Stack{
	
	//1.멤버변수
	private String data[];
	private int top;
	
	//2.생성자
	public StringStack(int capacity) {
		data = new String[capacity];
		top = -1;
	}
	
	//3.메소드

	@Override
	public int length() {//현재 들어가있는거의 갯수
		return top+1;
	}

	@Override
	public int capacity() {
		return data.length;
	}

	@Override
	public String pop() {
		if(top == -1)//스택이 비어있으면
			return null;
		
		return data[top--];
	}

	@Override
	public boolean push(String item) {
		
		if(top == data.length-1)//스택이 꽉 찼으면, 실패
			return false;
		else {
			data[top+1]=item;
			top++;
			return true;
		}
		
	}
	
}

public class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("스택의 크기>>");
		int size = sc1.nextInt();
		
		StringStack ss1 = new StringStack(size);
		
		while(true)
		{
			System.out.print("문자열 입력>>");
			String item = sc1.next();
			if(item.equals("그만"))
				break;
			
			boolean ok = ss1.push(item);
			if(ok == false)
				System.out.println("스택이 꽉차서 안들어가져요!");
		}
		
		//pop() 을 하면 전체를 꺼내서 , 출력
		System.out.println("스택에 저장된 모든 문자열 꺼내기(pop)");
		int length = ss1.length();
		
		for(int i=0; i<length; i++)
		{
			String item = ss1.pop();
			System.out.print(item +" ");
			
//			item = ss1.pop();
//			System.out.print(item +" ");
//			
//			item = ss1.pop();
//			System.out.print(item +" ");
			
		}
		
		sc1.close();
	}
}











