package sample2;

public class Foo implements Interfoo {
	public Foo() {
		// TODO Auto-generated constructor stub
		System.out.println("Foo객체 생성 : Foo()호출");
		System.out.println("---------------------");
	}
	public Foo(String str) {
		// TODO Auto-generated constructor stub
		System.out.println("Foo객체 생성 : Foo()호출");
		System.out.println("전달된 str 변수 값 : " + str);
		System.out.println("---------------------");
	}
	public Foo(String str, int num) {
		// TODO Auto-generated constructor stub
		System.out.println("Foo객체 생성 : Foo()호출");
		System.out.println("전달된 str 변수 값 : " + str);
		System.out.println("전달된 num 변수 값 : " + num);
		System.out.println("---------------------");
	}
	public Foo(String str, int num, boolean flag) {
		// TODO Auto-generated constructor stub
		System.out.println("Foo객체 생성 : Foo()호출");
		System.out.println("전달된 str 변수 값 : " + str);
		System.out.println("전달된 num 변수 값 : " + num);
		System.out.println("전달된 flag 변수 값 : " + flag);
		System.out.println("---------------------");
	}
	public Foo(Bar bar) {
		// TODO Auto-generated constructor stub
		System.out.println("Foo객체 생성 : Foo()호출");
		System.out.println("전달된 Bar 변수 값 : " + bar);
		System.out.println("---------------------");
	}
}
