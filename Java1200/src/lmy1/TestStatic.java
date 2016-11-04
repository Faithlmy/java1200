package lmy1;

import java.util.Date;



public class TestStatic {
	public static void main(String[] args) {
		TestStatic in = new TestStatic();
		in.increment();
	}
	
	private int i = 2;
	static void increment()
	{
		
		TestStatic st1 = new TestStatic();
		 System.out.println(st1.i++);
		 System.out.println("TestStatic.increment()");
		System.err.println(new Date());
		
	}

}
