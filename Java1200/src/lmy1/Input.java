/*
 * Java的基础知识（1）
 * 对象：
 * 1、一切都是对象，通过操纵标志符来来引用对象（电视机和遥控）
 * 2、存储到哪里？（P60）
 * 3、基本类型：
 * 		boolean  char  byte short int long  float double void
 * 4、包装器类型：
 * 		Boolean  character Byte Short Integer Long Float Double Void
 * 5、高精度数字：BigInteger  BigDecimal
 * 6、数组：
 * 7、永远不用销毁对象
 * 8、new 一个对象的时候，它可以存活于作用域之外，即 s在引用点消失后， s指向Sting对象仍继续占据内存空间
 * 9、static关键字：
 * 		1）不用考虑创建多少对象，甚至根本不用创建对象
 * 		2)即使没有创建对象，也能调用这个方法
 * */

package lmy1;

import java.sql.Date;
import java.util.Scanner;



public class Input {
	
	
	//Input in = new Input();
	
	String s ;//这只是一个引用，并不是对象
	String t = "first";//这是一个比较安全的做法，即引用的同时就初始化
	String t1 = new String("second");//经常这样写
	
	static String t2 = new String("hello");//静态变量
	
	
	public static void main(String[] args) 
	{
		
		Input input = new Input();
		
		System.out.println("main中的"+input.t);
		input.lmy();
		
		System.out.println("main中的"+Input.t2);//static定义的变量可以通过类名来调用
		System.out.println("main中的"+input.t2);//也可以通过新定义的对象去调用它
		
		/*查询一些信息*/
		System.getProperties().list(System.out);
		System.out.println("Input.main()");
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
		
		
	}

	
	
	public Input()
	{
		System.out.println("构造函数中的"+Input.t2);

		//in.s = "meng";
		//System.out.println(s);
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("input your number: ");
		//String line =  scanner.nextLine();
		//System.out.println("是"+ line.length() + "位的数字");
	}
	
	public void lmy()
	{
		Input m = new Input();
		System.out.println("lmy中的"+m.t1);
		System.out.println("lmy中的"+"lmy");
		System.out.println("lmy中的"+Input.t2);
		System.out.println("lmy中的"+m.t2);
	}


}
