/*
 * ��ʼ��������
 * 1������������ͬ��
 * 2���������κβ����Ĺ���������Ĭ�Ϲ�����
 * 3�������������ڼ��ٴ�����󣬲�ʹ���������Ķ�
 * 4��java�е� ��ʼ��  ��  ������������һ���
 * 5����������һ�������෽������Ϊ��û�з���ֵ��������void ����
 *   ��ͬ������ �շ���ֵ �� ���ܷ��������᷵��ʲô��������Ȼ����
 *   ѡ���������ر��Ķ����� �����������᷵���κζ���������û��
 *   ѡ�����أ�new�ı����ֻ�Ǵ����˶��󣬹���������û���κ�
 *   ����ֵ��
 *6����������һ�������ʱ��Ҳ�͸��˶������Ĵ洢�ռ��ȡһ�����֣�
 *	ͨ���������֣������������еĶ���ͷ���
 *7�����Լ�û��д��������ʱ�򣬱��������Զ����Լ�дһ����һ���Լ�д�˹�������
 *	�������㲻������㹹��
 * */

package lmy1;

public  class InitAndclear {
	
	public static void main(String[] args) {
		
	}
}


//���й���������
class Rock
{
	String s1 = "lmy";
	public static void main(String[] args) 
	{
		for(int i = 0; i<10; i++)
		{
			new Rock();
			new Rock2(i);
		}
	}
	
	Rock()
	{
		System.out.println("lmy");
	}
}


//���в����Ĺ�����
class Rock2
{
	Rock2(int i)
	{
		System.out.println("Rock2"+" " + i );
	}
}


//������ �� ��������
class Tree
{
	public static void main(String[] args) 
{
		for(int j = 0; j<10; ++j)
		{
			Tree T = new Tree();
			Tree t = new Tree(j);
			
			t.info();
			t.info("mengyao");	
		}
}

	
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
	System.out.println(s +"  "+"Tree is " + h);
}
}

//this������(p125)
/*
 * �����ڲ���õ�ǰ���������
 * ֻ���ڷ����ڲ�ʹ�ã���ʾ�Ե��÷������Ǹ����������
 * ����ڷ����ڲ�����ͬһ�������һ���������Ͳ�����this��ֱ�ӵ��ü���
 * */
 class Tthis
{
	String s1 = new String("mm");
	public static void main(String[] args)
	{
		String s2 = "meng"; 
		Tthis t1 = new Tthis();
		Tthis t2 = new Tthis();
		System.out.println("huahua");
		
		
	}
	public class Ap
	{
		
		
	}

}
//finalize()(p127)
 /*
  * java �Ļ��ջ���ֻ�������new�����Ķ�����л���
  * finalize()�Ĺ���ԭ��
  * 	һ������������׼�����ͷŶ���ռ�õ��ڴ棬���ȵ���finalize()����������
  * 	��һ���������ն����������Ż��������ն���ռ�õ��ڴ�ռ�
  * */




