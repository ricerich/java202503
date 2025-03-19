package ch03_ex;

public class ex13 {

	public static void main(String[] args) 
	{
		for(int i=1; i<100; i++) {
			int ten = i/10;
			int one = i%10;
			
			int cnt=0;
			
			if(ten!=0 && (ten%3==0)) {
				cnt++;
			}
			
			if(one!=0 && (one%3==0)) {
				cnt++;
			}
			
			switch(cnt)
			{
				case 1:
					System.out.println(i + " 박수짝");
					break;
				case 2:
					System.out.println(i + " 박수짝짝");
					break;
			}
		}
	}
}





