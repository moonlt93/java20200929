package chap07.textbook.s070601.package2;

import chap07.textbook.s070601.package1.A;
//얘는 자식이라  a에 접근 가능 다만, super()를 통해 생성자 호출해야함.
public class D extends A {
	public D() {
		super();
		this.field ="value";
		this.method();
	}

}
