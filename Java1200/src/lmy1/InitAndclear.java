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
 *7�� 
 * */

package lmy1;

public class InitAndclear {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++)
		{
			//new Rock();
			//new Rock2(i);
		}
		for(int j = 0; j<10; ++j)
		{
			Tree T = new Tree();
			Tree t = new Tree(j);
			
			t.info();
			t.info("meng");
			
			
		}
		

	}

}
//һ�����й���������
class Rock
{
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





