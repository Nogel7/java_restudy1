
public class Sample7 {

	public static void main(String[] args) {
		// 문자열(String)
		// 문자열이란 문장을 뜻한다. 예를 들어 다음과 같은 것들이 문자열이다.
		// "Happy Java"
		// "a"
		// "123"
		
		// 자바에서 문자열을 나타내는 자료형은 String 이다.
		// 즉, 위의 문자열을 자바에서 표현하려면 다음과 같이 사용해야 한다.
		//String a = "Happy Java";
		//String b = "a";
	    //String c = "123";
	    
	    // 하지만 위의 예제는 다음과 같이 표현해도 된다.
	    String a = new String("Happy Java");
	    String b = new String("a");
	    String c = new String("123");
	    // new 키워드는 객체를 만들 때 사용한다.
	    // "객체"에 대해서는 나중에 자세하게 알아볼 것이다. 
	    // 앞으로도 "객체"라는 용어가 계속해서 나올텐데 그때까지는 "새로 생성된 자료형" 정도의 의미라고만 알고 있도록 하자.
	    
	    // 하지만 보통 문자열을 표현할 때는 가급적 첫번째 방식(리터럴 표기)을 사용하는 것이 좋다. 
	    // 첫 번째 처럼 사용하면 가독성에 이점이 있고 컴파일 시 최적화에 도움을 주기 때문이다.
	    
	    // 리터럴 표기
        // String a = "happy java" 와 String a = new String("happy java")는 같은 값을 갖게 되지만 완전히 동일하지는 않다. 
	    // 첫번째 방식을 리터럴(literal) 표기라고 하는데 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다. 
	    // 위 예에서 리터럴 표기법은 "happy java" 라는 문자열을 intern pool 이라는 곳에 저장하고 다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다. 
	    // 두번째 방식은 항상 새로운 String 객체를 만든다.

	}

}
