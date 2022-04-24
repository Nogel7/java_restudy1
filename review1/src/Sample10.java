
public class Sample10 {

	public static void main(String[] args) {
		// 문자열 포매팅
		// 문자열에서 또 하나 알아야 할 것으로는 문자열 포매팅(Formatting)이 있다. 
		// 이것을 공부하기 전에 다음과 같은 문자열을 출력하는 프로그램을 작성했다고 가정해 보자.
		// "현재 온도는 18도입니다."

		// 시간이 지나서 20도가 되면 다음 문장을 출력한다.
		
		// "현재 온도는 20도입니다"
		
		// 위 두 문자열은 모두 같은데 20이라는 숫자와 18이라는 숫자만 다르다. 
		// 이렇게 문자열 안의 특정한 값을 바꿔야 할 경우가 있을 때 이것을 가능하게 해주는 것이 바로 문자열 포매팅 기법이다.
		
		// 쉽게 말해 문자열 포매팅이란 문자열 안에 어떤 값을 삽입하는 방법이다. 다음 예를 직접 실행해 보면서 그 사용법을 알아보자.
		
		// 1.숫자 바로 대입
		System.out.println(String.format("I eat %d apples.", 3));// " I eat 3 apples." 출력
		
		// 문자열 포매팅은 String.format 메소드를 사용한다. 위 예제의 결괏값을 보면 알겠지만 위 예제는 문자열 안에 정수 3을 삽입하는 방법을 보여 준다. 
		// 문자열 안에서 숫자를 넣고 싶은 자리에 %d 문자를 넣어 주고, 삽입할 숫자 3은 두번째 파라미터로 전달했다. 
		// 여기에서 %d는 문자열 포맷 코드라고 부른다.
		
		// 2.문자열 바로 대입
		
		// 문자열 안에 꼭 숫자만 넣으라는 법은 없다. 이번에는 숫자 대신 문자열을 넣어보자.
		System.out.println(String.format("I eat %s apples", "five"));// "I eat five apples"출력
		// 위 예제에서는 문자열 안에 또 다른 문자열을 삽입하기 위해 앞에서 사용한 문자열 포맷 코드 %d가 아닌 %s를 썼다.
		// 어쩌면 눈치 빠른 독자는 벌써 유추하였을 것이다. 숫자를 넣기 위해서는 %d를 써야 하고, 문자열을 넣기 위해서는 %s를 써야 한다는 사실을 말이다.
		
		// 3. 숫자 값을 나타내는 변수로 대입
		int number=3;
		System.out.println(String.format("I eat %d apples.", number));// "I eat 3 apples."출력
		// 1번처럼 숫자를 바로 대입하나 위 예제처럼 숫자 값을 나타내는 변수를 대입하나 결과는 같다.

		// 4. 2개 이상의 값 넣기
	    // 그렇다면 문자열 안에 1개가 아닌 여러 개의 값을 넣고 싶을 땐 어떻게 해야 할까?
		int number2=10;
		String day = "three";
		
		// "I eat 10 apples. so I was sick for three days." 출력
		System.out.println(String.format("I eat %d apples. so I was sick for %s days.", number2 , day));
		// 위 예문처럼 2개 이상의 값을 넣으려면 파라미터로 여러개를 전달하면 된다.
		
		// 문자열 포맷 코드
		// 문자열 포매팅 예제에서는 대입해 넣는 자료형으로 정수와 문자열을 사용했으나 이 외에도 다양한 것을 대입할 수 있다. 
		// 문자열 포맷 코드로는 다음과 같은 것이 있다.
		
		// 코드 | 설명
		// %s	문자열(String)
		// %c	문자 1개(character)
		// %d	정수(Integer)
		// %f   	부동소수(floating-point)
		// %o	8진수
		// %x	16진수
		// %%	Literal % (문자 % 자체)
		
		// 여기에서 재미있는 것은 %s 포맷 코드인데, 이 코드는 어떤 형태의 값이든 변환해 넣을 수 있다. 
		// 무슨 말인지 예를 통해 확인해 보자.
		System.out.println(String.format("I have %s apples", 3)); // " I have 3 apples" 출력
		System.out.println(String.format("rate is %s", 3.234));// "rate is 3.234"출력
		
		// 3을 문자열 안에 삽입하려면 %d를 사용하고, 3.234를 삽입하려면 %f를 사용해야 한다.
		// 하지만 %s를 사용하면 이런 것을 생각하지 않아도 된다. 
		// 왜냐하면 %s는 자동으로 % 뒤에 있는 값을 문자열로 바꾸기 때문이다.
		
		// [포매팅 연산자 %d와 %를 같이 쓸 때는 %%를 쓴다]
		//System.out.println(String.format("Error is %d%.",98));
		// 이유는 문자열 포맷 코드인 %d와 %가 같은 문자열 안에 존재하는 경우, %를 나타내려면 반드시 %%로 써야 하는 법칙이 있기 때문이다. 
		// 이 점은 꼭 기억해 두어야 한다. 
		// 하지만 문자열 안에 %d 같은 포매팅 연산자가 없으면 %는 홀로 쓰여도 상관이 없다.

        // 따라서 위 예를 제대로 실행하려면 다음과 같이 해야 한다.
		System.out.println(String.format("Error is %d%%.", 98));//"Error is 98%"출력
		
		// 포맷 코드와 숫자 함께 사용하기
		// 위에서 보았듯이 %d, %s 등의 포맷 코드는 문자열 안에 어떤 값을 삽입하기 위해 사용한다.
		// 하지만 포맷 코드를 숫자와 함께 사용하면 더 유용하게 사용할 수 있다. 다음 예를 보고 따라해 보자.
		
		// 1. 정렬과 공백
		System.out.println(String.format("%10s", "hi"));//"        hi"출력
		// 앞의 예문에서 %10s는 전체 길이가 10개인 문자열 공간에서 대입되는 값을 오른쪽으로 정렬하고 그 앞의 나머지는 공백으로 남겨 두라는 의미이다.
		
		// 그렇다면 반대쪽인 왼쪽 정렬은 %-10s가 될 것이다. 확인해 보자.
		System.out.println(String.format("%-10sjane", "hi")); // "hi        jane." 출력
		// hi를 왼쪽으로 정렬하고 나머지는 공백으로 채웠음을 볼 수 있다.
		
		// 2.소수점 표현하기
		System.out.println(String.format("%.4f", 3.42134234));// 3/4213출력
        // 3.42134234를 소수점 네 번째 자리까지만 나타내고 싶은 경우에는 위와 같이 사용한다. 
		// 즉 여기서 '.'의 의미는 소수점 포인트를 말하고 그 뒤의 숫자 4는 소수점 뒤에 나올 숫자의 개수를 말한다. 다음 예를 살펴보자.
		System.out.println(String.format("%10.4f", 3.42134234)); // '    3.4213' 출력
		// 위 예는 숫자 3.42134234를 소수점 네 번째 자리까지만 표시하고 전체 길이가 10개인 문자열 공간에서 오른쪽으로 정렬하는 예를 보여 준다.
		
		// System.out.printf
		// String.format 메소드는 포매팅된 문자열을 리턴한다. 
		// 따라서 포매팅된 문자열을 출력하려면 다음처럼 System.out.println 메소드를 함께 사용해야 한다.
		System.out.println(String.format("I eat %d apples", 3));// "I eat 3 apples." 출력
		// 하지만 System.out.printf 메소드를 사용하면 String.format 메소드 없이도 동일한 형식으로 포매팅된 문자열을 출력할 수 있다.
		System.out.printf("I eat %d apples.",3);// "I eat 3 apples." 출력
		// String.format 과 System.out.printf의 차이는 전자는 문자열을 리턴하는 메소드이고 후자는 문자열을 출력하는 메소드라는 점이다. 
		// 상황에 맞게 선택하여 사용하자.
	}

}
