/*
 * 
 *�¼��������
 *
 *1��ʵ��һ����ļ����Ĳ���
 *a��ʵ����Ӧ�Ľӿ�
 *b���ѽӿڵķ�����д
 *c�����¼�Դע�����
 *d���¼��Ĵ����ǿ��¼�����
 */

package lmy6.www;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Demo12 extends JFrame implements ActionListener
{
	//����panel
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
		jb1 = new JButton("��ɫ");
		jb2 = new JButton("��ɫ");
		
		this.add(jb1 , BorderLayout.NORTH);
		mp.setBackground(Color.black);
		this.add(mp);
		this.add(jb2, BorderLayout.SOUTH);

		
		//��è����
		Cat mycat = new Cat();
		
		//ע�����
		jb1.addActionListener(this);
		
		//��jb1.addActionListener�����Ƴ�
		//�¼�Դ������jb1�� �¼������������mycat
		jb1.addActionListener(mycat);
		
		//ָ��action����
		jb1.setActionCommand("��ɫ");
		
		jb2.addActionListener(this);
		jb2.setActionCommand("��ɫ");
		
		
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//���¼�����ķ��� ��  �������  actionPerformed()
	//�¼����� ������ actionPerformed   �¼���������� e
	
	public void actionPerformed(ActionEvent e)
	{
		
		//�ж����Ǹ���ť�����
		if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("������ ��ɫ ��ť");
			mp.setBackground(Color.black);
		}
		else if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("������ ��ɫ ��ť");
			mp.setBackground(Color.red);
		}
		else 
		{
			System.out.println("��֪������ʲô");
		}
	}

}

class Cat implements ActionListener
{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("è֪���㰴�º�ɫ��ť");
		}
		else if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("��ɫ");
		}
	}
	
}













