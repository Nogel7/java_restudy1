package review2;

public class Sample6 {

	public static void main(String[] args) {
		/* while문
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");
			if(treeHit == 10) {
				System.out.println("나무넘어갑니다");
			}
		
		}
		while(true) {
			System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈수 있습니다.");
		}*/
		
		int coffee = 10;
		int money = 300;
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee--;
			System.out.println("남은 커피의 양은" + coffee + "입니다");
			if(coffee == 0) {
				System.out.println("커피가 다 떨어짐, 판매 중지");
				break;
			}
		}
		
		int a = 0;
		while(a < 10) {
			a++;
			if(a%2 == 0) {
				continue;// 짝수인 경우 조건문으로 돌아간다.
			}
			System.out.println(a); // 홀수만 출력
		}
		
	}
}
