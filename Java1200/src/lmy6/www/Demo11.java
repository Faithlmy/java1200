/*
 * ��ͼ
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
//����һ��Mypanel(���Լ������)
class Mypanel extends JPanel
{
	//����JPanel��paint����
	//Graphics  ��ͼ�ı�
	public void paint(Graphics g)
	{
		//1�����ø��ຯ����ɳ�ʼ��  �� ������
		super.paint(g);
		//��һ��Բ
	//	g.drawOval(10, 10,30, 30);
//		
		g.drawLine(20, 30, 40, 50);
//		g.drawRect(50, 60, 89, 90);
//		
//		g.setColor(Color.blue);
//		g.fillRect(34, 56, 45, 45);
		//��ͼƬ
//		Image i_m = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("Images/66.jpg"));
//		g.drawImage(i_m, 20, 20, 100, 100, this);
//		
		
//		//��λ���
//		g.setColor(Color.red);
//		g.setFont(new Font("����",Font.BOLD,50));
//		g.drawString("�й�", 100, 100);
		
		
	}
}
