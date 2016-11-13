/*
 * BorderLayout
 * 
 * 1、继承JFrame
 * 2、定义需要的组件
 * 3、创建组件
 * 4、添加组件
 * 5、创建窗体属性
 * 6、显示窗体
 * 
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo02 extends JFrame
{
	
	//定义组件
	JButton jb1, jb2, jb3, jb4, jb5;
	public static void main(String[] args) {
		
		 Demo02 demo02 = new Demo02();
		
	}
	public Demo02()
	{
		//创建组件
		
		jb1 = new JButton("中部");
		jb2 = new JButton("东部");
		jb3 = new JButton("西部");
		jb4 = new JButton("南部");
		jb5 = new JButton("北部");

		//添加组件
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.EAST);
		this.add(jb3, BorderLayout.WEST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.NORTH);
		
		//创建窗体属性
		this.setTitle("边界布局案例");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗体
		this.setVisible(true);
	}

}
