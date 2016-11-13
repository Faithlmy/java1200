/*
 * 
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo08 extends JFrame
{
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JList  jlist;

	JComboBox jcb1;
	JScrollPane jsp;
	
	public static void main(String[] args) {
		Demo08 demo08 = new Demo08();
	}
	//构造函数
	public Demo08()
	{
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("你的籍贯：");
		jl2 = new JLabel("旅游地点");
		
		String []jg = {"北京","山西","广州"};
		jcb1 = new JComboBox(jg);
		
		String []dd = {"长城", "故宫", "天安门","天坛","首都机场"};
		jlist = new JList(dd);
		jlist.setVisibleRowCount(5);
		jsp = new JScrollPane(jlist);
		//设置你想显示的个数
		
		//设置布局
		this.setTitle("用户界面");
		this.setLayout(new GridLayout(3,1));
		
		//添加组件
		jp1.add(jl1);
		jp1.add(jcb1);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
	}

	
	

}
