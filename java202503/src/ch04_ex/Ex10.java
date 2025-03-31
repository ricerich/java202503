package ch04_ex;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) 
	{
		for(int i=0; i<kor.length; i++)
		{
			if(word.equals(kor[i]))
				return eng[i];
		}
		return null;		
	}
}

class DictionaryManager{
	void run()
	{
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(true) {
			Scanner sc1 = new Scanner(System.in);
			
			System.out.print("한글단어?");
			String kor = sc1.next();
			
			if(kor.equals("그만"))
				break;
			
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng == null)
				System.out.println(kor+ "은 저의 사전에 없습니다");
			else
				System.out.println(kor+"은 "+eng);
		}
		
	}
}

public class Ex10 {

	public static void main(String[] args) 
	{
		new DictionaryManager().run();
	}

}
