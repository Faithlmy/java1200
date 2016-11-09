
/*访问权限*/
//p156

package lmy1;

public class Access {
	public static void main(String[] args) {
		
	}

}
//public接口访问权限
//public之后紧跟着的成员声明自己对每个人都是有用的
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

