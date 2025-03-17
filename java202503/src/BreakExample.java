import java.util.Scanner;
public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		String sum="";
		while(true) {
			System.out.print(">>");
			String text = scanner.next();
			sum = sum + " " + text;
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while 문을 벗어남
		}		
		System.out.println("종료합니다...");
		System.out.println(sum);

		scanner.close();
	}
}