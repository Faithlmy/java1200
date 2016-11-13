/*
 * Thread开发线程
 * */

package lmy6.www;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建一个C_at的对象
		C_at   c = new C_at();
		//会导致run函数的运行
		c.start();
	}

}

//
class C_at extends Thread
{
	int times = 0;
	
	//重写函数
	public void run()
	{
		while(true)
		{
			
			//休眠一秒
			//1000  表示毫秒
			//Blocked 状态，并释放资源（内存和CPU等）
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




















