package lmy2;


/*������
 * 1�����ã���������  �������Ķ���ֵ
 * 2�������ʱ��������ʽ�������������Ļ�������Ĭ���ṩһ��������
 * 3��һ����ʽ������Ĺ���������ôĬ�ϵĹ������Ͳ����ṩ
 * 3�����������Ĺ�����       Ȩ�����η�   �������βΣ�{}
 * 4����Ķ��������֮�乹������
 * 
 * */

public class TestPerson {
	public static void main(String[] args) {
		Person1 p = new Person1("����");
		System.out.println(p.getName());
		
		Person1 p1 = new Person1("����" , 45);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
class Person1{
	//����
	private int age;
	private String name;
	
	//������
	public Person1(String n){
		name = n;
	}
	public Person1(){
		
	}
	public Person1(String n , int a){
		name = n;
		age = a;
		
	}
	
	//����
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
