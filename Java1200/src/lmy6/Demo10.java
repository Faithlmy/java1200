/*
 * QQ 聊天记录
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo10 extends JFrame
{
	//定义组件
	JTextArea jta = null;
	JScrollPane jsp = null;
	JPanel jp = null;
	JComboBox jc = null;
	JTextField jtf = null;
	JButton jb = null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo10 demo10= new Demo10(); 
	}
	//构造函数
	public Demo10()
	{
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jp = new JPanel();
		String []ch = {"布什", "拉登"};
		jc = new JComboBox(ch);
		jtf = new JTextField (10);
		jb = new JButton("发送");
		
		//设置布局
		
		//添加组件
		jp.add(jc);
		jp.add(jtf);
		jp.add(jb);
		
		//加入JFrame
		this.add(jsp);
		this.add(jp, BorderLayout.SOUTH);
		
		this.setSize(300,200);
		this.setTitle("腾讯qq");
		this.setIconImage((new ImageIcon("Images/qq.png")).getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
	}

}
