package com.leaderment.test;

class A {
    public String run(D obj) {
        return ("A & D");
    }
 
    public String run(A obj) {
        return ("A & A");
    }
}
class B extends A {
    public String run(B obj) {
        return ("B & B");
    }
    public String run(A obj) {
        return ("B & A");
    }
}
class C extends B {}
class D extends B {}
public class Test {
	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println("1--" + aa.run(b));
		System.out.println("2--" + aa.run(c));
		System.out.println("3--" + aa.run(d));
		System.out.println("4--" + ab.run(b));
		System.out.println("5--" + ab.run(c));
		System.out.println("6--" + ab.run(d));
		System.out.println("7--" + b.run(b));
		System.out.println("8--" + b.run(c));
		System.out.println("9--" + b.run(d));
	}
}