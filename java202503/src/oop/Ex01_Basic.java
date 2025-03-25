package oop;

class A{
	
}

public class Ex01_Basic 
{
	public static void main (String args[]) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
//		ArrayParameter a1 = new ArrayParameter();
		
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	}

}
