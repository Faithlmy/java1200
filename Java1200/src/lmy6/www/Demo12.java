/*
 * 
 *事件处理机制
 *
 *1、实现一个类的监听的步骤
 *a、实现相应的接口
 *b、把接口的方法重写
 *c、在事件源注册监听
 *d、事件的传到是靠事件对象
 */

package lmy6.www;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Demo12 extends JFrame implements ActionListener
{
	//定义panel
	JPanel mp = null;
	 JButton jb1 = null;
	 JButton jb2 = null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo12 demo12 = new Demo12();
		
	}
	public Demo12()
	{
		mp = new JPanel();
		jb1 = new JButton("黑色");
		jb2 = new JButton("红色");
		
		this.add(jb1 , BorderLayout.NORTH);
		mp.setBackground(Color.black);
		this.add(mp);
		this.add(jb2, BorderLayout.SOUTH);

		
		//让猫监听
		Cat mycat = new Cat();
		
		//注册监听
		jb1.addActionListener(this);
		
		//从jb1.addActionListener可以推出
		//事件源对象是jb1， 事件监听对象就是mycat
		jb1.addActionListener(mycat);
		
		//指定action命令
		jb1.setActionCommand("黑色");
		
		jb2.addActionListener(this);
		jb2.setActionCommand("红色");
		
		
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//对事件处理的方法 是  这个函数  actionPerformed()
	//事件处理 方法是 actionPerformed   事件处理对象是 e
	
	public void actionPerformed(ActionEvent e)
	{
		
		//判断是那个按钮被点击
		if(e.getActionCommand().equals("黑色"))
		{
			System.out.println("你点击了 黑色 按钮");
			mp.setBackground(Color.black);
		}
		else if(e.getActionCommand().equals("红色"))
		{
			System.out.println("你点击了 红色 按钮");
			mp.setBackground(Color.red);
		}
		else 
		{
			System.out.println("不知道你点击什么");
		}
	}

}

class Cat implements ActionListener
{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("黑色"))
		{
			System.out.println("猫知道你按下黑色按钮");
		}
		else if(e.getActionCommand().equals("红色"))
		{
			System.out.println("红色");
		}
	}
	
}













