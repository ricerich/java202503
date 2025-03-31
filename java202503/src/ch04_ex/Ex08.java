package ch04_ex;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	public String getName()
	{
		return name;
	}

	public String getTel() {
		return tel;
	}
}

class PhoneBook{
	
	Scanner sc1;
	Phone phoneArr[];
	
	public PhoneBook() {
		sc1 = new Scanner(System.in);
//		phoneArr = new Phone[n];//여기서 하면 안됨!
	}


	private void input()
	{
//		Scanner sc1 = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = sc1.nextInt();
		
//		Phone phoneArr[] = new Phone[n];
		
		phoneArr = new Phone[n];
		
		for(int i=0; i<phoneArr.length; i++) {
			System.out.print("이름과 전화번호(빈칸입력없이 입력)>>");
			String name = sc1.next();
			String tel = sc1.next();
			phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	private String check(String name) 
	{
		
//		int cnt = 0;
		String tel=null;
		for(int i=0; i<phoneArr.length; i++) {
//			cnt = i;
			if(name.equals(phoneArr[i].getName())) {
				tel = phoneArr[i].getTel();
//				System.out.println(""+name+"의 번호는 "+tel+" 입니다");
				break;
			}
		}
		
//		if(cnt == phoneArr.length-1)
//			System.out.println(name +"이 없습니다");
		
		return tel;
	}

	
	
	private void search() 
	{
//		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = sc1.next();
			
			if(name.equals("그만"))
				return;
			
			//방법2: check함수 별도 만들기
			String tel = check(name);
			
			if(tel == null)
				System.out.println(name +"이 없습니다");
			else
				System.out.println(""+name+"의 번호는 "+tel+" 입니다");
			
			//방법1:
//			int cnt = 0;
//			for(int i=0; i<phoneArr.length; i++) {
//				cnt = i;
//				if(name.equals(phoneArr[i].getName())) {
//					String tel = phoneArr[i].getTel();
//					System.out.println(""+name+"의 번호는 "+tel+" 입니다");
//					break;
//				}
//			}
//			
//			if(cnt == phoneArr.length-1)
//				System.out.println(name +"이 없습니다");
		}
	}
	
	


	public void run() 
	{
		input();
		search();
	}
	
}

public class Ex08 {

	public static void main(String[] args) 
	{
		new PhoneBook().run();
	}

}
