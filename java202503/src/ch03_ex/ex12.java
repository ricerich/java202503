package ch03_ex;

public class ex12 {

	public static void main(String[] args) 
	{
		int sum =0;
		for(int i=0; i<args.length; i++) {
			
			try {
				int n = Integer.parseInt(args[i]);
				sum = sum + n;
			}
			catch(NumberFormatException e) {
				
			}
		}
		
		System.out.println(sum);

	}
}





