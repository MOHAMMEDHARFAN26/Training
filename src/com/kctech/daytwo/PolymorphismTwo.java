package com.kctech.daytwo;


class PolymorphismMo {
	
	public int a;
	public int b;
	 
	public void method()
	{
		System.out.println("This is the first method");
	}
	
	public int method(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a*b;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismTwo k= new PolymorphismTwo();
		
		k.method();
		System.out.println(k.method(100, 100));

	}*/
}
 class PolymorphismTwo extends PolymorphismMo{
	@Override
	public int method(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a-b;
	}
	public static void main(String[] args) {
		PolymorphismTwo l = new PolymorphismTwo();
		
		System.out.println(l.method(100,40));
	}
}
