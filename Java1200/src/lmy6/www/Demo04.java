/*
 * 网格布局
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;

public class Demo04 extends JFrame
{
	int size = 9;
	//定于组件
	JButton jbs[] =new JButton[size];
	public static void main(String[] args) 
	{
		//创建实体
		Demo04 demo04 = new Demo04();
	}
	//构造函数
	public Demo04()
	{
		
		//创建组件
		for(int i = 0; i<size; i++)
		{
			jbs[i] = new JButton(String.valueOf(i));
		}
		//设置网格布局
		this.setLayout(new GridLayout(3, 3, 10, 10));
		
		//添加组件
		for(int i = 0; i<size; i++)
		{
			this.add(jbs[i]);
		}
		
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		
		//显示
		this.setVisible(true);
	}

}
