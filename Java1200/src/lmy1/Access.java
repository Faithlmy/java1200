
/*����Ȩ��*/
//p156

package lmy1;

public class Access {
	public static void main(String[] args) {
		
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

