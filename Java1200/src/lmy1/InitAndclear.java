/*
 * 初始化和清理：
 * 1、构造器与类同名
 * 2、不接受任何参数的构造器叫做默认构造器
 * */

package lmy1;

public class InitAndclear {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++)
		{
			//new Rock();
			new Rock2(i);
		}
	}

}
//一个带有构造器的类
class Rock
{
	Rock()
	{
		System.out.println("Rock");
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