
public class Sample1 {

	public static void main(String[] args) {		
		// 숫자 자료형은 수자 형태로 이루어진 자료형으로 우리가 이미 익숙히 알고 있는 것들이다.
		// 12.34 같은 실수 , 드물게 쓰이긴 하지만 8진수나 16진수 같은 것들도 있다.
		// 이런 숫자들을 자바에서 어떻게 사용하는지 알아보자.
		
		// 정수 
		// 자바의 정수를 표현하기  위한 자료형은 int, long이다.(byte,short등도 있지만 잘 사용하지 않는다.)
		
		// int와 long의 차이는 표현할 수 있는 숫자의 범위이다.
		
		// 자료형 | 표현범위
		//  int      -2147483648 ~ 2147483647
		// long     -9223372036854775808 ~ 9223372036854775807
		          	
		// 다음과 같이 사용한다.
		int age = 10;
		long countOfStar = 8764827384923849L;
		
		// long변수에 값을 대입할 때는 대입하는 숫자 값이 int자료형의 최대값인 2147483647보다 큰 경우 8764827384923849L 과 같이
		// L접미사 (또는 소문자 l, 소문자 'l'은 수자 1과 비슷하게 보이므로 추천하지 않는다)를 붙여 주어여 한다.
		// 만약 큰 수자에 'L'과 같은 접미사를 누락하면 컴파일 에러가 발생한다.
		
		// 실수
		// 자바의 실수를 표현하기 위한 자료형은 float,double 이다.
		// float와 double의 차이 역시 표현할 수 있는 숫자의 범위이다.
		
		// 자료형 | 표현범위
		// float    -3.4 * 10^38 ~ 3.4*10^38
		// double  -1.7*10^308 ~ 1.7*10^308
		
		// 다음과 같이 사용한다.
		float pi = 3.14F;
		double morePi = 3.14159265358979323846;
		
		// 자바에서 실수형은 디폴트가 double이므로 위의 예에서 보듯이 float변수에 값을 대입할 때에는 3.14F와 같이 F접미사(또는 소문자f)를 꼭 붙여준다.
		// float자료형에 값을 대입할 때 접미사를 누락하면 컴파일 에러가 발생한다.
		
		// 또는 과학적 지수 표현식으로 다음과 같이 사용할 수 있다.
		double d1 = 123.4;
		double d2 = 1.234e2;
		
		// d1과 d2의 값은 123.4로 같다.d2의 e2는 10의제곱(10²)을 의미한다. 즉 1.234 * 10² 이 되어 123.가 되는 것이다.
				
		

	}

}