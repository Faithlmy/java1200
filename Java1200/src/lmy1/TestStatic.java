package lmy1;

public class TestStatic {
	
	private int i = 2;
	static void increment()
	{
		
		TestStatic st1 = new TestStatic();
		 System.out.println(st1.i++);
		
	}

}
