
/*����Ȩ��*/
//p156

package lmy1;
//java �ı�׼���߿�
import java.util.*;

public class Access {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		Access b = new Access();
		
	}

public	class Cookie
	{

		public Cookie()
		{
			System.out.println("Cookie constructor");
		}
		void bite()
		{
			System.out.println("Cookie.bite()");
		}
	}
	//private  ���˰����ó�Ա����֮�⣬�����κ��඼�޷����������Ա
	class sun
	{

		
	}
}
//public�ӿڷ���Ȩ��
//public֮������ŵĳ�Ա�����Լ���ÿ���˶������õ�
class Cookie
{
	public static void main(String[] args) {
		Cookie c = new Cookie();
		c.bite();
	}
	public Cookie()
	{
		System.out.println("Cookie constructor");
	}
	void bite()
	{
		System.out.println("Cookie.bite()");
	}
}
//private  ���˰����ó�Ա����֮�⣬�����κ��඼�޷����������Ա
class sun
{
	public static void main(String[] args) {
		
	}
	
}
