import java.util.Scanner;

public class Ex404 {
	public static void main(String[] args) {
		System.out.print("당신의 나이는? ");
		System.out.print("\n당신의 키는?");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int height = s.nextInt();
		
		if (age > 15) {
			if (height > 140) {
				System.out.println("T-익스프레스를 탈 수 있음!");
			} else {
				System.out.println("키 때문에 타지 못함.");
			}
		} else {
			System.out.println("미안해요. 나이 때문에 타지 못함.");
		}
		

	}

}
