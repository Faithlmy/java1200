/*
 * 加深对事件处理机制的理解
 * 
 * 通过上下左右键控制小球的运动
 * 
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo13 extends JFrame
{
	M_Panel m_panel = null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo13 demo13 = new Demo13();

	}
	//构造函数
	public Demo13()
	{
		m_panel = new M_Panel();
		//加入到JFrame
		m_panel.setBackground(Color.BLACK);
		this.add(m_panel);
		this.addKeyListener(m_panel);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

// 定义自己的面板(画小球)
class M_Panel  extends JPanel implements KeyListener
{
	int x = 10;
	int y = 10;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(x, y, 10, 10);
	}

	//某个键的一个值被输出（打印）
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//压下
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("按下" + (char)e.getKeyCode());
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			//System.out.println("3");
			y++;
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			y--;
		}
		else if( e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			x--;
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			x++;
		}
		//调用repaint 函数 重新绘制界面
		this.repaint();
		
	}

	//释放
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}







