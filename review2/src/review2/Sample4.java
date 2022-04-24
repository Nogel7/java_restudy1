package review2;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		// if문
		// 다음과 같은 상상을 해 보자.

        // "돈이 있으면 택시를 타고 가고 돈이 없으면 걸어 간다."

        // 위와 같은 상황은 우리 주변에서 언제든지 일어 날 수 있는 상황중의 하나이다. 
		// 프로그래밍도 위처럼 조건을 판단해서 그 상황에 맞게 처리해야 할 경우가 생기게 된다. 
		// 이렇듯 조건을 판단하여 해당 조건에 맞는 상황을 수행하는데 쓰이는 것이 바로 if문이다.

        // 위 상황을 자바는 다음과 같이 만들 수 있다.
		
		boolean money = true;
		if(money) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		// if문의 기본 구조
		// 다음의 구조가 if와 else를 사용하는 기본 구조이다.
		
		//if(조건문) {
			//<수행할 문장1>;
			//<수행할 문장2>;
			//...
		//}else{
		    //<수행할 문장A>;
      		//<수행할 문장B>;
		    //...
        //}
		// 조건문을 테스트 해서 참이면 if문에 속한 문장들을 수행하고 조건문이 거짓이면 else문에 속한 문장들을 수행한다.
		
		// 조건문이란 무엇인가?
        // if (조건문)에 사용한 조건문은 참과 거짓을 판단하는 문장이다.
		// 즉, 위의 예에서 보았던 money가 조건문이 된다.
		boolean money2 = true;
		if(money2) {
			// money는 true이기 때문에 if문에 속한 문장들이 수행된다.
		}
	
	
	// 비교연산자
	// 이번에는 조건판단에 사용되는 비교 연산자(<, >, ==, !=, >=, <=)에 대해서 알아보자.
	// 다음은 자바의 비교 연산자들이다.
	// 비교연산자	    설명
	// x < y	        x가 y보다 작다
	// x > y	        x가 y보다 크다
	// x == y	    x와 y가 같다
	// x != y	    x와 y가 같지 않다
	// x >= y	    x가 y보다 크거나 같다
	// x <= y	    x가 y보다 작거나 같다
	// 예를 통해서 연산자들에 대해서 알아보자.
	
	int x =3;
	int y =2;
	System.out.println( x > y);// true출력
	// x에 3, y에 2를 대입한 다음에 x > y 라는 조건문을 출력하니 true가 출력된다. 왜냐하면 x > y 조건문이 참이기 때문이다.
	
	System.out.println(x < y);  // false  출력
	// 위 조건문은 거짓이기 때문에 false가 출력된다.
	
	System.out.println(x == y);  // false 출력
	// x와 y는 같지 않다. 따라서 위의 조건문은 거짓이다.
	
	System.out.println( x != y); // true 출력
	// x와 y는 같지 않다. 따라서 위의 조건문은 참이다.
	
	// 앞의 택시예제를 다음처럼 바꾸어 보자
	// "만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
	
	// 위 상황은 다음처럼 코딩할 수 있다.
	int money3 = 2000;
	if(money3 >= 3000) {
		System.out.println("택시를 타고 가라");
	}else {
		System.out.println("걸어가라");
	}
	
	// money >= 3000 이란 조건문이 거짓이 되기 때문에 else문의 문장이 수행되어 "걸어가라"가 출력된다.
	
	// and(&&), or(||), not(!)
	// 이외에도 조건 판단에 쓰이는 and, or, not 연산자가 있다.
	// 각각의 연산자는 다음처럼 동작한다.
	
	// 이번에는 다음과 같은 상황을 코딩해 보자.
	// "돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"
	
	int money4 = 2000;
	boolean hasCard = true;
	
	if(money4 >= 3000 || hasCard) {
		System.out.println("택시를 타고 가라");
	}else {
		System.out.println("걸어가라");
	}
	
	// money는 2000으로 3000보다 작지만 hasCard가 true이기 때문에 money >= 3000 || hasCard 조건문이 참이 되어 "택시를 타고 가라"가 출력된다.
	
	// contains
	// List 자료형에는 해당 아이템이 있는지 조사하는 contains 메소드가 있다. 
	// contains 메소드는 조건문에 많이 활용되는데 어떻게 활용이 되는지 살펴보자.
	
	// 이번에는 다음의 상황을 코딩해 보자.
    // "만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라“
	ArrayList<String>pocket=new ArrayList<String>();
	pocket.add("paper");
	pocket.add("handphone");
	pocket.add("money");
	
	if(pocket.contains("money")) {
		System.out.println("택시를 타고가라");
	}else {
		System.out.println("걸어가라");
	}
	// pocket 리스트에 안에 'money'가 있으므로 pocket.contains("money")가 참이 되어 "택시를 타고 가라"가 출력된다.
	
	// else if (다중 조건 판단)
	// if와 else만으로는 다양한 조건 판단을 하기가 어렵다.
	// 다음과 같은 예만 하더라도 if와 else만으로는 조건 판단에 어려움을 겪게 된다.
	
	// "지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“
	// 위의 문장을 보면 조건을 판단하는 부분이 두 군데가 있다. 
	// 먼저 지갑에 돈이 있는지를 판단해야 하고 지갑에 돈이 없으면 다시 카드가 있는지를 판단한다.
	
	// if와 else만으로 위의 문장을 표현 하려면 다음과 같이 해야한다.
	boolean hasCard2 = true;
	ArrayList<String> pocket2 = new ArrayList<String>();
	pocket2.add("paper");
	pocket2.add("handphone");
	
	if(pocket.contains("money")) {
		System.out.println("택시를 타라");
	}else {
		if(hasCard2) {
			System.out.println("택시를 타라");
		}else {
			System.out.println("걸어가라");
		}
	}
	// if와 else가 여러번 사용되어 이해하기가 쉽지 않고 산만한 느낌이 든다. 
	// 위와 같은 점을 보완하기 위해서 자바는 다중 조건 판단을 가능하게 하는 else if가 있다.
	
	// 다음은 위 예에 else if를 적용한 코드이다.
	boolean hasCard3 = true;
	ArrayList<String> pocket3 = new ArrayList<String>();
	pocket3.add("paper");
	pocket3.add("handphone");
	
	if(pocket3.contains(money)) {
		System.out.println("택시타고가라!");
	}else if(hasCard3) {
		System.out.println("택시타고가라!");
	}else {
		System.out.println("걍걸어");
	}
	// else if는 이전 조건문이 거짓일 때 수행된다. 
	// 따라서 위 예에서 pocket.contains("money") 문장이 거짓이므로 else if 문이 수행되고 hasCard가 true이므로 "택시를 타고 가라"가 출력된다.
	}
	
	// if, else if, else의 기본 구조는 다음과 같다.
	// if (조건문) {
             //<수행할 문장1> 
             //<수행할 문장2>
             //...
      //}else if (조건문) {
             //<수행할 문장1>
             //<수행할 문장2>
             //...
      //}else if (조건문) {
             //<수행할 문장1>
             //<수행할 문장2>
             //...
             //...
      //} else {
             //<수행할 문장1>
             //<수행할 문장2>
             //... 

  

}

