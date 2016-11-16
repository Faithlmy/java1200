package lmy2;



/*this:
 * 1、可以用来修饰属性 、方法和构造器
 * 2、this为当前对象或者为当前正在创建的对象。
 * 3、表示当前正在创建的对象的属性
 * 4、可以用来显式的调用当前类的重载的构造器
 * 
 * */

public class TestThis {
	public static void main(String[] args) {
		
	}

}
class Person{
	private int age;
	private String name;
	
	public Person(){
		
	}
	public Person(String n){
		name = n;
	}
	public Person(int a){
		age = a;
	}
	public Person(String n , int a){
		this(n);
		name = n;
	//	this(a);
		age = a;
	}
	
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	
	public void eat(){
		System.out.println("人吃饭");
	}
	public void sleep(){
		System.out.println("人睡觉");
	}
	public void info(){
		System.out.println("name" + name + "age" + age);
	}
	public void show(){
		System.out.println("我是一个人");
	}
}

