/*
 * Thread�����߳�
 * */

package lmy6.www;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����һ��C_at�Ķ���
		C_at   c = new C_at();
		//�ᵼ��run����������
		c.start();
	}

}

//
class C_at extends Thread
{
	int times = 0;
	
	//��д����
	public void run()
	{
		while(true)
		{
			
			//����һ��
			//1000  ��ʾ����
			//Blocked ״̬�����ͷ���Դ���ڴ��CPU�ȣ�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("HelloWorld" + times);
			times ++;
			if(times ==10)
			{
				break;
			}
		}
	
	}
}




















