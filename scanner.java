package ex1.io;
import java.util.Scanner; //라이브러리 사용
public class Program {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); //메소드
		
		String message=stdIn.nextLine();
		int x = stdIn.nextInt();
		double y =stdIn.nextDouble();
		
		System.out.println(message);
		System.out.println(x);
		System.out.println(y);
	}

}

