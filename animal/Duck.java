package com.sp.app0626.animal;
//최상위 클래스인 Object 를 import하지 않아도 사용가능한 이유?
//자바 프로그램 개발시 그 사용빈도가 너무 너무 높은 경우, java.lang이라는
//패키지에서 주요 클래스들을 지원하며 이 java.lang패키지는 개발자가 import/
//하지 않아도 접근이 가능하다. 즉 Object도 java.lang에 들어있다.

public class Duck extends Bird{
	String name="도날드";
	
	public void fly() {
		System.out.println("오리가 난다");
	}
	
	public static void main(String[] args) {
		Duck d=new Duck();
		d.toString();
		
		//String x="5";
		//Integer.parseInt(x);
		//자식이 업그레이드 한경우 무조건 자식의 메서드 호출
		
	}
}
