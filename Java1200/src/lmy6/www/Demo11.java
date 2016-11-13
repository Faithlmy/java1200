/*
 * 绘图
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;

public class Demo11 extends JFrame
{
	Mypanel my = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo11 my = new Demo11();
	}
	public Demo11()
	{
		my = new Mypanel();
		this.add(my);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
//定义一个Mypanel(我自己的面板)
class Mypanel extends JPanel
{
	//覆盖JPanel的paint方法
	//Graphics  绘图的笔
	public void paint(Graphics g)
	{
		//1、调用父类函数完成初始化  ， 不能少
		super.paint(g);
		//画一个圆
	//	g.drawOval(10, 10,30, 30);
//		
		g.drawLine(20, 30, 40, 50);
//		g.drawRect(50, 60, 89, 90);
//		
//		g.setColor(Color.blue);
//		g.fillRect(34, 56, 45, 45);
		//画图片
//		Image i_m = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("Images/66.jpg"));
//		g.drawImage(i_m, 20, 20, 100, 100, this);
//		
		
//		//如何画字
//		g.setColor(Color.red);
//		g.setFont(new Font("隶书",Font.BOLD,50));
//		g.drawString("中国", 100, 100);
		
		
	}
}
