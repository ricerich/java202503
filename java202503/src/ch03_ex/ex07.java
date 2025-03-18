package ch03_ex;

public class ex07 {

	public static void main(String[] args) 
	{
		int arr1[] = new int[10];
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10+1);
		}
		
		System.out.print("랜덤한 변수들:");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		double sum = 0;
		for(int i=0; i<arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println("\n평균은: "+sum/arr1.length);
	}
}
