package com.kctech.daythree;

class Test<T> {
	T obj;
	Test(T obj) {
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}


public class GenericsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iObj = new Test<Integer>(12);
		System.out.println(iObj.getObject());
		
		Test<String> sObj = new Test<String>("hello");
		System.out.println(sObj.getObject());
	}

}
