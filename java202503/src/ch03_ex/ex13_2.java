package ch03_ex;

public class ex13_2 {

	public static void main(String[] args) 
	{
		String str1[] = {"박수짝","박수짝짝"};
		
		for(int i=1; i<100; i++) 
		{
			int cnt=0;
			int num = i;
			for(int res= num%10; num >0; res=num%10) {
				if(res==3 || res==6 || res ==9) {
					cnt++;
				}
				num = num/10;				
			}
			
			if(cnt>0)
				System.out.println(i +" "+ str1[cnt-1]);
		}
	}
}





