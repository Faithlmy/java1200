/*
 * ��ʼ��������
 * 1������������ͬ��
 * 2���������κβ����Ĺ���������Ĭ�Ϲ�����
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
//һ�����й���������
class Rock
{
	Rock()
	{
		System.out.println("Rock");
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