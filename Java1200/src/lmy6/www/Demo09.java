/*
 * 词霸
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;

public class Demo09  extends JFrame
{
	//定义组件
	JSplitPane  jsp;
	JList jlist;
	JLabel jb1;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo09 demo09 = new Demo09();
	}
	//构造函数
	public Demo09()
	{
		//创建组件
		String []words = {"boy", "dog", "bird"};
		jlist = new JList(words);
		
		jb1 = new JLabel(new ImageIcon("images/55.jpg"));
		//jb2 = new JLabel(new ImageIcon("images/66.jpg"));
		
		//创建拆分窗格
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist, jb1);
		
		//调节变化
		jsp.setOneTouchExpandable(true);
		
		//设置布局管理器
		
		//添加组件
		this.add(jsp);
		
		//设置大小
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
