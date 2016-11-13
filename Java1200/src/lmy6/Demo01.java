/*
 * Author:lmy
 * Time:04/08/16
 * topic:图形界面开发
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo01 extends JFrame
{
	//把需要的Swing组件，放在此处，在下面的构造函数里面初始化
	JButton jb1 = null;

	public static void main(String[] args) 
	{
		Demo01 demo01 = new Demo01();
	}
	
	//构造函数
	public Demo01()
	{
		// TODO Auto-generated method stub
				//JFrame是一个顶层容器（可以添加其他Swing组件的类）
				
				
			     jb1 = new JButton("我是按钮");
				//设置窗体标题
				this.setTitle("hello");
				
				//设置大小,按像素（密度单位，）
				//##this.setSize(200, 200);
				
				this.add(jb1);
				
				//设置初始位置
				this.setLocation(100, 200);
				
				//设置关闭窗口的时候，保证Jvm退出
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//显示
				this.setVisible(true);
	}

}
