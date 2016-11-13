/*
 * 多种布局管理器
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo05 extends JFrame
{
	//定义组件
	JPanel jp1,jp2;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public static void main(String[] args)
	{
		 Demo05 demo05 = new Demo05();
	}
	//构造函数
	public Demo05()
	{
		//创建组件
		//JPanel的布局默认是FlowLayout
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("西瓜");
		jb2 = new JButton("香蕉");
		jb3 = new JButton("葡萄");
		jb4 = new JButton("凤梨");
		jb5 = new JButton("橘子");
		jb6 = new JButton("菠萝");
		
		//设置布局管理器
		
		//添加组件
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		//设置大小
		this.setSize(300, 300);
		this.setLocation(200, 200);
		
		this.setVisible(true);
		
	}
	
	

	

}
