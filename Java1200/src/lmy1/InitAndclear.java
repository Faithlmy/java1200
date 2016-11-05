/*
 * 初始化和清理：
 * 1、构造器与类同名
 * 2、不接受任何参数的构造器叫做默认构造器
 * 3、构造器有助于减少代码错误，并使代码易于阅读
 * 4、java中的 初始化  和  创建是捆绑在一起的
 * 5、构造器是一种特殊类方法，因为它没有返回值，但是与void 明显
 *   不同。对于 空返回值 ， 尽管方法本身不会返回什么，但是仍然可以
 *   选择让他返回被的东西， 构造器本身不会返回任何东西，根本没有
 *   选择的余地（new的表达是只是创建了对象，构造器本身并没有任何
 *   返回值）
 *6、当创创建一个对象的时，也就给此对象分配的存储空间分取一个名字，
 *	通过引用名字，可以引用所有的对象和方法
 *7、 
 * */

package lmy1;

public class InitAndclear {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++)
		{
			//new Rock();
			//new Rock2(i);
		}
		for(int i = 0; i<10; ++i)
		{
			Tree t = new Tree(i);
			t.info();
			t.info("meng");
			t.h = 3;
			
		}
		

	}

}
//一个带有构造器的类
class Rock
{
	Rock()
	{
		System.out.println("lmy");
	}
}
//带有参数的构造器
class Rock2
{
	Rock2(int i)
	{
		System.out.println("Rock2"+" " + i );
	}
}
//构造器 和 方法重载
class Tree
{
	int h;
	Tree()
	{
		System.out.println("seeding");
		h = 0 ;
	}
	Tree(int initH)
	{
		h = initH;
		System.out.println("Creating new Tree"+ h );
	}
	void info()
	{
		System.out.println("Tree is " + h);
	}
	void info(String s)
	{
		System.out.println(s+"  "+"Tree is " + h);
	}
}





