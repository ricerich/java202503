import java.util.Scanner;
public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5 개 입력하세요.");
		int sum=0;
		for(int i=0; i<5; i++) {
			
			int n=scanner.nextInt(); // 키보드에서 정수 입력
			
			if(n<=0)
				continue;
			
			sum += n; // 양수인 경우 덧셈
			System.out.print("현재 i 값->" + i);
			System.out.println("현재 n 값->" + n);
		}
		System.out.println("양수의 합은 " + sum);
		
		scanner.close();
	}
}
