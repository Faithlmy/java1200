
/*访问权限*/
//p156

package lmy1;

public class Access {
	public static void main(String[] args) {
		
	}

}
//public接口访问权限
class Cookie
{
	public static void main(String[] args) {
		Cookie c = new Cookie();
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

