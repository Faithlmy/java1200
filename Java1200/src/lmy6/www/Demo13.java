/*
 * ������¼�������Ƶ����
 * 
 * ͨ���������Ҽ�����С����˶�
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
	//���캯��
	public Demo13()
	{
		m_panel = new M_Panel();
		//���뵽JFrame
		m_panel.setBackground(Color.BLACK);
		this.add(m_panel);
		this.addKeyListener(m_panel);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

// �����Լ������(��С��)
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

	//ĳ������һ��ֵ���������ӡ��
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//ѹ��
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("����" + (char)e.getKeyCode());
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
		//����repaint ���� ���»��ƽ���
		this.repaint();
		
	}

	//�ͷ�
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}







