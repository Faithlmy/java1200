/*
 * ���ֲ��ֹ�����
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo05 extends JFrame
{
	//�������
	JPanel jp1,jp2;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public static void main(String[] args)
	{
		 Demo05 demo05 = new Demo05();
	}
	//���캯��
	public Demo05()
	{
		//�������
		//JPanel�Ĳ���Ĭ����FlowLayout
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("����");
		jb2 = new JButton("�㽶");
		jb3 = new JButton("����");
		jb4 = new JButton("����");
		jb5 = new JButton("����");
		jb6 = new JButton("����");
		
		//���ò��ֹ�����
		
		//������
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		//���ô�С
		this.setSize(300, 300);
		this.setLocation(200, 200);
		
		this.setVisible(true);
		
	}
	
	

	

}
