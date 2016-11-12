package lmy2;


/*构造器
 * 1、作用：创建对象  给创建的对象赋值
 * 2、设计类时，若不显式的声明构造器的话，程序默认提供一个构造器
 * 3、一旦显式定义类的构造器，那么默认的构造器就不再提供
 * 3、如何声明类的构造器       权限修饰符   类名（形参）{}
 * 4、类的多个构造器之间构成重载
 * 
 * */

public class TestPerson {
	public static void main(String[] args) {
		Person1 p = new Person1("高鹏");
		System.out.println(p.getName());
		
		Person1 p1 = new Person1("积极" , 45);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
class Person1{
	//属性
	private int age;
	private String name;
	
	//构造器
	public Person1(String n){
		name = n;
	}
	public Person1(){
		
	}
	public Person1(String n , int a){
		name = n;
		age = a;
		
	}
	
	//方法
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public void setName(String n){
		name = n;
	}
}
