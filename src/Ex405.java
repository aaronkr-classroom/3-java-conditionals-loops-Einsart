import java.util.Scanner;
public class Ex405 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요: ");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();
		
		
		switch(grade / 10) {
		case 10:
		case 9:	
			System.out.println("A. 천재");
			break;
		case 8:
			System.out.println("B. 괜찮");
			break;
		case 7:
			System.out.println("C. 졸업");
			break;
		case 6:	
			System.out.println("D. ");
			break;
		default: 
			System.out.println("F");
		}
		
	}
}