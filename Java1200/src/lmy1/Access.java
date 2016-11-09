
/*访问权限*/
//p156

package lmy1;
//java 的标准工具库
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
	//private  除了包含该成员的类之外，其他任何类都无法访问这个成员
	class sun
	{

		
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
//private  除了包含该成员的类之外，其他任何类都无法访问这个成员
class sun
{
	public static void main(String[] args) {
		
	}
	
}
