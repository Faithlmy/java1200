package lmy2;



/*this:
 * 1������������������ �������͹�����
 * 2��thisΪ��ǰ�������Ϊ��ǰ���ڴ����Ķ���
 * 3����ʾ��ǰ���ڴ����Ķ��������
 * 4������������ʽ�ĵ��õ�ǰ������صĹ�����
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
		System.out.println("�˳Է�");
	}
	public void sleep(){
		System.out.println("��˯��");
	}
	public void info(){
		System.out.println("name" + name + "age" + age);
	}
	public void show(){
		System.out.println("����һ����");
	}
}

