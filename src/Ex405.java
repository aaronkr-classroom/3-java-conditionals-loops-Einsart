import java.util.Scanner;

public class Ex405 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요: ");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();
		
		switch(grade / 10) {
			case 10:
			case 9:
				System.out.println("A!! 당신은 천제다!~~~");
				break;
			case 8:
				System.out.println("B - 괜찮아~ 괜찮아~");
				break;
			case 7:
				System.out.println("C - 어차피 졸업할 수 있겠네~");
				break;
			case 6:
				System.out.println("D - 게임을 많이 했지?");
				break;
			default: 
				System.out.println("F? ㅠㅠ OTL 우울증...~~~");
		}
	}
}
