package ch03_ex;

public class ex11 {

	public static void main(String[] args) 
	{
		//예외처리
		if(args.length ==0 )
		{
			System.out.println("명령행 인자(args)가 없어요!!");
			return;
		}
		
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			int n = Integer.parseInt(args[i]);
			sum = sum + n;
		}
		
		System.out.println(sum/args.length);

	}
}





