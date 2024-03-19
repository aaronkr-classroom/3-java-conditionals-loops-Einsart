import java.util.Scanner;

public class Ex404 {

	public static void main(String[] args) {
		System.out.print("당신의 나이는?");
		System.out.print("\n당신의 키는 몇CM?");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int height = s.nextInt();
		
		if (age >15) {
			if (height > 140) {
				System.out.println("T-익스프레스를 탈 수 있어요");
			} else {
				System.out.println("키때문에 불가능");
				
			}
		} else {
			System.out.println("나이때문에 불가능.");
			
		}

	}

}
